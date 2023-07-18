package org.inwork.Core;

import org.inwork.Interfaces.ICarrierRepo;
import org.inwork.Interfaces.ICashRepo;
import org.inwork.Models.Carrier;
import org.inwork.Models.Ticket;
import org.inwork.Models.User;
import org.inwork.Services.CarrierRepository;
import org.inwork.Services.CashRepository;

/**
 * Класс - провайдер для взаимодействия с банком и базой перевозчиков
 */
public class CashProvider extends Customer implements ICarrierRepo, ICashRepo {
    private long cardNumber;
    private boolean isAuthorized;

    private ICarrierRepo carrierRepository;
    private ICashRepo cashRepository;

    /**
     * Конструктор класса
     */
    public CashProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.carrierRepository = CarrierRepository.getCarrierRepository();
        this.cashRepository = CashRepository.getCashRepository();
    }

    @Override
    public Carrier read(int num) {
        return null;
    }

    @Override
    public boolean transaction(int payment, long cardFrom, long carrierСard) {
        return false;
    }



    /**
     * Метод покупки билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     * @throws RuntimeException
     */
    // подсказка  Carrier carrier = carrierRepository.read(1);
    // подсказка  return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    public boolean buy(Ticket ticket) {
        Carrier carrier = carrierRepository.read(1);
        return cashRepository.transaction(ticket.getPrice(), cardNumber, carrier.getCardNumber());
    }


    /**
     * Метод авторизации клиента. Здесь должно быть реализовано обращение к банку для подтверждения личности клиента.
     *
     * @param client
     */
    public void authorization(User client) {
    }


}
