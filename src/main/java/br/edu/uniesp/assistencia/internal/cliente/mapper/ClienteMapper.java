package br.edu.uniesp.assistencia.internal.cliente.mapper;

import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteResponse;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;

public final class ClienteMapper {

    private ClienteMapper() {
        throw new UnsupportedOperationException("Classe utilitária");
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

}
