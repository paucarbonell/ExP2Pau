package exP2Pau;

import java.util.Scanner;

public class LetraDNI {

    int dni;
    public static void main(String[] args) {
        Scanner scc = new Scanner(System.in);
        int dni;
        do{
            System.out.print("Introduce número de DNI: ");
            dni = scc.nextInt();
        }while(dni < 1);
        System.out.println("Letra dni -> " + obtenerLetraDNI(dni));                                               
    }
    public static char obtenerLetraDNI(int dni) {
        char[] letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                         'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};                             
        return letras[dni % 23];
    }
    
}