package com.task.Task.DAO;

import com.task.Task.Model.AnimalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalEntityRepository extends JpaRepository<AnimalEntity, String> {
}
