package com.pjh.springgraphqlapi.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@AllArgsConstructor @NoArgsConstructor
@Data
public class BadKeyword {

    @Id
    Integer id;
    String keyword;
    Integer count;
/*    BKLevel bkLevel;
    Boolean adminCheck;*/
}
