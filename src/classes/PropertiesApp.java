package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream("aplication.properties"));

            String port = properties.getProperty("database.port");
            String host = properties.getProperty("database.host");
            String username = properties.getProperty("database.username");
            String password = properties.getProperty("database.password");

            System.out.println(port);
            System.out.println(host);
            System.out.println(username);
            System.out.println(password);

        }catch (FileNotFoundException exception) {
            System.out.println("File not found");
        }catch (IOException exception) {
            System.out.println("Failed Load Data From File");
        }

        try{
            Properties properties = new Properties();

            properties.put("name.firstname", "Edho");
            properties.put("name.middle", "Dwi");
            properties.put("name.lastname", "Tirwanda");

            properties.store(new FileOutputStream("name.properties"), "Config Name");
        }catch (FileNotFoundException exception) {
            System.out.println("Error Creating a File");
        } catch (IOException exception) {
            System.out.println("Error Save Properties");
        }

    }
}
