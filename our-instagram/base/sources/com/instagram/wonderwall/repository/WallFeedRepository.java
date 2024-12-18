package com.instagram.wonderwall.repository;

import X.AbstractC09440dt;
import X.AbstractC166177bl;
import X.AbstractC166987dD;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25227BEk;
import X.AbstractC25651Mw;
import X.BJT;
import X.C008002u;
import X.C05A;
import X.C06090Tz;
import X.C0UO;
import X.C0eB;
import X.C10E;
import X.C115665Lc;
import X.C14360o3;
import X.C16930sl;
import X.C17s;
import X.C18U;
import X.C1JX;
import X.C25671My;
import X.C26041BfU;
import X.C50537MSq;
import X.C57529Pg3;
import X.C92674Dc;
import X.C92694De;
import X.EnumC09460dv;
import X.InterfaceC09390do;
import X.InterfaceC23621Ds;
import com.instagram.common.session.UserSession;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;
import com.instagram.wonderwall.model.WallPostItem;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public final class WallFeedRepository {
    public final C25671My A00;
    public final C92694De A01;
    public final C92694De A02;
    public final UserSession A03;
    public final WallApiGraphQLImpl A04;
    public final String A05;
    public final InterfaceC09390do A06;
    public final C05A A07;
    public final C05A A08;
    public final C05A A09;
    public final C0UO A0A;
    public final C0UO A0B;
    public final C0UO A0C;

    public final Object A01(InterfaceC23621Ds interfaceC23621Ds) {
        this.A01.A01();
        C92694De c92694De = this.A02;
        C50537MSq c50537MSq = new C50537MSq(this, null, 19);
        C0eB c0eB = C0eB.A00;
        Object A00 = c92694De.A00(c0eB, interfaceC23621Ds, c50537MSq);
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }

    public final void A03(WallPostItem wallPostItem) {
        Object value;
        ArrayList A0q;
        C14360o3.A0B(wallPostItem, 0);
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            List<WallPostItem> list = (List) value;
            A0q = AbstractC167017dG.A0q(list);
            for (WallPostItem wallPostItem2 : list) {
                if (C14360o3.A0K(wallPostItem2.Bez().A06, wallPostItem.Bez().A06)) {
                    wallPostItem2 = wallPostItem;
                }
                A0q.add(wallPostItem2);
            }
        } while (!c05a.AIi(value, A0q));
    }

    public final void A04(String str) {
        Object value;
        ArrayList A1E;
        C14360o3.A0B(str, 0);
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
            A1E = AbstractC166987dD.A1E();
            for (Object obj : (List) value) {
                if (!C14360o3.A0K(((WallPostItem) obj).Bez().A06, str)) {
                    A1E.add(obj);
                }
            }
        } while (!c05a.AIi(value, A1E));
    }

    public /* synthetic */ WallFeedRepository(UserSession userSession, String str) {
        WallApiGraphQLImpl wallApiGraphQLImpl = new WallApiGraphQLImpl(userSession);
        C25671My A00 = AbstractC25651Mw.A00(userSession);
        C14360o3.A0B(A00, 4);
        this.A05 = str;
        this.A03 = userSession;
        this.A04 = wallApiGraphQLImpl;
        this.A00 = A00;
        this.A06 = AbstractC09440dt.A00(EnumC09460dv.A04, new C57529Pg3(this, 39));
        C008002u A0z = AbstractC25227BEk.A0z();
        this.A09 = A0z;
        this.A0C = A0z;
        C008002u A1H = AbstractC25225BEi.A1H(new C26041BfU());
        this.A08 = A1H;
        this.A0B = A1H;
        C008002u A002 = C10E.A00(C16930sl.A00);
        this.A07 = A002;
        this.A0A = A002;
        C92674Dc c92674Dc = C92674Dc.A00;
        this.A02 = AbstractC166177bl.A00(c92674Dc);
        this.A01 = AbstractC166177bl.A00(c92674Dc);
        C17s.A07(new C115665Lc(1L, 60L), C18U.A01(C06090Tz.A05, userSession, 36603772881474529L));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.wonderwall.repository.WallFeedRepository r9, java.lang.String r10, X.InterfaceC23621Ds r11, boolean r12, boolean r13) {
        /*
            r4 = 14
            boolean r0 = X.PX0.A01(r11, r4)
            if (r0 == 0) goto Ldc
            r6 = r11
            X.PX0 r6 = (X.PX0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Ldc
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r7 = X.C1JX.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto Laf
            if (r0 != r5) goto Le8
            boolean r12 = r6.A05
            java.lang.Object r10 = r6.A02
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r6.A01
            com.instagram.wonderwall.repository.WallFeedRepository r9 = (com.instagram.wonderwall.repository.WallFeedRepository) r9
            X.AbstractC09560e7.A00(r1)
        L2e:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto La3
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r0 = r1.A00
            X.CQo r0 = (X.C27877CQo) r0
            java.util.List r7 = r0.A01
            X.05A r1 = r9.A09
            com.instagram.wonderwall.model.WallInfo r0 = r0.A00
            r1.Egh(r0)
            java.lang.String r1 = r9.A05
            com.instagram.common.session.UserSession r0 = r9.A03
            java.lang.String r0 = r0.userId
            boolean r0 = X.C14360o3.A0K(r1, r0)
            if (r0 == 0) goto L7a
            X.0do r6 = r9.A06
            X.1Ai r5 = X.AbstractC25226BEj.A10(r6)
            r3 = 0
            X.0ry r2 = r5.A8T
            X.0YR[] r8 = X.C23031Ai.A8c
            r0 = 490(0x1ea, float:6.87E-43)
            r1 = r8[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            r2.Egi(r5, r0, r1)
            X.1Ai r3 = X.AbstractC25226BEj.A10(r6)
            long r5 = java.lang.System.currentTimeMillis()
            X.0ry r2 = r3.A8U
            r0 = 489(0x1e9, float:6.85E-43)
            r1 = r8[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r2.Egi(r3, r0, r1)
        L7a:
            X.05A r1 = r9.A07
            if (r12 != 0) goto L88
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r7 = X.AbstractC001800i.A0S(r7, r0)
        L88:
            r1.Egh(r7)
            X.DHI r3 = new X.DHI
            r3.<init>(r10, r4)
        L90:
            X.05A r2 = r9.A08
        L92:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L92
            X.0eB r7 = X.C0eB.A00
            return r7
        La3:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Le3
            r0 = 48
            X.Pji r3 = new X.Pji
            r3.<init>(r1, r0)
            goto L90
        Laf:
            X.AbstractC09560e7.A00(r1)
            r0 = 25
            X.BIf r3 = new X.BIf
            r3.<init>(r13, r0)
            X.05A r2 = r9.A08
        Lbb:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto Lbb
            com.instagram.wonderwall.api.WallApiGraphQLImpl r1 = r9.A04
            java.lang.String r0 = r9.A05
            r6.A01 = r9
            r6.A02 = r10
            r6.A05 = r12
            r6.A00 = r5
            java.lang.Object r1 = r1.A05(r0, r6)
            if (r1 != r7) goto L2e
            return r7
        Ldc:
            X.PX0 r6 = new X.PX0
            r6.<init>(r9, r11, r4)
            goto L16
        Le3:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Le8:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.WallFeedRepository.A00(com.instagram.wonderwall.repository.WallFeedRepository, java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    public final void A02() {
        Object value;
        C05A c05a = this.A07;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, BJT.A00((Iterable) value, 12)));
    }
}
