package com.instagram.genai.imageservice.service;

import X.AbstractC166177bl;
import X.C14360o3;
import X.C92674Dc;
import X.C92694De;
import X.InterfaceC16660sJ;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public final class SingleFlightWithCache {
    public final C92694De A00;
    public final ConcurrentHashMap A01;
    public final InterfaceC16660sJ A02;

    public SingleFlightWithCache(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
        this.A02 = interfaceC16660sJ;
        this.A00 = AbstractC166177bl.A00(C92674Dc.A00);
        this.A01 = new ConcurrentHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.Object r6, X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8) {
        /*
            r5 = this;
            r3 = 36
            boolean r0 = X.MAK.A01(r7, r3)
            if (r0 == 0) goto L69
            r4 = r7
            X.MAK r4 = (X.MAK) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L69
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L49
            if (r0 != r1) goto L6f
            java.lang.Object r6 = r4.A02
            java.lang.Object r2 = r4.A01
            com.instagram.genai.imageservice.service.SingleFlightWithCache r2 = (com.instagram.genai.imageservice.service.SingleFlightWithCache) r2
            X.AbstractC09560e7.A00(r3)
        L2a:
            X.5ud r3 = (X.AbstractC130335ud) r3
            boolean r0 = r3 instanceof X.C130325uc
            if (r0 == 0) goto L42
            X.0sJ r1 = r2.A02
            r0 = r3
            X.5uc r0 = (X.C130325uc) r0
            java.lang.Object r0 = r0.A00
            boolean r0 = X.AbstractC25231BEo.A1a(r0, r1)
            if (r0 == 0) goto L42
            java.util.concurrent.ConcurrentHashMap r0 = r2.A01
            r0.put(r6, r3)
        L42:
            r0 = 0
            X.Mth r2 = new X.Mth
            r2.<init>(r3, r0)
        L48:
            return r2
        L49:
            X.AbstractC09560e7.A00(r3)
            java.util.concurrent.ConcurrentHashMap r0 = r5.A01
            java.lang.Object r0 = r0.get(r6)
            X.5ud r0 = (X.AbstractC130335ud) r0
            if (r0 == 0) goto L5c
            X.Mth r2 = new X.Mth
            r2.<init>(r0, r1)
            return r2
        L5c:
            X.4De r0 = r5.A00
            X.AbstractC31172DnG.A1V(r5, r6, r4, r1)
            java.lang.Object r3 = r0.A00(r6, r4, r8)
            if (r3 == r2) goto L48
            r2 = r5
            goto L2a
        L69:
            X.MAK r4 = new X.MAK
            r4.<init>(r5, r7, r3)
            goto L16
        L6f:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.genai.imageservice.service.SingleFlightWithCache.A00(java.lang.Object, X.1Ds, X.0sJ):java.lang.Object");
    }
}
