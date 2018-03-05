package eu.visiostudio.booking.dao;

import eu.visiostudio.booking.model.User;

public interface UserDao {

    void save(User user);

    User findById(int id);

    User findBySSO(String sso);

}

