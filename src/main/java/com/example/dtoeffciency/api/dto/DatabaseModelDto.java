package com.example.dtoeffciency.api.dto;

import java.util.UUID;

public class DatabaseModelDto {
    private UUID id;
    private String name;
    private long random;

    public DatabaseModelDto() {

    }

    public DatabaseModelDto(UUID id, String name, long random) {
        this.id = id;
        this.name = name;
        this.random = random;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getRandom() {
        return random;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRandom(long random) {
        this.random = random;
    }
}
