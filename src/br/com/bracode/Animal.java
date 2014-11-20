package br.com.bracode;

public class Animal {
	private String name;
	private String description;
	private StatusAnimal status;
	
	
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
	public StatusAnimal getStatus() {
		return status;
	}
	public void setStatus(StatusAnimal status) {
		this.status = status;
	}
	
}
