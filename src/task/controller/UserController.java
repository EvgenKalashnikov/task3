package task.controller;

import task.model.Address;
import task.model.User;
import task.service.PropertiesService;
import task.service.UserService;
import task.view.UserView;

import java.util.Date;
import java.util.Properties;

public class UserController {
    private static String question1 = "Input post index";
    private static String question2 = "Input city";
    private static String question3 = "Input street";
    private static String question4 = "Input house number";
    private static String question5 = "Input flat number";
    private static String question6 = "Input first name";
    private static String question7 = "Input middle name";
    private static String question8 = "Input last name";
    private static String question9 = "Input nickname";
    private static String question10 = "Input comments";
    private static String question11 = "Input phone number";
    private static String question12 = "Input email";
    private static String question13 = "Input skype";
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
        String postIndex = getString(regexp, question1);
        regexp = properties.getProperty("city.regexp");
        String city = getString(regexp, question2);
        regexp = properties.getProperty("street.regexp");
        String street = getString(regexp, question3);
        regexp = properties.getProperty("houseNumber.regexp");
        String houseNumber = getString(regexp, question4);
        regexp = properties.getProperty("flatNumber.regexp");
        String flatNumber = getString(regexp, question5);
        regexp = properties.getProperty("firstName.regexp");
        String firstName = getString(regexp, question6);
        regexp = properties.getProperty("middleName.regexp");
        String middleName = getString(regexp, question7);
        regexp = properties.getProperty("lastName.regexp");
        String lastName = getString(regexp, question8);
        regexp = properties.getProperty("nickname.regexp");
        String nickname = getString(regexp, question9);
        regexp = properties.getProperty("comments.regexp");
        String comments = getString(regexp, question10);
        regexp = properties.getProperty("phoneNumber.regexp");
        String phoneNumber = getString(regexp, question11);
        regexp = properties.getProperty("email.regexp");
        String email = getString(regexp, question12);
        regexp = properties.getProperty("skype.regexp");
        String skype = getString(regexp, question13);

        User user = new User(firstName, middleName, lastName, nickname, comments, phoneNumber, email, skype, new Date(), new Date(), new Address(postIndex, city, street, houseNumber, flatNumber));
        userView.show(user);

    }



    private String getString(String regexp, String question2) {
        String s = userService.getString(regexp, question2);
        return s;
    }

}
