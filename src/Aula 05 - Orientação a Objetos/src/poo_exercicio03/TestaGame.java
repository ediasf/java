package poo_exercicio03;

import poo_exercicio03.model.Game;

public class TestaGame {
    public static void main(String[] args) {
        Game g01 = new Game(1, "Overwatch 2", 2022, "PC, PS4, PS5, XBOX", 79.90f);
        Game g02 = new Game(2, "League of Legends", 2009, "PC", 0.0f);

        g01.visualizar();
        g02.visualizar();
    }
}
