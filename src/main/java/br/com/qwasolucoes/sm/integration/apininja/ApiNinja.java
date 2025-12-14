package br.com.qwasolucoes.sm.integration.apininja;

import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

@HttpExchange
public interface ApiNinja {

    @GetExchange("/v1/bitcoin")
    BitcoinPriceResponse getBitcoinPrice();
}
