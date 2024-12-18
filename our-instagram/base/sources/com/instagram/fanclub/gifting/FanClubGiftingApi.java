package com.instagram.fanclub.gifting;

import X.AbstractC167017dG;
import X.C40701ud;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class FanClubGiftingApi {
    public final UserSession A00;
    public final C40701ud A01;

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(java.lang.String r19, X.InterfaceC23621Ds r20) {
        /*
            r18 = this;
            r5 = 24
            r6 = r20
            boolean r0 = X.MAJ.A01(r6, r5)
            r4 = r18
            if (r0 == 0) goto L94
            r3 = r6
            X.MAJ r3 = (X.MAJ) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L94
            int r2 = r2 - r1
            r3.A00 = r2
        L1a:
            java.lang.Object r5 = r3.A01
            X.1JX r2 = X.C1JX.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L50
            if (r0 != r1) goto La2
            X.AbstractC09560e7.A00(r5)
        L28:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto L47
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r0 = r5.A00
            X.435 r0 = (X.AnonymousClass435) r0
            java.lang.Object r0 = r0.A01
            X.3NX r5 = X.AbstractC25225BEi.A0z(r0)
        L3a:
            boolean r0 = r5 instanceof X.C3NX
            if (r0 != 0) goto L46
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 == 0) goto L9d
            X.8jk r5 = X.AbstractC25227BEk.A0h()
        L46:
            return r5
        L47:
            boolean r0 = r5 instanceof X.C194848jk
            if (r0 != 0) goto L3a
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L50:
            X.AbstractC09560e7.A00(r5)
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r5 = X.AbstractC25225BEi.A0b()
            java.lang.String r0 = "user_id"
            r7 = r19
            r6.A04(r0, r7)
            boolean r0 = X.AbstractC167007dF.A1W(r7)
            X.1uJ r7 = X.AbstractC25227BEk.A0U(r0)
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r5.getParamsCopy()
            java.lang.Class<X.QgF> r11 = X.QgF.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "FanClubGiftOptions"
            r12 = 0
            r0 = 5605(0x15e5, float:7.854E-42)
            java.lang.String r16 = X.AbstractC111324zv.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = r4.A01
            r3.A00 = r1
            java.lang.Object r5 = r0.A04(r6, r3)
            if (r5 != r2) goto L28
            return r2
        L94:
            r0 = 42
            X.MAJ r3 = new X.MAJ
            r3.<init>(r4, r6, r5, r0)
            goto L1a
        L9d:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        La2:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.gifting.FanClubGiftingApi.A00(java.lang.String, X.1Ds):java.lang.Object");
    }

    public FanClubGiftingApi(UserSession userSession, C40701ud c40701ud) {
        AbstractC167017dG.A1P(userSession, c40701ud);
        this.A00 = userSession;
        this.A01 = c40701ud;
    }
}
