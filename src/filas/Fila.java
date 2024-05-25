package filas;

import java.util.Scanner;

public class Fila {
    private final int tamanho = 3;
    private String[] elementos;
    private int ini = 0;
    private int fim = 0;

    public Fila() {
        this.elementos = new String[getTamanho()];
        preencheElementoFila();
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getElementos(int indice) {
        return elementos[indice];
    }

    public void setElementos(int indice, String elemento) {
        this.elementos[indice] = elemento;
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

    public void insereElementoFila() {
        Scanner sc = new Scanner(System.in);
        if (getFim() == getTamanho()) {
            System.out.println("A fila está cheia, impossível inseri um novo elemento");
        } else {
            System.out.println("Um elemento a ser inserido: ");
            String elementoAInseri = sc.nextLine();
            setElementos(getFim(), elementoAInseri);
            setFim(getFim() + 1);
        }
    }

    public void removerElementoFila() {
        if (getIni() == getFim()) {
            System.out.println("A fila está vazia, não há nada para remover!");
        } else {
            for (int i = 0; i < getTamanho() - 1; i++) {
                setElementos(i, getElementos(i + 1));
            }
            setElementos(getFim() - 1, "Vazio");
            setFim(getFim() - 1);
        }
    }


    public void mostraElementosfila() {
        System.out.print("{");
        for (int i = 0; i < getTamanho(); i++) {
            System.out.print(getElementos(i) + ",");
        }
        System.out.println("}");
    }

    private void preencheElementoFila() {
        for (int i = 0; i < getTamanho(); i++) {
            setElementos(i, "Vazio");
        }
    }

    public void mostrarMenuFila() {
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Inserir na Fila");
        System.out.println("2 - Remover da Fila");
        System.out.println("0 - Sair");
    }
}
