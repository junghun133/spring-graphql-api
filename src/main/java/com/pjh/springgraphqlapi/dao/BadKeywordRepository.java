package com.pjh.springgraphqlapi.dao;

import com.pjh.springgraphqlapi.document.BadKeyword;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BadKeywordRepository extends MongoRepository<BadKeyword, Integer> {
    List<BadKeyword> findByKeywordLike(String keyword);
}
