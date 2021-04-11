package aceptaelreton;


import java.util.Scanner;

public class SecuenciaComun{
    
    
    
      public static void main(String[] args) {
                    
        final Scanner teclado = new Scanner(System.in);

        while (teclado.hasNext()) {

            A = teclado.next();
            B = teclado.next();

            System.out.println( contador() );
            recorrer(A.length(), B.length());
         
        }
       
        
    }
    


    static int[][] cadena = new int[100][100];
    static String A, B;

    static void recorrer(int y, int x) {
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                cadena[i+1][j+1] = 0;
            }
        }
    }

    static int contador() {
        for (int i = 0; i < A.length(); i++) {
            for (int j = 0; j < B.length(); j++) {
                if (A.charAt(i) == B.charAt(j)) {
                    cadena[i+1][j+1] = cadena[i][j] + 1;
                }
                else {
                    cadena[i+1][j+1] = Math.max(cadena[i][j+1], cadena[i+1][j]);
                }
            }
        }
        return cadena[A.length()][B.length()];
        
    }
    

  
}