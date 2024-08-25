package com.example.lending.domain;

import org.springframework.util.Assert;

import java.util.UUID;

public record CopyId(UUID id) {

    public CopyId {
        Assert.notNull(id, "id must not be null");
    }

}
