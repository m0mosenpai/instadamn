package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import X.C16R;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class NumberDeserializers$DoubleDeserializer extends NumberDeserializers$PrimitiveOrWrapperDeserializer {
    public static final NumberDeserializers$DoubleDeserializer A00;
    public static final NumberDeserializers$DoubleDeserializer A01;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.fasterxml.jackson.databind.deser.std.NumberDeserializers$PrimitiveOrWrapperDeserializer, com.fasterxml.jackson.databind.deser.std.NumberDeserializers$DoubleDeserializer] */
    static {
        Class cls = Double.TYPE;
        Double valueOf = Double.valueOf(0.0d);
        Integer num = C05F.A0u;
        A00 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(cls, num, valueOf, valueOf);
        A01 = new NumberDeserializers$PrimitiveOrWrapperDeserializer(Double.class, num, null, valueOf);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        double A0O;
        if (c16l.A19(C16R.A0H)) {
            A0O = c16l.A0g();
        } else if (this.A03) {
            A0O = A0O(c16l, anonymousClass469);
        } else {
            return A0x(c16l, anonymousClass469);
        }
        return Double.valueOf(A0O);
    }

    public final Double A0x(C16L c16l, AnonymousClass469 anonymousClass469) {
        Object A0g;
        double parseDouble;
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 11) {
                    if (A0x != 6) {
                        if (A0x != 7 && A0x != 8) {
                            anonymousClass469.A0R(c16l, A0U(anonymousClass469));
                        } else {
                            return Double.valueOf(c16l.A0g());
                        }
                    } else {
                        String A1P = c16l.A1P();
                        Double A0Z = A0Z(A1P);
                        if (A0Z == null) {
                            Integer A0e = A0e(anonymousClass469, A1P);
                            if (A0e != C05F.A0C) {
                                if (A0e == C05F.A0N) {
                                    A0g = ((NumberDeserializers$PrimitiveOrWrapperDeserializer) this).A01;
                                } else {
                                    String trim = A1P.trim();
                                    if (!A0w(anonymousClass469, trim)) {
                                        try {
                                            if ("2.2250738585072012e-308".equals(trim)) {
                                                parseDouble = Double.MIN_NORMAL;
                                            } else {
                                                parseDouble = Double.parseDouble(trim);
                                            }
                                            return Double.valueOf(parseDouble);
                                        } catch (IllegalArgumentException unused) {
                                            anonymousClass469.A0e(((StdDeserializer) this).A00, trim, "not a valid `Double` value", new Object[0]);
                                            throw C00O.createAndThrow();
                                        }
                                    }
                                }
                            }
                        } else {
                            return A0Z;
                        }
                    }
                }
                A0g = BXX(anonymousClass469);
            } else {
                A0g = A0g(c16l, anonymousClass469);
            }
            return (Double) A0g;
        }
        anonymousClass469.A0T(c16l, ((StdDeserializer) this).A00);
        throw C00O.createAndThrow();
    }
}
