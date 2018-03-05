package eu.visiostudio.booking.configuration;

import eu.visiostudio.booking.model.UserProfile;
import eu.visiostudio.booking.model.UserProfileType;
import eu.visiostudio.booking.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoleToUserProfileConverter implements Converter<Object, UserProfile> {

    @Autowired
    UserProfileService userProfileService;

    //Get UserProfile by id

    public UserProfile convert (Object element) {
        Integer id = Integer.parseInt((String) element);
        UserProfile profile = userProfileService.findById(id);
        System.out.println("Profile :" + profile);
        return profile;
    }
}
