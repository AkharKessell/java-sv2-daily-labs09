package Day01;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        Person person = new Person(new Ticket("Queen", LocalDateTime.now(), 2000));
        Person person2 = new Person(new FrontOfStageTicket("Queen", LocalDateTime.now(), 3000, "#sfg345"));

        Concert concert = new Concert();

        concert.addPerson(person2, LocalTime.of(15, 40));
        System.out.println("Ok");
        concert.addPerson(person, LocalTime.of(11, 40)); //IllegalArgumentException: Can't get in!
    }
}
