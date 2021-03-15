package com.leonid.controller;

import com.google.common.collect.Lists;
import com.leonid.domain.Anime;
import com.leonid.util.DateUtil;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Slf4j
public class AnimeController {

    @Setter(onMethod_ = @Autowired)
    private DateUtil dateUtil;

    @GetMapping()
    public List<Anime> getAnimes() {
        log.info("Date Formatted {}", dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return Lists.newArrayList(new Anime("DBZ"), new Anime("Berserker"));
    }
}
