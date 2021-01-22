package com.pjh.springgraphqlapi.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "keyword_DB")
@AllArgsConstructor @NoArgsConstructor
@Data
public class BadKeyword {
    @Id
    Integer id;
    String keyword;
    Integer count;
    String bkLevel; //H: hard, S: soft
    Boolean adminCheck;
}
