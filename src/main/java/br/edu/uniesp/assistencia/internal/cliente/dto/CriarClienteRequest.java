package br.edu.uniesp.assistencia.internal.cliente.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.br.CPF;

public record CriarClienteRequest
        (@NotNull String nome, @CPF String cpf, @Email String email) {
}
