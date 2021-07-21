package com.example.finalexamcase;

import java.util.Vector;

public class WarGameMain {

    Vector<GamePlayer> VGamePlayer = new Vector<GamePlayer>();


    public WarGameMain() {
        Vector<GameHeroes> VGameHeroes = new Vector<GameHeroes>();
        Vector<HeroesArmy> VHeroesArmy = new Vector<HeroesArmy>();

        VGamePlayer.add(new GamePlayer("Player A", new GameCastle(), VGameHeroes, VHeroesArmy));
        VGamePlayer.add(new GamePlayer("Player B", new GameCastle(), VGameHeroes, VHeroesArmy));

        for (int a = 0; a < VGamePlayer.size(); a++) {

            System.out.println(VGamePlayer.get(a).getClass());
            System.out.println("--------");
            System.out.println("Castle : " + VGamePlayer.get(a).getCastle());
            System.out.println("hero : " + VGamePlayer.get(a).getVGameHeroes());
            System.out.println("army : " + VGamePlayer.get(a).getVHeroesArmy());


        }

    }
}
