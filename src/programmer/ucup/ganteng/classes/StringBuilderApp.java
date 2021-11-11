package programmer.ucup.ganteng.classes;

public class StringBuilderApp {

  public static void main(String[] args) {

    String name = "Yusuf";

    name = name + " " + "Nur";

    name = name + " " + "Wahid";

    System.out.println(name);

    // Membuat 3 objek string baru karena string itu immutable
    // Yusuf
    // Yusuf Nur
    // Yusuf Nur Wahid

    StringBuilder builder = new StringBuilder();
    builder.append("Yusuf");
    builder.append(" ");
    builder.append("Nur");
    builder.append(" ");
    builder.append("Wahid");

    String name2 = builder.toString();
    System.out.println(name2);
  }
}
