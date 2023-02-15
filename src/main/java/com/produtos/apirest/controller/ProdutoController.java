package com.produtos.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.produtos.apirest.models.Produto;
import com.produtos.apirest.repository.ProdutoRepository;

@RestController
@RequestMapping(value="/produto")
@CrossOrigin(origins="*")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	//Métodos API
	
	@PostMapping("/cadastrar")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@GetMapping(value="/listar")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(value="/listar/{id}")
	public Produto listaProduto(@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping("/deletar/{id}")
	public ResponseEntity<?> deleteProduto(@PathVariable(value="id") long id) {
		Produto produto = listaProduto(id);
		produtoRepository.delete(produto);
		
		return ResponseEntity.ok("Produto com id: " + id + " foi deletado da base de dados com Sucesso!");
	}
	
	@PutMapping("/atualizar")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
