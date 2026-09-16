package br.edu.uniesp.assistencia.internal.cliente.service;

import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteResponse;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;
import br.edu.uniesp.assistencia.internal.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteEntity criarCliente(CriarClienteRequest clienteRequest) {
        ClienteEntity clienteEntity = new ClienteEntity(
                clienteRequest.nome(),
                clienteRequest.email(),
                clienteRequest.cpf());
        return this.clienteRepository.save(clienteEntity);
    }


}
