package com.testejava.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.testejava.model.Refeicao;
import com.testejava.repository.RefeicaoRepository;


@RestController
public class IndexController {
	
	@Autowired
	private RefeicaoRepository refeicaoRepository;
	
	@RequestMapping(value = "/listar/{nome}", method = RequestMethod.GET)
	@ResponseStatus
	public String refeicaoText(@PathVariable String nome) {
		Refeicao refeicao = new Refeicao();
		refeicao.setNome(nome);
		refeicaoRepository.save(refeicao);
		return "ola tudo bem " + nome + "!";
	}
	

	@GetMapping(value = "listatodos")
	@ResponseBody
	public ResponseEntity<List<Refeicao>> listaRefeicao() {
		
		List<Refeicao> refeicoes = refeicaoRepository.findAll();
		
		return new ResponseEntity<List<Refeicao>>(refeicoes, HttpStatus.OK);
		
	}
	
	@GetMapping(value = "buscarporid")
	@ResponseBody
	public ResponseEntity<Refeicao> buscarporid(@RequestParam(name = "idrefeicao") Long idrefeicao) {
		
		Refeicao refeicao = refeicaoRepository.findById(idrefeicao).get();
		
		return new ResponseEntity<Refeicao>(refeicao, HttpStatus.OK);
	}
	
	@GetMapping(value = "buscarPorNome")
	@ResponseBody
	public ResponseEntity<List<Refeicao>> buscarPorNome(@RequestParam(name = "nome") String nome) {
		
		List<Refeicao> refeicao = refeicaoRepository.buscarPorNome(nome);
		
		return new ResponseEntity<List<Refeicao>>(refeicao, HttpStatus.OK);
	}
	
	@PostMapping(value = "gravar")
	@ResponseBody
	public ResponseEntity<Refeicao> gravar (@RequestBody Refeicao refeicao){
		
		Refeicao ref = refeicaoRepository.save(refeicao);
		
		return new ResponseEntity<Refeicao>(ref, HttpStatus.CREATED);
	}
	
	@PutMapping(value = "atualizar")
	@ResponseBody
	public ResponseEntity<Refeicao> atualizar (@RequestBody Refeicao refeicao){
		
		Refeicao refSalva = refeicaoRepository.saveAndFlush(refeicao);
		
		return new ResponseEntity<Refeicao>(refSalva, HttpStatus.OK);
	}
	
	@DeleteMapping(value = "delete") 
	@ResponseBody
	public ResponseEntity<String> delete(@RequestParam Long idremoverefeicao){
		
		 refeicaoRepository.deleteById(idremoverefeicao);
		
		return new ResponseEntity<String>("Refeicao removida com sucesso", HttpStatus.OK);
	}
	

}
