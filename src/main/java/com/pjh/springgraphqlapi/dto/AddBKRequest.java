package com.pjh.springgraphqlapi.dto;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@NoArgsConstructor @AllArgsConstructor
public class AddBKRequest {
    @Id
    Integer id;
    String keyword;
}
