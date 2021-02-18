package kiralynok;

import java.io.IOException;

public class Kiralynok {
    
    private Tabla tabla;

    public Kiralynok() {
        tabla = new Tabla('#');
    }
    
    
    
    public static void main(String[] args) throws IOException {
        
       Kiralynok kir = new Kiralynok();
       kir.megoldasok();
        
    }

    private void megoldasok() {
       feladat4();
       feladat6();
       feladat9();
    }

    private void feladat4() {
        System.out.println("4. feldat: üres tábla megjelenítése:");
        tabla.megjelenit();
        
    }

    private void feladat6() {
        System.out.println("6. feladat: feltöltött tábla:");
        tabla.elhelyez(8);
        tabla.megjelenit();
    }

    private void feladat9() {
        System.out.println("9. feladat: üress sorok és oszlopok száma:");
        System.out.println("Sorok: " + tabla.uresSorokSzama());
        System.out.println("Oszlop: " + tabla.uresOszlopokSzama());
    }
    
}
