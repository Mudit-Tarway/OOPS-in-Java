package Day4.Code.question3;
import java.util.Scanner;

// a) Class TicketCounter
class TicketCounter {
    private int passengerCount;
    private double cashTotal;

    // b) Constructor to initialize
    public TicketCounter() {
        passengerCount = 0;
        cashTotal = 0.0;
    }

    // c-i) Paying passenger
    public void payingPassenger() {
        passengerCount++;
        cashTotal += 50.0;
    }

    // c-ii) Child passenger
    public void childPassenger() {
        passengerCount++;
        // No change to cashTotal
    }

    // c-iii) Display totals
    public void display() {
        System.out.println("\n--- Ticket Counter Summary ---");
        System.out.println("Total Passengers: " + passengerCount);
        System.out.println("Total Cash Collected: Rs. " + cashTotal);
    }
}

// d) Test program
public class Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TicketCounter counter = new TicketCounter();

        System.out.println("Toy Train Ticket Counter");
        System.out.println("Press:");
        System.out.println("  p --> Paying Passenger");
        System.out.println("  c --> Child Passenger");
        System.out.println("  d --> Display Totals and Exit");

        while (true) {
            System.out.print("Enter choice (p/c/d): ");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("p")) {
                counter.payingPassenger();
            } else if (input.equals("c")) {
                counter.childPassenger();
            } else if (input.equals("d")) {
                counter.display();
                break;
            } else {
                System.out.println("Invalid input. Try again.");
            }
        }

        scanner.close();
    }
}
