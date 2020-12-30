import java.util.Scanner;

class Main {
    public static void main(String[] args) {
      
      Scanner input = new Scanner(System.in);
      
      System.out.print("");
      String nama = input.nextLine();
      
      System.out.print("");
      int tahun = input.nextInt();
      
      int umur = 2020 - tahun;
      System.out.printf("%s (%d tahun)", nama , umur);
      
  
       
    }
}