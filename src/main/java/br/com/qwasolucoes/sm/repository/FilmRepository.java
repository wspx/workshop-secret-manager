package br.com.qwasolucoes.sm.repository;

import br.com.qwasolucoes.sm.domain.Film;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface FilmRepository extends PagingAndSortingRepository<Film, Integer> { }
