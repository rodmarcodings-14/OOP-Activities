import java.util.Scanner;

public class BasicArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("How many words do you want to input: ");
    int n = sc.nextInt();
    sc.nextLine(); // consume newline

    String[] words = new String[n];

    System.out.println("Please enter " + n + " words:");
    for (int i = 0; i < n; i++) {
      words[i] = sc.nextLine();
    }

    System.out.println("First Element: " + words[0]);
    System.out.println("Last Element: " + words[n - 1]);

    System.out.print("All words: ");
    for (int i = 0; i < n; i++) {
      System.out.print(words[i] + " ");
    }

    sc.close();
  }
}
