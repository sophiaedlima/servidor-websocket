package br.com.metricas.servidor_websocket.modelo;

public record MetricaServidor(
        double cpu,
        double memoria,
        long uptimeSegundos
) {}