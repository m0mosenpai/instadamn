package com.fasterxml.jackson.datatype.guava.deser;

import X.AbstractC75163Zh;
import X.InterfaceC75173Zi;
import com.google.common.collect.NaturalOrdering;
import com.google.common.collect.TreeMultiset;

/* loaded from: classes10.dex */
public abstract class GuavaMultisetDeserializer extends GuavaCollectionDeserializer {
    /* JADX WARN: Type inference failed for: r1v0, types: [X.3Zi, X.3Zh, com.google.common.collect.AbstractMapBasedMultiset] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.3Zi, X.3Zh, com.google.common.collect.AbstractMapBasedMultiset] */
    public final InterfaceC75173Zi A0y() {
        if (this instanceof TreeMultisetDeserializer) {
            return new TreeMultiset(NaturalOrdering.A00);
        }
        if (this instanceof LinkedHashMultisetDeserializer) {
            ?? abstractC75163Zh = new AbstractC75163Zh();
            abstractC75163Zh.A01 = abstractC75163Zh.A07();
            return abstractC75163Zh;
        }
        ?? abstractC75163Zh2 = new AbstractC75163Zh();
        abstractC75163Zh2.A01 = abstractC75163Zh2.A07();
        return abstractC75163Zh2;
    }
}
