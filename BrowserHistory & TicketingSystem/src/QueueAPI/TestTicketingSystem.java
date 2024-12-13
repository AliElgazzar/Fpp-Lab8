package QueueAPI;

public class TestTicketingSystem {
    public static void main(String[] args) {
        TicketingSystem system = new TicketingSystem();
        system.addTicket("Issue with login");
        system.addTicket("Payment not processed");
        system.addTicket("Error message on dashboard");
        system.viewNextTicket();
        system.processTicket();
        system.viewNextTicket();

        while (!system.isQueueEmpty()) {
            system.processTicket();
        }

        system.viewNextTicket();
        system.processTicket();
    }
}
