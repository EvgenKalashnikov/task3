package task;

import task.controller.UserController;
import task.service.PropertiesService;
import task.service.UserService;
import task.view.UserView;

import java.util.Scanner;

public class App {
    private static final String propPath="src/task/resource/RegularExpressions.properties";
    public static void main(String[] args) {
        UserController userController = new UserController(new UserService(new Scanner(System.in)), new PropertiesService(propPath), new UserView());
        userController.appProcess();


    }




}
