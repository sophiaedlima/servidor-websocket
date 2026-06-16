package br.com.metricas.servidor_websocket.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import br.com.metricas.servidor_websocket.modelo.MetricaServidor;

@Controller
public class MetricaController {

    @MessageMapping("/metricas")
    @SendTo("/topic/metricas")
    public MetricaServidor receberMetrica(MetricaServidor metrica) {
        return metrica;
    }
}