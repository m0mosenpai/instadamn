package com.fasterxml.jackson.databind.deser.std;

import X.AbstractC63020Sal;
import X.AnonymousClass469;
import X.C05F;
import X.C16L;
import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;

@JacksonStdImpl
/* loaded from: classes10.dex */
public class NumberDeserializers$NumberDeserializer extends StdScalarDeserializer {
    public static final NumberDeserializers$NumberDeserializer A00 = new NumberDeserializers$NumberDeserializer();

    public NumberDeserializers$NumberDeserializer() {
        super(Number.class);
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Integer A0I() {
        return C05F.A0j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0074, code lost:
    
        if ("INF".equals(r5) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x008f, code lost:
    
        if ("-INF".equals(r5) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee A[Catch: IllegalArgumentException -> 0x0121, TryCatch #0 {IllegalArgumentException -> 0x0121, blocks: (B:53:0x00aa, B:55:0x00b1, B:61:0x00d2, B:66:0x00ca, B:72:0x00db, B:74:0x00e3, B:76:0x00e9, B:78:0x00ee, B:80:0x00f6, B:82:0x00fc, B:88:0x0116, B:90:0x011c), top: B:52:0x00aa }] */
    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A0D(X.C16L r7, X.AnonymousClass469 r8) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.deser.std.NumberDeserializers$NumberDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.JsonDeserializer
    public final Object A0J(C16L c16l, AnonymousClass469 anonymousClass469, AbstractC63020Sal abstractC63020Sal) {
        int A0x = c16l.A0x();
        if (A0x != 6 && A0x != 7 && A0x != 8) {
            return abstractC63020Sal.A06(c16l, anonymousClass469);
        }
        return A0D(c16l, anonymousClass469);
    }
}
