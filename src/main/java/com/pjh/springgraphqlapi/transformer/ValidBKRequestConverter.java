package com.pjh.springgraphqlapi.transformer;

import com.pjh.springgraphqlapi.document.BadKeyword;
import com.pjh.springgraphqlapi.dto.ValidBKRequest;
import org.springframework.core.convert.converter.Converter;

public class ValidBKRequestConverter implements Converter<ValidBKRequest, BadKeyword> {

    @Override
    public BadKeyword convert(ValidBKRequest validBKRequest) {
        return null;
    }
}
