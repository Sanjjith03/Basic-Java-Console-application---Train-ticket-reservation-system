import java.util.*;

public class reservation {
    ArrayList<train> available_trains = new ArrayList<>();
    ArrayList<String> booked_seats = new ArrayList<>();
    public reservation(){
        available_trains.add(new train("Mumbai - Delhi", "13:05", 50, 1010));
        available_trains.add(new train("Delhi - Jaipur", "7:00", 50, 2013));
        available_trains.add(new train("Prayagraj - Delhi", "10:00", 50, 3045));
    }

    public void display_trains(){
        System.out.println("Available trains: ");
        System.out.println("Train Name\tTime\tPassenger Strength\tTrain Number");
        for(train Train:available_trains){
            System.out.println(Train.name+"\t"+Train.time + "\t" + Train.passenger_strength + "\t" + Train.trainNumber);
        }
    }

    public void check_seat_availability(int trainNumber){
        for(train Train:available_trains){
            if(Train.trainNumber == trainNumber){
                int available_seats = Train.passenger_strength - booked_seats.size();
                System.out.println("Available seats on Train " + Train.trainNumber + ": " + available_seats);
                return;
            }
        }
        System.out.println("Train not found.");
    }

    public void book_tickets(int trainNumber, String passenger_name){
        for(train Train:available_trains){
            if(Train.trainNumber==trainNumber){
                if(booked_seats.size()<Train.passenger_strength){
                    System.out.println("Ticket booked successfully");
                }
                else{
                    System.out.println("Sorry, the train is fully booked");
                }
                return;
            }
        }
        System.out.println("Train not found.");
    }

    public void cancel(String passenger_name){
        if (booked_seats.remove(passenger_name)) {
            System.out.println("Ticket canceled successfully for " + passenger_name);
        } else {
            System.out.println("Passenger not found or no booking exists for this passenger.");
        }
    }

    public void displayBookedTickets() {
        System.out.println("Booked Tickets:");
        for (String passenger : booked_seats) {
            System.out.println(passenger);
        }
    }

}
