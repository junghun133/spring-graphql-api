package com.pjh.springgraphqlapi.transformer;

import com.pjh.springgraphqlapi.document.BadKeyword;
import com.pjh.springgraphqlapi.dto.AddBKRequest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
class AddBKRequestConverter implements Converter<AddBKRequest, BadKeyword> {

    @Override
    public BadKeyword convert(AddBKRequest addBKRequest) {
        return null;
    }
}
