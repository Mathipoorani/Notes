package net.javaguides.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Note;
import net.javaguides.springboot.repository.NoteRepository;

@Service
public class NoteService {

	@Autowired
	private NoteRepository noteRepo;
	
	public Note createNote(Note note) {
		return noteRepo.save(note);
	}
	
	public List<Note> getAllNotes(){
		return noteRepo.findAll();
	}
}
