package grafos;

import java.util.Scanner;

public class GrafoTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Grafo g = new Grafo();
        g.quantidadeVertice();
        int opc = 1;
        while (opc != 0) {
            g.mostraVertice();
            g.mostraMa();
            g.mostraMenu();
            opc = sc.nextInt();

            switch (opc) {
                case 1:
                    g.inserirAresta();
                    break;
                case 2:
                    g.removeAresta();
                    break;
            }
        }
        sc.close();
    }
}
