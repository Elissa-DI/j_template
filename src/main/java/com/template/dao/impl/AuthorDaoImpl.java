package com.template.dao.impl;

import com.template.dao.AuthorDao;
import com.template.models.Author;
import org.springframework.jdbc.core.JdbcTemplate;

public class AuthorDaoImpl implements AuthorDao {

    private final JdbcTemplate jdbcTemplate;

    public AuthorDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void create(Author author) {
        jdbcTemplate.update(
            "INSERT INTO authors (id, name, age) VALUES (?, ?, ?)",
            author.getId(), author.getName(), author.getAge()
        );
    }
}
