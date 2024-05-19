package net.javaguides.springboot.model;

import java.time.ZonedDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long noteId;
	
	/*@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)*/
	@Column(nullable=false, unique=true, updatable = false)
	private UUID uuid = UUID.randomUUID();
	
	private String title;
	
	@Enumerated(EnumType.STRING)
	private ParentType parentType;
	
	@Enumerated(EnumType.STRING)
	private Type type;
	
	@CreationTimestamp
	private ZonedDateTime createdDate;
	
	private String noteContent;
	
}
