package com.pjh.springgraphqlapi.document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collation = "user_DB")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
    @Id
    Integer id;
    String emailId;
    List<BadKeyword> badKeywordList;
}
