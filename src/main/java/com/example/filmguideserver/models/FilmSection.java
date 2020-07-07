package com.example.filmguideserver.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@AllArgsConstructor
@Data
public class FilmSection {

    private String genre;
    private List films;
}
