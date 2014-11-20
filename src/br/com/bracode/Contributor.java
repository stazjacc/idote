package br.com.bracode;

public class Contributor {
	private String name;
	private FunctionContributor function;
	private boolean remunerated;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public FunctionContributor getFunction() {
		return function;
	}
	public void setFunction(FunctionContributor function) {
		this.function = function;
	}
	public boolean isRemunerated() {
		return remunerated;
	}
	public void setRemunerated(boolean remunerated) {
		this.remunerated = remunerated;
	}
	
}
