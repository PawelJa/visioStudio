package eu.visiostudio.booking.service;

import eu.visiostudio.booking.model.UserProfile;

import java.util.List;

public interface UserProfileService {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
