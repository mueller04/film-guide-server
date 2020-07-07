package com.example.filmguideserver.controllers;

import com.example.filmguideserver.models.FilmSection;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/film-sections")
public class FilmSectionsController {

    FilmSection section;

    @GetMapping
    public List<FilmSection> getFilmSections() {
        return List.of(
                new FilmSection("a",List.of("foo", "bar")),
                new FilmSection("b",List.of("bar", "baz")));
    }
}
