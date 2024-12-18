package com.fasterxml.jackson.databind.deser.impl;

import X.AbstractC58321PtD;
import X.AbstractC910944l;
import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

/* loaded from: classes10.dex */
public class UnsupportedTypeDeserializer extends StdDeserializer {
    public final AbstractC910944l A00;
    public final String A01;

    public UnsupportedTypeDeserializer(AbstractC910944l abstractC910944l, String str) {
        super(abstractC910944l);
        this.A00 = abstractC910944l;
        this.A01 = str;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0V;
        if (c16l.A10() == C16R.A0E && ((A0V = c16l.A0V()) == null || AbstractC58321PtD.A1W(this.A00.A00, A0V))) {
            return A0V;
        }
        anonymousClass469.A08(this.A00, this.A01);
        throw C00O.createAndThrow();
    }
}
