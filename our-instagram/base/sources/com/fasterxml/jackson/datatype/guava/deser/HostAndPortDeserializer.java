package com.fasterxml.jackson.datatype.guava.deser;

import X.AnonymousClass469;
import X.TIC;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;

/* loaded from: classes10.dex */
public class HostAndPortDeserializer extends FromStringDeserializer {
    public static final HostAndPortDeserializer A00 = new HostAndPortDeserializer();

    public HostAndPortDeserializer() {
        super(TIC.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        if (r4 > 65535) goto L18;
     */
    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer, com.fasterxml.jackson.databind.JsonDeserializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object A0D(X.C16L r6, X.AnonymousClass469 r7) {
        /*
            r5 = this;
            X.16R r0 = X.C16R.A0D
            boolean r0 = r6.A19(r0)
            if (r0 == 0) goto L6a
            X.44T r0 = r6.A1K()
            if (r0 == 0) goto L63
            X.44p r1 = r0.A04(r6)
            java.lang.String r0 = "host"
            X.44p r0 = r1.A04(r0)
            if (r0 != 0) goto L31
            java.lang.String r0 = "hostText"
            X.44p r0 = r1.A05(r0)
            java.lang.String r2 = r0.A07()
        L24:
            java.lang.String r0 = "port"
            X.44p r0 = r1.A04(r0)
            if (r0 != 0) goto L36
            X.TIC r0 = X.TIC.A00(r2)
            return r0
        L31:
            java.lang.String r2 = r0.A06()
            goto L24
        L36:
            int r4 = r0.A02()
            if (r4 < 0) goto L42
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 1
            if (r4 <= r0) goto L43
        L42:
            r1 = 0
        L43:
            java.lang.String r0 = "Port out of range: %s"
            X.C18C.A0C(r0, r4, r1)
            X.TIC r3 = X.TIC.A00(r2)
            int r0 = r3.A00
            boolean r0 = X.MSY.A1R(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Host has a port: %s"
            X.C18C.A0A(r2, r0, r1)
            java.lang.String r2 = r3.A01
            boolean r1 = r3.A02
            X.TIC r0 = new X.TIC
            r0.<init>(r2, r4, r1)
            return r0
        L63:
            java.lang.String r0 = "No ObjectCodec defined for parser, needed for deserialization"
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A14(r0)
            throw r0
        L6a:
            java.lang.Object r0 = super.A0D(r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.datatype.guava.deser.HostAndPortDeserializer.A0D(X.16L, X.469):java.lang.Object");
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public final /* bridge */ /* synthetic */ Object A0z(AnonymousClass469 anonymousClass469, String str) {
        return TIC.A00(str);
    }
}
