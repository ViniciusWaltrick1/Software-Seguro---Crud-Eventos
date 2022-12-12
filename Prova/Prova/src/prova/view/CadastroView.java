package prova.view;

import prova.model.Evento;

import java.util.Scanner;

public class CadastroView {
    Scanner sc;
    public CadastroView(){
        this.sc = new Scanner(System.in);
    }
    public Evento cadastro(Evento evento){
        System.out.print("Nome: ");
        evento.setNome(sc.nextLine());
        System.out.print("Data: ");
        evento.setData(sc.nextLine());
        System.out.print("Cidade: ");
        evento.setCidade(sc.nextLine());
        System.out.print("Endereco: ");
        evento.setEndereco(sc.nextLine());
        System.out.print("Preco: ");
        evento.setPreco(sc.nextDouble());
        System.out.print("Quantidade: ");
        evento.setQuant(sc.nextInt());

        return evento;
    }

    public void eventoCadastrado(){
        System.out.println("Evento cadastrao");
    }

    public void eventoNaoCadastrado(){
        System.out.println("Evento Não Cadastrada");
    }
}
