package eu.visiostudio.booking.service;

import eu.visiostudio.booking.model.User;

public interface UserService {

    User findById(int id);

    User findBySso(String sso);

}