package com.example.demo.domain;

public class Heroi {

	private Long id;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Heroi: " + this.name;
	}

	public Heroi(String nomeDoHeroi, Long id) {
		super();
		this.name = nomeDoHeroi;
		this.id = id;
	}

	public Heroi() {
		super();
	}

}
