package Faculdade;
import java.util.ArrayList;
import java.util.Scanner;
public class MainBar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bar bar = new Bar();
        System.out.println("Digite seu nome : ");
        bar.setNome(scanner.next());
        String saudacao = """
                            Bem vindo ao nosso bar,\s""" + bar.getNome();
        System.out.println(saudacao);
        String cardapio = """
                            ******************************
                            Cardápio
                            Bebidas:
                            1 - Skol R$5,00
                            2 - Brahma R$6,50
                            3 - Heineken R$7,50
                            4 - Stella R$8,50
                            5 - Água R$2,00
                            6 - Suco R$7,00
                            7 - Fechar conta
                            """;
                    Produtos produto1 = new Produtos("Skol", 5.00);
                    Produtos produto2 = new Produtos("Brahma", 6.50);
                    Produtos produto3 = new Produtos("Heineken", 7.50);
                    Produtos produto4 = new Produtos("Stella", 8.50);
                    Produtos produto5 = new Produtos("Água", 2.00);
                    Produtos produto6 = new Produtos("suco", 7.00);
                    int opcao = 0;
                    while (opcao != 7) {
                        System.out.println(cardapio);
                        System.out.println("Selecione a sua bebida: ");
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                bar.adicionarProduto(produto1);
                                System.out.println("você selecionou Skol");
                                break;
                            case 2:
                                bar.adicionarProduto(produto2);
                                System.out.println("você selecionou Brahma");
                                break;
                            case 3:
                                bar.adicionarProduto(produto3);
                                System.out.println("você selecionou Heineken");
                                break;
                            case 4:
                                bar.adicionarProduto(produto4);
                                System.out.println("você selecionou Stella");
                                break;
                            case 5:
                                bar.adicionarProduto(produto5);
                                System.out.println("você selecionou Àgua");
                                break;
                            case 6:
                                bar.adicionarProduto(produto6);
                                System.out.println("você selecionou Suco");
                                break;
                            case 7 :
                                System.out.println("fechando conta...");
                                break;
                            default:
                                System.out.println("opção invalida");
                        }
                        }
                        bar.calcularConta();
                    scanner.close();
                }
                }
