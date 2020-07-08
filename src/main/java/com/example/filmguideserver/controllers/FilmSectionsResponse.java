package com.example.filmguideserver.controllers;

import com.example.filmguideserver.models.FilmSection;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class FilmSectionsResponse {

    private List<FilmSection> filmSections;
}
