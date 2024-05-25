package grafos;

import java.util.Scanner;

public class Grafo {
    private final int maximo;
    private int tamanhoVertice;
    private int[] grafo;
    private int[][] ma;
    private Scanner sc;


    public Grafo() {
        this.maximo = 10;
        this.grafo = new int[maximo];
        this.ma = new int[maximo][maximo];
        this.sc = new Scanner(System.in);
    }

    public int getMaximo() {
        return maximo;
    }

    public int getTamanhoVertice() {
        return tamanhoVertice;
    }

    public void setTamanhoVertice(int tamanho) {
        this.tamanhoVertice = tamanho;
    }

    public int getGrafo(int index) {
        return grafo[index];
    }

    public void setGrafo(int index, int valor) {
        this.grafo[index] = valor;
    }

    public int getMa(int index1, int index2) {
        return ma[index1][index2];
    }

    public void setMa(int index1, int index2, int valor) {
        this.ma[index1][index2] = valor;
    }

    public void quantidadeVertice() {
        System.out.println("Escolha a quantidade de vértices do grafo: [maximo " + getMaximo() + "]");
        int quantidade = sc.nextInt();
        if (quantidade <= 0 || quantidade > getMaximo()) {
            throw new IllegalArgumentException("Escolha um valor entre 1 e " + getMaximo());
        } else {
            setTamanhoVertice(quantidade);
            adicionaVertice();
        }

    }

    private void adicionaVertice() {
        for (int i = 0; i < getTamanhoVertice(); i++) {
            setGrafo(i, i);
        }
    }

    public void inserirAresta() {
        int num1;
        int num2;

        System.out.println("Escolha o vértice de origem entre 0, " + (getTamanhoVertice() - 1));
        num1 = sc.nextInt();
        System.out.println("Escolha o vértice de destino entre 0," + (getTamanhoVertice() - 1));
        num2 = sc.nextInt();

        if (num1 > (getTamanhoVertice() - 1) || num2 > (getTamanhoVertice() - 1) || num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Os valores precisam estar entre 0 e " + (getTamanhoVertice() - 1));
        } else {
            setMa(num1, num2, 1);
            setMa(num2, num1, 1);
        }

    }

    public void removeAresta() {
        int num1;
        int num2;
        System.out.println("Escolha o vértice de origem entre 0, " + (getTamanhoVertice() - 1));
        num1 = sc.nextInt();
        System.out.println("Escolha o vértice de destino entre 0," + (getTamanhoVertice() - 1));
        num2 = sc.nextInt();

        if (num1 > (getTamanhoVertice() - 1) || num2 > (getTamanhoVertice() - 1) || num1 < 0 || num2 < 0) {
            throw new IllegalArgumentException("Os valores precisam estar entre 0 e " + (getTamanhoVertice() - 1));
        } else {
            setMa(num1, num2, 0);
            setMa(num2, num1, 0);
        }
    }

    public void mostraVertice() {
        System.out.println("Lista de vertices do grafo: ");
        System.out.print("[");
        for (int i = 0; i < getTamanhoVertice(); i++) {
            System.out.print(getGrafo(i));
        }
        System.out.println("]");
    }

    public void mostraMa() {
        System.out.println("[");
        for (int i = 0; i < getTamanhoVertice(); i++) {
            for (int j = 0; j < getTamanhoVertice(); j++) {
                System.out.print(getMa(i, j) + " ");
            }
            System.out.println();
        }
        System.out.println("]");
    }

    public void mostraMenu() {
        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Inserir aresta");
        System.out.println("2 - Remover aresta");
        System.out.println("0 - Sair");

    }
}