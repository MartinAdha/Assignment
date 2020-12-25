import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int AkuHebat = input.nextInt();
    
    for (int Shotgun = 0; Shotgun < AkuHebat; Shotgun++) {
      for ( int pewpew= 0; pewpew < AkuHebat; pewpew++) {
        System.out.print(pewpew + " ");
         }
         System.out.println();
    }
    
  }
}