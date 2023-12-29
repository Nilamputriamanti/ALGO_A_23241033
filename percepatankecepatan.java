import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner (System.in);
        System.out.println("Diket : + jarak ...meter,dalam waktu ...detik");
        System.out.println("Diket : kecepatan rata-rata?");

        System.out.print("Masukan jarak:");
        int jarak = input.nextInt();

        System.out.print("Masukan waktu:");

        double waktu = input.nextDouble();
        double total = jarak/waktu;
        System.out.println("jawaban :" + jarak + "/" + waktu + ":" + total);
        
        
      
    }
}