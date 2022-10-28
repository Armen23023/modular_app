package com.example.core.repositories;

import com.example.core.models.Article;
import com.example.core.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {

    @Query("select a from Article a where a.author=:author")
    List<Article> findAllByAuthor(@Param("author") User author);

}
