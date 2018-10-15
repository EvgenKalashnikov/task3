package task.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {

    private final Scanner scanner;

    public UserService( Scanner scanner) {
        this.scanner = scanner;
    }

    private String readWord() {
        return scanner.next();
    }
    private boolean validate(String inputWord, String regexpExpression){
        Pattern pattern = Pattern.compile(regexpExpression);
        Matcher matcher = pattern.matcher(inputWord);
        return matcher.matches();

    }

    private String getToken(String regexp, String question1) {
        String s;
        while (true) {
            System.out.println(question1);
            String inputWord = readWord();
            if (validate(inputWord, regexp)) {
                s = inputWord;
                break;
            }
        }
        return s;
    }
    public String getString(String regexp, String question2) {
        return getToken(regexp, question2);
    }
}
