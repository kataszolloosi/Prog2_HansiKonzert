package at.campus02.pr2;

public class AppTicket implements NFCTicket {
    protected String owner;
    protected double price;
    protected String system;
    protected String app;

    public AppTicket(String owner, double price, String system) {
        this.owner = owner;
        this.price = price;
        this.system = system;
        app = TicketFraudSystem.createNewTicket("app");
    }

    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {

        if (system.equals("ios")) {
            return price * 0.7;
        } else if (system.equals("android")) {
            return price * 0.75;
        }
        return price * 0.8;
    }

    @Override
    public int getCategory() {
        if (price >= 100){

            return 1;
        } else if (price > 50) {

            return  2;
        } else {

            return 3;
        }
    }

    @Override
    public String getSecret() {
        return app;
    }

    @Override
    public String toString() {
        return "AppTicket{" +
                "owner='" + owner + '\'' +
                ", price=" + price +
                ", system='" + system + '\'' +
                ", app='" + app + '\'' +
                '}';
    }
}
