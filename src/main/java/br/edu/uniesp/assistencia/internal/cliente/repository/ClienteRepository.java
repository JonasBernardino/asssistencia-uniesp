package br.edu.uniesp.assistencia.internal.cliente.repository;

import br.edu.uniesp.assistencia.internal.cliente.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
}
