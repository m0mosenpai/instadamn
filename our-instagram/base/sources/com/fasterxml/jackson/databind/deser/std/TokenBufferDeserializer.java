package com.fasterxml.jackson.databind.deser.std;

import X.AnonymousClass001;
import X.AnonymousClass469;
import X.C102314j6;
import X.C16L;
import X.C16R;
import X.C914146b;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes2.dex */
public class TokenBufferDeserializer extends StdScalarDeserializer {
    public TokenBufferDeserializer() {
        super(C914146b.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final /* bridge */ /* synthetic */ Object A0D(C16L c16l, AnonymousClass469 anonymousClass469) {
        C16R A1J;
        C914146b c914146b = new C914146b(c16l, anonymousClass469);
        C16R c16r = C16R.A0A;
        if (!c16l.A19(c16r)) {
            c914146b.A14(c16l);
            return c914146b;
        }
        c914146b.A0d();
        do {
            c914146b.A14(c16l);
            A1J = c16l.A1J();
        } while (A1J == c16r);
        C16R c16r2 = C16R.A09;
        if (A1J != c16r2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Expected END_OBJECT after copying contents of a JsonParser into TokenBuffer, got ");
            sb.append(A1J);
            String obj = sb.toString();
            C16L c16l2 = anonymousClass469.A07;
            String format = String.format("Unexpected token (%s), expected %s", c16l2.A10(), c16r2);
            if (obj != null) {
                format = AnonymousClass001.A0g(format, ": ", obj);
            }
            throw new C102314j6(c16l2, format);
        }
        c914146b.A0a();
        return c914146b;
    }
}
