import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("When I say Computer, You say Science!\nEnter a number, press enter, and repeat:\n");
    Scanner in = new Scanner(System.in);
    while (true) {
      int input = in.nextInt();

      if (input % 4 == 0 && input % 5 == 0) {
        System.out.println("Computer Science!");
      } else if (input % 4 == 0) {
        System.out.println("Computer");
      } else if (input % 5 == 0) {
        System.out.println("Science");
      } else {
        System.out.println("Not Divisible!");
      }
      
    }
  }
}