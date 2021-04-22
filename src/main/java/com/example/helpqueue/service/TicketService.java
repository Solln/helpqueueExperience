package com.example.helpqueue.service;

import com.example.helpqueue.model.Ticket;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface TicketService {

    boolean createTicket(Ticket ticket);

    Ticket getTicket(Long id);

    Iterable<Ticket> getTickets(String status) throws JsonProcessingException;

    void updateTicket(Ticket ticket);

    void deleteTicket(Long id);


}
