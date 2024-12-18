package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class NumberDeserializers$LongDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$LongDeserializer A00;
    public static final NumberDeserializers$LongDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$LongDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Long.TYPE;
        Integer num = C05F.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, 0L, 0L);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Long.class, num, null, 0L);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        long A0S;
        if (c16l.A15()) {
            A0S = c16l.A0j();
        } else if (this.A03) {
            A0S = A0S(c16l, anonymousClass469);
        } else {
            return A0f(c16l, anonymousClass469, Long.class);
        }
        return Long.valueOf(A0S);
    }
}
