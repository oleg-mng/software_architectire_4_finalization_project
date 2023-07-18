package org.inwork.Interfaces;

import org.inwork.Core.UserProvider;
import org.inwork.Models.Ticket;
import org.inwork.Models.User;

import java.util.Date;
import java.util.List;

public interface ICustomer {
    User getUser();
    User setUser();
    UserProvider getUserProvider();

    void setUser(User client);

    boolean buyTicket(Ticket ticket);
    List<Ticket> searchTicket(Date date, int num);


}
