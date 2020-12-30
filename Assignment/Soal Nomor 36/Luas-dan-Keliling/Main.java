import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    double inputpanjang = input.nextDouble();
    double inputlebar = input.nextDouble();
    ShowKelilingandLuas(inputpanjang, inputlebar);
    
  }
  public static void ShowKelilingandLuas(double panjang, double lebar){
    System.out.println(luas(panjang, lebar));
    System.out.println(keliling(panjang, lebar));
  }
    public static double keliling(double panjang, double lebar){
      double result = 2 * (panjang + lebar);
      return result;
    }
    public static double luas(double panjang, double lebar){
      double result = panjang * lebar;
      return result;
    }
}