package br.com.bracode;

import java.util.ArrayList;

public class Ong {
	private String name;
	private String cnpj;
	ArrayList<Animal> animals = new ArrayList<Animal>();
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public ArrayList<Animal> getAnimals() {
		return animals;
	}
	public void setAnimals(ArrayList<Animal> animals) {
		this.animals = animals;
	}
	
	
	
}
