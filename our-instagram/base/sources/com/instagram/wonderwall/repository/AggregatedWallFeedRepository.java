package com.instagram.wonderwall.repository;

import X.AbstractC166177bl;
import X.AbstractC25225BEi;
import X.C008002u;
import X.C05A;
import X.C0UO;
import X.C10E;
import X.C16930sl;
import X.C26041BfU;
import X.C92674Dc;
import X.C92694De;
import com.instagram.wonderwall.api.WallApiGraphQLImpl;

/* loaded from: classes5.dex */
public final class AggregatedWallFeedRepository {
    public String A00;
    public boolean A01;
    public final C92694De A02;
    public final C92694De A03;
    public final C05A A04;
    public final C05A A05;
    public final C0UO A06;
    public final C0UO A07;
    public final WallApiGraphQLImpl A08;

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.wonderwall.repository.AggregatedWallFeedRepository r7, java.lang.String r8, X.InterfaceC23621Ds r9, boolean r10, boolean r11) {
        /*
            r3 = 13
            boolean r0 = X.PX0.A01(r9, r3)
            if (r0 == 0) goto La9
            r6 = r9
            X.PX0 r6 = (X.PX0) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto La9
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A03
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L7e
            if (r0 != r4) goto Lb5
            boolean r10 = r6.A05
            java.lang.Object r8 = r6.A02
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r6.A01
            com.instagram.wonderwall.repository.AggregatedWallFeedRepository r7 = (com.instagram.wonderwall.repository.AggregatedWallFeedRepository) r7
            X.AbstractC09560e7.A00(r1)
        L2e:
            X.3NY r1 = (X.C3NY) r1
            boolean r0 = r1 instanceof X.C3NX
            if (r0 == 0) goto L72
            X.3NX r1 = (X.C3NX) r1
            java.lang.Object r3 = r1.A00
            X.CRl r3 = (X.C27900CRl) r3
            java.util.List r2 = r3.A01
            X.05A r1 = r7.A04
            if (r10 == 0) goto L64
            r1.Egh(r2)
        L43:
            boolean r0 = r3.A02
            r7.A01 = r0
            java.lang.String r0 = r3.A00
            r7.A00 = r0
            r0 = 3
            X.MHz r3 = new X.MHz
            r3.<init>(r8, r2, r0)
        L51:
            X.05A r2 = r7.A05
        L53:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L53
            X.0eB r5 = X.C0eB.A00
            return r5
        L64:
            java.lang.Object r0 = r1.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.ArrayList r0 = X.AbstractC001800i.A0S(r2, r0)
            r1.Egh(r0)
            goto L43
        L72:
            boolean r0 = r1 instanceof X.C194848jk
            if (r0 == 0) goto Lb0
            r0 = 47
            X.Pji r3 = new X.Pji
            r3.<init>(r1, r0)
            goto L51
        L7e:
            X.AbstractC09560e7.A00(r1)
            r0 = 24
            X.BIf r3 = new X.BIf
            r3.<init>(r11, r0)
            X.05A r2 = r7.A05
        L8a:
            java.lang.Object r1 = r2.getValue()
            java.lang.Object r0 = r3.invoke(r1)
            boolean r0 = r2.AIi(r1, r0)
            if (r0 == 0) goto L8a
            com.instagram.wonderwall.api.WallApiGraphQLImpl r0 = r7.A08
            r6.A01 = r7
            r6.A02 = r8
            r6.A05 = r10
            r6.A00 = r4
            java.lang.Object r1 = r0.A04(r8, r6)
            if (r1 != r5) goto L2e
            return r5
        La9:
            X.PX0 r6 = new X.PX0
            r6.<init>(r7, r9, r3)
            goto L16
        Lb0:
            X.B4Z r0 = X.B4Z.A00()
            throw r0
        Lb5:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.wonderwall.repository.AggregatedWallFeedRepository.A00(com.instagram.wonderwall.repository.AggregatedWallFeedRepository, java.lang.String, X.1Ds, boolean, boolean):java.lang.Object");
    }

    public AggregatedWallFeedRepository(WallApiGraphQLImpl wallApiGraphQLImpl) {
        this.A08 = wallApiGraphQLImpl;
        C008002u A1H = AbstractC25225BEi.A1H(new C26041BfU());
        this.A05 = A1H;
        this.A07 = A1H;
        C008002u A00 = C10E.A00(C16930sl.A00);
        this.A04 = A00;
        this.A06 = A00;
        C92674Dc c92674Dc = C92674Dc.A00;
        this.A03 = AbstractC166177bl.A00(c92674Dc);
        this.A02 = AbstractC166177bl.A00(c92674Dc);
    }
}
