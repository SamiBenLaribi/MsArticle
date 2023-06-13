package com.sbl.mcroservice_project.ms_article.controller;

import com.sbl.mcroservice_project.ms_article.entities.Article;
import com.sbl.mcroservice_project.ms_article.service.ArticleServiceImp;
import com.sbl_commons.dto.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/article")
public class ArticleController {
    private final ArticleServiceImp articleServiceImp;
    @PatchMapping("{id}")
    public Article updateArticle(@RequestBody Map<Object, Object> fields, @PathVariable long id){
        return articleServiceImp.updateArticle(fields,id);
    }
    @GetMapping("/getArticle/{id}")
    public ArticleDto retriveArticleById(@PathVariable long id){

        return articleServiceImp.retriveArticleById(id);
    }
    @PostMapping("/ajouterArticle")
    public Article ajouterArticle(@RequestBody Article article){
        return articleServiceImp.createArticle(article);
    }

}

//SBL