package com.auto.insurance;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

/**
 * Created by uengine on 2018. 10. 25..
 */
public interface CreditRepository extends PagingAndSortingRepository<Credit, String> {
}
