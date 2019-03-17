package com.americano.member.type;

import java.util.Arrays;

/**
 * Created by gavinkim at 2019-03-17
 */
public enum Status {
    UNKOWN("unkown"),
    ACTIVE("active"),
    INACTIVE("inactive"),
    DELELTED("deleted");

    private String status;

    Status(String status) {
        this.status = status;
    }

    public static Status findByStatus(String status){
        return Arrays.stream(Status.values())
                .filter(st -> status.equalsIgnoreCase(st.name()))
                .findFirst()
                .orElse(UNKOWN);
    }
}
