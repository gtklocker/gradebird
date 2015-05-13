import java.util.*;

public class SleepyAnswer {
  public static void main(String[] args) throws InterruptedException {
    Scanner in = new Scanner(System.in);

    Thread.sleep(1000);
    if (in.hasNextInt()) {
      if (in.nextInt() == 1) {
        System.out.println("Correct");
      }
    }
  }
}
