package com.pjh.springgraphqlapi.transformer;

public interface Transformer<A, B> {
    B transform(A source);
}
