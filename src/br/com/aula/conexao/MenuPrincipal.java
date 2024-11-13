package br.com.aula.conexao;

import java.util.Scanner;

//Classe MenuPrincipal
public class MenuPrincipal {

    public static void main(String[] args) {
        // Cria o scanner para ler as entradas do usuário
        Scanner scanner = new Scanner(System.in);
        // A variável 'rodando' controla o loop do programa
        boolean rodando = true;

        // Loop que vai rodar até o usuário escolher sair
        while (rodando) {
            //Chama a função que exibe  o menu para o usuario
            exibirMenu();
            int opcao;
            try {
                // Tenta ler a opção como número inteiro
                opcao = Integer.parseInt(scanner.nextLine()); // Lê a opção como string e converte para inteiro
            } catch (NumberFormatException e) {
                // Se o usuário não digitar um número, mostra mensagem de erro
                System.out.println("Entrada inválida. Por favor, insira um número.");
                continue;
            }
            // Escolhe a ação a ser feita baseado na opção
            switch (opcao) {
                case 1:
                    //Chama o metodo para inserir os dados
                    InserirDados.inserirAluno(scanner);
                    break;
                case 2:
                    //Chama o metodo para ler os dados
                    LerDados.lerAlunos();
                    break;
                case 3:
                    //Chama o metodo para atualizar os dados
                    AtualizarDados.atualizarAluno(scanner);
                    break;
                case 4:
                    //Chama o metodo para deletar os dados
                    DeletarDados.deletarAluno(scanner);
                    break;
                case 5:
                    // Sai do programa
                    System.out.println("Saindo do sistema. Até logo!");
                    rodando = false;
                    break;
                default:
                    // Se a opção não for válida, mostra mensagem de erro
                    System.out.println("Opção inválida! Por favor, tente novamente.");
            }
        }
        
        // Fecha o scanner no final do programa
        scanner.close();
    }

    // Método que exibe o menu para o usuário
    private static void exibirMenu() {
        System.out.println("\n===== Menu Principal =====");
        System.out.println("1. Inserir Dados");
        System.out.println("2. Ler Dados");
        System.out.println("3. Atualizar Dados");
        System.out.println("4. Deletar Dados");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
    }
}
