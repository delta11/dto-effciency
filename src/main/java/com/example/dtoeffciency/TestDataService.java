package com.example.dtoeffciency;

import com.example.dtoeffciency.database.DatabaseModel;
import com.example.dtoeffciency.database.DbRepo;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class TestDataService implements ApplicationListener<ContextRefreshedEvent> {
    @Autowired
    private DbRepo dbRepo;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        for (int i = 0; i < 1000; i++) {
            dbRepo.save(
                    new DatabaseModel(
                            UUID.randomUUID(),
                            RandomStringUtils.random(100, true, true),
                            Math.round(Math.random() * 100)
                    )
            );
        }
    }
}
