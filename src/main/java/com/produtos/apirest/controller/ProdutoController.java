package com.produtos.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value="/api")
@Api(value="API REST Produtos")
@CrossOrigin(origins="*")
public class ProdutoController {

	@Autowired
	ProdutoRepository produtoRepository;
	
	//Métodos API
	
	@PostMapping("/cadastrar")
	@ApiOperation(value="Salva um produto")
	public Produto salvaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
	@GetMapping(value="/listar")
	@ApiOperation(value="Retorna a lista completa dos produtos")
	public List<Produto> listaProdutos(){
		return produtoRepository.findAll();
	}
	
	@GetMapping(value="/listar/{id}")
	@ApiOperation(value="Retorna um único produto")
	public Produto listaProduto(@PathVariable(value="id") long id) {
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping("/deletar")
	@ApiOperation(value="Deleta um produto")
	public void deleteProduto(@RequestBody Produto produto) {
		produtoRepository.delete(produto);
	}
	
	@PutMapping("/atualizar")
	@ApiOperation(value="Atualiza um produto")
	public Produto atualizaProduto(@RequestBody Produto produto) {
		return produtoRepository.save(produto);
	}
	
}
