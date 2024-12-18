package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import X.MSW;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public class AtomicIntegerDeserializer extends StdScalarDeserializer {
    public AtomicIntegerDeserializer() {
        super(AtomicInteger.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0j;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return new AtomicInteger();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (c16l.A15()) {
            return MSW.A1C(c16l.A0i());
        }
        Integer A0c = A0c(c16l, anonymousClass469, AtomicInteger.class);
        if (A0c == null) {
            return null;
        }
        return MSW.A1C(A0c.intValue());
    }
}
