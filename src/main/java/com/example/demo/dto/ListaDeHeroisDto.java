package com.example.demo.dto;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.domain.Heroi;

public class ListaDeHeroisDto {

	public List<HeroiDto> herois;

	public List<HeroiDto> getHerois() {
		return herois;
	}

	public void setHerois(List<HeroiDto> herois) {
		this.herois = herois;
	}

	public List<Heroi> forHeroisDtoParaHerois() {
		ArrayList<Heroi> list = new ArrayList<Heroi>();

		for (HeroiDto heroiDto : this.herois) {
			Heroi heroi = new Heroi(heroiDto.getHeroiName(), heroiDto.getId());
			list.add(heroi);
		}
		return list;

	}
}
