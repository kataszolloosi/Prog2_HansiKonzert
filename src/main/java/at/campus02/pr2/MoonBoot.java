package at.campus02.pr2;

public class MoonBoot implements NFCTicket{
    protected String owner;
    protected boolean color = false;  //mehrfarbig == true;   eine farbe == false;
    protected String moonboot;

    public MoonBoot(String owner, boolean color) {
        this.owner = owner;
        this.color = color;
        moonboot = TicketFraudSystem.createNewTicket("moonboot");
    }


    @Override
    public String getTicketOwner() {
        return owner;
    }

    @Override
    public double getProfit() {
        if (color == true) {
            return 250;
        } else {
            return 200;
        }
    }

    @Override
    public int getCategory() {
        if (color == true) {

            return 1;
        } else {

            return 2;
        }
    }

    @Override
    public String getSecret() {
        return moonboot;
    }

    @Override
    public String toString() {
        return "MoonBoot{" +
                "owner='" + owner + '\'' +
                ", color=" + color +
                ", moonboot='" + moonboot + '\'' +
                '}';
    }
}
