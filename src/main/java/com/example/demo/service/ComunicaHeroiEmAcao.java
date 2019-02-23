package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.BuscaHeroi;
import com.example.demo.domain.Heroi;

@Service
public class ComunicaHeroiEmAcao {

	@Autowired
	private BuscaHeroi buscaHEroi;
	
	public void comunique(List<Heroi> herois) {
		buscaHEroi.informarHeroiEmAcao(herois);
	}

}
