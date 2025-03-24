package com.template.project.repositories;

import com.template.project.models.DictamenData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DictamenDataRepository extends JpaRepository<DictamenData, Long> {
}
