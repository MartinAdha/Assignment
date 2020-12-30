import java.util.Scanner;
class Main {
 
     public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
 int nvidiartx= input.nextInt();

 for(int i=1;i<=nvidiartx;i++){
 for(int j=1;j<=nvidiartx;j++)
 {
 if((j==1||j==nvidiartx)||(i==1||i==nvidiartx))
 System.out.print("#");
 else
 System.out.print(" ");
 }
 System.out.println();
 }
     } 
 }  