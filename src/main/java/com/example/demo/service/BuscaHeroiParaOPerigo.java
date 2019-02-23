package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.client.BuscaHeroi;
import com.example.demo.domain.EnumCatastrofe;
import com.example.demo.domain.Heroi;

@Service
public class BuscaHeroiParaOPerigo {

	@Autowired
	private BuscaHeroi buscaHeroi;

	public List<Heroi> encontreOHeroiCerto(EnumCatastrofe catastrofe) {

		List<Heroi> heroisDisponiveis = buscaHeroi.buscaHeroisDisponíveis(catastrofe);

		if (heroisDisponiveis.isEmpty()) {
			return null;
		} else {
			return heroisDisponiveis;
		}
	}

}
