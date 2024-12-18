package com.instagram.arp.api;

import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class AvatarTaskHelper {
    public final UserSession A00;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.arp.api.AvatarTaskHelper r5, java.lang.String r6, X.InterfaceC23621Ds r7, X.InterfaceC16660sJ r8) {
        /*
            r4 = 1
            boolean r0 = X.MAG.A01(r7, r4)
            if (r0 == 0) goto L55
            r3 = r7
            X.MAG r3 = (X.MAG) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L55
            int r2 = r2 - r1
            r3.A00 = r2
        L15:
            java.lang.Object r2 = r3.A02
            X.1JX r1 = X.C1JX.A02
            int r0 = r3.A00
            if (r0 == 0) goto L47
            if (r0 != r4) goto L60
            java.lang.Object r6 = r3.A01
            java.lang.String r6 = (java.lang.String) r6
            X.AbstractC09560e7.A00(r2)
        L26:
            r1 = r2
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 != 0) goto L46
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto L5b
            X.8jk r1 = (X.C194848jk) r1
            java.lang.Object r2 = r1.A00
            java.lang.StringBuilder r1 = X.AbstractC166987dD.A1C()
            java.lang.String r0 = "Failed with error: "
            java.lang.String r0 = X.AbstractC167017dG.A0n(r2, r0, r1)
            X.C0w9.A03(r6, r0)
            X.8jk r1 = X.AbstractC25227BEk.A0h()
        L46:
            return r1
        L47:
            X.AbstractC09560e7.A00(r2)
            r3.A01 = r6
            r3.A00 = r4
            java.lang.Object r2 = r8.invoke(r3)
            if (r2 != r1) goto L26
            return r1
        L55:
            X.MAG r3 = new X.MAG
            r3.<init>(r5, r7, r4)
            goto L15
        L5b:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arp.api.AvatarTaskHelper.A00(com.instagram.arp.api.AvatarTaskHelper, java.lang.String, X.1Ds, X.0sJ):java.lang.Object");
    }

    public AvatarTaskHelper(UserSession userSession) {
        this.A00 = userSession;
    }
}
