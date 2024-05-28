package trainTicket.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest {

    @Test
    void calculateTicketPrice() {
        Ticket ticket = new Ticket(25, 100);
        assertEquals(21, ticket.calculateTicketPrice());
    }

    @Test
    void calculateTicketPriceWithDiscount() {
        Ticket ticket = new Ticket(15, 100);
        assertEquals(16.8, ticket.calculateTicketPrice());
        Ticket ticket2 = new Ticket(68, 100);
        assertEquals(12.6, ticket2.calculateTicketPrice());
    }


    @Test
    void generateValidTicket() {
        Ticket ticket = new Ticket(15, 50);
        assertEquals(15, ticket.getAge());
        assertEquals(50, ticket.getKilometers());
    }
    @Test
    void generateInvalidTicket() {
        assertThrows(IllegalArgumentException.class, ()->new Ticket(0, 15));
        assertThrows(IllegalArgumentException.class, ()->new Ticket(15, -5));
    }
}