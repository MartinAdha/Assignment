import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    int pilih = input.nextInt();
    
    switch (pilih) {
      case 1:
        System.out.println("Selamat datang di jurusan Teknik Informatika");
        break;
      case 2:
          System.out.println("Selamat datang di jurusan Sistem Informasi");
          break;
      case 3:
          System.out.println("Selamat datang di jurusan Teknik Elektro");
          break;
      case 4:
          System.out.println("Selamat datang di jurusan Teknik Industri");
          break;
      case 5:
          System.out.println("Selamat datang di jurusan Matematika Terapan");
          break;
        
    }
  }
}