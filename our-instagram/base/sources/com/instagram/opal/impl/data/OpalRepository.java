package com.instagram.opal.impl.data;

import X.AbstractC166177bl;
import X.AbstractC166987dD;
import X.AbstractC167007dF;
import X.AbstractC167017dG;
import X.AbstractC25225BEi;
import X.AbstractC25651Mw;
import X.AbstractC62822tL;
import X.C05A;
import X.C06090Tz;
import X.C0eB;
import X.C14360o3;
import X.C18U;
import X.C1JX;
import X.C29152CtJ;
import X.C38688GzT;
import X.C40701ud;
import X.C4A7;
import X.C4A8;
import X.C51751Mta;
import X.C57452kK;
import X.C62832tM;
import X.C74;
import X.C92674Dc;
import X.C92694De;
import X.InterfaceC23621Ds;
import X.InterfaceC41501vz;
import X.PXO;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* loaded from: classes9.dex */
public final class OpalRepository extends C4A7 {
    public final InterfaceC41501vz A00;
    public final C92694De A01;
    public final C92694De A02;
    public final UserSession A03;
    public final C40701ud A04;
    public final C62832tM A05;
    public final String A06;
    public final List A07;
    public final C05A A08;
    public final Context A09;
    public final C92694De A0A;
    public final C92694De A0B;

    public final Object A04(String str, InterfaceC23621Ds interfaceC23621Ds, boolean z) {
        C0eB c0eB;
        Object A00;
        boolean A06 = C18U.A06(C06090Tz.A05, this.A03, 36321043774055513L);
        C92694De c92694De = this.A01;
        if (!A06) {
            PXO pxo = new PXO(this, str, null, 0, z);
            c0eB = C0eB.A00;
            A00 = c92694De.A00(c0eB, interfaceC23621Ds, pxo);
            if (A00 != C1JX.A02) {
                A00 = c0eB;
            }
        } else {
            PXO pxo2 = new PXO(this, str, null, 1, z);
            c0eB = C0eB.A00;
            A00 = c92694De.A00(c0eB, interfaceC23621Ds, pxo2);
        }
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }

    public final Object A06(String str, InterfaceC23621Ds interfaceC23621Ds, boolean z, boolean z2) {
        C92694De c92694De = this.A0A;
        OpalRepository$fetchOpalClipsData$2 opalRepository$fetchOpalClipsData$2 = new OpalRepository$fetchOpalClipsData$2(this, str, null, z2, z);
        C0eB c0eB = C0eB.A00;
        Object A00 = c92694De.A00(c0eB, interfaceC23621Ds, opalRepository$fetchOpalClipsData$2);
        if (A00 != C1JX.A02) {
            return c0eB;
        }
        return A00;
    }

    public static final void A00(C51751Mta c51751Mta, OpalRepository opalRepository) {
        Object value;
        C05A c05a = opalRepository.A08;
        do {
            value = c05a.getValue();
        } while (!c05a.AIi(value, C38688GzT.A00((C38688GzT) value, c51751Mta, null, null, null, 13)));
    }

    public static final void A01(OpalRepository opalRepository, C74 c74) {
        Object value;
        C38688GzT c38688GzT;
        List list;
        String str;
        boolean z;
        C05A c05a = opalRepository.A08;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
            C51751Mta c51751Mta = (C51751Mta) c38688GzT.A00;
            list = (List) c51751Mta.A00;
            str = c51751Mta.A02;
            z = c51751Mta.A03;
            AbstractC167017dG.A1N(list, c74);
        } while (!c05a.AIi(value, C38688GzT.A00(c38688GzT, null, new C51751Mta(c74, str, list, z), null, null, 11)));
    }

    public static final void A02(OpalRepository opalRepository, C74 c74) {
        Object value;
        C38688GzT c38688GzT;
        List list;
        String str;
        boolean z;
        C05A c05a = opalRepository.A08;
        do {
            value = c05a.getValue();
            c38688GzT = (C38688GzT) value;
            C51751Mta c51751Mta = (C51751Mta) c38688GzT.A01;
            list = (List) c51751Mta.A00;
            str = c51751Mta.A02;
            z = c51751Mta.A03;
            AbstractC167017dG.A1N(list, c74);
        } while (!c05a.AIi(value, C38688GzT.A00(c38688GzT, new C51751Mta(c74, str, list, z), null, null, null, 13)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0036, code lost:
    
        if (r6 == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        r1 = r3.getValue();
        r0 = X.C38688GzT.A00((X.C38688GzT) r1, null, null, null, r6, 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0047, code lost:
    
        if (r3.AIi(r1, r0) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        return X.C0eB.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        r2 = r3.getValue();
        r0 = X.C38688GzT.A00((X.C38688GzT) r2, null, null, null, com.instagram.opal.impl.data.OpalProfileData.A00(r8, X.C74.A03, null, null, null, null, null, null, 0, 7935, false, false), 14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r3.AIi(r2, r0) == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A03(com.instagram.opal.impl.data.OpalProfileData r21, X.InterfaceC23621Ds r22) {
        /*
            r20 = this;
            r8 = r21
            r3 = 13
            r6 = r22
            boolean r0 = X.PXA.A03(r6, r3)
            r5 = r20
            if (r0 == 0) goto Lb3
            r4 = r6
            X.PXA r4 = (X.PXA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto Lb3
            int r2 = r2 - r1
            r4.A00 = r2
        L1c:
            java.lang.Object r6 = r4.A03
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L72
            if (r0 != r2) goto Lb9
            java.lang.Object r8 = r4.A02
            com.instagram.opal.impl.data.OpalProfileData r8 = (com.instagram.opal.impl.data.OpalProfileData) r8
            java.lang.Object r0 = r4.A01
            com.instagram.opal.impl.data.OpalRepository r0 = (com.instagram.opal.impl.data.OpalRepository) r0
            X.AbstractC09560e7.A00(r6)
        L32:
            com.instagram.opal.impl.data.OpalProfileData r6 = (com.instagram.opal.impl.data.OpalProfileData) r6
            X.05A r3 = r0.A08
            if (r6 == 0) goto L4c
        L38:
            java.lang.Object r1 = r3.getValue()
            r0 = r1
            X.GzT r0 = (X.C38688GzT) r0
            X.GzT r0 = X.C38688GzT.A01(r0, r6)
            boolean r0 = r3.AIi(r1, r0)
            if (r0 == 0) goto L38
        L49:
            X.0eB r3 = X.C0eB.A00
        L4b:
            return r3
        L4c:
            java.lang.Object r2 = r3.getValue()
            r1 = r2
            X.GzT r1 = (X.C38688GzT) r1
            r16 = 0
            r10 = 0
            X.C74 r9 = X.C74.A03
            r17 = 7935(0x1eff, float:1.112E-41)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r16
            r19 = r16
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.GzT r0 = X.C38688GzT.A01(r1, r0)
            boolean r0 = r3.AIi(r2, r0)
            if (r0 == 0) goto L4c
            goto L49
        L72:
            X.AbstractC09560e7.A00(r6)
            X.05A r7 = r5.A08
        L77:
            java.lang.Object r6 = r7.getValue()
            r1 = r6
            X.GzT r1 = (X.C38688GzT) r1
            r16 = 0
            r10 = 0
            X.C74 r9 = X.C74.A06
            r17 = 7935(0x1eff, float:1.112E-41)
            r11 = r10
            r12 = r10
            r13 = r10
            r14 = r10
            r15 = r10
            r18 = r16
            r19 = r16
            com.instagram.opal.impl.data.OpalProfileData r0 = com.instagram.opal.impl.data.OpalProfileData.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.GzT r0 = X.C38688GzT.A01(r1, r0)
            boolean r0 = r7.AIi(r6, r0)
            if (r0 == 0) goto L77
            com.instagram.opal.impl.data.OpalRepoUtil r9 = com.instagram.opal.impl.data.OpalRepoUtil.A00
            android.content.Context r10 = r5.A09
            com.instagram.common.session.UserSession r1 = r5.A03
            X.1ud r0 = r5.A04
            X.PXA.A01(r5, r8, r4, r2)
            r13 = r8
            r11 = r1
            r12 = r0
            r14 = r4
            java.lang.Object r6 = r9.A01(r10, r11, r12, r13, r14)
            if (r6 == r3) goto L4b
            r0 = r5
            goto L32
        Lb3:
            X.PXA r4 = X.PXA.A00(r5, r6, r3)
            goto L1c
        Lb9:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepository.A03(com.instagram.opal.impl.data.OpalProfileData, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if (r1 != X.C74.A03) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A05(java.lang.String r12, X.InterfaceC23621Ds r13, boolean r14) {
        /*
            r11 = this;
            r3 = 24
            boolean r0 = X.C57145PWx.A02(r13, r3)
            r6 = r11
            if (r0 == 0) goto L5e
            r4 = r13
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.A00 = r2
        L17:
            java.lang.Object r1 = r4.A02
            X.1JX r3 = X.C1JX.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto L63
            java.lang.Object r9 = r4.A01
            X.0ps r9 = (X.C15370ps) r9
            X.AbstractC09560e7.A00(r1)
        L29:
            java.lang.Object r0 = r9.A00
            if (r0 == 0) goto L3e
            com.instagram.opal.impl.data.OpalProfileData r0 = (com.instagram.opal.impl.data.OpalProfileData) r0
            if (r0 == 0) goto L3c
            X.C74 r1 = r0.A01
        L33:
            X.C74 r0 = X.C74.A03
            if (r1 == r0) goto L3e
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L3c:
            r1 = 0
            goto L33
        L3e:
            r2 = 0
            goto L37
        L40:
            X.AbstractC09560e7.A00(r1)
            X.0ps r9 = X.AbstractC25225BEi.A1F()
            X.4De r1 = r11.A0B
            r8 = 0
            com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2 r5 = new com.instagram.opal.impl.data.OpalRepository$fetchOpalProfileData$2
            r7 = r12
            r10 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            r4.A01 = r9
            r4.A00 = r2
            X.0eB r0 = X.C0eB.A00
            java.lang.Object r0 = r1.A00(r0, r4, r5)
            if (r0 != r3) goto L29
            return r3
        L5e:
            X.PWx r4 = X.C57145PWx.A00(r11, r13, r3)
            goto L17
        L63:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.opal.impl.data.OpalRepository.A05(java.lang.String, X.1Ds, boolean):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpalRepository(Context context, UserSession userSession, C40701ud c40701ud, String str) {
        super("Opal", C4A8.A01(72627069, 3));
        AbstractC167017dG.A1P(str, userSession);
        AbstractC167007dF.A1F(context, 3, c40701ud);
        this.A06 = str;
        this.A03 = userSession;
        this.A09 = context;
        this.A04 = c40701ud;
        this.A08 = AbstractC25225BEi.A1H(new C38688GzT());
        C92674Dc c92674Dc = C92674Dc.A00;
        this.A01 = AbstractC166177bl.A00(c92674Dc);
        this.A0A = AbstractC166177bl.A00(c92674Dc);
        this.A0B = AbstractC166177bl.A00(c92674Dc);
        this.A02 = AbstractC166177bl.A00(c92674Dc);
        C62832tM A00 = AbstractC62822tL.A00(userSession);
        C14360o3.A07(A00);
        this.A05 = A00;
        this.A07 = AbstractC166987dD.A1E();
        C29152CtJ c29152CtJ = new C29152CtJ(this, 1);
        this.A00 = c29152CtJ;
        AbstractC25651Mw.A00(userSession).A01(c29152CtJ, C57452kK.class);
    }
}
