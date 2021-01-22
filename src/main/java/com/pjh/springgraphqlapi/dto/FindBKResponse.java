package com.pjh.springgraphqlapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class FindBKResponse {
    @Setter @Getter
    private String keyword;
    @Setter @Getter
    private String bkLevel;
}
