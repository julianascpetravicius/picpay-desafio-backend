package com.picpaysimplificado.repositories;

import com.picpaysimplificado.domain.transaction.Transation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transation, Long> {
}
