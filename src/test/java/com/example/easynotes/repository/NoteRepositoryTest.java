package com.example.easynotes.repository;

import com.example.easynotes.model.Note;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class NoteRepositoryTest {

    @Autowired
    NoteRepository noteRepository;


    @Test
    void deleteNote(){
        Note note = new Note();
        note.setId(2l);
        note.setTitle("Today's List");
        note.setContent("Buy Book today");
        noteRepository.delete(note);

    }
    @Test
    void getAllNotes(){

        ArrayList<Note> arrayList = (ArrayList<Note>) noteRepository.findAll();

        assertNotNull(arrayList);
    }

    @Test
    void addNote(){

        Note note = new Note();
        note.setTitle("Today's List");
        note.setContent("Read a book");

        noteRepository.save(note);



    }


}