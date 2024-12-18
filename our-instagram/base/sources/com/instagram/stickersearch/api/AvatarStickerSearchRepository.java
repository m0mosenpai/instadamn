package com.instagram.stickersearch.api;

import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.C05A;
import X.C10E;
import X.C169487hO;
import X.C43172J6r;
import X.C47461Kxq;
import X.C47463Kxs;
import X.C4A7;
import X.C4A8;
import X.C51758Mth;
import X.EnumC143286dT;
import X.InterfaceC169497hP;
import com.instagram.common.session.UserSession;

/* loaded from: classes8.dex */
public final class AvatarStickerSearchRepository extends C4A7 {
    public final C51758Mth A00;
    public final EnumC143286dT A01;
    public final UserSession A02;
    public final InterfaceC169497hP A03;
    public final C47461Kxq A04;
    public final C47463Kxs A05;
    public final C05A A06;
    public final C05A A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarStickerSearchRepository(C51758Mth c51758Mth, EnumC143286dT enumC143286dT, UserSession userSession) {
        super("AvatarStickerSearchRepository", C4A8.A00(218726426));
        C47461Kxq c47461Kxq = new C47461Kxq(userSession);
        C47463Kxs c47463Kxs = new C47463Kxs(userSession);
        AbstractC167017dG.A1P(userSession, enumC143286dT);
        this.A02 = userSession;
        this.A01 = enumC143286dT;
        this.A00 = c51758Mth;
        this.A04 = c47461Kxq;
        this.A05 = c47463Kxs;
        this.A03 = new C169487hO();
        this.A07 = C10E.A00(null);
        this.A06 = C10E.A00(null);
        AbstractC166987dD.A1Z(new C43172J6r(this, null, 41), super.A01);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A00(X.C38687GzS r10, X.InterfaceC23621Ds r11) {
        /*
            r9 = this;
            r4 = 44
            boolean r0 = X.PXA.A03(r11, r4)
            if (r0 == 0) goto Lb2
            r2 = r11
            X.PXA r2 = (X.PXA) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto Lb2
            int r3 = r3 - r1
            r2.A00 = r3
        L16:
            java.lang.Object r5 = r2.A03
            X.1JX r3 = X.C1JX.A02
            int r1 = r2.A00
            r0 = 1
            if (r1 == 0) goto L49
            if (r1 != r0) goto Lbc
            java.lang.Object r10 = r2.A02
            X.GzS r10 = (X.C38687GzS) r10
            java.lang.Object r1 = r2.A01
            com.instagram.stickersearch.api.AvatarStickerSearchRepository r1 = (com.instagram.stickersearch.api.AvatarStickerSearchRepository) r1
            X.AbstractC09560e7.A00(r5)
        L2c:
            X.3NY r5 = (X.C3NY) r5
            boolean r0 = r5 instanceof X.C3NX
            if (r0 == 0) goto Lb9
            X.7hP r4 = r1.A03
            java.lang.String r3 = r10.A01
            X.3NX r5 = (X.C3NX) r5
            java.lang.Object r2 = r5.A00
            X.K8S r2 = (X.K8S) r2
            java.util.List r1 = r2.A00()
            r0 = 0
            r4.AA5(r3, r0, r1)
            java.util.List r3 = r2.A00()
        L48:
            return r3
        L49:
            X.AbstractC09560e7.A00(r5)
            com.instagram.common.session.UserSession r7 = r9.A02
            X.6dT r6 = r9.A01
            java.lang.Object r4 = r10.A00
            X.6dS r4 = (X.EnumC143276dS) r4
            java.lang.String r8 = r10.A01
            X.Mth r5 = r9.A00
            r2.A01 = r9
            r2.A02 = r10
            r2.A00 = r0
            X.AbstractC167017dG.A1R(r4, r8)
            X.6oQ r1 = X.EnumC143276dS.A01
            if (r5 == 0) goto Lb0
            boolean r0 = r5.A01
        L67:
            java.lang.String r1 = r1.A00(r4, r6, r7, r0)
            X.1Ms r4 = X.AbstractC31177DnL.A0M(r7)
            java.lang.String r0 = "creatives/search_avatar_sticker_pack/"
            r4.A0B(r0)
            java.lang.String r0 = "sticker_pack_id"
            r4.A9s(r0, r1)
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "surface"
            r4.A9s(r0, r1)
            java.lang.String r0 = "query_string"
            r4.A9s(r0, r8)
            X.0aQ r1 = new X.0aQ
            r1.<init>(r7)
            X.KEs r0 = new X.KEs
            r0.<init>(r6, r1)
            r4.A02 = r0
            if (r5 == 0) goto La2
            boolean r0 = r5.A01
            if (r0 == 0) goto La2
            java.lang.Object r0 = r5.A00
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "user_ids"
            r4.A9s(r0, r1)
        La2:
            X.1ON r1 = r4.A0N()
            r0 = -5
            java.lang.Object r5 = r1.A00(r0, r2)
            if (r5 == r3) goto L48
            r1 = r9
            goto L2c
        Lb0:
            r0 = 0
            goto L67
        Lb2:
            X.PXA r2 = new X.PXA
            r2.<init>(r9, r11, r4)
            goto L16
        Lb9:
            X.0sl r3 = X.C16930sl.A00
            return r3
        Lbc:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.api.AvatarStickerSearchRepository.A00(X.GzS, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.EnumC143276dS r11, java.lang.String r12, X.InterfaceC23621Ds r13) {
        /*
            r10 = this;
            r3 = 45
            boolean r0 = X.PXA.A03(r13, r3)
            if (r0 == 0) goto L2f
            r4 = r13
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L2f
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r6 = 4
            r9 = 3
            r8 = 2
            r7 = 1
            if (r0 == 0) goto L35
            if (r0 == r7) goto La8
            if (r0 == r8) goto La8
            if (r0 == r9) goto L88
            if (r0 == r6) goto La8
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        L2f:
            X.PXA r4 = new X.PXA
            r4.<init>(r10, r13, r3)
            goto L16
        L35:
            X.AbstractC09560e7.A00(r3)
            X.7hP r0 = r10.A03
            X.9JQ r0 = r0.BjP(r12)
            java.util.List r3 = r0.A06
            java.lang.Integer r1 = r0.A01
            java.lang.Integer r0 = X.C05F.A0C
            if (r1 != r0) goto L5a
            if (r3 == 0) goto L5a
            X.05A r2 = r10.A06
            r1 = 22
            X.GzS r0 = new X.GzS
            r0.<init>(r3, r1, r12)
            r4.A00 = r7
            java.lang.Object r0 = r2.emit(r0, r4)
        L57:
            if (r0 != r5) goto Lab
            return r5
        L5a:
            X.GzS r7 = new X.GzS
            r7.<init>(r11, r12)
            X.Kxs r0 = r10.A05
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36325390280569893(0x810dc000003425, double:3.035661311814009E-306)
            boolean r0 = X.C18U.A06(r2, r3, r0)
            if (r0 == 0) goto L79
            X.05A r0 = r10.A07
            r4.A00 = r8
            java.lang.Object r0 = r0.emit(r7, r4)
            goto L57
        L79:
            X.05A r2 = r10.A06
            r4.A01 = r2
            r4.A02 = r12
            r4.A00 = r9
            java.lang.Object r3 = r10.A00(r7, r4)
            if (r3 != r5) goto L93
            return r5
        L88:
            java.lang.Object r12 = r4.A02
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r2 = r4.A01
            X.0Ui r2 = (X.InterfaceC06180Ui) r2
            X.AbstractC09560e7.A00(r3)
        L93:
            java.util.List r3 = (java.util.List) r3
            r0 = 22
            X.GzS r1 = new X.GzS
            r1.<init>(r3, r0, r12)
            r0 = 0
            r4.A01 = r0
            r4.A02 = r0
            r4.A00 = r6
            java.lang.Object r0 = r2.emit(r1, r4)
            goto L57
        La8:
            X.AbstractC09560e7.A00(r3)
        Lab:
            X.0eB r5 = X.C0eB.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.stickersearch.api.AvatarStickerSearchRepository.A01(X.6dS, java.lang.String, X.1Ds):java.lang.Object");
    }
}
