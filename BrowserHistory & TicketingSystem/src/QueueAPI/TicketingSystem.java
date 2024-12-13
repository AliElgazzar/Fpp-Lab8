package QueueAPI;

import java.util.LinkedList;
import java.util.Queue;

class TicketingSystem {
    private Queue<Ticket> ticketQueue;
    private int nextId;

    public TicketingSystem() {
        this.ticketQueue = new LinkedList<>();
        this.nextId = 1;
    }

    public void addTicket(String description) {
        Ticket newTicket = new Ticket(nextId++, description);
        ticketQueue.offer(newTicket);
        System.out.println("Added: " + newTicket);
    }

    public Ticket processTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets to process.");
            return null;
        }
        Ticket processedTicket = ticketQueue.poll();
        System.out.println("Processed: " + processedTicket);
        return processedTicket;
    }

    public Ticket viewNextTicket() {
        if (ticketQueue.isEmpty()) {
            System.out.println("No tickets in the queue.");
            return null;
        }
        Ticket nextTicket = ticketQueue.peek();
        System.out.println("Next ticket: " + nextTicket);
        return nextTicket;
    }

    public boolean isQueueEmpty() {
        return ticketQueue.isEmpty();
    }

    public int getQueueSize() {
        return ticketQueue.size();
    }
}