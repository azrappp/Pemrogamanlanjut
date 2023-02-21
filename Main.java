package latihanpemdas;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    static int angka [][]  = new int [3][3];
    static boolean salah = true;
    public static void main(String[] args) {
        Main main = new Main();
        //masukin nilai ke kotak 
        for (int i = 0; i < angka.length; i++) {
            for (int j = 0; j < angka.length; j++) {
                angka[i][j]=0;
            }
        }
        angka[0][1]=3;
        angka[1][1]=2;
        angka[2][1]=5;
        main.showkotak();
        while(salah){  
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan Baris dan Kolom");
            System.out.print("Baris : ");
            int baris = input.nextInt();
            System.out.print("Kolom : ");
            int kolom = input.nextInt();
            System.out.print("angka : ");
            int angkainput = input.nextInt();
            boolean angkatetap = true;
            for (int i = 1; i <= 3; i++) {
                if(baris==i&&kolom==2){
                    angkatetap = false;
                }
            }
            if(angkatetap){
                angka[baris-1][kolom-1] = angkainput;
            }
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            main.showkotak();
            main.cek();
            showkotak();
        }
        System.out.println("==ANDA MENANG==");
    }
    static void showkotak(){
        System.out.println("=====PERMAINAN KOTAK AJAIB====");
        System.out.println("Jumlah Total = 10");
        for (int i = 0; i < 3; i++) {
                System.out.println("******************************");
                System.out.println("*         *         *        *");
                System.out.printf("*   %d     *    %d    *   %d    *\n",angka[i][0],angka[i][1],angka[i][2]);
                System.out.println("*         *         *        *");  
        }
        System.out.println("******************************");
    }
    private void cek(){
        //cek kolom 
        int kolombener = 0;
        int barisbener = 0;
        for (int i = 0; i < angka.length; i++) {
            int sum = 0;
            sum = angka[i][0]+angka[i][1]+angka[i][2];
            if(sum==10){
                kolombener++;
            }
            sum = 0;
        }
        //cek baris
        for (int i = 0; i < angka.length; i++) {
            int sum = 0;
            sum = angka[0][i]+angka[1][i]+angka[2][i];
            if(sum==10){
                barisbener++;
            }
            sum = 0;
        }
        if(kolombener==3&&barisbener==3){
            salah = false;
        }
        kolombener = 0;
        barisbener = 0;
    }

    

}

