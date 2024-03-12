package com.example.demo;

import java.util.Date;
import java.util.Map;
import java.util.List;
import java.util.HashMap;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/book")
public class ApiController {
    private final Logger log = LoggerFactory.getLogger(ApiController.class);
    private final Map<Integer, Books> book = new HashMap<>();

    @GetMapping("/{id}")
    public Books getBook(@PathVariable(name = "id") int id) {
        return book.get(id);
    }

    @PostMapping
    public Books postBook(@RequestBody Books entity) {
        book.put(book.size(), entity);
        return entity;
    }

    @PutMapping("/{id}")
    public Books putMethodBook(@PathVariable(name = "id") int id, @RequestBody Books entity) {
        book.replace(id, entity);
        return entity;
    }

    @GetMapping
    public List<Books> getMethodAll() {
        return List.copyOf(book.values());
    }

    @DeleteMapping("/{id}")
    public Books delMethod(@PathVariable(name = "id") int id) {
        Books old = book.get(id);
        book.remove(id);
        return old;
    }
}
