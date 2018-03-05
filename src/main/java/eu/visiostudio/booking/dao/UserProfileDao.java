package eu.visiostudio.booking.dao;

import eu.visiostudio.booking.model.UserProfile;
import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import java.util.List;

public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}
