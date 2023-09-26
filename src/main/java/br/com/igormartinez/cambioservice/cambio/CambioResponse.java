package br.com.igormartinez.cambioservice.cambio;

import java.math.BigDecimal;

public record CambioResponse(
    String from,
    String to,
    BigDecimal conversionFactor,
    BigDecimal convertedValue,
    String enviroment
) {}
