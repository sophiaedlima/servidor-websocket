package br.com.metricas.servidor_websocket;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ServidorWebsocketApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ServidorWebsocketApplication.class);
        app.setDefaultProperties(Collections.singletonMap("server.port", "8081"));
        app.run(args);
    }
}