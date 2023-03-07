package lab2_2;

public class Vers {

    private String vers;

    public Vers(String vers){

        this.vers = vers;
    }
    public int nr_cuvinte(){

        String[] cuvinte = vers.split(" ");
        return cuvinte.length;
    }

    public int nr_vocale(){

        int c = 0;
        char a;
        for(int i = 0;i<vers.length();i++){

            a = vers.charAt(i);
            if(a=='a' || a == 'A' || a=='e'||a=='E'||a=='i'||a=='I'||a=='o'||a=='O'||a=='u'||a=='U'){

                c++;
            }
        }
        return c;
    }

    public boolean match(String dat){

        if(dat.regionMatches(true, 0, vers, vers.length() - dat.length(), dat.length())){

            return true;
        } else return false;
    }
}
