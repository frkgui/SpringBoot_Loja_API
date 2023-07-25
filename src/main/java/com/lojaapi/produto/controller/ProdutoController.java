package com.lojaapi.produto.controller;

import com.lojaapi.produto.entity.Produto;
import com.lojaapi.produto.service.ProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProdutoController {

    private ProdutoService produtoService = new ProdutoService();

    @GetMapping("/produto")
    public List<Produto> verProdutos(){
        return produtoService.mostrarProduto();
    }





}
