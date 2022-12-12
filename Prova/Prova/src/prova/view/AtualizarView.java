package prova.view;

import prova.model.Evento;

import java.util.Scanner;

public class AtualizarView {
    Scanner sc;
    public AtualizarView(){
        this.sc = new Scanner(System.in);
    }
    public Evento atualizar(Evento evento){

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
        System.out.println("Digite o id: ");
        evento.setId(sc.nextInt());

        return evento;
    }

    public void eventoAtulizado(){
        System.out.println("Evento Atualizado");
    }

    public void eventoNaoAtualizado(){
        System.out.println("Evento Não Atualizado");
    }
}