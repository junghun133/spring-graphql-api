package com.pjh.springgraphqlapi.dao;

import com.pjh.springgraphqlapi.document.BadKeyword;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BadKeywordRepository extends MongoRepository<BadKeyword, Integer> {
}
