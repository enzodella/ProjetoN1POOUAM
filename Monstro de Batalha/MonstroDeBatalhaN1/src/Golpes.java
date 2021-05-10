import java.util.Scanner;

import java.io.IOException;

public class Golpes extends Monstros {
    private String[] golpesFogo = { "Incinerar", "Bola de Fogo", "Incendiar" };
    private int[] poderFogo = { 30, 40, 50 };
    private String[] golpesGrama = { "Ascensão  dos espinhos", "Selva Magica", "Enraizamento" };
    private int[] poderGrama = { 30, 40, 50 };
    private String[] golpesAgua = { "Prisão Aquática", "Maré Violenta", "Ataque do Ouriço" };
    private int[] poderAgua = { 30, 40, 50 };
    private String[] golpesLuz = { "Iluminação", "Rajada de Luz", "Labareda Solar" };
    private int[] poderLuz = { 30, 40, 50 };
    private String[] golpesGelo = { "Estilhaço de Gelo", "Fissura glacial", "Tempestade Glacial" };
    private int[] poderGelo = { 30, 40, 50 };
    private String[] golpesEscuridao = { "Portador do anoitecer", "Ceifar", "Horror indescritivel" };
    private int[] poderEscuridao = { 20, 30, 40 };
    private int poderJogador;
    private boolean isFirst = true;

    public void selecaoPoder(Jogador jogador1, Jogador jogador2, int jogadorAtacante)
            throws InterruptedException, IOException {
        Scanner ler = new Scanner(System.in);

        int c = 1, con = 0, resp = 0;
        String elementoJogador = jogadorAtacante == 1
                ? jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]]
                : jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]];
        // System.out.println("Monstro Jogador1: " + monstrojogador1);
        // System.out.println("Monstro Selecionado Jogador1: " +
        // jogador1.monstros[jogador1.monstroSelecionado]);
        // System.out.println(jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]]);

        switch (elementoJogador) {
            case "Fogo":
                System.out.println("Selecione seu golpe Jogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesFogo) {
                    System.out.print(c++ + " - " + golpe + ", com poder: " + poderFogo[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 30;
                        break;
                    case 2:
                        poderJogador = 40;
                        break;
                    case 3:
                        poderJogador = 50;
                        break;
                    default:
                }
                break;
            case "Grama":
                System.out.println("Selecione seu golpe Jogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesGrama) {
                    System.out.print(c++ + " - " + golpe + ", com poder: " + poderGrama[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 40;
                        break;
                    case 2:
                        poderJogador = 50;
                        break;
                    case 3:
                        poderJogador = 60;
                        break;
                    default:
                }
                break;
            case "Agua":
                System.out.println("Selecione seu golpe Jogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesAgua) {
                    System.out.print(c++ + " - " + golpe + ", com poder de: " + poderAgua[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 30;
                        break;
                    case 2:
                        poderJogador = 40;
                        break;
                    case 3:
                        poderJogador = 50;
                        break;
                    default:
                }
                break;
            case "Luz":
                System.out.println("Selecione seu golpe Jogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesLuz) {
                    System.out.print(c++ + " - " + golpe + ", com poder de: " + poderLuz[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 30;
                        break;
                    case 2:
                        poderJogador = 40;
                        break;
                    case 3:
                        poderJogador = 50;
                        break;
                    default:
                }
                break;
            case "Gelo":
                System.out.println("Selecione seu golpe Jogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesGelo) {
                    System.out.print(c++ + " - " + golpe + ", com poder de: " + poderGelo[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 30;
                        break;
                    case 2:
                        poderJogador = 40;
                        break;
                    case 3:
                        poderJogador = 50;
                        break;
                    default:
                }
                break;
            case "Escuridao":
                System.out.println("Selecione seu golpe ogador " + jogadorAtacante + ": \n");
                for (String golpe : golpesEscuridao) {
                    System.out.print(c++ + " - " + golpe + ", com poder de: " + poderEscuridao[con] + " \n");
                    con++;
                }
                resp = ler.nextInt();
                switch (resp) {
                    case 1:
                        poderJogador = 20;
                        break;
                    case 2:
                        poderJogador = 30;
                        break;
                    case 3:
                        poderJogador = 40;
                        break;
                    default:
                }
                break;
            default:

        }

        Thread.sleep(2000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        resultadoBatalha(jogador1, jogador2, jogadorAtacante, isFirst);

        System.out.println("\n\n\n\n               ATACARRRRRRR!!!!!!!!!!!               \n\n\n\n");

        int vida = jogadorAtacante == 2 ? jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]]
                : jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]];
        int defesa = jogadorAtacante == 2 ? jogador1.defesa[jogador1.monstros[jogador1.monstroSelecionado]]
                : jogador2.defesa[jogador2.monstros[jogador2.monstroSelecionado]];
        String elementoAtacante = jogadorAtacante == 1
                ? jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]]
                : jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]];
        String elementoAtacado = jogadorAtacante == 2
                ? jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]]
                : jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]];
        

        switch (elementoAtacante) {
            case "Fogo":
                if (elementoAtacado.equals("Grama") || elementoAtacado.equals("Gelo")) {

                    System.out.println(
                            "Você está atacando um monstro de um elemento que você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Agua") || elementoAtacado.equals("Escuridao")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            case "Grama":
                if (elementoAtacado.equals("Luz")) {

                    System.out.println(
                            "Você está atacando um monstro de um elementoque você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n ");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Fogo") || elementoAtacado.equals("Escuridao")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            case "Agua":
                if (elementoAtacado.equals("Fogo")) {

                    System.out.println(
                            "Você está atacando um monstro de um elementoque você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Gelo")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            case "Luz":
                if (elementoAtacado.equals("Escuridao")) {

                    System.out.println(
                            "Você está atacando um monstro de um elementoque você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Grama")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            case "Gelo":
                if (elementoAtacado.equals("Agua")) {

                    System.out.println(
                            "Você está atacando um monstro de um elementoque você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Fogo")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            case "Escuridao":
                if (elementoAtacado.equals("Grama") || elementoAtacado.equals("Fogo")) {

                    System.out.println(
                            "Você está atacando um monstro de um elementoque você tem vantagem! \nPor isso o dano do golpe será aumentado!!\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador *= 1.5;
                    System.out.println("Dano do golpe aumentado: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                } else if (elementoAtacado.equals("Luz")) {
                    System.out.println(
                            "Você está atacando um monstro de um elemento que você não tem vantagem! \nPor isso o dano do golpe será reduzido\n\n");
                    System.out.println("Dano do golpe: " + poderJogador);
                    poderJogador /= 1.5;
                    System.out.println("Dano do golpe diminuido: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }else{
                    System.out.println("Dano do golpe: " + poderJogador);
                    System.out.println("Defesa do monstro atacado: " + defesa);
                    System.out.println("Dano a causar: " + (poderJogador - defesa));
                    System.out.println("\nDigite alguma coisa para continuar!");
                    ler.next();
                }
                break;
            default:
        }
        vida -= poderJogador - defesa;
        if (jogadorAtacante == 1) {
            jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] = vida;

        } else if (jogadorAtacante == 2) {
            jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] = vida;
        }
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        resultadoBatalha(jogador1, jogador2, jogadorAtacante, isFirst);
    }

    public void resultadoBatalha(Jogador jogador1, Jogador jogador2, int jogadorAtacante, boolean isFirst) throws InterruptedException, IOException  {
        Scanner ler = new Scanner(System.in);
        if (isFirst == true) {
            System.out.println("JOGADOR " + jogadorAtacante + " ESCOLHEU ATACAR!!!\n");
            isFirst = false;
        } else {
            isFirst = true;
        }

        System.out.println("MOSNTRO SELECIONADO DO JOGADOR 1   ");
        System.out.println(jogador1.nome[jogador1.monstros[jogador1.monstroSelecionado]] + ", Tipo: "
                + jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]] + ", Vida atual: "
                + jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] + "\n");

        System.out.println("MOSNTRO SELECIONADO DO JOGADOR 2 ");
        System.out.println(jogador2.nome[jogador2.monstros[jogador2.monstroSelecionado]] + ", Tipo: "
                + jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]] + ", Vida atual: "
                + jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] + "\n");

        isFirst = false;
        System.out.println("\nDigite alguma coisa para continuar!");
        ler.next();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}