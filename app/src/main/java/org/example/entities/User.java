package org.example.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashedPassword;
    private List<Ticket> ticketsBooked;
    private String userId;
    private String ContactNumber;

    public User(String name, String password, String hashedPassword, List<Ticket> ticketsBooked, String userId, String ContactNumber) {
        this.name = name;
        this.password = password;
        this.hashedPassword = hashedPassword;
        this.ticketsBooked = ticketsBooked;
        this.userId = userId;
        this.ContactNumber = ContactNumber;
    }

    public User(){}

    public String getName() {
        return this.name;
    }
    public String getPassword() {
        return this.password;
    }
    public String getHashedPassword() {
        return this.hashedPassword;
    }
    public List<Ticket> getTicketsBooked() {
        return this.ticketsBooked;
    }
    public void printTickets() {
        for (int i = 0; i < ticketsBooked.size(); i++)
            System.out.println(ticketsBooked.get(i).getTicketInfo());

    }

    public String getUserId() {
        return this.userId;
    }
    public String getContactNumber() {
        return this.ContactNumber;
    }

}
