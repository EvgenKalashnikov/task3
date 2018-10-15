package task.controller;

import task.model.Address;
import task.model.User;
import task.service.PropertiesService;
import task.service.UserService;
import task.view.UserView;

import java.util.Date;
import java.util.Properties;

public class UserController {
    private final UserService userService;
    private final PropertiesService propertiesService;
    private final UserView userView;

    public UserController(UserService userService, PropertiesService propertiesService, UserView userView) {
        this.userService = userService;
        this.propertiesService = propertiesService;
        this.userView = userView;
    }

    public void appProcess() {


        Properties properties = propertiesService.getProperties();

        String regexp;
        regexp = properties.getProperty("postIndex.regexp");
        String question1 = "Input post index";
        String postIndex = userService.getToken(regexp, question1);
        regexp = properties.getProperty("city.regexp");
        String question2 = "Input city";
        String city = userService.getToken(regexp, question2);
        regexp = properties.getProperty("street.regexp");
        String question3 = "Input street";
        String street = userService.getToken(regexp, question3);
        regexp = properties.getProperty("houseNumber.regexp");
        String question4 = "Input house number";
        String houseNumber = userService.getToken(regexp, question4);
        regexp = properties.getProperty("flatNumber.regexp");
        String question5 = "Input flat number";
        String flatNumber = userService.getToken(regexp, question5);
        regexp = properties.getProperty("firstName.regexp");
        String question6 = "Input first name";
        String firstName = userService.getToken(regexp, question6);
        regexp = properties.getProperty("middleName.regexp");
        String question7 = "Input middle name";
        String middleName = userService.getToken(regexp, question7);
        regexp = properties.getProperty("lastName.regexp");
        String question8 = "Input last name";
        String lastName = userService.getToken(regexp, question8);
        regexp = properties.getProperty("nickname.regexp");
        String question9 = "Input nickname";
        String nickname = userService.getToken(regexp, question9);
        regexp = properties.getProperty("comments.regexp");
        String question10 = "Input comments";
        String comments = userService.getToken(regexp, question10);
        regexp = properties.getProperty("phoneNumber.regexp");
        String question11 = "Input phone number";
        String phoneNumber = userService.getToken(regexp, question11);
        regexp = properties.getProperty("email.regexp");
        String question12 = "Input email";
        String email = userService.getToken(regexp, question12);
        regexp = properties.getProperty("skype.regexp");
        String question13 = "Input skype";
        String skype = userService.getToken(regexp, question13);

        User user = new User(firstName, middleName, lastName, nickname, comments, phoneNumber, email, skype, new Date(), new Date(), new Address(postIndex, city, street, houseNumber, flatNumber));
        userView.show(user);

    }


}
