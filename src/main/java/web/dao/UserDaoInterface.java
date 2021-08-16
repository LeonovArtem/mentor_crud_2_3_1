package web.dao;

import java.util.List;

import web.model.User;

public interface UserDaoInterface {

    List<User> listUsers();

    User find(long id);

    void save(User user);

    void update(User user);

    void delete(User user);
}
