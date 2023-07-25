package com.lojaapi.produto.service;

import com.lojaapi.produto.entity.Produto;
import com.lojaapi.produto.repository.ProdutoRepository;

import java.util.ArrayList;

public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService() {
        produtoRepository = new ProdutoRepository();
    }

    public Produto salvarProduto(Produto produto){

        produtoRepository.salvarProduto(produto);
        Produto produtoSalvo = produto;

        return produtoSalvo;
    }

    public Produto removerProduto(Produto produto){

        produtoRepository.excluirProduto(produto);
        Produto produtoRemovido = produto;


        return produtoRemovido;
    }


    public Produto editarProduto(Produto produto){

        return produtoRepository.editarProduto(produto);
    }

    public ArrayList<Produto> mostrarProduto(){
        return produtoRepository.mostrarProduto();
    }
}
