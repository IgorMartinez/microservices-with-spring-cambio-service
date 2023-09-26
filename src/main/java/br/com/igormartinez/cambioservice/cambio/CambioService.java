package br.com.igormartinez.cambioservice.cambio;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CambioService {

    private final Environment environment;
    private final CambioRepository repository;

    public CambioService(Environment environment, CambioRepository repository) {
        this.environment = environment;
        this.repository = repository;
    }

    public CambioResponse getCambio(BigDecimal amount, String from, String to) {

        Cambio cambio = repository.findByFromAndTo(from, to)
            .orElseThrow(() -> new RuntimeException("Currency unsupported"));

        return new CambioResponse(
            cambio.getFrom(), 
            cambio.getTo(), 
            cambio.getConversionFactor(), 
            cambio.getConversionFactor().multiply(amount).setScale(2, RoundingMode.CEILING), 
            environment.getProperty("local.server.port"));
    }
}
