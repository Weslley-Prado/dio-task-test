package br.com.task.domain;

import java.time.LocalDate;

public class Mentoring extends Content {
	
	private LocalDate data;
	@Override
	public double calculateXp() {
		// TODO Auto-generated method stub
		return XP_DEFAULT + 20d;
	}
	
	public Mentoring() {
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "Mentoring [title=" + getTitle() + ", description=" + getDescription() + ", data=" + data + "]";
	}



	
}
