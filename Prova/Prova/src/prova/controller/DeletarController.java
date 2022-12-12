package prova.controller;

import prova.dao.DeletarDAO;
import prova.model.Evento;
import prova.view.DeletarView;

public class DeletarController {
    private final DeletarView aview;
    private final Evento evento;
    private final DeletarDAO adao;

    public DeletarController() {

        aview = new DeletarView();
        evento = aview.deletar(new Evento());

        adao = new DeletarDAO();

        if (Boolean.TRUE.equals(adao.deletarevento(evento))) {
            aview.eventoExcluido();
        } else {
            aview.eventoNaoExcluido();
        }
    }

}
