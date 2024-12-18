package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import X.C16R;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public final class NumberDeserializers$BooleanDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$BooleanDeserializer A00;
    public static final NumberDeserializers$BooleanDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$BooleanDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer] */
    static {
        Class cls = Boolean.TYPE;
        Boolean bool = Boolean.FALSE;
        Integer num = C05F.A15;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, bool, bool);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Boolean.class, num, null, bool);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A10 = c16l.A10();
        if (A10 == C16R.A0K) {
            return Boolean.TRUE;
        }
        if (A10 == C16R.A0F) {
            return Boolean.FALSE;
        }
        if (this.A03) {
            return Boolean.valueOf(A0v(c16l, anonymousClass469));
        }
        return A0Y(c16l, anonymousClass469, ((StdDeserializer) this).A00);
    }
}
