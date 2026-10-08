import java.util.Scanner;

public class CinemaTicketssystem {

    static class MovieTicket {
    String movieName;
    double ticketPrice;
    int numberOfTickets;

     public MovieTicket(String name, double price, int tickets) {
     movieName = name;
     ticketPrice = price;
     numberOfTickets = tickets;
        }
        public double calculateTotal() {
        double total = ticketPrice * numberOfTickets;
        return total;
        }
        public double calculateDiscount() {
        double totalAmount = calculateTotal();
        double discount = 0.0;

       if (numberOfTickets >= 5) {
       discount = totalAmount * 0.10;
       }
       else {
       discount = 0.0;
       }
       return discount;
        }
     public double calculateFinalAmount() {
     double totalAmount = calculateTotal();
     double discountAmount = calculateDiscount();
     double finalAmount = totalAmount - discountAmount;
     return finalAmount;
        }
    public void displayBill() {
    double total = calculateTotal();
    double discount = calculateDiscount();
    double finalAmount = calculateFinalAmount();
    System.out.println("Ur Final bill is ");
    System.out.println("Movie Name: " + movieName);
    System.out.println("Ticket Price: "+ticketPrice);
    System.out.println("Number of Tickets: " + numberOfTickets);
    System.out.print("Total Amount: ");
    System.out.println("Discount: "+discount);
    System.out.println("Final Amount: "+finalAmount);
        }
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Movie Name: ");
    String name = sc.nextLine();
    System.out.print("Enter Ticket Price: ");
    double price = sc.nextDouble();
    System.out.print("Enter Number of Tickets: ");
    int tickets = sc.nextInt();
    MovieTicket obj = new MovieTicket(name, price, tickets);
    obj.displayBill();
    }
}