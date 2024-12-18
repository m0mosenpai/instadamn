package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public class AtomicLongDeserializer extends StdScalarDeserializer {
    public AtomicLongDeserializer() {
        super(AtomicLong.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0j;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return new AtomicLong();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (c16l.A15()) {
            return AbstractC58318PtA.A15(c16l.A0j());
        }
        if (A0f(c16l, anonymousClass469, AtomicLong.class) == null) {
            return null;
        }
        return AbstractC58318PtA.A15(r0.intValue());
    }
}
