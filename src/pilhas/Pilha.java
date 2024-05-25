package pilhas;

import java.util.Scanner;

public class Pilha {
    private final int tamanho = 5;
    private int ini = 0;
    private int fim = 0;
    private int[] dados;

    public Pilha() {
        this.dados = new int[this.getTamanho()];
    }

    public int getTamanho() {
        return tamanho;
    }

    public int getIni() {
        return ini;
    }

    public void setIni(int ini) {
        this.ini = ini;
    }

    public int getFim() {
        return fim;
    }

    public void setFim(int fim) {
        this.fim = fim;
    }

    public int getDados(int indice) {
        return dados[indice];
    }

    public void setDados(int indice, int dados) {
        this.dados[indice] = dados;
    }

    public void mostraPilha() {
        System.out.print("[");
        for (int i = 0; i < this.getTamanho(); i++) {
            System.out.print(this.getDados(i));
        }
        System.out.println("] ");
    }

    public void adcionaDadosPilha() {
        Scanner sc = new Scanner(System.in);
        if (getFim() == this.getTamanho()) {
            System.out.println("A pilha está cheia, impossível empilhar um novo elemento!");
        } else {
            System.out.println("Digite o valor a ser empilhado: ");
            int valor = sc.nextInt();
            setDados(getFim(), valor);
            setFim(getFim() + 1);
        }
    }

    public void removeDadosPilha() {
        if (getIni() == getFim()) {
            System.out.println("A pilha está vazia, não há nada para desempilhar!");
        } else {
            setDados(getFim() - 1, 0);
            setFim(getFim() - 1);
        }
    }

    public void mostraMenu() {
        System.out.println("Escolha uma opcao: ");
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("0 - Sair");
    }
}
