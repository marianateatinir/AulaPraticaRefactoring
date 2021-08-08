import java.util.Enumeration;

public abstract class Statement {
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

    protected abstract String nameText(String name);
    protected abstract String rentalText(String title, double charge);
    protected abstract String owedText(double value);
    protected abstract String earnedText(int points);
}
