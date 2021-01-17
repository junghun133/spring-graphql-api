package com.pjh.springgraphqlapi.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class ValidBKRequest {
    @Setter @Getter
    String emailId;

    @Setter @Getter
    String keyword;
}
