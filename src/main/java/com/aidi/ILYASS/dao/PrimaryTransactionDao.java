package com.aidi.ILYASS.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.aidi.ILYASS.domain.PrimaryTransaction;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction, Long> {

    List<PrimaryTransaction> findAll();
}
