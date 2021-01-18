package com.pjh.springgraphqlapi.service;

import com.pjh.springgraphqlapi.document.BadKeyword;

import java.util.List;

public interface BKMongoDao {
    Integer save(BadKeyword badKeyword);
    List<BadKeyword> findAll();
    List<BadKeyword> findBadKeyword(String badKeyword);
}
