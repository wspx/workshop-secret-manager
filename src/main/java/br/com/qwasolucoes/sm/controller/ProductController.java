package br.com.qwasolucoes.sm.controller;

import br.com.qwasolucoes.sm.domain.Product;
import br.com.qwasolucoes.sm.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/product")
@RequiredArgsConstructor
public class ProductController {

    private final ProductRepository productRepository;

    @GetMapping
    public Page<Product> getAllProductPageable(final Pageable pageable) {
        return productRepository.findAll(pageable);
    }
}
