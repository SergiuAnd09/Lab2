package lab2_2;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        File file = new File("Song_out.txt"); //fac fisierul de iesire
        file.createNewFile();
        BufferedReader buff = new BufferedReader(new InputStreamReader(new FileInputStream("Song.txt")));//facem obiectul cu care sa citim din el
        BufferedReader nuff = new BufferedReader(new InputStreamReader(new FileInputStream("Song.txt")));
        BufferedReader zuff = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader tuff = new BufferedReader(new InputStreamReader(new FileInputStream("Song_out.txt")));
        Random rand = new Random();
        float lep;
        PrintStream scrie = new PrintStream("Song_out.txt");

        int c = 0;
        while(buff.readLine()!=null){ //aflam cate linii sunt in fisier
            c++;
        }

        String []m = new String[c];
        String []n = new String[c];
        Vers []versurile = new Vers[c];//tabloul de versuri

        for(int j = 0;j<c;j++){ //forul asta baga in vectorul de siruri versurile, genereaza un numar pt fiecare dintre versuri, si ii da upper la conditie
            m[j] = nuff.readLine();
            lep = rand.nextFloat(1);
            System.out.println(lep);
            if(lep<0.1){

                m[j]=m[j].toUpperCase();
            }
        }

        for(int k = 0;k < c; k++){ //initializarea obiectelor din vectorul de clasa Versuri

            versurile[k] = new Vers(m[k]);
        }

        for(int z = 0;z<c;z++){ //scrie in tabloul de scris in fisierul de iesire

            //scrie.println(m[z] + " Cuvinte:  " + versurile[z].nr_cuvinte() + " Vocale: " + versurile[z].nr_vocale());
            n[z] = m[z] + " Cuvinte:  " + versurile[z].nr_cuvinte() + " Vocale: " + versurile[z].nr_vocale();
        }

        label :do{ //meniu de cautat siruri de text in linie si adaugat steluta la linia unde se gaseste la final ceea ce se cauta
            int opt;
            System.out.println("0.Iesire\n1.Introducere litere de cautat pt steluta.");
            System.out.println("Ce optiune doriti:");
            opt = scanner.nextInt();
            switch(opt){

                default : System.out.println("Introduceti o valoare valida.");
                case 0 : break label;
                case 1 :
                    System.out.println("Dati sirul de cautat la final: ");
                    String linie = zuff.readLine();
                    for(int i = 0;i < c;i++){

                        if(versurile[i].match(linie)){

                            n[i] += " *";
                        }
                    }
            }
        }while(true);

        for(int i = 0; i<c;i++){ //scrie in fisierul de iesire

            scrie.println(n[i]);
        }

    }
}
