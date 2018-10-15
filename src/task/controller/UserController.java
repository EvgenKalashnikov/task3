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
        String postIndex;
        String city;
        String street;
        String houseNumber;
        String flatNumber;
        String firstName ;
        String middleName;
        String lastName;
        String nickname;
        String comments;
        String phoneNumber;
        String email;
        String skype;

        Properties properties = propertiesService.getProperties();

        String regexp;
        regexp = properties.getProperty("postIndex.regexp");
        while (true) {
            System.out.println(question1);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                postIndex = inputWord;
                break;
            }
        }

        regexp = properties.getProperty("city.regexp");
        while (true) {
            System.out.println(question2);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                city = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("street.regexp");
        while (true) {
            System.out.println(question3);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                street = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("houseNumber.regexp");
        while (true) {
            System.out.println(question4);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                houseNumber = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("flatNumber.regexp");
        while (true) {
            System.out.println(question5);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                flatNumber = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("firstName.regexp");
        while (true) {
            System.out.println(question6);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                firstName = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("middleName.regexp");
        while (true) {
            System.out.println(question7);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                middleName = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("lastName.regexp");
        while (true) {
            System.out.println(question8);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                lastName = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("nickname.regexp");
        while (true) {
            System.out.println(question9);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                nickname = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("comments.regexp");
        while (true) {
            System.out.println(question10);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                comments = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("phoneNumber.regexp");
        while (true) {
            System.out.println(question11);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                phoneNumber = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("email.regexp");
        while (true) {
            System.out.println(question12);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                email = inputWord;
                break;
            }
        }
        regexp = properties.getProperty("skype.regexp");
        while (true) {
            System.out.println(question13);
            String inputWord = userService.readWord();
            if (userService.validate(inputWord, regexp)) {
                skype = inputWord;
                break;
            }
        }

        User user = new User(firstName, middleName, lastName, nickname, comments, phoneNumber, email, skype, new Date(), new Date(), new Address(postIndex, city, street, houseNumber, flatNumber));
        userView.show(user);

    }

}
