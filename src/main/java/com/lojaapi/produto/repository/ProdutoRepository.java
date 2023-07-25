package com.lojaapi.produto.repository;

import com.lojaapi.produto.entity.Produto;

import java.util.ArrayList;

public class ProdutoRepository {

    ArrayList<Produto> listaDeProdutos = new ArrayList<>();



    public Produto salvarProduto(Produto produto){

        listaDeProdutos.add(produto);
        Produto produtoSalvo = produto;

        return produtoSalvo;
    }

    public Produto excluirProduto(Produto produto){

        listaDeProdutos.remove(produto);
        Produto produtoRemovido = produto;

        return produto;

    }

//    public Produto editarProduto(Produto produto){
//
//       Produto idProduto = listaDeProdutos.get(produto.getIdDoProduto());
//
//        listaDeProdutos.get(idProduto.getIdDoProduto()) = produto;
//
//        return produtoEditado;
//    }


    public ArrayList<Produto> mostrarProduto(){

        return listaDeProdutos;
    }


}
