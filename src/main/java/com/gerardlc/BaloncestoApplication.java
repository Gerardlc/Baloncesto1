package com.gerardlc;

import com.gerardlc.Service.JugadorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BaloncestoApplication {
    private static JugadorService jugadorService;

    public static void main(String[] args) {
        //SpringApplication.run(BaloncestoApplication.class, args);
        ConfigurableApplicationContext context= SpringApplication.run(BaloncestoApplication.class, args);

        jugadorService = context.getBean(JugadorService.class);
        jugadorService.testJugador();

    }
}
