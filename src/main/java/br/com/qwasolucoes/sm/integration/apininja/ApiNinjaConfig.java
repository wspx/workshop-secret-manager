package br.com.qwasolucoes.sm.integration.apininja;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.support.RestClientAdapter;
import org.springframework.web.service.invoker.HttpServiceProxyFactory;

@Configuration
public class ApiNinjaConfig {

    private static final String HEADER_API_KEY = "X-Api-Key";

    @Value("${api.apininjas.url}")
    private String urlApi;

    @Value("${api.apininjas.token}")
    private String token;

    @Bean
    public ApiNinja configApiClient() {
        final var restClient = RestClient.builder()
                .baseUrl(urlApi)
                .requestInterceptor((request, body, execution) -> {
                    request.getHeaders().add(HEADER_API_KEY, token);
                    return execution.execute(request, body);
                })
                .build();

        return HttpServiceProxyFactory
                .builderFor(RestClientAdapter.create(restClient))
                .build()
                .createClient(ApiNinja.class);
    }
}
