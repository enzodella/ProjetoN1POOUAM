import java.io.IOException;
import java.util.Scanner;

public class Jogador extends Monstros {
    protected int monstros[] = new int[3];
    protected int numPlayer;
    protected int monstroSelecionado = 0;

    public Jogador(int numJogador) {
        this.numPlayer = numJogador;
        this.monstroSelecionado = 0;
        this.monstros[0] = -1;
        this.monstros[1] = -1;
        this.monstros[2] = -1;
    }

    public void trocaMonstro() throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        boolean teste = false;
        while (teste == false) {
            System.out.println("Jogador " + numPlayer + ", gostaria de selecionar qual monstro? \n1 - "
                    + nome[monstros[0]] + ", Tipo: " + elemento[monstros[0]] + ", Vida Atual: " + vida[monstros[0]]
                    + " \n2 - " + nome[monstros[1]] + ", Tipo: " + elemento[monstros[1]] + ", Vida Atual: "
                    + vida[monstros[1]] + " \n3 - " + nome[monstros[2]] + ", Tipo: " + elemento[monstros[2]]
                    + ", Vida Atual: " + vida[monstros[2]]);
            monstroSelecionado = (ler.nextInt() - 1);
            if (vida[monstros[monstroSelecionado]] > 0) {
                teste = true;
            } else {
                teste = false;
                System.out.println("\nEsse seu monstro foi derrotado, por favor escolher outro!\n");
            }
        }
        Thread.sleep(2000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}
