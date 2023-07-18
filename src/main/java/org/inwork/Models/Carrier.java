package org.inwork.Models;

/**
 * Модель перевозчика
 */
public class Carrier {
    public int id;
    public long cardNumber;


    public Carrier(int id, long cardNumber) {
        this.id = id;
        this.cardNumber = cardNumber;
    }

    public int getId() {
        return id;
    }

    public long getCardNumber() {
        return cardNumber;
    }
}
