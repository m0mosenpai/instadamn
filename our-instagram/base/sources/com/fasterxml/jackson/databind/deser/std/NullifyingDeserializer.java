package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC63020Sal;
import X.AnonymousClass469;
import X.C16L;
import X.C16R;
import X.C912845h;

/* loaded from: classes10.dex */
public class NullifyingDeserializer extends StdDeserializer {
    public static final NullifyingDeserializer A00 = new NullifyingDeserializer();

    public NullifyingDeserializer() {
        super(Object.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        if (!c16l.A19(C16R.A0A)) {
            c16l.A0z();
            return null;
        }
        while (true) {
            C16R A1J = c16l.A1J();
            if (A1J == null || A1J == C16R.A09) {
                return null;
            }
            c16l.A0z();
        }
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Boolean A0G(C912845h c912845h) {
        return Boolean.FALSE;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        int A0x = c16l.A0x();
        if (A0x != 1 && A0x != 3 && A0x != 5) {
            return null;
        }
        return abstractC63020Sal.A03(c16l, anonymousClass469);
    }
}
