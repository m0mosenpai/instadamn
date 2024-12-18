package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC58318PtA;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: classes10.dex */
public class FailingDeserializer extends StdDeserializer {
    public final String A00;

    public FailingDeserializer() {
        super(Object.class);
        this.A00 = "No _valueDeserializer assigned";
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        anonymousClass469.A0h(this.A00, AbstractC58318PtA.A1b());
        throw C00O.createAndThrow();
    }
}
