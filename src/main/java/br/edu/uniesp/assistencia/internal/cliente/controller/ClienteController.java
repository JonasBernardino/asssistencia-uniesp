package br.edu.uniesp.assistencia.internal.cliente.controller;

import br.edu.uniesp.assistencia.internal.cliente.dto.ClienteResumoResponse;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteRequest;
import br.edu.uniesp.assistencia.internal.cliente.dto.CriarClienteResponse;
import br.edu.uniesp.assistencia.internal.cliente.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;


    @PostMapping
    public ResponseEntity<CriarClienteResponse> criar (@Valid @RequestBody CriarClienteRequest request) {
        CriarClienteResponse response = clienteService.criarCliente(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ClienteResumoResponse> buscarPorId(@PathVariable Long id) {
        ClienteResumoResponse response = clienteService.buscarClientePorId(id);
        return ResponseEntity.ok(response);
    }


}
