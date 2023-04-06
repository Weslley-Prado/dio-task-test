package br.com.task.domain;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Content> contentsDoing = new LinkedHashSet<>();
	private Set<Content> contentsDone = new LinkedHashSet<>();

	public void registerBootcamp(Bootcamp bootcamp) {
		this.contentsDoing.addAll(bootcamp.getContent());
		bootcamp.getDevsRegistered().add(this);
	}
	public void progress() {
		Optional<Content> content = this.contentsDone.stream().findFirst();
		if(content.isPresent()) {
			this.contentsDone.add(content.get());
			this.contentsDoing.remove(content.get());
		} else {
			System.err.println("You aren't registered in a content!");
		}
	}
	public double calculateTotalXp() {
		return	this.contentsDone
				.stream()
				.mapToDouble(content -> content.calculateXp()).sum();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Content> getContentsDoing() {
		return contentsDoing;
	}
	public void setContentsDoing(Set<Content> contentsDoing) {
		this.contentsDoing = contentsDoing;
	}
	public Set<Content> getContentsDone() {
		return contentsDone;
	}
	public void setContentsDone(Set<Content> contentsDone) {
		this.contentsDone = contentsDone;
	}
	@Override
	public int hashCode() {
		return Objects.hash(contentsDoing, contentsDone, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dev other = (Dev) obj;
		return Objects.equals(contentsDoing, other.contentsDoing) && Objects.equals(contentsDone, other.contentsDone)
				&& Objects.equals(name, other.name);
	}


}
