package br.com.qwasolucoes.sm.controller;

import br.com.qwasolucoes.sm.integration.apininja.ApiNinja;
import br.com.qwasolucoes.sm.integration.apininja.BitcoinPriceResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/bitcoin")
@RequiredArgsConstructor
public class BitcoinPriceController {

    private final ApiNinja apiNinja;

    @GetMapping
    public BitcoinPriceResponse getBitcoinCurrentPrice() {
        return apiNinja.getBitcoinPrice();
    }
}
