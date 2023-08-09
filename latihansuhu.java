import java.util.Scanner;

public class latihansuhu {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan Suhu Celcius");
        
        
        double celcius = input.nextDouble();

        System.out.println("OPSI");
        System.out.println("1.Reamur");
        System.out.println("2.Fahrenhait");
        System.out.println("3.Kelvin");

        
        int opsi = input.nextInt();

        if(opsi == 1){
            double R = 4*celcius/5;
            System.out.println("Hasil dari "+celcius+" Celcius Adalah "+R+" Reamur");
        }

        else if(opsi == 2){
            double F =  9*celcius/5+32;
            System.out.println("Hasil dari "+celcius+" Celcius Adalah "+F+" Fahrenhait");
        }

        else if(opsi == 3){
            double K = celcius+273;
            System.out.println("Hasil dari "+celcius+" Celcius Adalah "+K+" Kelvin");
        }

        else{
            System.out.println("Maaf Tidak Ada Opsi Untuk Ini :)");
        }
    }
    



    
}
