import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int matriks [][] = new int [5][5];
    
    for (int row = 0; row < 5; row++) {
      for (int coloumn = 0; coloumn < 5; coloumn++) {
        matriks[row][coloumn] = input.nextInt();
      }
    }
    int nilai = 0;
    for (int row = 0; row < 5; row++) {
      for (int coloumn = 0; coloumn < 5; coloumn++) {
        nilai += matriks[row][coloumn];
      }
      System.out.println(nilai);
      nilai = 0;
    }
    
  }
}