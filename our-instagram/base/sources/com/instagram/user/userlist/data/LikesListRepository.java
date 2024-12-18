package com.instagram.user.userlist.data;

import X.InterfaceC19390xP;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.IgBaseRepository;

/* loaded from: classes9.dex */
public final class LikesListRepository extends IgBaseRepository {
    public final UserSession A00;
    public final InterfaceC19390xP A01;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, X.Psj] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ LikesListRepository(com.instagram.common.session.UserSession r8) {
        /*
            r7 = this;
            X.0Tz r3 = X.C06090Tz.A05
            r0 = 36319321491905711(0x81083b00021caf, double:3.03182338542573E-306)
            boolean r6 = X.C18U.A06(r3, r8, r0)
            r0 = 1
            X.C14360o3.A0B(r8, r0)
            r2 = 1948631496(0x7425c1c8, float:5.2530477E31)
            r5 = 0
            X.1Iw r1 = new X.1Iw
            r1.<init>(r5)
            X.12L r0 = X.C12L.A00
            X.0nZ r0 = X.AbstractC43592JPx.A0W(r0, r2)
            X.12W r0 = r1.plus(r0)
            X.19K r4 = X.AnonymousClass194.A02(r0)
            r0 = 36319321491774638(0x81083b00001cae, double:3.031823385342839E-306)
            boolean r0 = X.C18U.A06(r3, r8, r0)
            if (r0 == 0) goto L92
            r0 = 20
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            X.4DW r1 = new X.4DW
            r1.<init>(r0, r2)
        L3b:
            com.instagram.user.userlist.data.LikesListRemoteDataSource r0 = new com.instagram.user.userlist.data.LikesListRemoteDataSource
            r0.<init>()
            r7.<init>(r1, r0, r4)
            r7.A00 = r8
            X.Enk r4 = new X.Enk
            r4.<init>(r8, r5)
            java.lang.Integer r2 = X.C05F.A0C
            X.05A r1 = r7.A04
            r0 = 7
            X.PVJ r3 = new X.PVJ
            r3.<init>(r0, r2, r1, r4)
            if (r6 != 0) goto L7b
            r0 = 9
            X.MZP r2 = new X.MZP
            r2.<init>(r3, r0)
        L5d:
            r7.A01 = r2
            if (r6 != 0) goto L7a
            X.1My r0 = X.AbstractC25651Mw.A00(r8)
            X.625 r1 = new X.625
            r1.<init>(r0)
            java.lang.Class<X.3Cr> r0 = X.C70073Cr.class
            X.02x r1 = r1.A00(r0)
            r0 = 2
            X.0po r1 = X.C57167PZl.A02(r7, r1, r0)
            X.19L r0 = r7.A03
            X.AbstractC18560vj.A03(r0, r1)
        L7a:
            return
        L7b:
            X.1My r2 = X.AbstractC25651Mw.A00(r8)
            r1 = 38
            X.PZk r0 = new X.PZk
            r0.<init>(r3, r2, r5, r1)
            X.05N r1 = X.C0JE.A01(r0)
            r0 = 9
            X.MZP r2 = new X.MZP
            r2.<init>(r1, r0)
            goto L5d
        L92:
            r1 = r5
            goto L3b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRepository.<init>(com.instagram.common.session.UserSession):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A04(X.GFF r7, X.InterfaceC23621Ds r8) {
        /*
            r6 = this;
            r3 = 17
            boolean r0 = X.C57146PWy.A01(r8, r3)
            if (r0 == 0) goto L57
            r5 = r8
            X.PWy r5 = (X.C57146PWy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L57
            int r2 = r2 - r1
            r5.A00 = r2
        L16:
            java.lang.Object r0 = r5.A02
            X.1JX r4 = X.C1JX.A02
            int r2 = r5.A00
            r3 = 2
            r1 = 1
            if (r2 == 0) goto L32
            if (r2 == r1) goto L2a
            if (r2 != r3) goto L5d
            X.AbstractC09560e7.A00(r0)
        L27:
            X.0eB r4 = X.C0eB.A00
        L29:
            return r4
        L2a:
            java.lang.Object r2 = r5.A01
            com.instagram.repository.common.IgBaseRepository r2 = (com.instagram.repository.common.IgBaseRepository) r2
            X.AbstractC09560e7.A00(r0)
            goto L42
        L32:
            X.AbstractC09560e7.A00(r0)
            r5.A01 = r6
            r5.A00 = r1
            X.P9P r0 = X.P9P.A00
            java.lang.Object r0 = r6.A03(r7, r0, r5)
            if (r0 == r4) goto L29
            r2 = r6
        L42:
            if (r0 == 0) goto L27
            X.NSm r1 = new X.NSm
            r1.<init>(r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r3
            X.05A r0 = r2.A04
            java.lang.Object r0 = r0.emit(r1, r5)
            if (r0 != r4) goto L27
            return r4
        L57:
            X.PWy r5 = new X.PWy
            r5.<init>(r6, r8, r3)
            goto L16
        L5d:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.user.userlist.data.LikesListRepository.A04(X.GFF, X.1Ds):java.lang.Object");
    }
}
