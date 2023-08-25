package com.jackswork.learnspringframework;

import com.jackswork.learnspringframework.game.GameRunner;
import com.jackswork.learnspringframework.game.GamingConsole;
import com.jackswork.learnspringframework.game.PacManGame;
import com.jackswork.learnspringframework.game.SuperContraGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

  @Bean
      public GamingConsole game() {
    var game = new PacManGame();
    return game;
  }

  @Bean
      public GameRunner gameRunner(GamingConsole game){
    var gameRunner = new GameRunner(game);
    return gameRunner;
  }
}
