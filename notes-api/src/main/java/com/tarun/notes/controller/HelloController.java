package com.tarun.notes.controller;

import com.tarun.notes.model.Note;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/note")
    public Note getNote() {
        return new Note(
                1,
                "First Note",
                "This note is coming from backend"
        );
    }
}
