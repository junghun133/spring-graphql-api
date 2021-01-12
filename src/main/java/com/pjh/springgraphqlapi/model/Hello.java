package com.pjh.springgraphqlapi.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Hello {
    private String title;
    private String message;
}
