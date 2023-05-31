package at.campus02.pr2;

import java.util.Comparator;

public class AccountingComparator implements Comparator<NFCTicket> {

    @Override
    public int compare(NFCTicket o1, NFCTicket o2) {
        //nach kategorie sortieren
        int s = Integer.compare(o1.getCategory(), o2.getCategory());
        if (s == 0) {
            //nach sicherheitscode sortieren
            return o1.getSecret().compareTo(o2.getSecret());
        }
        return s;
    }
}
