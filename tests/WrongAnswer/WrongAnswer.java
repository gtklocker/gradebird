import java.util.*;

public class WrongAnswer {
  public static void main(String[] args) throws InterruptedException {
    Scanner in = new Scanner(System.in);

    if (in.hasNextInt()) {
      int num = in.nextInt();
      if (num == 1) {
        System.out.println("hi world");
      }
      else {
        System.out.println("goodbye world");
      }
    }
    else {
      System.out.println("hello world");
    }
  }
}
