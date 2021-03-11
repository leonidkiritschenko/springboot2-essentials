package com.leonid.controller;

import com.google.common.collect.Lists;
import com.leonid.domain.Anime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("anime")
public class AnimeController {

    @GetMapping()
    public List<Anime> getAnimes() {
        return Lists.newArrayList(new Anime("DBZ"), new Anime("Berserker"));
    }
}
