package com.boot.factory;

public class Games {
    public static void playGame(GameFactory gameFactory){
        Game game = gameFactory.getGame();
        while (game.move()){}
    }

    public static void main(String[] args) {
        playGame(new CheckersFactory());
        playGame(new ChessFactory());
    }
}
