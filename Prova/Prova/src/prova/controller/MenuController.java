package prova.controller;

import prova.view.MenuView;

public class MenuController {

    private final MenuView menuView;
    private CadastroController cadastroController() {
        return new CadastroController();
    }
    private ListarController listar() {
        return new ListarController();
    }

    private AtualizarController atualizar() {
        return new AtualizarController();
    }

    private DeletarController deletar() {
        return new DeletarController();
    }
    private int escolha;
    public MenuController() {

        menuView = new MenuView();

        escolha = menuView.menu();

        if (escolha == 1) {
            cadastroController();
        } else if (escolha == 2) {
            listar();
        } else if(escolha == 3) {
            atualizar();
        } else if(escolha == 4){
            listar();
            deletar();
        }else{
            menuView.opcaoInvalida();
        }
    }
}

