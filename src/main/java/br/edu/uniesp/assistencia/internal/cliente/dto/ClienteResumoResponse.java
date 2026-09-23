package br.edu.uniesp.assistencia.internal.cliente.dto;

public record ClienteResumoResponse(
        Long id,
        String nome,
        String cpf,
        String email,
        boolean ativo
) {
}

