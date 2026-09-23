package br.edu.uniesp.assistencia.internal.cliente.mapper;

import br.edu.uniesp.assistencia.internal.cliente.dto.ClienteResumoResponse;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteResponse;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;

public final class ClienteMapper {

    private ClienteMapper() {
    }

    public static ClienteEntity converteParaEntidade(CriarClienteRequest request) {
        return new ClienteEntity(
                request.nome(),
                request.cpf(),
                request.email()
        );
    }
    public static CriarClienteResponse converterParaResposta(ClienteEntity cliente) {
        return new CriarClienteResponse(
                cliente.getNome(),
                cliente.getEmail()
        );
    }

    public static ClienteResumoResponse paraResumoResposta(
            ClienteEntity cliente) {
        return new ClienteResumoResponse(
                cliente.getId(),
                cliente.getNome(),
                cliente.getEmail(),
                cliente.getCpf(),
                cliente.isAtivo()
        );
    }

}
