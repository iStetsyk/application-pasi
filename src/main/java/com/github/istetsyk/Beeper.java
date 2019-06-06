package com.github.istetsyk;

import java.time.LocalDateTime;
import java.util.UUID;
import java.util.Objects;

class Beeper {

    private final String uuid = UUID.randomUUID().toString();
    private LocalDateTime createdAt;
    private String orderName;
    private LocalDateTime calledAt;
    private LocalDateTime collectedAt;

    public Beeper(String orderName) {
        this.orderName = orderName;
        createdAt = LocalDateTime.now();
    }

    public String getOrderName(){
        return orderName;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.uuid);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Beeper) {
            Beeper that = (Beeper)obj;
            return Objects.equals(this.uuid, that.uuid);
        }
        return  false;
    }

}