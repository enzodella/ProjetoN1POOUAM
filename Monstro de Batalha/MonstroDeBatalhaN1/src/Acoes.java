import java.io.IOException;
import java.util.Scanner;


public class Acoes{
    
    public int acoesjogadores(Jogador jogador1, Jogador jogador2, int numPlayer)
            throws InterruptedException, IOException {
        int respMenu = 0;
        Scanner ler = new Scanner(System.in);
        System.out.println("AÇÃO DO JOGADOR " + numPlayer + ": \n");

        System.out.println("MONSTRO SELECIONADO DO JOGADOR 1 ");
        System.out.println(jogador1.nome[jogador1.monstros[jogador1.monstroSelecionado]] + ", Tipo: "
                + jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]] + ", Vida atual: "
                + jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] + "\n");

        System.out.println("MONSTRO SELECIONADO DO JOGADOR 2 ");
        System.out.println(jogador2.nome[jogador2.monstros[jogador2.monstroSelecionado]] + ", Tipo: "
                + jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]] + ", Vida atual: "
                + jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] + "\n");

        System.out.println("1 - ATAQUE \n2 - TROCAR MONSTRO");
        respMenu = ler.nextInt();

        if (respMenu == 1) {
            System.out.println("Você escolheu atacar!!!");
        } else {
            System.out.println("Você escolheu trocar o monstro");
        }
        System.out.println("\n\nDigite qualquer coisa para continuar");
        ler.next();
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

        return respMenu;
    }

    public void selecaoMonstro(Jogador jogador) throws IOException, InterruptedException {
        Scanner ler = new Scanner(System.in);
        int respMenu = 0, x = 0;
        boolean teste = false;
        do {
            System.out.println("Jogador " + jogador.numPlayer + ", escolha seus monstros!");
            System.out.println("1 - Oshuo, Elemento: Fogo, Vida: 110, Força 50, Defesa: 15, Velocidade: 20\n"
                    + "2 - Elco, Elemento: Grama, Vida: 110, Força 60, Defesa: 15, Velocidade: 15 \n"
                    + "3 - Nurion, Elemento: Agua, Vida: 90, Força 50, Defesa: 10, Velocidade: 25 \n"
                    + "4 - Plilu, Elemento: Luz, Vida: 90, Força 50, Defesa: 10, Velocidade: 15 \n"
                    + "5 - Cisur, Elemento: Gelo, Vida: 100, Força 50, Defesa: 10, Velocidade: 15 \n"
                    + "6 - Cubaytou, Elemento: Escuridão, Vida: 80, Força 40, Defesa: 10, Velocidade: 30 \n"
                    + "9 - Sair");
            respMenu = ler.nextInt();
            switch (respMenu) {
                case 1:
                    do {
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 0) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 0;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 2:
                    do {
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 1) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 1;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 3:
                     do{
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 2) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 2;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 4:
                    do {
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 3) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 3;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 5:
                    do{
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 4) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 5;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 6:
                    do {
                        for (int c = 0; c < 3; c++) {
                            if (jogador.monstros[c] == 0) {
                                teste = true;
                            }
                        }
                        if (teste == true) {
                            System.out.println("Monstro já selecionado anteriormente!!");
                        } else {
                            jogador.monstros[x] = 6;
                            x++;
                            teste = false;
                        }
                    }while (teste == true);
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Entrada inválida!");
                    break;
            }
        } while (x < 3 && respMenu != 9);

        Thread.sleep(2000);
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
}

