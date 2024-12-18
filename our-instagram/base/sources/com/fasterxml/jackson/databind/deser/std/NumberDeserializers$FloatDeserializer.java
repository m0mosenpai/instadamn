package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class NumberDeserializers$FloatDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$FloatDeserializer A00;
    public static final NumberDeserializers$FloatDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$FloatDeserializer] */
    static {
        Class cls = Float.TYPE;
        Float valueOf = Float.valueOf(0.0f);
        Integer num = C05F.A0u;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Float.class, num, null, valueOf);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        float A0P;
        if (c16l.A19(C16R.A0H)) {
            A0P = c16l.A0h();
        } else if (this.A03) {
            A0P = A0P(c16l, anonymousClass469);
        } else {
            int A0x = c16l.A0x();
            if (A0x != 1) {
                if (A0x != 3) {
                    if (A0x != 11) {
                        if (A0x != 6) {
                            if (A0x != 7 && A0x != 8) {
                                anonymousClass469.A0R(c16l, A0U(anonymousClass469));
                            } else {
                                return Float.valueOf(c16l.A0h());
                            }
                        } else {
                            String A1P = c16l.A1P();
                            Float A0a = A0a(A1P);
                            if (A0a != null) {
                                return A0a;
                            }
                            Integer A0e = A0e(anonymousClass469, A1P);
                            if (A0e != C05F.A0C) {
                                if (A0e == C05F.A0N) {
                                    return ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
                                }
                                String trim = A1P.trim();
                                if (!A0w(anonymousClass469, trim)) {
                                    try {
                                        return Float.valueOf(Float.parseFloat(trim));
                                    } catch (IllegalArgumentException unused) {
                                        anonymousClass469.A0e(((StdDeserializer) this).A00, trim, "not a valid `Float` value", new Object[0]);
                                        throw C00O.createAndThrow();
                                    }
                                }
                            }
                        }
                    }
                    return BXX(anonymousClass469);
                }
                return A0g(c16l, anonymousClass469);
            }
            anonymousClass469.A0T(c16l, ((StdDeserializer) this).A00);
            throw C00O.createAndThrow();
        }
        return Float.valueOf(A0P);
    }
}
