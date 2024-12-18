package com.instagram.video.live.mvvm.model.domainmodel;

/* loaded from: classes9.dex */
public abstract class IgLiveSponsorKt {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.1JX] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r10, java.util.List r11, X.InterfaceC23621Ds r12) {
        /*
            r0 = 18
            boolean r0 = X.PX7.A02(r12, r0)
            if (r0 == 0) goto La5
            r7 = r12
            X.PX7 r7 = (X.PX7) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La5
            int r2 = r2 - r1
            r7.A00 = r2
        L16:
            java.lang.Object r1 = r7.A07
            X.1JX r5 = X.C1JX.A02
            int r0 = r7.A00
            r8 = 1
            if (r0 == 0) goto L9d
            if (r0 != r8) goto Lac
            java.lang.Object r6 = r7.A03
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r10 = r7.A02
            com.instagram.common.session.UserSession r10 = (com.instagram.common.session.UserSession) r10
            java.lang.Object r11 = r7.A01
            java.util.List r11 = (java.util.List) r11
            X.AbstractC09560e7.A00(r1)
        L30:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L4d
            com.instagram.pendingmedia.model.BrandedContentTag r9 = X.MSW.A0n(r6)
            com.instagram.user.model.User r0 = r9.A00
            if (r0 != 0) goto L30
            X.18A r1 = X.AnonymousClass189.A00(r10)
            java.lang.String r0 = r9.A01
            com.instagram.user.model.User r0 = r1.A02(r0)
            if (r0 == 0) goto L7a
            r9.A00 = r0
            goto L30
        L4d:
            java.util.ArrayList r5 = X.AbstractC167017dG.A0q(r11)
            java.util.Iterator r4 = r11.iterator()
        L55:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9c
            com.instagram.pendingmedia.model.BrandedContentTag r0 = X.MSW.A0n(r4)
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
            com.instagram.user.model.User r1 = r0.A00
            if (r1 != 0) goto L71
            X.18A r1 = X.AnonymousClass189.A00(r10)
            java.lang.String r0 = r0.A01
            com.instagram.user.model.User r1 = r1.A02(r0)
        L71:
            X.OB9 r0 = new X.OB9
            r0.<init>(r1, r3, r2)
            r5.add(r0)
            goto L55
        L7a:
            java.lang.String r4 = r9.A01
            if (r4 == 0) goto L30
            X.PX7.A00(r11, r10, r6, r9, r7)
            r7.A05 = r4
            r7.A06 = r7
            r7.A00 = r8
            X.3yw r3 = X.JQ0.A0r(r7)
            X.4LM r2 = X.C4LM.A02
            r1 = 4
            X.GIL r0 = new X.GIL
            r0.<init>(r1, r9, r3)
            r2.A02(r10, r0, r4)
            java.lang.Object r0 = r3.A00()
            if (r0 != r5) goto L30
        L9c:
            return r5
        L9d:
            X.AbstractC09560e7.A00(r1)
            java.util.Iterator r6 = r11.iterator()
            goto L30
        La5:
            X.PX7 r7 = new X.PX7
            r7.<init>(r12)
            goto L16
        Lac:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.model.domainmodel.IgLiveSponsorKt.A00(com.instagram.common.session.UserSession, java.util.List, X.1Ds):java.lang.Object");
    }
}
