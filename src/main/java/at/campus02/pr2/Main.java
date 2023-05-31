package at.campus02.pr2;

import jdk.jfr.Category;

public class Main {

    public static void main(String[] args) {
        // ABSEITS DER ANGABE KÖNNEN SIE HIER NATÜRLICH AUCH NOCH WEITER TESTEN BZW. ERGEBNISSE AUSGEBEN

        PaperTicket p1 = new PaperTicket("Anna", 81, 20.5, true);
        PaperTicket p2 = new PaperTicket("Hanna", 52, 5, false);
        AppTicket a1 = new AppTicket("Mario", 101, "ios");
        AppTicket a2 = new AppTicket("Albert", 96, "windows");
        MoonBoot m1 = new MoonBoot("Kata", true);
        MoonBoot m2 = new MoonBoot("Chris", false);

        System.out.println("---TicketOwners---");
        System.out.println(p1.getTicketOwner()+" "+p2.getTicketOwner()+" "+a1.getTicketOwner()+" "+a2.getTicketOwner()+" "+m1.getTicketOwner()+" "+m2.getTicketOwner());
        System.out.println("\n---SicherheitCodes---");
        System.out.println(p1.getSecret()+" "+p2.getSecret()+" "+ a1.getSecret()+" "+a2.getSecret()+" "+m1.getSecret()+" "+m2.getSecret());
        System.out.println("\n---Profit---");
        System.out.println("PaperTicket1 profit: " + p1.getProfit());
        System.out.println("PaperTicket2 profit: " + p2.getProfit());
        System.out.println("AppTicket1 profit: " + a1.getProfit());
        System.out.println("AppTicket2 profit: " + a2.getProfit());
        System.out.println("MoonBoot1 profit: " + m1.getProfit());
        System.out.println("MoonBoot2 profit: " + m2.getProfit());
        System.out.println("\n---Kategorie---");
        System.out.println("PaperTicket1 kategorie: " + p1.getCategory());
        System.out.println("PaperTicket2 kategorie: " + p2.getCategory());
        System.out.println("AppTicket1 kategorie: " + a1.getCategory());
        System.out.println("AppTicket2 kategorie: " + a2.getCategory());
        System.out.println("MoonBoot1 kategorie: " + m1.getCategory());
        System.out.println("MoonBoot2 kategorie: " + m2.getCategory());

        ConcertSystem concertSystem = new ConcertSystem();
        concertSystem.addTicket(p1);
        concertSystem.addTicket(p2);
        concertSystem.addTicket(a1);
        concertSystem.addTicket(a2);
        concertSystem.addTicket(m1);
        concertSystem.addTicket(m2);
        System.out.println("\n---ConcertSystem - Alle Tickets---\n"+concertSystem);

        System.out.println("\nProfit per category: "+ +concertSystem.profitPerCategory(1));
        System.out.println("\nDonation per category: "+concertSystem.donationPerCategory());
        System.out.println("\n---Invited to stage---: "+concertSystem.invitedToStage());

        System.out.println("\n---Kategorie mit SichetheitsCode---");
        System.out.println("PaperTicket1  " + p1.getCategory()+ "  "+p1.getSecret());
        System.out.println("PaperTicket2  " + p2.getCategory()+ "  "+p2.getSecret());
        System.out.println("AppTicket1  " + a1.getCategory()+ "  "+a1.getSecret());
        System.out.println("AppTicket2  " + a2.getCategory()+ "  "+a2.getSecret());
        System.out.println("MoonBoot1  " + m1.getCategory()+ "  "+m1.getSecret());
        System.out.println("MoonBoot2  " + m2.getCategory()+ "  "+m2.getSecret());

        System.out.println("\n---Sortierte Liste---");
        concertSystem.sortAndPrintForAccounting();



    }
}
