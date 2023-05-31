package at.campus02.pr2;

public class PaperTicket implements NFCTicket {

    protected String owner;
    protected double price;
    protected double discount;   //muss ich im %
    protected boolean winner = false;
    protected String paper;

    public PaperTicket(String owner, double price, double discount, boolean winner) {
        this.owner = owner;
        this.price = price;
        this.discount = discount;
        this.winner = winner;
        paper = TicketFraudSystem.createNewTicket("paper");
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        double priceMinusHaendlerkosten = price - 20;
        return priceMinusHaendlerkosten - (priceMinusHaendlerkosten * (discount / 100));
    }

    @Override
    public int getCategory() {
        if (price >= 80) {
            return 2;
        } else{
            return 3;
        }
    }

    @Override
    public String getSecret() {
        return paper;
    }

    @Override
    public String toString() {
        return "PaperTicket{" +
                "owner='" + owner + '\'' +
                ", price=" + price +
                ", discount=" + discount +
                ", winner=" + winner +
                ", paper='" + paper + '\'' +
                '}';
    }
}
