

public class Algoritmy {

//===========================KONSTANTNÍ ATRIBUTY TŘÍDY=============================
//===========================OSTATNÍ ATRIBUTY TŘÍDY================================
//===========================KONSTANTNÍ ATRIBUTY INSTANCÍ==========================
//===========================OSTATNÍ ATRIBUTY INSTANCÍ=============================

//===========================PŘÍSTUPOVÉ METODY ATRIBUTŮ TŘÍDY======================
//===========================OSTATNÍ METODY TŘÍDY==================================
    public static void prohozeniHodnotDvouPromennych(int a, int b) {
        output(a, b);
        a = a + b - (b = a);
        output(a, b);
    }
    
    public static void operatorXOR() {
        boolean result = true;
        for (int i = 0; i<5; i++) {
            System.out.println(result ^= true);
        }
        // ovšem je to to samé, jako následující syntaxe
        for (int i = 0; i<5; i++) {
            System.out.println(result = !result);
        }
    }
    
    public static void operatorySipek() {
        // x << y znamená x * 2 na ypsilontou
        System.out.println(3 << 0); // 3 * 2^0 = 3 * 1 = 3
        System.out.println(3 << 1); // 3 * 2^1 = 3 * 2 = 6
        System.out.println(3 << 2); // 3 * 2^2 = 3 * 4 = 12
        System.out.println(3 << 3); // 3 * 2^3 = 3 * 8 = 24
        System.out.println(3 << 4); // 3 * 2^4 = 3 * 16 = 48
        System.out.println(3 << 5); // 3 * 2^5 = 3 * 32 = 96
    }
    
    public static void operatoryOpacnychSipek() {
        // x >> y znamená x / 2 na ypsilontou
        System.out.println(100 >> 0); // 100 / 2^0 = 100 / 1 = 100
        System.out.println(100 >> 1); // 100 / 2^1 = 100 / 2 = 50
        System.out.println(100 >> 2); // 100 / 2^2 = 100 / 4 = 25
        System.out.println(100 >> 3); // 100 / 2^3 = 100 / 8 = 12
        System.out.println(100 >> 4); // 100 / 2^4 = 100 / 16 = 6
        System.out.println(100 >> 5); // 100 / 2^5 = 100 / 32 = 3
    }

//===========================TOVÁRNÍ METODY A KONSTRUKTORY=========================
    private Algoritmy() {
        
    }
//===========================PŘÍSTUPOVÉ METODY ATRIBUTŮ INSTANCÍ===================
//===========================OSTATNÍ METODY INSTANCÍ===============================

//===========================HLAVNÍ METODA=========================================

//===========================SOUKROMÉ METODY=======================================
    private static void output(int a, int b) {
        System.out.println(a + " : " + b);
    }

//===========================TESTOVACÍ METODY======================================
}
