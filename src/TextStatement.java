import java.util.Enumeration;

public class TextStatement extends Statement {
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
        return "Rental Record for " + name + "\n";
    }

    private String rentalText(String title, double charge) {
        return "\t" + title + "\t" + String.valueOf(charge) + "\n";
    }

    private String owedText(double value) {
        return "Amount owed is " + String.valueOf(value) + "\n";
    }

    private String earnedText(int points) {
        return "You earned " + String.valueOf(points) + " frequent renter points";
    }
}
