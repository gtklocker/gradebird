import java.util.*;

public class CorrectAnswer {
  public static void main(String[] args) throws InterruptedException {
    Scanner in = new Scanner(System.in);

    if (in.hasNextInt()) {
      if (in.nextInt() == 1) {
        System.out.println("Correct");
      }
    }
  }
}
