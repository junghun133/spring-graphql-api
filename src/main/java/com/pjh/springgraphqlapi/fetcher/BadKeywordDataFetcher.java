package com.pjh.springgraphqlapi.fetcher;

import com.pjh.springgraphqlapi.document.BadKeyword;
import com.pjh.springgraphqlapi.service.BKMongoMongoDaoImpl;
import graphql.schema.DataFetcher;
import graphql.schema.DataFetchingEnvironment;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BadKeywordDataFetcher implements DataFetcher<List<BadKeyword>> {

    final
    BKMongoMongoDaoImpl bkMongoMongoDao;

    public BadKeywordDataFetcher(BKMongoMongoDaoImpl bkMongoMongoDao) {
        this.bkMongoMongoDao = bkMongoMongoDao;
    }

    @Override
    public List<BadKeyword> get(DataFetchingEnvironment dataFetchingEnvironment) throws Exception {
        String keyword = dataFetchingEnvironment.getArgument("keyword");
        return bkMongoMongoDao.findBadKeyword(keyword);
    }
}
