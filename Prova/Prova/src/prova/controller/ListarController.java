package prova.controller;

import prova.dao.ListarDAO;
import prova.model.Evento;
import prova.view.ListarView;

import java.util.List;

public class ListarController {

    public ListarController() {
        ListarDAO listarDAO = new ListarDAO();
        List<Evento> eventos = listarDAO.listaeventos();

        ListarView listarview = new ListarView();
        listarview.listarView(eventos);
    }
}
