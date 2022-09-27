public class Kæledyr {


    String navn;
    Dyr art;

    enum Dyr {
        HUND,
        KAT,
        MARSVIN,
        HEST
    }

    public Kæledyr(String n, Dyr a){
        navn = n;
        art = a;


    }

    String getNavn(){
        return navn;

    }

    Dyr getArt(){
        return art;

    }

    void sætNavn(String nytNavn){
        navn = nytNavn;

    }

}
