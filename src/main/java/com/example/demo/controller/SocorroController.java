package com.example.demo.controller;

import static java.util.Objects.isNull;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.EnumCatastrofe;
import com.example.demo.domain.Heroi;
import com.example.demo.dto.ListaDeHeroisDto;
import com.example.demo.service.BuscaHeroiParaOPerigo;
import com.example.demo.service.ComunicaHeroiEmAcao;

@RestController
@RequestMapping("socorro")
public class SocorroController {

	@Autowired
	private BuscaHeroiParaOPerigo buscaHeroi;
	
	@Autowired
	private ComunicaHeroiEmAcao comunicaHeroiEmAcao;

	@GetMapping("/catastrofes/{catastrofe}/{cidade}")
	public ResponseEntity<?> pedirSocorro(@PathVariable String cidade, @PathVariable String catastrofe) {

		List<Heroi> heroisDisponiveis = buscaHeroi.encontreOHeroiCerto(EnumCatastrofe.valueOf(catastrofe));

		if (isNull(heroisDisponiveis)) {
			return ResponseEntity.ok("Não existem heróis disponíveis! Fuja para as montanhas");
		} else {
			return ResponseEntity.ok(heroisDisponiveis);
		}

	}
	
	@PostMapping("/herois")
	public ResponseEntity<?>heroiEmAcao(@RequestBody ListaDeHeroisDto listaDeHorisDto){
		List<Heroi> herois = listaDeHorisDto.forHeroisDtoParaHerois();
		comunicaHeroiEmAcao.comunique(herois);
		return ResponseEntity.ok("Aguentem firme... herois a caminho.");
	}

}
