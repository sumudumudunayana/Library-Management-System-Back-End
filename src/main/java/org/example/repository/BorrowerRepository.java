package org.example.repository;

import org.example.entity.BorrowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BorrowerRepository extends JpaRepository<BorrowerEntity,Integer> {
}
