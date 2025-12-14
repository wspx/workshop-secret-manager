package br.com.qwasolucoes.sm.integration.apininja;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class BitcoinPriceResponse {

    @JsonProperty("price")
    private BigDecimal preco;

    private Long timestamp;

    @JsonProperty("24h_price_change")
    private BigDecimal variacaoPreco24h;

    @JsonProperty("24h_price_change_percent")
    private BigDecimal percentualVariacaoPreco24h;

    @JsonProperty("24h_high")
    private BigDecimal maxima24h;

    @JsonProperty("24h_low")
    private BigDecimal minima24h;

    @JsonProperty("24h_volume")
    private BigDecimal volume24h;

}
