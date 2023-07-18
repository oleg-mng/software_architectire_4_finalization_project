package org.inwork.Core;

import org.inwork.Interfaces.IUserRepo;
import org.inwork.Models.User;
import org.inwork.Services.UserRepository;

import java.util.List;

/**
 * Класс - провайдер для работы с базой данных клиентов
 */
public class UserProvider implements IUserRepo {
    private IUserRepo clientRepository;

    /**
     * Конструктор класса
     */
    public UserProvider() {
        // Класс репозитория находится в единственном экземпляре для того, чтобы не создавать несколько подключений
        // к базе данных. Реализация паттерна Синглтон.
        this.clientRepository = UserRepository.getClientRepository();
    }

    /**
     * Метод создания нового клиента
     *
     * @param userName     имя клиента
     * @param passwordHash хэш пароля
     * @param cardNumber   номер банковской карты
     * @return ID клиента в базе
     * @throws RuntimeException
     */
    public int createClient(String userName, int passwordHash, long cardNumber) throws RuntimeException {
        int id = clientRepository.create(userName, passwordHash, cardNumber);
        return id;
    }

    /**
     * Метод поиска клиента из базы по имени
     *
     * @param userName имя клиента
     * @return модель клиента
     * @throws RuntimeException
     */
    public User getClientByName(String userName) throws RuntimeException {
        var client = clientRepository.read(userName);
        return client;
    }

    /**
     * Метод получения списка всех клиентов (для реализации тестов и администрирования), не используется.
     *
     * @return список клиентов
     * @throws RuntimeException
     */
    public List<User> getAllClients() throws RuntimeException {
        var clients = clientRepository.readAll();
        return clients;
    }

    @Override
    public int create(User user) {
        return 0;
    }

    @Override
    public User read(int num) {
        return null;
    }

    @Override
    public User read(String str) {
        return null;
    }

    @Override
    public List<User> readAll() {
        return List.of(new User[0]);
    }

    @Override
    public boolean update(User user) {
        return false;
    }

    @Override
    public boolean delete(User user) {
        return false;
    }

    @Override
    public int create(String userName, int passwordHash, long cardNumber) {
        return 0;
    }
}
