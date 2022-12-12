package prova.controller;

import prova.dao.AtualizarDAO;
import prova.model.Evento;
import prova.view.AtualizarView;


public class AtualizarController {
    private final AtualizarView aview;
    private final Evento evento;
    private final AtualizarDAO adao;

    public AtualizarController() {

        aview = new AtualizarView();
        evento = aview.atualizar(new Evento());

        adao = new AtualizarDAO();

        if (Boolean.TRUE.equals(adao.atualizarevento(evento))) {
            aview.eventoAtulizado();
        } else {
            aview.eventoNaoAtualizado();
        }
    }
}
