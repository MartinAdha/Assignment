import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int number = 0;
    int ganjil = 0;
    
    try {
      while (true) {
        number = input.nextInt();
        if (number %2 != 0) {
          ganjil++;
        }
      }
    }catch(NumberFormatException err){
      System.out.println(ganjil);
    }catch(Exception err){
      System.out.println(ganjil);
    }
  }
}