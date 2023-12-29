import java.util.Scanner;
public class App {
    public static void main(String[] args){

          Scanner userInput = new Scanner(System.in);

        float phi = 3.14f;
        float jari,LuasP, volume;

        System.out.println("\t Hitung Luas & volume bola dengan method \n\n");

        System.out.print(" Masukan nilai jari-jari :");
        jari = userInput.nextFloat();

        System.out.println("Hasilnya adalah.....");
        System.out.print("===============");

        LuasP = LuasPermukaan(jari);
        System.out.println("\n Luas Permukaanya :"+ LuasP);

        volume =volumeBola(jari);
        System.out.println("volume Bolanya      :" + volume);
       
    }
    public static float LuasPermukaan(float r){
        float phi = 3.14f;
        float hasil = 4 * phi * r * r;

        return hasil;

    }
    public static float volumeBola(float r){
        float phi = 3.14f;
        float hasil = 4 / (float) 3 * phi * r * r;

        return hasil;
    }
}