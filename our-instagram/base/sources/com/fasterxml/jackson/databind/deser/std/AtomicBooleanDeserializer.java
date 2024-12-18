package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC166997dE;
import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import X.C16R;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public class AtomicBooleanDeserializer extends StdScalarDeserializer {
    public AtomicBooleanDeserializer() {
        super(AtomicBoolean.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A15;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        boolean booleanValue;
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0K) {
            booleanValue = true;
        } else if (A10 == C16R.A0F) {
            booleanValue = false;
        } else {
            Boolean A0Y = A0Y(c16l, anonymousClass469, AtomicBoolean.class);
            if (A0Y == null) {
                return null;
            }
            booleanValue = A0Y.booleanValue();
        }
        return new AtomicBoolean(booleanValue);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return AbstractC166997dE.A17();
    }
}
