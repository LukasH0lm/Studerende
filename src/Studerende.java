import java.util.ArrayList;
import java.util.LinkedList;

@SuppressWarnings("ALL")
public class Studerende {
    LinkedList<Kæledyr> kæledyrsListe;
    String navn;
    int fødselsår;


    public Studerende(String n, int år) {
        navn = n;
        fødselsår = år;
        kæledyrsListe = new LinkedList<>();
    }

    public String getNavn() {
        return navn;
    }

    public void kæledyrNavneskift(String gagamelNavn, String nytNavn){

        for(int i = 0; i < this.kæledyrsListe.size() ; i++)    {
            if (kæledyrsListe.get(i).getNavn() == gagamelNavn){

                kæledyrsListe.get(i).sætNavn(nytNavn);

            }

    }



    }}

