package br.com.igormartinez.cambioservice.cambio;

import java.math.BigDecimal;

public record CambioResponse(
    Long id,
    String from,
    String to,
    BigDecimal conversionFactor,
    BigDecimal convertedValue,
    String enviroment
) {}
