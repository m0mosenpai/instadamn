package com.instagram.immersivecatchup.repository;

import X.AbstractC001800i;
import X.AbstractC25225BEi;
import X.C14360o3;
import X.C3NX;
import X.C47456Kxl;
import X.C47640L1z;
import X.C4A7;
import X.C4A8;
import com.instagram.common.session.UserSession;
import com.instagram.reels.store.ReelStore;
import java.util.List;

/* loaded from: classes8.dex */
public final class ImmersiveCatchUpRepository extends C4A7 {
    public final C47640L1z A00;
    public final UserSession A01;
    public final C47456Kxl A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ImmersiveCatchUpRepository(UserSession userSession, C47640L1z c47640L1z, C47456Kxl c47456Kxl) {
        super("ImmersiveCatchUpRepository", C4A8.A01(557672991, 3));
        C14360o3.A0B(userSession, 3);
        this.A00 = c47640L1z;
        this.A02 = c47456Kxl;
        this.A01 = userSession;
    }

    public final C3NX A00() {
        C47640L1z c47640L1z = this.A00;
        List list = c47640L1z.A02;
        if (list == null) {
            list = AbstractC001800i.A0d(ReelStore.A03(this.A02.A00).A0U(false), 5);
            C14360o3.A0B(list, 0);
            c47640L1z.A02 = list;
        }
        return AbstractC25225BEi.A0z(list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A01(X.O6Q r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.MAK.A01(r8, r3)
            if (r0 == 0) goto L66
            r5 = r8
            X.MAK r5 = (X.MAK) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L66
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L55
            if (r0 != r2) goto L8e
            java.lang.Object r1 = r5.A02
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r7 = r5.A01
            X.O6Q r7 = (X.O6Q) r7
            X.AbstractC09560e7.A00(r4)
        L2c:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L6c
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.5jj r0 = (X.InterfaceC124295jj) r0
            java.util.List r0 = r0.AoP()
            r1.addAll(r0)
            boolean r0 = X.AbstractC166987dD.A1b(r1)
            if (r0 == 0) goto L7a
            X.2od r0 = r7.A00
            X.Gg2 r0 = r0.A0C
            if (r0 != 0) goto L75
            java.lang.String r0 = "viewerAdapter"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L55:
            X.AbstractC09560e7.A00(r4)
            java.util.ArrayList r1 = X.AbstractC166987dD.A1E()
            X.AbstractC31172DnG.A1V(r7, r1, r5, r2)
            java.lang.Object r4 = r6.A03(r5)
            if (r4 != r3) goto L2c
            return r3
        L66:
            X.MAK r5 = new X.MAK
            r5.<init>(r6, r8, r3)
            goto L16
        L6c:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L7e
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L75:
            X.Gg8 r0 = r0.A0A
            r0.A0P(r2, r1)
        L7a:
            X.3NX r4 = X.AbstractC25227BEk.A0i()
        L7e:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L8b
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L8b
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L8b:
            X.0eB r3 = X.C0eB.A00
            return r3
        L8e:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A01(X.O6Q, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(X.InterfaceC23621Ds r19) {
        /*
            r18 = this;
            r3 = 42
            r5 = r19
            boolean r0 = X.MAH.A01(r5, r3)
            r4 = r18
            if (r0 == 0) goto L90
            r6 = r5
            X.MAH r6 = (X.MAH) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L90
            int r2 = r2 - r1
            r6.A00 = r2
        L1a:
            java.lang.Object r2 = r6.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r6.A00
            r1 = 1
            if (r0 == 0) goto L39
            if (r0 != r1) goto L9b
            java.lang.Object r0 = r6.A01
            com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository r0 = (com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository) r0
            X.AbstractC09560e7.A00(r2)
        L2c:
            X.QsC r2 = (X.C59990QsC) r2
            X.L1z r0 = r0.A00
            r0.A01 = r2
            if (r2 == 0) goto L96
            X.3NX r3 = X.AbstractC25225BEi.A0z(r2)
        L38:
            return r3
        L39:
            X.AbstractC09560e7.A00(r2)
            X.L1z r0 = r4.A00
            X.QsC r0 = r0.A01
            if (r0 == 0) goto L47
            X.3NX r3 = X.AbstractC25225BEi.A0z(r0)
            return r3
        L47:
            X.Kxl r5 = r4.A02
            r6.A01 = r4
            r6.A00 = r1
            X.3yw r2 = X.JQ0.A0r(r6)
            r0 = 21
            X.JeI r1 = new X.JeI
            r1.<init>(r2, r0)
            com.instagram.common.session.UserSession r5 = r5.A00
            r12 = 0
            r13 = 0
            X.2JM r6 = X.AbstractC25225BEi.A0b()
            X.2JM r0 = X.AbstractC25225BEi.A0b()
            X.1uJ r7 = X.AbstractC25225BEi.A0c()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.QsC> r11 = X.C59990QsC.class
            java.util.ArrayList r17 = X.AbstractC166987dD.A1E()
            java.lang.String r8 = "IGDCatchUpQuery"
            java.lang.String r16 = "igd_catch_up"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            X.1ud r0 = X.AbstractC40691uc.A01(r5)
            r0.A06(r6, r1)
            java.lang.Object r2 = r2.A00()
            if (r2 == r3) goto L38
            r0 = r4
            goto L2c
        L90:
            X.MAH r6 = new X.MAH
            r6.<init>(r4, r5, r3)
            goto L1a
        L96:
            X.8jk r3 = X.AbstractC25227BEk.A0h()
            return r3
        L9b:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A02(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r11) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.InterfaceC23621Ds r7) {
        /*
            r6 = this;
            r3 = 44
            boolean r0 = X.MAH.A01(r7, r3)
            if (r0 == 0) goto L63
            r5 = r7
            X.MAH r5 = (X.MAH) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L63
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r2 = X.C1JX.A02
            int r1 = r5.A00
            r0 = 1
            if (r1 == 0) goto L51
            if (r1 != r0) goto L84
            java.lang.Object r3 = r5.A01
            java.util.List r3 = (java.util.List) r3
            X.AbstractC09560e7.A00(r4)
        L28:
            X.3NY r4 = (X.C3NY) r4
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L69
            X.3NX r4 = (X.C3NX) r4
            java.lang.Object r0 = r4.A00
            X.5jj r0 = (X.InterfaceC124295jj) r0
            java.util.List r0 = r0.AoP()
            java.util.Iterator r2 = r0.iterator()
        L3c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L72
            java.lang.Object r1 = r2.next()
            X.5dq r1 = (X.C120985dq) r1
            X.JzY r0 = new X.JzY
            r0.<init>(r1)
            r3.add(r0)
            goto L3c
        L51:
            X.AbstractC09560e7.A00(r4)
            java.util.ArrayList r3 = X.AbstractC166987dD.A1E()
            r5.A01 = r3
            r5.A00 = r0
            java.lang.Object r4 = r6.A03(r5)
            if (r4 != r2) goto L28
            return r2
        L63:
            X.MAH r5 = new X.MAH
            r5.<init>(r6, r7, r3)
            goto L16
        L69:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L76
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L72:
            X.3NX r4 = X.AbstractC25227BEk.A0i()
        L76:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 != 0) goto L83
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 != 0) goto L83
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L83:
            return r3
        L84:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.immersivecatchup.repository.ImmersiveCatchUpRepository.A04(X.1Ds):java.lang.Object");
    }
}
