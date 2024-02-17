import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static void satu(Integer lampu){
        ArrayList<Integer> jml = new ArrayList<>();
        int lampumati = 0;
        int lampuhidup = 0;

        for (int i=1;i<=lampu;i++){
            jml.add(i);
        }

        for (int j=0;j<jml.size();j++){
            if ((jml.get(j)%2!=0)&&(jml.get(j)%3!=0)&&(jml.get(j)%5!=0)&&(jml.get(j)%7!=0)&&(jml.get(j)%11!=0)){
                lampumati++;
            } else {
                lampuhidup++;
            }
        }
        System.out.println("NOMOR 1");
        System.out.print("a. ");
        System.out.println("Lampu yang tidak bisa Hidup atau Mati : "+lampumati);
        System.out.print("b. ");
        System.out.println("Lampu maksimal yang bisa dinyalakan : "+lampuhidup);
    }

    static void tigaA(Integer kartu, Integer ulang){
        int[] angka = new int[31];
        int card = 31-kartu+1;
        int tampung = 0;
        int tamp =0;

        for (int i=1;i<=angka.length;i++){
            angka[i-1] = i;
        }

        for (int j= 0;j<ulang;j++){
            tampung = angka[card-1];
            for (int k = card; k>1;k--){
                angka[k-1]=angka[k-2];
            }
            angka[0]=tampung;
        }
        System.out.println("NOMOR 3");
        System.out.print("a. ");
        System.out.println("Kartu pada tumpukan teratas = "+angka[0]);
    }

    static void tigaB(Integer kartu, Integer ulang){
        int[] angka = new int[31];
        int card = 31-kartu+1;
        int tampung = 0;
        int tamp =0;

        for (int i=1;i<=angka.length;i++){
            angka[i-1] = i;
        }

        for (int j= 0;j<ulang;j++){
            tampung = angka[card-1];
            for (int k = card; k>1;k--){
                angka[k-1]=angka[k-2];
            }
            angka[0]=tampung;
        }
        System.out.print("b. ");
        System.out.println("Kartu pada tumpukan teratas = "+angka[0]);
    }

    static void tigaC(Integer kartu, Integer up){
        int[] angka = new int[31];
        int card = 31-kartu+1;
        int tampung = 0;
        int tamp =0;

        for (int i=1;i<=angka.length;i++){
            angka[i-1] = i;
        }

        for (int j= 0;j<j+1;j++){
            tampung = angka[card-1];
            for (int k = card; k>1;k--){
                angka[k-1]=angka[k-2];
            }
            angka[0]=tampung;
            if(angka[0]==up) {
                tamp=j+1;
                break;
            }
        }
        System.out.print("c. ");
        System.out.println("Langkah yang harus dilakukan sebanyak = "+tamp);
    }

    static void dua(int permen, int cucu){
        double total = permen-7+cucu-1;
        double pembagi = cucu-1;
        double operasi = total/pembagi;
        double jml = (total-1)*operasi;
        System.out.println("NOMOR 2");
        System.out.println("Jumlah cara untuk membagikan permen = "+jml);
    }

    public static void main(String[] args) {

        System.out.println("JAWABAN PERTANYAAN");
        satu(30);
        System.out.println();
        dua(12,3);
        System.out.println();
        tigaA(5,45);
        tigaB(7,50);
        tigaC(3,1);
    }

}