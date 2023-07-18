package org.inwork.Interfaces;

import org.inwork.Models.User;

import java.util.List;

public interface IUserRepo {
    int create(User user);
    User read (int num);
    User read (String str);
    List<User> readAll ();
    boolean update(User user);
    boolean delete(User user);

    int create(String userName, int passwordHash, long cardNumber);
}
