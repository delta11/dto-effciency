package com.example.dtoeffciency.database;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.UUID;

public interface DbRepo extends CrudRepository<DatabaseModel, UUID> {
    @Query(nativeQuery = true, value = "SELECT id, name, random  FROM database_model ORDER BY RAND() LIMIT 100")
    List<DatabaseModel> getRandom();
}
