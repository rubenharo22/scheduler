package com.rharo.client.dto;

import java.util.List;

import lombok.Data;

@Data
public class JokeDto {

	String id = null;
	String value = null;
	String name = null;
	String createdAt = null;
	String updatedAt = null;
	String iconUrl = null;
	List<String> categories = null;

	@Override
	public String toString() {
		return "JokeDto [id=" + id + ", value=" + value + ", name=" + name + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", iconUrl=" + iconUrl + ", categories=" + categories + "]";
	}

}