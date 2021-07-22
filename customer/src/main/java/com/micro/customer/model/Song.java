package com.micro.customer.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value="song")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Song {
	@Id
	private String id;
	private String name;
	private String description;
	private String movieName;
}
