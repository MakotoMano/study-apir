package com.github.acnaweb.study_apir.dto;

public class ProductRequestCreate{
    // private Long id; não precisa o ID no dto pois ao inserir o nome e o valor 
    // do produto é incrementado +1 ao ID
    private String nome;
    //private BigDecimal valor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    // public BigDecimal getValor() {
    //     return valor;
    // }

    // public void setValor(BigDecimal valor) {
    //     this.valor = valor;
    // }



}