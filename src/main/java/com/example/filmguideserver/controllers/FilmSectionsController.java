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
    public FilmSectionsResponse getFilmSections() {
        List<FilmSection> filmSections = List.of(
                new FilmSection("Drama", List.of("Shawshank Redemption", "Flight", "Do The Right Thing", "The Godfather", "Taxi Driver")),
                new FilmSection("Action", List.of("Preditor", "Die Hard", "Total Recall", "The Matrix", "Bad Boys")),
                new FilmSection("Horror", List.of("Alien", "The Thing", "Carrie", "The Shining", "Cabin In The Woods")),
                new FilmSection("Comic", List.of("Superman", "Batman", "X-Men", "Spiderman", "Watchmen")),
                new FilmSection("Italian", List.of("L'Aventurra", "La Notte", "L'Eclise", "Il Deserto Rosso", "8 1/2")),
                new FilmSection("French", List.of("Vivre Sa Vie", "Breathless", "Shoot the Piano Player", "Cléo from 5 to 7", "Weekend")),
                new FilmSection("Sci-Fi", List.of("Star Wars", "Robocop", "BladeRunner", "Minority Report", "Deus Ex Machina")),
                new FilmSection("Comedy", List.of("Get Him To The Greek", "Superbad", "This is The End", "The Hangover", "Anchorman")),
                new FilmSection("Adventure", List.of("Indiana Jones", "Jumanji", "Cast Away", "Back To The Future", "The Maze Runner")),
                new FilmSection("Family", List.of("The Lion King", "Aladdin", "The Little Mermaid", "Mulan", "Fantasia")),
                new FilmSection("Suspense", List.of("Knives Out", "Aladdin", "The Little Mermaid", "Mulan", "Fantasia"))
        );

        return new FilmSectionsResponse(filmSections);
    }
}
