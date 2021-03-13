package com.example.dtoeffciency.api;

import com.example.dtoeffciency.database.DatabaseModel;
import com.example.dtoeffciency.database.DbRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "non-mapping")
public class NonMappingController {
    @Autowired
    private DbRepo dbRepo;

    @GetMapping
    public List<DatabaseModel> getNonMapped() {
        return dbRepo.getRandom();
    }
}
