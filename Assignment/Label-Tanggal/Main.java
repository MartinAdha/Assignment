import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int xx = input.nextInt();
        System.out.print(xx);
        
        int nomorBulan = input.nextInt();
        String[] yy = {
                "Nomor tidak valid",
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

      
        
       
if (nomorBulan <= 12) {
      System.out.print(" " + yy [nomorBulan - 0] + " ");
      } else if (nomorBulan < 0) {
      System.out.println("Nomor tidak valid");
    } else {
        System.out.println("Nomor tidak valid");
}
int zzzz = input.nextInt();
System.out.print(zzzz);
    }
}