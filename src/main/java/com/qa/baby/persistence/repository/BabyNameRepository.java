package com.qa.baby.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.baby.persistence.domain.BabyName;

@Repository
public interface BabyNameRepository extends JpaRepository<BabyName, String> {
}
