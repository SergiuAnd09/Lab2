package lab2_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        StringBuilder sir1, sir2;
        String u, t;
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Dati sirul in care se va face inserarea: ");
        u = buff.readLine();
        sir1 = new StringBuilder(u);
        System.out.println("Dati sirul de inserat: ");
        t = buff.readLine();
        sir2 = new StringBuilder(t);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dati pozitia de unde se va pune sirul de inserat.");
        int poz = scanner.nextInt();

        if(t.length()<=u.length() - poz){

                    sir1.insert(poz, sir2);
                    System.out.println(sir1);

                    System.out.println("Dati pozitia de unde se va incepe stergerea: ");
                    int del = scanner.nextInt();
                    System.out.println("Dati pozitia unde se va incheia stergerea: ");
                    int inch = scanner.nextInt();

                    sir1.delete(del, inch);
                    System.out.println(sir1 );
        }
        else {
            System.out.println("Sirul de inserat e prea mare pentru cel suport");
        }
    }
}
