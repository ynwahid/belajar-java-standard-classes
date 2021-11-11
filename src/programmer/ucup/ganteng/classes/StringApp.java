package programmer.ucup.ganteng.classes;

public class StringApp {

  public static void main(String[] args) {

    String name = "Yusuf Nur Wahid";
    String nameLowercase = name.toLowerCase();
    String nameUppercase = name.toUpperCase();

    System.out.println(name);
    System.out.println(nameLowercase);
    System.out.println(nameUppercase);
    System.out.println(name.length());
    System.out.println(name.startsWith("Yus"));
    System.out.println(name.endsWith("hid"));

    String[] names = name.split(" ");
    for (var value : names) {
      System.out.println("Name value: " + value);
    }

    System.out.println(" ".isBlank());
    System.out.println(" ".isEmpty());
    System.out.println("".isEmpty());
    System.out.println(name.charAt(0));

    char[] chars = name.toCharArray();
    for (var ch : chars) {
      System.out.println("Char array: " + ch);
    }
  }
}
