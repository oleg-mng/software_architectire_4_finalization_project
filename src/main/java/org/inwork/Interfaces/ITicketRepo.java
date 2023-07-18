package org.inwork.Interfaces;

import org.inwork.Models.Ticket;

import java.util.List;

public interface ITicketRepo {
    boolean create (Ticket ticket);
    List<Ticket> readAll(int num);
    boolean update(Ticket ticket);
    boolean delete(Ticket ticket);
}
