import java.util.Scanner;
class Main {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
   int jumlah = input.nextInt();
   int[]nilai = new int[jumlah];
  
   for(int i = 0; i <jumlah; i++){
    nilai[i] = input.nextInt();
  }
   for(int i = jumlah-1; i >=0; i--){
     System.out.print(nilai[i] + " ");
   }
  } 
}