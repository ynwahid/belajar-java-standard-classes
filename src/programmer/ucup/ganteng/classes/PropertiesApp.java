package programmer.ucup.ganteng.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {

  public static void main(String[] args) {

    try {
      Properties properties = new Properties();
      properties.load(new FileInputStream("application.properties"));

      String host = properties.getProperty("database.host");
      String port = properties.getProperty("database.port");
      String username = properties.getProperty("database.username");
      String password = properties.getProperty("database.password");

      System.out.println(host);
      System.out.println(port);
      System.out.println(username);
      System.out.println(password);
    } catch (FileNotFoundException exception) {
      System.out.println("File tidak ditemukan");
    } catch (IOException exception) {
      System.out.println("Gagal memuat data dari file");
    }

    try {
      Properties properties = new Properties();
      properties.put("name.first", "Yusuf");
      properties.put("name.middle", "Nur");
      properties.put("name.last", "Wahid");

      properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");

    } catch (FileNotFoundException exception) {
      System.out.println("Error Membuat Properties");
    } catch (IOException exception) {
      System.out.println("Error Menyimpan Properties");
    }

  }
}
