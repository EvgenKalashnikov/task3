package task.service;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserService {

    private final Scanner scanner;

    public UserService( Scanner scanner) {
        this.scanner = scanner;
    }

    public String readWord() {
        return scanner.next();
    }
    public boolean validate(String inputWord, String regexpExpression){
        Pattern pattern = Pattern.compile(regexpExpression);
        Matcher matcher = pattern.matcher(inputWord);
        return matcher.matches();

    }

    public String getRegexp() {
        return null;
    }
}
