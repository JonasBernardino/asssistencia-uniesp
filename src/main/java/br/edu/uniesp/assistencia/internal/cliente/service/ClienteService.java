package br.edu.uniesp.assistencia.internal.cliente.service;

import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteResponse;
import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;
import br.edu.uniesp.assistencia.internal.cliente.mapper.ClienteMapper;
import br.edu.uniesp.assistencia.internal.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Transactional
    public CriarClienteResponse criarCliente(CriarClienteRequest request){
        ClienteEntity clienteEntity = ClienteMapper.converteParaEntidade(request);
        clienteRepository.save(clienteEntity);
        return ClienteMapper.converterParaResposta( clienteEntity );
    }
}
