package com.pjh.springgraphqlapi.service;

import com.pjh.springgraphqlapi.dao.BadKeywordRepository;
import com.pjh.springgraphqlapi.document.BadKeyword;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Qualifier("bkService")
@Transactional(readOnly = true)
public class BKMongoMongoDaoImpl implements BKMongoDao {
    final BadKeywordRepository badKeywordRepository;

    public BKMongoMongoDaoImpl(BadKeywordRepository badKeywordRepository) {
        this.badKeywordRepository = badKeywordRepository;
    }

    @Transactional
    @Override
    public Integer save(BadKeyword badKeyword) {
        BadKeyword savedBK = badKeywordRepository.save(badKeyword);
        return savedBK.getId();
    }

    @Override
    public List<BadKeyword> findAll() {
        return badKeywordRepository.findAll();
    }

    @Override
    public List<BadKeyword> findBadKeyword(String badKeyword) {
        return badKeywordRepository.findByKeywordLike(badKeyword);
    }
}
