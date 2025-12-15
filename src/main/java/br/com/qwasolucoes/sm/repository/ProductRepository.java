package br.com.qwasolucoes.sm.repository;

import br.com.qwasolucoes.sm.domain.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductRepository extends PagingAndSortingRepository<Product, Short> {}
