package org.inwork.Core;

import org.inwork.Interfaces.ITicketRepo;
import org.inwork.Models.Ticket;
import org.inwork.Services.TicketRepository;

import java.util.List;

/**
 * Класс - провайдер для работы с базой данных билетов
 */
public class TicketProvider implements ITicketRepo {
    private ITicketRepo ticketRepo;


    public TicketProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.ticketRepo = TicketRepository.getTicketRepository();
    }

    @Override
    public boolean create(Ticket ticket) {
        return false;
    }

    @Override
    public List<Ticket> readAll(int num) {
        return List.of(new Ticket[0]);
    }

    @Override
    public boolean update(Ticket ticket) {
        return false;
    }

    @Override
    public boolean delete(Ticket ticket) {
        return false;
    }

    public List<Ticket> getTickets(int route) {
        return readAll(route);
    }


    /**
     * Метод получения билетов из базы данных
     *
     * @param routeNumber номер маршрута
     * @return список билетов
     * @throws RuntimeException
     */


    /**
     * Метод обновления статуса билета
     *
     * @param ticket билет
     * @return результат выполнения операции
     */
    public boolean updateTicketStatus(Ticket ticket) {
        return ticketRepo.update(ticket);
    }

}
