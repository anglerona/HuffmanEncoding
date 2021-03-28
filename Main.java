import java.util.Scanner;
import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    decode(sc);
  }
  public static String decode(Scanner sc) {
    int letters = sc.nextInt();
    Hashtable<String, String> dict = new Hashtable<String, String>();
    sc.nextLine();

    for (int i = 0; i < letters; ++i) {
      String input = sc.nextLine();
      String[] splited = input.split("\\s+"); 
      dict.put(splited[1], splited[0]);
    }

    String output = "";
    int start = 0;
    int end = 1;
    String code = sc.nextLine();

    while (end <= code.length()) {

      if (dict.containsKey(code.substring(start, end))) {
        output = output + dict.get(code.substring(start, end));

        start = end;
        end = end + 1;

      } else {
        end = end + 1;
      }
    }
    System.out.println(output);

    return "";
  }
}
