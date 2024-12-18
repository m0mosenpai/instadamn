package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class NumberDeserializers$IntegerDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$IntegerDeserializer A00;
    public static final NumberDeserializers$IntegerDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$IntegerDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Integer.TYPE;
        Integer num = C05F.A0j;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, 0, 0);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Integer.class, num, null, 0);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0Q;
        if (c16l.A15()) {
            A0Q = c16l.A0i();
        } else if (this.A03) {
            A0Q = A0Q(c16l, anonymousClass469);
        } else {
            return A0c(c16l, anonymousClass469, Integer.class);
        }
        return Integer.valueOf(A0Q);
    }
}
