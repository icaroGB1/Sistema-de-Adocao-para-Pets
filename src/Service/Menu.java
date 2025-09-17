package Service;

import java.util.Scanner;


public class Menu {
    public int opcoesMenu() {
        Scanner input = new Scanner(System.in);
        System.out.println("1 - Cadastrar um novo pet");
        System.out.println("2 - Alterar os dados do pet cadastrado");
        System.out.println("3 - Deletar um pet cadastrado");
        System.out.println("4 - Listar todos os pets cadastrados");
        System.out.println("5 - Listar pets por algum critério (idade, nome, raça)");
        System.out.println("6 - Sair");
        int escolha = validMenu(input);
        return escolha;
    }

    public int validMenu(Scanner sc) {
        while (true) {
            System.out.println("Digite um número de 1 a 6: ");
            if (sc.hasNextInt()) {
                int num = sc.nextInt();
                if (num >= 1 && num <= 6) {
                    return num;
                } else {
                    System.out.println("Número fora do intervalo. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida. Digite apenas números.");
                sc.nextLine();
            }

        }

    }

}
