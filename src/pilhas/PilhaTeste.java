package pilhas;

import java.util.Scanner;

public class PilhaTeste {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        Scanner sc = new Scanner(System.in);
        int op = 1;
        while (op != 0) {
            p.mostraPilha();
            p.mostraMenu();
            op = sc.nextInt();
            switch (op) {
                case 1:
                    p.adcionaDadosPilha();
                    break;
                case 2:
                    p.removeDadosPilha();
                    break;

            }
        }
        sc.close();

    }


}
