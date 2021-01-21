package com.pjh.springgraphqlapi.fetcher;

import com.pjh.springgraphqlapi.document.BadKeyword;
import com.pjh.springgraphqlapi.service.BKMongoDaoImpl;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetAllBadKeywordDataFetcher implements DataFetcher<List<BadKeyword>> {

    final
    BKMongoDaoImpl bkMongoDao;

    public GetAllBadKeywordDataFetcher(BKMongoDaoImpl bkMongoDao) {
        this.bkMongoDao = bkMongoDao;
    }

    @Override
    public List<BadKeyword> get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
        return bkMongoDao.findAll();
    }
}
