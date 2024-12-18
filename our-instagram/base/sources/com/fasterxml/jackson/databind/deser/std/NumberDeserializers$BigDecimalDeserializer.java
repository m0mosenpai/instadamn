package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC58318PtA;
import X.AbstractC58319PtB;
import X.AnonymousClass469;
import X.C00O;
import X.C05F;
import X.C16L;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
import java.math.BigDecimal;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class NumberDeserializers$BigDecimalDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$BigDecimalDeserializer A00 = new NumberDeserializers$BigDecimalDeserializer();

    public NumberDeserializers$BigDecimalDeserializer() {
        super(BigDecimal.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0u;
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        int A0x = c16l.A0x();
        if (A0x != 1) {
            if (A0x != 3) {
                if (A0x != 6) {
                    if (A0x != 7 && A0x != 8) {
                        AbstractC58319PtB.A1G(c16l, anonymousClass469, this);
                    } else {
                        return c16l.A0r();
                    }
                } else {
                    String A1P = c16l.A1P();
                    Integer A0e = A0e(anonymousClass469, A1P);
                    if (A0e != C05F.A0C) {
                        if (A0e == C05F.A0N) {
                            return BigDecimal.ZERO;
                        }
                        String trim = A1P.trim();
                        if (!"null".equals(trim)) {
                            try {
                                return new BigDecimal(trim);
                            } catch (IllegalArgumentException unused) {
                                anonymousClass469.A0e(this.A00, trim, "not a valid representation", AbstractC58318PtA.A1b());
                                throw C00O.createAndThrow();
                            }
                        }
                    }
                    return BXX(anonymousClass469);
                }
            } else {
                return A0g(c16l, anonymousClass469);
            }
        } else {
            anonymousClass469.A0T(c16l, this.A00);
        }
        throw C00O.createAndThrow();
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0K(AnonymousClass469 anonymousClass469) {
        return BigDecimal.ZERO;
    }
}
