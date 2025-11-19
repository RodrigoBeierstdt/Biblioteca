package poo.heranca;
import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entradaUsuario = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();

        // Criação e adição dos objetos
        Livro livro1 = new Livro("Crime e Castigo", "1866", true);
        Livro livro2 = new Livro("Noites Brancas", "1846", false);
        Livro livro3 = new Livro("A Metamorfose", "1915", true);

        livros.add(livro1);
        livros.add(livro2);
        livros.add(livro3);

        while (true) {
            System.out.println("\n══════════ MENU DA BIBLIOTECA ══════════");
            System.out.println(" 1 - Ver lista de livros");
            System.out.println(" 2 - Ver detalhes de um livro");
            System.out.println(" 3 - Emprestar livro");
            System.out.println(" 4 - Devolver livro");
            System.out.println(" 0 - Sair");
            System.out.println("══════════════════════════════════════");
            System.out.print(" Escolha uma opção: ");

            // TRATAMENTO DE ENTRADA DO MENU
            if (!entradaUsuario.hasNextInt()) {
                System.out.println("\n ERRO: Por favor, digite um número válido.");
                entradaUsuario.next();
                continue;
            }

            int opcao = entradaUsuario.nextInt();
            // LIMPA O BUFFER APÓS LER O INTEIRO
            entradaUsuario.nextLine(); 

            if (opcao == 0) {
                System.out.println("\nEncerrando o sistema. Até logo!");
                break;
            }
            
            // ESTRUTURA DE CONTROLE (Switch)
            switch (opcao) {
                case 1:
                    System.out.println("\n --- LISTA DE LIVROS --- ");
                    for (int i = 0; i < livros.size(); i++) {
                        String status = livros.get(i).isDisponivel() ? " (Disponível)" : " (Emprestado)";
                        System.out.println((i + 1) + ": " + livros.get(i).getTitulo() + status);
                    }
                    
                    // Pausa APÓS toda a listagem
                    System.out.println("\n-------------------------");
                    System.out.print("Pressione ENTER para voltar ao Menu...");
                    entradaUsuario.nextLine(); 
                    break;

                case 2:
                case 3:
                case 4:
                    // LÓGICA DE SELEÇÃO CENTRALIZADA
                    System.out.println("\n⬇ --- SELECIONE O LIVRO --- ⬇");
                    for (int i = 0; i < livros.size(); i++) {
                        String status = livros.get(i).isDisponivel() ? " (Disponível)" : " (Emprestado)";
                        System.out.println((i + 1) + ": " + livros.get(i).getTitulo() + status);
                    }
                    
                    System.out.print("\n▶︎ Digite o número do livro para a ação: ");
                    
                    if (!entradaUsuario.hasNextInt()) {
                        System.out.println("\n ERRO: Entrada inválida. Voltando ao menu.");
                        entradaUsuario.next();
                        break;
                    }
                    
                    int escolha = entradaUsuario.nextInt();
                    entradaUsuario.nextLine(); // Limpa o buffer
                    int indice = escolha - 1;

                    // VALIDAÇÃO E EXECUÇÃO DA AÇÃO
                    if (indice >= 0 && indice < livros.size()) {
                        Livro livroSelecionado = livros.get(indice);
                        
                        if (opcao == 2) {
                            livroSelecionado.verDetalhes();
                        } else if (opcao == 3) {
                            livroSelecionado.emprestar();
                        } else if (opcao == 4) {
                            livroSelecionado.devolver();
                        }
                    } else {
                        System.out.println("\n ERRO: Número de livro inválido. Tente novamente.");
                    }
                    
                    // PAUSA APÓS AÇÃO (AGORA BEM SEPARADA)
                    System.out.println("\n-------------------------");
                    System.out.print("Pressione ENTER para voltar ao Menu...");
                    entradaUsuario.nextLine(); 
                    break;

                default:
                    System.out.println("\n Opção não reconhecida. Tente novamente.");
            }
        }

        // FECHAMENTO DO SCANNER
        entradaUsuario.close();
    }
}