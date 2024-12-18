package com.instagram.fanclub.promovideo;

import X.AbstractC25233BEq;
import X.C17060sy;
import X.C99694dm;
import X.EnumC31515Dsz;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* loaded from: classes8.dex */
public final class FanClubPromoAndWelcomeVideoApi {
    public final EnumC31515Dsz A00;
    public final UserSession A01;
    public final C99694dm A02;
    public final C17060sy A03;
    public final FanClubApi A04;

    public FanClubPromoAndWelcomeVideoApi(EnumC31515Dsz enumC31515Dsz, UserSession userSession, C99694dm c99694dm, FanClubApi fanClubApi, C17060sy c17060sy) {
        AbstractC25233BEq.A0x(1, userSession, c17060sy, c99694dm);
        this.A01 = userSession;
        this.A00 = enumC31515Dsz;
        this.A04 = fanClubApi;
        this.A03 = c17060sy;
        this.A02 = c99694dm;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 31
            boolean r0 = X.MAJ.A01(r6, r3)
            if (r0 == 0) goto L58
            r4 = r6
            X.MAJ r4 = (X.MAJ) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L58
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A01
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L46
            if (r0 != r2) goto L60
            X.AbstractC09560e7.A00(r1)
        L24:
            boolean r0 = r1 instanceof X.C3NX
            r3 = 0
            if (r0 == 0) goto L45
            X.3NX r1 = (X.C3NX) r1
            if (r1 == 0) goto L45
            java.lang.Object r0 = r1.A00
            X.R0o r0 = (X.C60488R0o) r0
            if (r0 == 0) goto L45
            X.R0n r0 = r0.A0E()
            if (r0 == 0) goto L45
            X.R0m r1 = r0.A0E()
            if (r1 == 0) goto L45
            java.lang.String r0 = "strong_id__"
            java.lang.String r3 = r1.A07(r0)
        L45:
            return r3
        L46:
            X.AbstractC09560e7.A00(r1)
            com.instagram.fanclub.api.FanClubApi r1 = r5.A04
            com.instagram.common.session.UserSession r0 = r5.A01
            java.lang.String r0 = r0.userId
            r4.A00 = r2
            java.lang.Object r1 = r1.A0F(r0, r4)
            if (r1 != r3) goto L24
            return r3
        L58:
            r0 = 42
            X.MAJ r4 = new X.MAJ
            r4.<init>(r5, r6, r3, r0)
            goto L16
        L60:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A00(com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0027 A[PHI: r5
      0x0027: PHI (r5v8 java.lang.Object) = (r5v4 java.lang.Object), (r5v0 java.lang.Object) binds: [B:19:0x0055, B:10:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.InterfaceC23621Ds r8) {
        /*
            r7 = this;
            r3 = 11
            boolean r0 = X.MAH.A01(r8, r3)
            if (r0 == 0) goto L6c
            r6 = r8
            X.MAH r6 = (X.MAH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L6c
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r5 = r6.A02
            X.1JX r4 = X.C1JX.A02
            int r0 = r6.A00
            r3 = 2
            r1 = 1
            if (r0 == 0) goto L30
            if (r0 == r1) goto L28
            if (r0 != r3) goto L72
            X.AbstractC09560e7.A00(r5)
        L27:
            return r5
        L28:
            java.lang.Object r0 = r6.A01
            com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi r0 = (com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi) r0
            X.AbstractC09560e7.A00(r5)
            goto L63
        L30:
            X.AbstractC09560e7.A00(r5)
            X.0sy r0 = r7.A03
            com.instagram.user.model.User r0 = r0.A00()
            X.17P r0 = r0.A03
            com.instagram.api.schemas.FanClubInfoDict r0 = r0.B4O()
            if (r0 == 0) goto L58
            java.lang.String r5 = r0.getFanClubId()
            if (r5 == 0) goto L58
            r0 = r7
        L48:
            com.instagram.fanclub.api.FanClubApi r2 = r0.A04
            X.Dsz r1 = r0.A00
            r0 = 0
            r6.A01 = r0
            r6.A00 = r3
            java.lang.Object r5 = r2.A02(r1, r5, r6)
            if (r5 != r4) goto L27
        L57:
            return r4
        L58:
            r6.A01 = r7
            r6.A00 = r1
            java.lang.Object r5 = A00(r7, r6)
            if (r5 == r4) goto L57
            r0 = r7
        L63:
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L48
            X.8jk r5 = X.AbstractC25227BEk.A0h()
            return r5
        L6c:
            X.MAH r6 = new X.MAH
            r6.<init>(r7, r8, r3)
            goto L16
        L72:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.promovideo.FanClubPromoAndWelcomeVideoApi.A01(X.1Ds):java.lang.Object");
    }
}
