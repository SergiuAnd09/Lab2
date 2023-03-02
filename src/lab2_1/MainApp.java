package lab2_1;

import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        String fis = "Judete.txt";
        BufferedReader flux_in;
        flux_in = new BufferedReader(new InputStreamReader(new FileInputStream(fis)));
        String []judete = new String[42];

        for(int i = 0; i< judete.length;i++){

            judete[i] = flux_in.readLine();
        }

        Arrays.sort(judete, 0, 41);
        for (int j = 0; j<judete.length -1 ;j++){

            System.out.println("Avem judetul " + judete[j]);
        }

        BufferedReader keyboard_in = new BufferedReader(new InputStreamReader(System.in));
        String linie;
        System.out.println("Dati numele judetului cautat: ");
        linie = keyboard_in.readLine();
        System.out.println("S-a citit urmatoarea treaba " + linie);

        /*for( int i = 0; i<judete.length-1; i++){

            //System.out.println("Am intrart aici cu " + judete[i]);
            if(linie.equals(judete[i])){

                System.out.println("Judetul cautat numit " + linie + " exista si e pe pozitia " + i);

            }
        }*/

        int poz = Arrays.binarySearch(judete, linie);
        System.out.println(poz>=0?"Gasit pe pozitia " +poz:"Nu se gaseste!");

    }
}
