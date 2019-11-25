package br.com.diego.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.diego.entity.Cartao;
import br.com.diego.repository.ICartaoRepository;

@Controller
@RequestMapping(path = "/banco")
public class TesteJPAController {

	@Autowired
	private ICartaoRepository cartaoRepository;

	@RequestMapping(path = "/novo")
	public @ResponseBody Iterable<Cartao> addNewUser(@RequestParam String name) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		if(name != null && !"".equals(name)) {
			Cartao cartao = new Cartao();
			cartao.setNome(name);
			
			cartaoRepository.save(cartao);
			
		}
		
		return this.getAllUsers();
	}

	@GetMapping(path = "/all")
	public @ResponseBody Iterable<Cartao> getAllUsers() {
		return cartaoRepository.findAll();
	}
	
	@GetMapping(path = "/deleteall")
	public @ResponseBody Iterable<Cartao> deleteAllUsers() {
		cartaoRepository.deleteAll();
		return cartaoRepository.findAll();
	}

}
