package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C16L;
import java.sql.Date;

/* loaded from: classes10.dex */
public class DateDeserializers$SqlDateDeserializer extends DateDeserializers$DateBasedDeserializer {
    public DateDeserializers$SqlDateDeserializer() {
        super(Date.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return new Date(0L);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        java.util.Date A0l = A0l(c16l, anonymousClass469);
        if (A0l == null) {
            return null;
        }
        return new Date(A0l.getTime());
    }
}
