package br.com.diego.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.diego.controller.result.Teste;

@RestController
public class GreetingController {

	@RequestMapping("/greeting")
    public List<Teste> greeting(@RequestParam(value="name", defaultValue="World") String name) {
		List<Teste> lista = new ArrayList<>();
		
		lista.add(new Teste("1", "Diego"));
		lista.add(new Teste("2", "Lívia"));
		
        return lista;
    }
	
}
