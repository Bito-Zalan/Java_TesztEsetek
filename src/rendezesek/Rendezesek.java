
package rendezesek;


public class Rendezesek {
    
    //ittlesznek a redezes fvnyek
    public static int[] egyszeru(int[] sorozat) {
        //itt történik majd a rendezés
        for (int i = 0; i < sorozat.length; i++) {
             int min = i;
             for (int j = i+1; j < sorozat.length; j++) {
                if (sorozat[min] > sorozat[j]){
                    min = j;
                }
            }
             int csere = sorozat[i];
             sorozat[i] = sorozat[min];
             sorozat[min] = csere;
        }
        return sorozat;
    }
    
}
