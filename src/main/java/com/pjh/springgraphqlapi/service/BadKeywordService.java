package com.pjh.springgraphqlapi.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BadKeywordService {
    private final MongoTemplate mongoTemplate;



}
