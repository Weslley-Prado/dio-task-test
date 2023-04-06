package br.com.task.domain;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
	     private String name;
	     private String description;
	     private final LocalDate dateStarting = LocalDate.now();
	     private final LocalDate dateFinal = dateStarting.plusDays(45);
	     private Set<Dev> devsRegistered = new HashSet<>();
	     private Set<Content> content = new LinkedHashSet<>();
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Set<Dev> getDevsRegistered() {
			return devsRegistered;
		}
		public void setDevsRegistered(Set<Dev> devsRegistered) {
			this.devsRegistered = devsRegistered;
		}
		public Set<Content> getContent() {
			return content;
		}
		public void setContent(Set<Content> content) {
			this.content = content;
		}
		public LocalDate getDateStarting() {
			return dateStarting;
		}
		public LocalDate getDateFinal() {
			return dateFinal;
		}
		@Override
		public int hashCode() {
			return Objects.hash(content, dateFinal, dateStarting, description, devsRegistered, name);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Bootcamp other = (Bootcamp) obj;
			return Objects.equals(content, other.content) && Objects.equals(dateFinal, other.dateFinal)
					&& Objects.equals(dateStarting, other.dateStarting)
					&& Objects.equals(description, other.description)
					&& Objects.equals(devsRegistered, other.devsRegistered) && Objects.equals(name, other.name);
		}
	     
	     
}
