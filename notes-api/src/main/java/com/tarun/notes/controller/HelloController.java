package com.tarun.notes.controller;

import com.tarun.notes.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/notes")
    public List<Note> getNotes() {
        return List.of(
                new Note(1, "First Note", "From backend"),
                new Note(2, "Second Note", "Still from backend"),
                new Note(3, "Third Note", "Backend is alive")
        );
    }
}
