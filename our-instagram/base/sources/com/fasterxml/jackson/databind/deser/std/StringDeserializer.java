package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C00O;
import X.C16L;
import X.C16R;
import X.C45T;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class StringDeserializer extends StdScalarDeserializer {
    public static final StringDeserializer A00 = new StringDeserializer();

    public StringDeserializer() {
        super(String.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /* renamed from: A0x, reason: merged with bridge method [inline-methods] */
    public final String A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        String A1Q;
        if (c16l.A19(C16R.A0J)) {
            return c16l.A1P();
        }
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0C) {
            return (String) A0g(c16l, anonymousClass469);
        }
        if (A10 == C16R.A0E) {
            Object A0V = c16l.A0V();
            if (A0V == null) {
                return null;
            }
            if (A0V instanceof byte[]) {
                return ((C45T) anonymousClass469.A02).A01.A00.A05((byte[]) A0V);
            }
            return A0V.toString();
        }
        if (A10 != C16R.A0D && A10.A03 && (A1Q = c16l.A1Q()) != null) {
            return A1Q;
        }
        anonymousClass469.A0T(c16l, this.A00);
        throw C00O.createAndThrow();
    }
}
