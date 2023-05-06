package com.grupoG32.reto3.repoditory;

import com.grupoG32.reto3.model.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<ClientModel,Integer> {
}
