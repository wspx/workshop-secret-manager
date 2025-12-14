package br.com.qwasolucoes.sm.controller;

import br.com.qwasolucoes.sm.domain.Film;
import br.com.qwasolucoes.sm.repository.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/films")
public class FilmController {

    private final FilmRepository filmRepository;

    @GetMapping
    public Page<Film> getAllFilmsPageable(Pageable page) {
        return filmRepository.findAll(page);
    }
}
