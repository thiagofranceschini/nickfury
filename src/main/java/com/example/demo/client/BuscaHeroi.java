package com.example.demo.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.domain.EnumCatastrofe;
import com.example.demo.domain.Heroi;
@Component
@FeignClient(name="buscaHeroi", url="http://192.168.0.63:8080" )
public interface BuscaHeroi {

	@GetMapping(path="/{catastrofeRequerida}")
	List<Heroi>buscaHeroisDisponíveis(@PathVariable("catastrofeRequerida") EnumCatastrofe catastrofeRequerida);

	@PostMapping()
	ResponseEntity<?> informarHeroiEmAcao(@RequestBody List<Heroi> herois);
}
