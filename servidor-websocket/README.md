# Monitor de Servidor - WebSocket STOMP

**Nome completo:** Sophia Eduarda Lima
20242012000377

## Domínio escolhido

Monitoramento de servidor com métricas simuladas de CPU, memória e uptime.
O WebSocket é ideal para este cenário porque o servidor sabe exatamente quando
novos dados estão disponíveis e notifica os clientes instantaneamente, sem
nenhuma requisição desnecessária sendo feita pelo frontend.

## Como executar

```bash
mvn spring-boot:run
```

Acesse: http://localhost:8081/index.html

## Como o projeto demonstra a abordagem

O status "Conectado" aparece assim que a conexão WebSocket é estabelecida.
As métricas chegam automaticamente a cada 2 segundos sem nenhuma requisição
do cliente. Cada mensagem recebida é necessariamente uma atualização nova,
ao contrário do Projeto A onde requisições são feitas mesmo sem dados novos.