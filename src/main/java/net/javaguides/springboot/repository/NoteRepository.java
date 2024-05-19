package net.javaguides.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.model.Note;

public interface NoteRepository extends JpaRepository <Note, Long>{

}
