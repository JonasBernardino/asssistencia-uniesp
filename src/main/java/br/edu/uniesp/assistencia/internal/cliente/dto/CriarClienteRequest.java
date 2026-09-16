package br.edu.uniesp.assistencia.internal.cliente.dto;

public record CriarClienteRequest
        (String nome, String cpf, String email) {
}
