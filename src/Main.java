import java.util.*;
public class Main {
    public static void main(String[] args) {
            reservation reservationsystem = new reservation();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("\nRailway Reservation System Menu:");
                System.out.println("1. Display Available Trains");
                System.out.println("2. Check Seat Availability");
                System.out.println("3. Book a Ticket");
                System.out.println("4. Cancel a Ticket");
                System.out.println("5. Display Booked Tickets");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        reservationsystem.display_trains();
                        break;
                    case 2:
                        System.out.print("Enter Train Number: ");
                        int trainNumber = scanner.nextInt();
                        reservationsystem.check_seat_availability(trainNumber);
                        break;
                    case 3:
                        System.out.print("Enter Train Number: ");
                        trainNumber = scanner.nextInt();
                        scanner.nextLine();  // Consume the newline character
                        System.out.print("Enter Passenger Name: ");
                        String passengerName = scanner.nextLine();
                        reservationsystem.book_tickets(trainNumber, passengerName);
                        break;
                    case 4:
                        System.out.print("Enter Passenger Name to Cancel: ");
                        passengerName = scanner.nextLine();
                        reservationsystem.cancel(passengerName);
                        break;
                    case 5:
                        reservationsystem.displayBookedTickets();
                        break;
                    case 6:
                        System.out.println("Exiting Railway Reservation System. Thank you!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }
}