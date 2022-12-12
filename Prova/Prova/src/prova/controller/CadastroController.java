package prova.controller;

import prova.dao.CadastroDAO;
import prova.model.Evento;
import prova.view.CadastroView;


public class CadastroController {
    private final CadastroView aview;
    private final Evento evento;
    private final CadastroDAO adao;

    public CadastroController() {

        aview = new CadastroView();
        evento = aview.cadastro(new Evento());

        adao = new CadastroDAO();

        if (Boolean.TRUE.equals(adao.cadastrarevento(evento))) {
            aview.eventoCadastrado();
        } else {
            aview.eventoNaoCadastrado();
        }
    }
}

