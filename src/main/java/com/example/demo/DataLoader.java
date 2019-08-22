package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component

public class DataLoader implements CommandLineRunner {
    @Autowired
    TodoRepository repository;

    @Override
    public void run(String... strings) throws Exception{
        Todo todo;
        todo = new Todo("Aloni", "Conducting supervision on classes", "Top");
        repository.save(todo);

        todo = new Todo("Dagm", "Submitting report on new findings", "Top");
        repository.save(todo);

        todo = new Todo("Robi", "Prepare interview materials", "Medium");
        repository.save(todo);

    }

}
