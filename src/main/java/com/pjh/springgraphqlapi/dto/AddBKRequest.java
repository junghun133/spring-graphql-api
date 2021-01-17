package com.pjh.springgraphqlapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor @AllArgsConstructor
public class AddBKRequest {
    @Setter @Getter
    Integer id;

    @Setter @Getter
    String keyword;
}
