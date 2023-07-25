package com.lojaapi.produto.entity;

import java.util.Date;

public class Produto {

    private Integer idDoProduto,quantidadeDoProduto,precoDoProduto;
    private String nomeDoProduto;
    private Date dataDeValidade;

    public Produto() {
        this.idDoProduto = idDoProduto;
        this.quantidadeDoProduto = quantidadeDoProduto;
        this.precoDoProduto = precoDoProduto;
        this.nomeDoProduto = nomeDoProduto;
        this.dataDeValidade = dataDeValidade;
    }

    public Integer getIdDoProduto() {
        return idDoProduto;
    }

    public void setIdDoProduto(Integer idDoProduto) {
        this.idDoProduto = idDoProduto;
    }

    public Integer getQuantidadeDoProduto() {
        return quantidadeDoProduto;
    }

    public void setQuantidadeDoProduto(Integer quantidadeDoProduto) {
        this.quantidadeDoProduto = quantidadeDoProduto;
    }

    public Integer getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(Integer precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public Date getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(Date dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}
