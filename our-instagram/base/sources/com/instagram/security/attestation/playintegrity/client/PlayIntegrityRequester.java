package com.instagram.security.attestation.playintegrity.client;

import X.C006802i;
import X.InterfaceC57913PmJ;

/* loaded from: classes9.dex */
public final class PlayIntegrityRequester {
    public final InterfaceC57913PmJ A00;
    public final C006802i A01;

    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r5 = 3
            boolean r0 = X.C57137PWp.A00(r11, r5)
            if (r0 == 0) goto L2a
            r7 = r11
            X.PWp r7 = (X.C57137PWp) r7
            int r2 = r7.A01
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2a
            int r2 = r2 - r1
            r7.A01 = r2
        L15:
            java.lang.Object r3 = r7.A03
            X.1JX r8 = X.C1JX.A02
            int r0 = r7.A01
            r2 = 1
            r6 = 533736699(0x1fd02cfb, float:8.816584E-20)
            if (r0 == 0) goto L35
            if (r0 != r2) goto L30
            int r4 = r7.A00
            java.lang.Object r7 = r7.A02
            com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester r7 = (com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester) r7
            goto L6e
        L2a:
            X.PWp r7 = new X.PWp
            r7.<init>(r9, r11, r5)
            goto L15
        L30:
            java.lang.IllegalStateException r3 = X.AbstractC166987dD.A13()
            throw r3
        L35:
            X.AbstractC09560e7.A00(r3)
            X.PmJ r1 = r9.A00
            if (r10 == 0) goto L92
            X.N26 r0 = new X.N26
            r0.<init>(r10)
            X.5KS r1 = r1.EJA(r0)
            X.C14360o3.A07(r1)
            X.OlY r0 = new X.OlY
            r0.<init>(r1)
            X.XOy r1 = X.XOv.A00(r0)
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            int r4 = r0.nextInt()
            X.02i r0 = r9.A01     // Catch: X.N21 -> L82
            r0.markerStart(r6, r4)     // Catch: X.N21 -> L82
            r7.A02 = r9     // Catch: X.N21 -> L82
            r7.A00 = r4     // Catch: X.N21 -> L82
            r7.A01 = r2     // Catch: X.N21 -> L82
            java.lang.Object r3 = X.AbstractC47129KsO.A00(r1, r7)     // Catch: X.N21 -> L82
            if (r3 != r8) goto L6c
            return r8
        L6c:
            r7 = r9
            goto L71
        L6e:
            X.AbstractC09560e7.A00(r3)     // Catch: X.N21 -> L80
        L71:
            X.02i r2 = r7.A01     // Catch: X.N21 -> L80
            r0 = 2
            r2.markerEnd(r6, r4, r0)     // Catch: X.N21 -> L80
            r1 = 533740763(0x1fd03cdb, float:8.8192103E-20)
            java.lang.String r0 = "success"
            r2.A0g(r1, r0)     // Catch: X.N21 -> L80
            return r3
        L80:
            r3 = move-exception
            goto L84
        L82:
            r3 = move-exception
            r7 = r9
        L84:
            X.02i r2 = r7.A01
            r2.markerEnd(r6, r4, r5)
            r1 = 533740510(0x1fd03bde, float:8.819047E-20)
            java.lang.String r0 = "fail"
            r2.A0g(r1, r0)
            throw r3
        L92:
            java.lang.String r0 = "Null nonce"
            java.lang.NullPointerException r3 = X.AbstractC166987dD.A15(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.security.attestation.playintegrity.client.PlayIntegrityRequester.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public PlayIntegrityRequester(InterfaceC57913PmJ interfaceC57913PmJ, C006802i c006802i) {
        this.A00 = interfaceC57913PmJ;
        this.A01 = c006802i;
    }
}
