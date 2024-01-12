package com.valderez.br.moduleprimeconta.repositories;

import com.valderez.br.moduleprimeconta.transaction.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Transaction, Long> {
}
