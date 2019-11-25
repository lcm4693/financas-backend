package br.com.diego.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.diego.controller.result.DespesaCover;

@RestController
public class DespesaController {

	@RequestMapping("/despesas-list")
    public List<DespesaCover> findAll() {
		List<DespesaCover> lista = new ArrayList<>();
		
		lista.add(new DespesaCover(1, "Despesa 1", new Date(), 10.2d));
		lista.add(new DespesaCover(2, "Despesa 2", new Date(), 17.3d));
		lista.add(new DespesaCover(3, "Despesa 3", new Date(), 8.4d));
		lista.add(new DespesaCover(4, "Despesa 4", new Date(), 9.8d));
		lista.add(new DespesaCover(5, "Despesa 5", new Date(), 13.9d));
		
        return lista;
    }
	
}
