public class HtmlStatement extends Statement {
    protected String nameText(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    protected String rentalText(String title, double charge) {
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    protected String owedText(double value) {
        return "<P>You owe <EM>" + String.valueOf(value) + "</EM><P>\n";
    }

    protected String earnedText(int points) {
        return "On this rental you earned <EM>" + String.valueOf(points) + "</EM> frequent renter points<P>";
    }
}
