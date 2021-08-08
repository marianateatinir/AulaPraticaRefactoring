import java.util.Enumeration;

public class HtmlStatement extends Statement {
    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = nameText(aCustomer.getName());
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            //show figures for this rental
            result += rentalText(each.getMovie().getTitle(), each.getCharge());
        }
        //add footer lines
        result += owedText(aCustomer.getTotalCharge());
        result += earnedText(aCustomer.getTotalFrequentRenterPoints());
        return result;
    }

    private String nameText(String name) {
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    private String rentalText(String title, double charge) {
        return title + ": " + String.valueOf(charge) + "<BR>\n";
    }

    private String owedText(double value) {
        return "<P>You owe <EM>" + String.valueOf(value) + "</EM><P>\n";
    }

    private String earnedText(int points) {
        return "On this rental you earned <EM>" + String.valueOf(points) + "</EM> frequent renter points<P>";
    }
}
