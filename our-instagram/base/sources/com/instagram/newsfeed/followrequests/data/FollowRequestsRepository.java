package com.instagram.newsfeed.followrequests.data;

import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25651Mw;
import X.AbstractC43593JPy;
import X.AbstractC54433O3n;
import X.AnonymousClass625;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C14360o3;
import X.C16930sl;
import X.C19L;
import X.C25671My;
import X.C34456FGu;
import X.C3MC;
import X.C42281xI;
import X.C4A7;
import X.C4A8;
import X.C51684MsF;
import X.C52627NQa;
import X.F9N;
import X.GSQ;
import X.InterfaceC58264Ps8;
import X.N2B;
import X.P6B;
import X.PZF;
import X.PZS;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class FollowRequestsRepository extends C4A7 {
    public final UserSession A00;
    public final InterfaceC58264Ps8 A01;
    public final SpamFollowRequestsNetworkDataSource A02;
    public final N2B A03;
    public final C34456FGu A04;
    public final C05A A05;
    public final C0UO A06;

    public final void A04(AbstractC54433O3n abstractC54433O3n) {
        A05(abstractC54433O3n, null, null, null, null, null, null);
    }

    public final void A05(AbstractC54433O3n abstractC54433O3n, Integer num, Integer num2, Integer num3, Integer num4, List list, List list2) {
        int i;
        int i2;
        int i3;
        int i4;
        AbstractC54433O3n abstractC54433O3n2 = abstractC54433O3n;
        List list3 = list2;
        List list4 = list;
        C05A c05a = this.A05;
        C51684MsF c51684MsF = (C51684MsF) c05a.getValue();
        if (list == null) {
            list4 = c51684MsF.A05;
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = c51684MsF.A01;
        }
        if (list2 == null) {
            list3 = c51684MsF.A06;
        }
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = c51684MsF.A00;
        }
        if (num3 != null) {
            i3 = num3.intValue();
        } else {
            i3 = c51684MsF.A03;
        }
        if (abstractC54433O3n == null) {
            abstractC54433O3n2 = c51684MsF.A04;
        }
        if (num4 != null) {
            i4 = num4.intValue();
        } else {
            i4 = c51684MsF.A02;
        }
        AbstractC167017dG.A1O(list4, list3);
        C14360o3.A0B(abstractC54433O3n2, 4);
        c05a.Egh(new C51684MsF(abstractC54433O3n2, list4, list3, i, i2, i3, i4));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(X.C51684MsF r7, com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r8, X.InterfaceC23621Ds r9) {
        /*
            r3 = 8
            boolean r0 = X.PXA.A03(r9, r3)
            if (r0 == 0) goto L8c
            r4 = r9
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r1 = r4.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r4.A00
            r3 = 1
            if (r0 == 0) goto L44
            if (r0 != r3) goto L91
            java.lang.Object r7 = r4.A02
            X.MsF r7 = (X.C51684MsF) r7
            java.lang.Object r8 = r4.A01
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r8 = (com.instagram.newsfeed.followrequests.data.FollowRequestsRepository) r8
            X.AbstractC09560e7.A00(r1)
        L2c:
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L38
            A01(r7, r8)
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L38:
            java.lang.Integer r1 = X.C05F.A01
            X.NQX r0 = new X.NQX
            r0.<init>(r1)
            r8.A04(r0)
            r3 = 0
            goto L33
        L44:
            X.AbstractC09560e7.A00(r1)
            java.util.List r0 = r7.A05
            java.util.ArrayList r6 = X.AbstractC166987dD.A1E()
            java.util.Iterator r2 = r0.iterator()
        L51:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L70
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            X.17P r0 = r0.A03
            com.instagram.user.model.FriendshipStatus r0 = r0.B8n()
            if (r0 == 0) goto L6c
            java.lang.Boolean r0 = r0.BHO()
            if (r0 != 0) goto L51
        L6c:
            r6.add(r1)
            goto L51
        L70:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L33
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1ON r1 = X.AbstractC151506rw.A03(r0, r6)
            r4.A01 = r8
            r4.A02 = r7
            r4.A00 = r3
            r0 = 1884899610(0x7059491a, float:2.6898649E29)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r5) goto L2c
            return r5
        L8c:
            X.PXA r4 = X.PXA.A00(r8, r9, r3)
            goto L16
        L91:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A00(X.MsF, com.instagram.newsfeed.followrequests.data.FollowRequestsRepository, X.1Ds):java.lang.Object");
    }

    public static final void A01(C51684MsF c51684MsF, FollowRequestsRepository followRequestsRepository) {
        List list = c51684MsF.A05;
        Integer valueOf = Integer.valueOf(c51684MsF.A01);
        List list2 = c51684MsF.A06;
        followRequestsRepository.A05(c51684MsF.A04, valueOf, Integer.valueOf(c51684MsF.A00), Integer.valueOf(c51684MsF.A03), Integer.valueOf(c51684MsF.A02), list, list2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A02(java.util.List r20, X.InterfaceC23621Ds r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A02(java.util.List, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(X.InterfaceC23621Ds r14) {
        /*
            r13 = this;
            r3 = 12
            boolean r0 = X.C57145PWx.A02(r14, r3)
            if (r0 == 0) goto L5a
            r5 = r14
            X.PWx r5 = (X.C57145PWx) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5a
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r4 = r5.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L3e
            if (r0 != r2) goto L73
            java.lang.Object r5 = r5.A01
            com.instagram.newsfeed.followrequests.data.FollowRequestsRepository r5 = (com.instagram.newsfeed.followrequests.data.FollowRequestsRepository) r5
            X.AbstractC09560e7.A00(r4)
        L28:
            boolean r0 = r4 instanceof X.C3NX
            if (r0 == 0) goto L5f
            java.lang.Integer r0 = X.C05F.A0C
            X.NQY r6 = new X.NQY
            r6.<init>(r0)
            X.0sl r11 = X.C16930sl.A00
            r7 = 0
            r8 = r7
            r9 = r7
            r10 = r7
            r12 = r7
            r5.A05(r6, r7, r8, r9, r10, r11, r12)
            return r4
        L3e:
            X.AbstractC09560e7.A00(r4)
            java.lang.Integer r1 = X.C05F.A0C
            X.NQZ r0 = new X.NQZ
            r0.<init>(r1)
            r13.A04(r0)
            X.Ps8 r0 = r13.A01
            r5.A01 = r13
            r5.A00 = r2
            java.lang.Object r4 = r0.AOb(r5)
            if (r4 != r3) goto L58
            return r3
        L58:
            r5 = r13
            goto L28
        L5a:
            X.PWx r5 = X.C57145PWx.A00(r13, r14, r3)
            goto L16
        L5f:
            boolean r0 = r4 instanceof X.C194848jk
            if (r0 == 0) goto L6e
            java.lang.Integer r1 = X.C05F.A0C
            X.NQX r0 = new X.NQX
            r0.<init>(r1)
            r5.A04(r0)
            return r4
        L6e:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        L73:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.followrequests.data.FollowRequestsRepository.A03(X.1Ds):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FollowRequestsRepository(UserSession userSession, N2B n2b, boolean z) {
        super("FollowRequests", C4A8.A01(1396732746, 1));
        InterfaceC58264Ps8 p6b;
        C34456FGu A00 = F9N.A00(userSession);
        AbstractC167007dF.A1K(userSession, n2b);
        if (z) {
            p6b = new SpamFollowRequestsNetworkDataSource(userSession, n2b);
        } else {
            p6b = new P6B(userSession, n2b);
        }
        InterfaceC58264Ps8 interfaceC58264Ps8 = p6b;
        AbstractC167017dG.A1S(A00, interfaceC58264Ps8);
        this.A00 = userSession;
        this.A03 = n2b;
        this.A04 = A00;
        this.A01 = interfaceC58264Ps8;
        this.A02 = new SpamFollowRequestsNetworkDataSource(userSession, n2b);
        C16930sl c16930sl = C16930sl.A00;
        C008002u A1H = AbstractC25225BEi.A1H(new C51684MsF(C52627NQa.A00, c16930sl, c16930sl, c16930sl.size(), -1, 0, 0));
        this.A05 = A1H;
        this.A06 = A1H;
        C19L c19l = super.A01;
        PZF.A02(this, c19l, 46);
        C25671My A002 = AbstractC25651Mw.A00(userSession);
        AbstractC43593JPy.A1X(new PZS(this, null, 49), c19l, new AnonymousClass625(A002).A00(C3MC.class));
        AbstractC43593JPy.A1X(new GSQ(this, null, 0), c19l, new AnonymousClass625(A002).A00(C42281xI.class));
    }
}
