package com.jackswork.learnspringframework;

import com.jackswork.learnspringframework.game.GameRunner;
import com.jackswork.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {

    public static void main(String[] args){

      //var game = new MarioGame();
      //var game = new PackManGame();

      var game = new SuperContraGame();

      var gameRunner = new GameRunner(game);

      gameRunner.run();
    }
}
