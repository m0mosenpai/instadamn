package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.5Hv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C115005Hv {
    public final UserSession A00;
    public final InterfaceC75453aC A01;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
    
        if (X.C87153uY.A08(r18, r19) != false) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final X.C115015Hw A00(com.instagram.common.session.UserSession r18, X.C38321qM r19, boolean r20) {
        /*
            r1 = 0
            r0 = r18
            X.C14360o3.A0B(r0, r1)
            r1 = 1
            r5 = r19
            X.C14360o3.A0B(r5, r1)
            X.1w7 r1 = X.AbstractC41561w6.A00(r0)
            X.1v4 r1 = r1.A00(r5)
            r4 = 0
            if (r1 == 0) goto Ld7
            X.1qM r1 = r1.A0J
            X.1rF r1 = r1.A0C
            X.1sb r1 = r1.getInjected()
            if (r1 == 0) goto Ld9
            X.4oC r3 = r1.BzH()
            if (r3 == 0) goto Lda
            com.instagram.api.schemas.SponsoredAdsDisclaimerType r2 = r3.BL1()
        L2b:
            com.instagram.api.schemas.SponsoredAdsDisclaimerType r1 = com.instagram.api.schemas.SponsoredAdsDisclaimerType.A04
            if (r2 != r1) goto L3e
            if (r3 == 0) goto L3e
            java.lang.String r1 = r3.BKx()
            if (r1 == 0) goto L3e
            int r1 = r1.length()
            if (r1 == 0) goto L3e
            r4 = r3
        L3e:
            X.4o2 r2 = X.AbstractC41071vF.A02(r0, r5)
            com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement r1 = com.instagram.api.schemas.IGAdTransparencyDisclaimerPlacement.A04
            java.lang.String r11 = X.AbstractC87103uT.A00(r1, r2)
            boolean r14 = r5.A5M()
            boolean r15 = r5.CdW()
            java.lang.String r7 = r5.getId()
            java.lang.String r2 = "Required value was null."
            if (r7 == 0) goto Le3
            com.instagram.user.model.User r1 = r5.A2E(r0)
            if (r1 == 0) goto Ld4
            boolean r16 = X.AbstractC76693cH.A03(r1)
        L62:
            java.lang.String r8 = X.AbstractC41071vF.A0E(r0, r5)
            if (r8 == 0) goto Ldd
            r6 = 0
            if (r4 == 0) goto Ld1
            java.lang.String r9 = r4.BKx()
            java.lang.String r10 = r4.Ah4()
            boolean r1 = r4.BBF()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
        L7b:
            boolean r1 = X.C87153uY.A06(r0, r5)
            if (r1 != 0) goto L89
            boolean r1 = X.C87153uY.A08(r0, r5)
            r17 = 0
            if (r1 == 0) goto L8b
        L89:
            r17 = 1
        L8b:
            boolean r18 = X.C87153uY.A07(r0, r5)
            X.0Tz r3 = X.C06090Tz.A05
            r1 = 36323972941426425(0x810c7600012ef9, double:3.034764980832513E-306)
            boolean r1 = X.C18U.A06(r3, r0, r1)
            r19 = 1
            if (r1 == 0) goto Lce
            if (r11 == 0) goto Lce
            int r1 = r11.length()
            if (r1 <= 0) goto Lce
        La6:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r1 = X.AbstractC41071vF.A00(r0, r5)
            if (r1 == 0) goto Lb2
            java.lang.String r12 = r1.BrS()
            if (r12 != 0) goto Lb4
        Lb2:
            java.lang.String r12 = ""
        Lb4:
            com.instagram.api.schemas.IGCTMessagingAdsInfoDictIntf r0 = X.AbstractC41071vF.A00(r0, r5)
            if (r0 == 0) goto Lc6
            com.instagram.api.schemas.OnFeedMessagesIntf r0 = r0.BUJ()
            if (r0 == 0) goto Lc6
            java.lang.String r13 = r0.BDG()
            if (r13 != 0) goto Lc8
        Lc6:
            java.lang.String r13 = ""
        Lc8:
            X.5Hw r4 = new X.5Hw
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r4
        Lce:
            r19 = 0
            goto La6
        Ld1:
            r9 = r6
            r10 = r6
            goto L7b
        Ld4:
            r16 = 0
            goto L62
        Ld7:
            r3 = r4
            goto Lda
        Ld9:
            r3 = 0
        Lda:
            r2 = r4
            goto L2b
        Ldd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        Le3:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C115005Hv.A00(com.instagram.common.session.UserSession, X.1qM, boolean):X.5Hw");
    }

    public C115005Hv(UserSession userSession, InterfaceC75453aC interfaceC75453aC) {
        this.A00 = userSession;
        this.A01 = interfaceC75453aC;
    }
}
