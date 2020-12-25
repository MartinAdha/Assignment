import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int gege = input.nextInt();
    
     for (int i = 0; i < gege; i++) {
            for (int j = 0; j < gege; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    
  }
}