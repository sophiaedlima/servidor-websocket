package br.com.metricas.servidor_websocket.websocket;

import java.util.Random;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.com.metricas.servidor_websocket.modelo.MetricaServidor;

@Component
public class MetricaScheduler {

    private final SimpMessagingTemplate messagingTemplate;
    private final Random random = new Random();

    private double cpu = 40.0;
    private double memoria = 60.0;
    private long uptime = 0;

    public MetricaScheduler(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    @Scheduled(fixedRate = 2000)
    public void publicarMetricas() {
        cpu = Math.max(0, Math.min(100, cpu + (random.nextDouble() - 0.5) * 8));
        memoria = Math.max(0, Math.min(100, memoria + (random.nextDouble() - 0.5) * 4));
        uptime += 2;

        MetricaServidor metrica = new MetricaServidor(
                Math.round(cpu * 10.0) / 10.0,
                Math.round(memoria * 10.0) / 10.0,
                uptime
        );

        messagingTemplate.convertAndSend("/topic/metricas", metrica);
    }
}