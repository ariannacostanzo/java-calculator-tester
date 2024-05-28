package trainTicket.exercise;

public class Ticket {

    //attributi
    private double kilometers;
    private int age;
    private final double discountForMinors;
    private final double discountForElders;
    private final double priceForKm;

    //costruttore
    public Ticket(int age, double kilometers) {
        this.discountForMinors = 0.20;
        this.discountForElders = 0.40;
        this.priceForKm = 0.21;
        this.age = validateAge(age);
        this.kilometers = validateKilometers(kilometers);
    }

    //metodi

    //validazione
    private int validateAge (int age) throws IllegalArgumentException{
        if (age <= 0) {
            throw new IllegalArgumentException("Invalid age");
        }
        return age;
    }

    private double validateKilometers (double km) throws IllegalArgumentException{
        if (km <= 0) {
            throw new IllegalArgumentException("Invalid kilometers");
        }
        return km;
    }

    //calcolo biglietto
    public double calculateTicketPrice() {
        double price = priceForKm * kilometers;
        double discount = 0;

        if (age < 18) {
            discount = discountForMinors * price;
            price -= discount;
        } else if (age > 65) {
            discount = discountForElders * price;
            price -= discount;
        }

        return price;

    }


    //getter e setter

    public double getKilometers() {
        return kilometers;
    }

    public void setKilometers(double kilometers) throws IllegalArgumentException{
        this.kilometers = validateKilometers(kilometers);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws IllegalArgumentException{
        this.age = validateAge(age);
    }

    public double getDiscountForMinors() {
        return discountForMinors;
    }

    public double getDiscountForElders() {
        return discountForElders;
    }
}
