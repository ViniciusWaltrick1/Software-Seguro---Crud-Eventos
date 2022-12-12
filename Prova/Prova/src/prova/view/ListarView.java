package prova.view;

import prova.model.Evento;

import java.util.List;

public class ListarView {
    public void listarView(List<Evento> eventos) {
        for (Evento evento : eventos) {
            System.out.println("Evento:" + System.lineSeparator() + "Nome: " + evento.getNome() + System.lineSeparator()
            + "Data: " + evento.getData() + System.lineSeparator() + "Cidade: " + evento.getCidade() + System.lineSeparator() +
            "Endereco: " + evento.getEndereco() + System.lineSeparator() + "Preco: " + evento.getPreco() + System.lineSeparator() +
            "Quantidadede ingressos: " + evento.getQuant() + System.lineSeparator() + "Id: " + evento.getId() +System.lineSeparator());
        }
    }
}
