package filas;

import java.util.Scanner;

public class FilaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Fila f = new Fila();

        int op = 1;
        while (op != 0) {
            f.mostraElementosfila();
            f.mostrarMenuFila();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    f.insereElementoFila();
                    break;
                case 2:
                    f.removerElementoFila();
                    break;
            }
        }
    }
}
