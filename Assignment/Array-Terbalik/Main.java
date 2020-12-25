import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   int[]angka = new int[5];
  
   for(int i = 0; i < angka.length; i++){
    angka[i] = input.nextInt();
  }
   for(int i = 4; i >=0; i--){
     System.out.println(angka[i] + " ");
   }
  } 
}