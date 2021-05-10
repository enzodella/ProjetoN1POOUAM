import java.util.Scanner;
import java.io.IOException;

public class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        Scanner ler = new Scanner(System.in);
        Jogador jogador1 = new Jogador(1);
        Jogador jogador2 = new Jogador(2);
        Acoes acao = new Acoes();
        Golpes golpe = new Golpes();
        int respMenu1, respMenu2;
        acao.selecaoMonstro(jogador1);
        acao.selecaoMonstro(jogador2);
        //jogador1.selecaoMonstro();
        //jogador2.selecaoMonstro();

        while ((jogador1.vida[jogador1.monstros[0]] > 0 || jogador1.vida[jogador1.monstros[1]] > 0
                || jogador1.vida[jogador1.monstros[2]] > 0)
                && (jogador2.vida[jogador2.monstros[0]] > 0 || jogador2.vida[jogador2.monstros[1]] > 0
                        || jogador2.vida[jogador2.monstros[2]] > 0)) {

            if (jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] <= 0) {
                System.out.println(
                        "Jogador 1, seu monstro foi derrotado! ;-; \nSerá necessário escolher outro monstro!\n\n");
                jogador1.trocaMonstro();

            } else if (jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] <= 0) {
                System.out.println(
                        "Jogador 2, seu monstro foi derrotado! ;-; \nSerá necessário escolher outro monstro!\n\n");
                jogador2.trocaMonstro();
            }

            respMenu1 = acao.acoesjogadores(jogador1, jogador2, 1);

            respMenu2 = acao.acoesjogadores(jogador1, jogador2, 2);

            if (respMenu1 == 2) {
                jogador1.trocaMonstro();
            }

            if (respMenu2 == 2) {
                jogador2.trocaMonstro();
            }

            if (respMenu1 == 1 && respMenu2 == 1) {
                if (jogador1.velocidade[jogador1.monstros[jogador1.monstroSelecionado]] == jogador2.velocidade[jogador2.monstros[jogador2.monstroSelecionado]]) {
                    if (jogador1.elemento[jogador1.monstros[jogador1.monstroSelecionado]]
                            .equals(jogador2.elemento[jogador2.monstros[jogador2.monstroSelecionado]])) {
                        System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                        System.out.println("Os monstros são os mesmos!");
                        System.out.println("Monstro do jogador 1 ataca primeiro por ser o primeiro jogador!");
                        System.out.println("\n\nDigite qualquer coisa para continuar");
                        ler.next();
                        golpe.selecaoPoder(jogador1, jogador2, 1);
                        if (jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] > 0) {
                            golpe.selecaoPoder(jogador1, jogador2, 2);
                        }
                    } else if (jogador1.forca[jogador1.monstros[jogador1.monstroSelecionado]] > jogador2.forca[jogador1.monstros[jogador2.monstroSelecionado]]) {
                        System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                        System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                        System.out.println("Monstro do jogador 1, é mais veloz!");
                        System.out.println("\n\nDigite qualquer coisa para continuar");
                        ler.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        golpe.selecaoPoder(jogador1, jogador2, 1);
                        if (jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] > 0) {
                            golpe.selecaoPoder(jogador1, jogador2, 2);
                        }
                    } else if (jogador1.forca[jogador1.monstros[jogador1.monstroSelecionado]] < jogador2.forca[jogador2.monstros[jogador2.monstroSelecionado]]) {
                        System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                        System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                        System.out.println("Monstro do jogador 2, é mais veloz!");
                        System.out.println("\n\nDigite qualquer coisa para continuar");
                        ler.next();
                        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                        golpe.selecaoPoder(jogador1, jogador2, 2);
                        if (jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] > 0) {
                            golpe.selecaoPoder(jogador1, jogador2, 1);
                        }
                    } else if (jogador1.forca[jogador1.monstros[jogador1.monstroSelecionado]] == jogador2.forca[jogador2.monstros[jogador2.monstroSelecionado]]) {
                        if (jogador1.defesa[jogador1.monstros[jogador1.monstroSelecionado]] > jogador2.defesa[jogador2.monstros[jogador2.monstroSelecionado]]) {
                            System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                            System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                            System.out.println("Monstro do jogador 1, é mais veloz!");
                            System.out.println("\n\nDigite qualquer coisa para continuar");
                            ler.next();
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            golpe.selecaoPoder(jogador1, jogador2, 1);
                            if (jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] > 0) {
                                golpe.selecaoPoder(jogador1, jogador2, 2);
                            }
                        } else if (jogador1.defesa[jogador1.monstros[jogador1.monstroSelecionado]] < jogador2.defesa[jogador2.monstros[jogador2.monstroSelecionado]]) {
                            System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                            System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                            System.out.println("Monstro do jogador 2, é mais veloz!");
                            System.out.println("\n\nDigite qualquer coisa para continuar");
                            ler.next();
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                            golpe.selecaoPoder(jogador1, jogador2, 2);
                            if (jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] > 0) {
                                golpe.selecaoPoder(jogador1, jogador2, 1);
                            }
                        }
                    }
                } else if (jogador1.velocidade[jogador1.monstros[jogador1.monstroSelecionado]] > jogador2.velocidade[jogador2.monstros[jogador2.monstroSelecionado]]) {
                    System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                    System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                    System.out.println("Monstro do jogador 1, é mais veloz!");
                    System.out.println("\n\nDigite qualquer coisa para continuar");
                    ler.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    golpe.selecaoPoder(jogador1, jogador2, 1);
                    if (jogador2.vida[jogador2.monstros[jogador2.monstroSelecionado]] > 0) {
                        golpe.selecaoPoder(jogador1, jogador2, 2);
                    }

                } else if (jogador1.velocidade[jogador1.monstros[jogador1.monstroSelecionado]] < jogador2.velocidade[jogador2.monstros[jogador2.monstroSelecionado]]) {
                    System.out.println("OS DOIS ESCOLHERAM ATACAR!");
                    System.out.println("Ataca primeiro o monstro que tiver mais velocidade!");
                    System.out.println("Monstro do jogador 2, é mais veloz!");
                    System.out.println("\n\nDigite qualquer coisa para continuar");

                    ler.next();
                    new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();

                    golpe.selecaoPoder(jogador1, jogador2, 2);
                    if (jogador1.vida[jogador1.monstros[jogador1.monstroSelecionado]] > 0) {
                        golpe.selecaoPoder(jogador1, jogador2, 1);
                    }
                }
            } else if (respMenu1 == 1) {
                golpe.selecaoPoder(jogador1, jogador2, 1);
            } else if (respMenu2 == 1) {
                golpe.selecaoPoder(jogador1, jogador2, 2);
            }
        }

        if (jogador1.vida[jogador1.monstros[0]] <= 0 && jogador1.vida[jogador1.monstros[1]] >= 0
                && jogador1.vida[jogador1.monstros[2]] <= 0) {
            System.out.println(
                    "VITÓRIA!!!!!!!!!!!\nJogador 1 foi derrotado!! \nMeus parabéns Jogador 2, foi uma batalha épica!!");
            System.out.println("Monstros campeões!!!");
            for (int inteiro : jogador2.monstros) {
                switch (inteiro) {
                    case 0:
                        System.out.println("Oshuo");
                        break;
                    case 1:
                        System.out.println("Elco");

                        break;
                    case 2:
                        System.out.println("Nurion");

                        break;
                    case 3:
                        System.out.println("Plilu");

                        break;
                    case 4:
                        System.out.println("Cisur");

                        break;
                    case 5:
                        System.out.println("Cubaytou");
                        break;
                    default:

                }

            }
        } else {
            System.out.println(
                    "VITÓRIA!!!!!!!!!!!\nJogador 2 foi derrotado!! \nMeus parabéns Jogador 1, foi uma batalha épica!!");
            System.out.println("Monstros campeões!!!");
            for (int inteiro : jogador1.monstros) {
                switch (inteiro) {
                    case 0:
                        System.out.println("Oshuo");
                        break;
                    case 1:
                        System.out.println("Elco");

                        break;
                    case 2:
                        System.out.println("Nurion");

                        break;
                    case 3:
                        System.out.println("Plilu");

                        break;
                    case 4:
                        System.out.println("Cisur");

                        break;
                    case 5:
                        System.out.println("Cubaytou");
                        break;
                    default:

                }

            }
        }
        ler.close();
    }

    
}
