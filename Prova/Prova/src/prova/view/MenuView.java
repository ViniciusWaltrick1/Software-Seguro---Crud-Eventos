package prova.view;

import java.util.Scanner;


public class MenuView {

    public int menu() {
        Scanner sc = new Scanner(System.in);

        int escolha;

        System.out.println("Opcoes:" + System.lineSeparator() +
                "1 Cadastrar" + System.lineSeparator() +
                "2 Listar" + System.lineSeparator() +
                "3 Atualizar" + System.lineSeparator() +
                "4 Excluir" + System.lineSeparator() +
                "Digite sua opcao:");

        escolha = sc.nextInt();

        return escolha;

    }

    public void opcaoInvalida(){
        System.out.println("Opcao Invalida!");
    }

}
