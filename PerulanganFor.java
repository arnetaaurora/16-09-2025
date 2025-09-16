package AccountTest;

import java.util.Scanner;

public class PerulanganFor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        boolean kondisi = true;
        int counter=0;
        String jawab;

        while (kondisi) {
            System.out.println("Apakah anda ingin keluar(ya/tidak)");
            jawab = input.next();

            if(jawab.equalsIgnoreCase("ya")){
                kondisi = false;
            }
            counter++;
       
            
        }
        System.out.println("anda sudah mengulang  sebanyak " + counter +"kali");
    
    }
    
}
