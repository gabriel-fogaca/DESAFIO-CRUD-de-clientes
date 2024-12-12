package com.devsuperior.Clientes.repositories;

import com.devsuperior.Clientes.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
