package com.example.finalexamcase;

import java.util.Vector;

public class GamePlayer {

    private GameCastle castle;
    private String player;

    private Vector<GameHeroes> VGameHeroes = new Vector<GameHeroes>();
    private Vector<HeroesArmy> VHeroesArmy = new Vector<HeroesArmy>();

    public GamePlayer(GameCastle castle, String player, Vector<GameHeroes> vGameHeroes,
                      Vector<HeroesArmy> vHeroesArmy, GameCastle GameCastle, String GamePlayer) {
        super();
        GameCastle = castle;
        GamePlayer = player;
        VGameHeroes = vGameHeroes;
        VHeroesArmy = vHeroesArmy;
    }


    public GamePlayer(String string, GameCastle gameCastle, Vector<GameHeroes> vGameHeroes2,
                      Vector<HeroesArmy> vHeroesArmy2) {
        // TODO Auto-generated constructor stub
    }


    public GameCastle getCastle() {
        return castle;
    }

    public void setCastle(GameCastle castle) {
        this.castle = castle;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Vector<GameHeroes> getVGameHeroes() {
        return VGameHeroes;
    }

    public void setVGameHeroes(Vector<GameHeroes> vGameHeroes) {
        VGameHeroes = vGameHeroes;
    }

    public Vector<HeroesArmy> getVHeroesArmy() {
        return VHeroesArmy;
    }

    public void setVHeroesArmy(Vector<HeroesArmy> vHeroesArmy) {
        VHeroesArmy = vHeroesArmy;
    }


}
