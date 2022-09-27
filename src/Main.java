import java.util.LinkedList;

public class Main {




    public static void main(String[] args) {

        Kæledyr bøfBuffer = new Kæledyr("Riko", Kæledyr.Dyr.HEST);

        Studerende s0 = new Studerende("Hansen", 2000);

        s0.kæledyrsListe.add( new Kæledyr("Maren", Kæledyr.Dyr.HEST));


        Studerende s1 = new Studerende("Larsen", 1999);

        s1.kæledyrsListe.add(0, new Kæledyr("Niko", Kæledyr.Dyr.HEST));
        s1.kæledyrNavneskift("Niko","Bellic");
        s1.kæledyrsListe.add(bøfBuffer);


        Studerende s2 = new Studerende("Nielsen", 1989);

        s2.kæledyrsListe.add(0, new Kæledyr("Sue", Kæledyr.Dyr.MARSVIN));
        s2.kæledyrsListe.add(1, new Kæledyr("Miv", Kæledyr.Dyr.KAT));


        Studerende s3 = new Studerende("Jansen", 1773);

        s3.kæledyrsListe.add(bøfBuffer);


        LinkedList<Studerende> liste = new LinkedList<Studerende>();
        liste.add(s0);
        liste.add(s1);
        liste.add(s2);
        liste.add(s3);

        //udskrivDyr(liste, Kæledyr.Dyr.KAT);
        udskrivStuderende(liste);


    }

    public static void udskrivStuderende(LinkedList<Studerende> liste){
        for(Studerende stud : liste) {
            System.out.println("Studerende: " + stud.getNavn());
            if (stud.kæledyrsListe != null){
                for(int i = 0; i < stud.kæledyrsListe.size() ; i++) {
                    System.out.println("    Navn: " + stud.kæledyrsListe.get(i).getNavn() + ", art: " + stud.kæledyrsListe.get(i).getArt());

    }}}}


     public static void udskrivDyr(LinkedList<Studerende> liste, Kæledyr.Dyr d){

            for(Studerende stud : liste) {
                System.out.println("Studerende: " + stud.getNavn());
                for(int i = 0; i < stud.kæledyrsListe.size() ; i++) {
                    if (stud.kæledyrsListe.get(i).getArt() == d)
                        System.out.println("    Navn: " + stud.kæledyrsListe.get(i).getNavn() + "art: " + stud.kæledyrsListe.get(i).getArt());
        }}}




}