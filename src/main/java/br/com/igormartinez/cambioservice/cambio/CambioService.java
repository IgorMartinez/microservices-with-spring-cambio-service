package br.com.igormartinez.cambioservice.cambio;

import java.math.BigDecimal;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CambioService {

    private final Environment environment;
    
    public CambioService(Environment environment) {
        this.environment = environment;
    }

    public CambioResponse getCambio(BigDecimal amount, String from, String to) {
        return new CambioResponse(
            1L, 
            from, 
            to, 
            BigDecimal.ONE, 
            amount, 
            environment.getProperty("local.server.port"));
    }
}
