package task.service;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesService {
    private final String propertyPath;

    public PropertiesService(String propertyPath) {
        this.propertyPath = propertyPath;
    }

    public Properties getProperties (){
        Properties prop = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(propertyPath)) {
            prop.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }
}
