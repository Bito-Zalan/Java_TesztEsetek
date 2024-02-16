package rendezesek;


public class Teszt {
    public static void asszertek() {
        //1. teszt eset
        int[] sor1 = {};
        assert rendezettE(Rendezesek.egyszeru(sor1)): "Üres sorozatra nem működik.";
        
        //2. teszt eset
        int[] sor2 = {3, 5, 6};
        assert rendezettE(Rendezesek.egyszeru(sor2)): "Szigorúan monoton növekvő sorozatra nem mükődik";
        
        //3. teszt eset
        int[] sor3 = {3, 5, 6};
        assert rendezettE(Rendezesek.egyszeru(sor3)): "Szigorúan monoton növekvő sorozatra nem mükődik";
        
        //4. teszt eset
        int[] sor4 = {13, 5, -5, -6};
        assert rendezettE(Rendezesek.egyszeru(sor4)): "Csőkkenő sorozatra nem mükődik";
        
        //5. teszt eset
        int[] sor5 = {10, 2, 14, };
        assert rendezettE(Rendezesek.egyszeru(sor5)): "Völgy típusu sorozatra sorozatra nem mükődik";
        
        //6. teszt eset
        int[] sor6 = {10, 42, 14};
        assert rendezettE(Rendezesek.egyszeru(sor6)): "Hegy típusu sorozatra nem mükődik";
        
        //7. teszt eset
        int[] sor7 = {13, 5, 5, 6};
        assert rendezettE(Rendezesek.egyszeru(sor7)): "Az első nagyobb, a többi rendezett sorozatra nem mükődik";
        
        //8. teszt eset
        int[] sor8 = {13, 55, 75, 6};
        assert rendezettE(Rendezesek.egyszeru(sor7)): "Az utolsó legkissebb, a többi rendezett sorozatra nem mükődik";
        
        //9. teszt eset
        int[] sor9 = {13, 55, 35, 46};
        assert rendezettE(Rendezesek.egyszeru(sor9)): "Hegy-völgy sorozatra nem mükődik";
        
        //10. teszt eset
        int[] sor10 = {13, -5, 35, 16, 45, 0};
        assert rendezettE(Rendezesek.egyszeru(sor10)): "Völgy-hegy sorozatra nem mükődik";


    }
    
    public static boolean rendezettE(int[] sor) {
        int i = 0;
        while(i < sor.length-1 && sor[i] <= sor[i+1]){
            i++;
        }
        return i>= sor.length-1;
    }
}
