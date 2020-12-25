import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int x = input.nextInt();
    int y = input.nextInt();
    int Matriks[][] = new int [x][y];
    
    for (int row = 0; row < x; row++){
      for (int column = 0; column < y; column++){
        Matriks[row][column] = input.nextInt();
      }
    }
    
    int ganjil = 0;
    for (int row = 0; row < x; row++){
      for (int column = 0; column < y; column++){
        if (Matriks [row][column] % 2 != 0){
          ganjil++;
        }
      }
      System.out.println(ganjil);
      ganjil = 0;
  }
  
  }
}