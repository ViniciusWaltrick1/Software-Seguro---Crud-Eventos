package prova.view;

import prova.model.Evento;

import java.util.Scanner;

public class DeletarView {
    Scanner sc;

    public DeletarView() {
        this.sc = new Scanner(System.in);
    }

    public Evento deletar(Evento evento) {

        System.out.println("Digite o id: ");
        evento.setId(sc.nextInt());

        return evento;
    }
    public void eventoExcluido(){
        System.out.println("Evento Excluido");
    }

    public void eventoNaoExcluido(){
        System.out.println("Evento Não Atualizado");
    }

}
