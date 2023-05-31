package at.campus02.pr2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class ConcertSystem {
    protected ArrayList<NFCTicket> tickets;

    public ConcertSystem() {
        tickets = new ArrayList<>();
    }

    public boolean addTicket(NFCTicket t) {
        if (!tickets.contains(t) && TicketFraudSystem.checkTicket(t)) {
            tickets.add(t);
            return true;
        }
//        for (NFCTicket ticket : tickets) {
//            if (ticket.equals(t) && TicketFraudSystem.checkTicket(ticket)) {
//                tickets.add(t);
//                return true;
//            }
//        } return false;
        return false;
    }

    public double profitPerCategory(int Category) {
        double erg = 0;
        for (NFCTicket t : tickets) {
            Category = t.getCategory();
            erg = t.getProfit();
        }
        return erg/ tickets.size();

    }

    public ArrayList<String> invitedToStage() {
        ArrayList<String>erg = new ArrayList<>();

        for (NFCTicket t : tickets) {
            String invited = t.getSecret();
            if (t.getSecret().startsWith("M")) {
                erg.add(t.getTicketOwner());
            } else if (t.getSecret().startsWith("A") && t.getCategory() == 1) {
                erg.add(t.getTicketOwner());
            }
        }
        return erg;
    }

    HashMap<Integer, Double> donationPerCategory() {
        HashMap<Integer, Double> erg = new HashMap<Integer, Double>();
        erg.put(1, 0.0);
        erg.put(2, 0.0);
        erg.put(3, 0.0);

        for (NFCTicket t : tickets) {
            int profit = (int) t.getProfit();
            int cat = t.getCategory();
            if (cat == 1) {
                erg.put(1, erg.get(1) + (profit * 0.3));
            } else if (cat == 2) {
                erg.put(2, erg.get(2) + (profit * 0.2));
            } else if (cat == 3){
                erg.put(2, erg.get(3) + (profit * 0.1));
            }
        }
        return erg;
    }

    public void sortAndPrintForAccounting() {
        AccountingComparator accountingComparator = new AccountingComparator();
        Collections.sort(tickets, accountingComparator);
        System.out.println(tickets.toString());
    }

    @Override
    public String toString() {
        return "ConcertSystem{" +
                "tickets=" + tickets +
                '}';
    }
}
