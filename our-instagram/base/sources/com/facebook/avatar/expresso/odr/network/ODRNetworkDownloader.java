package com.facebook.avatar.expresso.odr.network;

import X.C12W;
import X.C14360o3;

/* loaded from: classes9.dex */
public final class ODRNetworkDownloader {
    public final C12W A00;

    public ODRNetworkDownloader(C12W c12w) {
        C14360o3.A0B(c12w, 1);
        this.A00 = c12w;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:13)(2:10|11))(3:18|19|(1:21))|14|15|16))|23|6|7|(0)(0)|14|15|16) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(com.instagram.common.session.UserSession r12, java.io.File r13, java.lang.String r14, X.InterfaceC23621Ds r15) {
        /*
            r11 = this;
            r4 = 21
            boolean r0 = X.MAQ.A02(r15, r4)
            if (r0 == 0) goto L22
            r3 = r15
            X.MAQ r3 = (X.MAQ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L22
            int r2 = r2 - r1
            r3.A00 = r2
        L16:
            java.lang.Object r4 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 != r1) goto L2e
            goto L2a
        L22:
            r0 = 42
            X.MAQ r3 = new X.MAQ
            r3.<init>(r11, r15, r4, r0)
            goto L16
        L2a:
            X.AbstractC09560e7.A00(r4)     // Catch: java.io.IOException -> L58
            goto L59
        L2e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L33:
            X.AbstractC09560e7.A00(r4)
            X.1QX r0 = X.MSY.A0J()
            X.1QY r5 = r0.A00()
            X.16i r0 = X.C2n4.A09
            X.2n4 r8 = r0.E3L(r14)
            X.12W r0 = r11.A00     // Catch: java.io.IOException -> L58
            r9 = 0
            r10 = 5
            X.PZ3 r4 = new X.PZ3     // Catch: java.io.IOException -> L58
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9, r10)     // Catch: java.io.IOException -> L58
            r3.A00 = r1     // Catch: java.io.IOException -> L58
            java.lang.Object r0 = X.AbstractC23641Du.A00(r3, r0, r4)     // Catch: java.io.IOException -> L58
            if (r0 != r2) goto L59
            return r2
        L58:
            r1 = 0
        L59:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.avatar.expresso.odr.network.ODRNetworkDownloader.A00(com.instagram.common.session.UserSession, java.io.File, java.lang.String, X.1Ds):java.lang.Object");
    }
}
