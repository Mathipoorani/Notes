package net.javaguides.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.javaguides.springboot.model.Note;
import net.javaguides.springboot.service.NoteService;

@RestController
@RequestMapping("/notes")
public class NoteController {

	@Autowired
	private NoteService noteService;
	
	@PostMapping("/createNote")
	public Note createNote(@RequestBody Note note) {
		return noteService.createNote(note);
	}
	
	@GetMapping ("/all")
	public List<Note> getAllNotes(){
		return noteService.getAllNotes();
	}
}
