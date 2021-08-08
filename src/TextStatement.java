public class TextStatement extends Statement {
    protected String nameText(String name) {
        return "Rental Record for " + name + "\n";
    }

    protected String rentalText(String title, double charge) {
        return "\t" + title + "\t" + String.valueOf(charge) + "\n";
    }

    protected String owedText(double value) {
        return "Amount owed is " + String.valueOf(value) + "\n";
    }

    protected String earnedText(int points) {
        return "You earned " + String.valueOf(points) + " frequent renter points";
    }
}
