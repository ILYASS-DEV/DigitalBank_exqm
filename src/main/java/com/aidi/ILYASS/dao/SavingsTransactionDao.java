package com.aidi.ILYASS.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aidi.ILYASS.domain.SavingsTransaction;

public interface SavingsTransactionDao extends CrudRepository<SavingsTransaction, Long> {

    List<SavingsTransaction> findAll();
}

