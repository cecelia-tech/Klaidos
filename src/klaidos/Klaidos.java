/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package klaidos;

/**
 *
 * @author vita
 */
public class Klaidos {

   // public static void main(String[] args) {
        // TODO code application logic here
        /*
        1. patikrinam ar per kintamojo prizme matosi toks metodas
        2. ziurim i kokios klases objekta rodo kintamasis
        3. metodo paieskas pradedam nuo (realaus objekto) klases
        4. jei toje klaseje tokio metodo nera, ziurim i super klases ir t.t.
        5. kai surandam metoda - kvieciam t.y. sustabdom sita scope ir sukriam nauja scope kvieciamam metodui
        6. jei reikia perduodam parametru reksmes
        7. naujame scope kintamajam this (context) priskiriam reiksme
        (iki tasko - siuo atveju nuoroda i ta pati objekta i kuri rodo kintamasis o)
        8. laukiam kol metodo scope baigs darba.
        9. tesiam sita scope
        
        //java.lang.NullPointerException
        Object o = null;
        String s = o.toString();
        System.out.println(s);*/
        /*
        kadangi o rodo i nieko(null), java nezino nuo kur pradet ieskot to nurodyto metodo
        */
        //classCasting
        //stackOverflow
        public static String biblioteka(String knygosPavadinimas) {
        String ret = null;
        /*
        surandu norima knyga
        */
//        ret = "as tau pakisau ne ta knyga";
        return ret;
    }
   
    public static int watsonVardas(String knygosPavadinimas) {
        String tekstas = biblioteka(knygosPavadinimas);
        if (tekstas == null) {
            IllegalArgumentException ex = new IllegalArgumentException("Nera tokios knygos");
           
            Object o = new IllegalArgumentException("priskirta kintamajam tipo Object\nthrow'inant cast'inam");
            System.out.println("Dabar pasakysiu, kad neradau tokios knygos");
            throw new IllegalArgumentException("Ner tokios knygos");
        }
        int kiek = 0;
        /*
        paskaiciuju kiek kartu maciau Watson varda
        */
        return kiek;
    }
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
        int sk = watsonVardas("Baskerviu suo");
        System.out.println(sk);
        } catch (IllegalArgumentException ex)
        {
            System.out.println("Pagavom klaida " + ex.getMessage());
        }
        System.out.println("pabaiga");
    }
    
}
