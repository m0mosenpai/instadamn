package com.instagram.music.search.query.viewmodel;

import X.AbstractC166997dE;
import X.AbstractC25233BEq;
import X.AbstractC52922bZ;
import X.C06090Tz;
import X.C14360o3;
import X.C18U;
import X.C2GS;
import X.C2GT;
import X.C38071Gp0;
import X.C51572MqQ;
import X.C52678NSa;
import X.C54428O3i;
import X.C54429O3j;
import X.C54431O3l;
import X.C54693ODt;
import X.C54814OKp;
import X.C55562Olw;
import X.C57745PjY;
import X.C58252li;
import X.InterfaceC58056Poh;
import X.MSW;
import X.MSZ;
import X.MUG;
import X.O8H;
import X.ODE;
import X.OIV;
import X.OKv;
import X.P69;
import com.instagram.common.session.UserSession;

/* loaded from: classes9.dex */
public final class MusicSearchQueryViewModel extends AbstractC52922bZ {
    public boolean A00;
    public C2GT A01;
    public final C2GT A02;
    public final C2GT A03;
    public final C2GT A04;
    public final C2GT A05;
    public final C2GT A06;
    public final C58252li A07;
    public final C58252li A08;
    public final C58252li A09;
    public final C2GS A0A;
    public final C2GS A0B;
    public final C2GS A0C;
    public final C54428O3i A0D;
    public final C54429O3j A0E;
    public final C54814OKp A0F;
    public final C54693ODt A0G;
    public final OIV A0H;
    public final ODE A0I;
    public final C52678NSa A0J;
    public final boolean A0K;
    public final UserSession A0L;
    public final InterfaceC58056Poh A0M;

    public MusicSearchQueryViewModel(UserSession userSession, C54428O3i c54428O3i, C54429O3j c54429O3j, C54814OKp c54814OKp, C54693ODt c54693ODt, OIV oiv, ODE ode, C52678NSa c52678NSa, boolean z) {
        C14360o3.A0B(userSession, 1);
        AbstractC25233BEq.A0y(5, c52678NSa, c54428O3i, c54429O3j);
        this.A0L = userSession;
        this.A0G = c54693ODt;
        this.A0H = oiv;
        this.A0I = ode;
        this.A0J = c52678NSa;
        this.A0F = c54814OKp;
        this.A0K = z;
        this.A0D = c54428O3i;
        this.A0E = c54429O3j;
        P69 p69 = new P69(this);
        this.A0M = p69;
        C58252li c58252li = new C58252li();
        this.A07 = c58252li;
        C58252li c58252li2 = new C58252li();
        this.A09 = c58252li2;
        C58252li c58252li3 = new C58252li();
        this.A08 = c58252li3;
        C2GS A0E = MSW.A0E();
        this.A0C = A0E;
        C2GS A0E2 = MSW.A0E();
        this.A0B = A0E2;
        C2GS A0E3 = MSW.A0E();
        this.A0A = A0E3;
        this.A04 = c58252li;
        this.A06 = c58252li2;
        this.A05 = c58252li3;
        this.A01 = A0E;
        this.A03 = A0E2;
        this.A02 = A0E3;
        c54814OKp.A00 = p69;
        c58252li2.A0B(new O8H(0, null));
        C55562Olw.A00(c54693ODt.A00, c58252li, C57745PjY.A00(this, 46), 62);
        C55562Olw.A00(oiv.A00, c58252li2, C57745PjY.A00(this, 47), 62);
        C55562Olw.A00(ode.A00, c58252li3, C57745PjY.A00(this, 48), 62);
        if (z) {
            c54814OKp.A01(new OKv("", 0, false, false, false));
        }
        c52678NSa.A00 = new C54431O3l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A00(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r7, X.InterfaceC23621Ds r8) {
        /*
            r3 = 10
            boolean r0 = X.C57145PWx.A02(r8, r3)
            if (r0 == 0) goto L5d
            r6 = r8
            X.PWx r6 = (X.C57145PWx) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5d
            int r2 = r2 - r1
            r6.A00 = r2
        L16:
            java.lang.Object r1 = r6.A02
            X.1JX r5 = X.C1JX.A02
            int r0 = r6.A00
            r4 = 2
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L45
            if (r0 != r4) goto L62
            X.AbstractC09560e7.A00(r1)
        L28:
            X.0eB r5 = X.C0eB.A00
            return r5
        L2b:
            X.AbstractC09560e7.A00(r1)
            X.NSa r0 = r7.A0J
            r6.A01 = r7
            r6.A00 = r2
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1ON r2 = X.OQ0.A00(r0, r3, r3)
            r1 = 1237494160(0x49c2a990, float:1594674.0)
            r0 = 3
            X.02x r1 = r2.A04(r1, r0)
            if (r1 != r5) goto L4a
            return r5
        L45:
            java.lang.Object r7 = r6.A01
            X.AbstractC09560e7.A00(r1)
        L4a:
            X.0xP r1 = (X.InterfaceC19390xP) r1
            r0 = 50
            X.MV6 r0 = X.MV6.A00(r7, r0)
            r6.A01 = r3
            r6.A00 = r4
            java.lang.Object r0 = r1.collect(r0, r6)
            if (r0 != r5) goto L28
            return r5
        L5d:
            X.PWx r6 = X.C57145PWx.A00(r7, r8, r3)
            goto L16
        L62:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel.A00(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A01(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r5, X.InterfaceC23621Ds r6) {
        /*
            r3 = 11
            boolean r0 = X.C57145PWx.A02(r6, r3)
            if (r0 == 0) goto L40
            r4 = r6
            X.PWx r4 = (X.C57145PWx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L40
            int r2 = r2 - r1
            r4.A00 = r2
        L16:
            java.lang.Object r3 = r4.A02
            X.1JX r2 = X.C1JX.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L2e
            if (r0 != r1) goto L45
            java.lang.Object r5 = r4.A01
            com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel r5 = (com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel) r5
            X.AbstractC09560e7.A00(r3)
        L28:
            r0 = 0
            r5.A00 = r0
        L2b:
            X.0eB r2 = X.C0eB.A00
            return r2
        L2e:
            X.AbstractC09560e7.A00(r3)
            boolean r0 = r5.A00
            if (r0 == 0) goto L2b
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r0 = A00(r5, r4)
            if (r0 != r2) goto L28
            return r2
        L40:
            X.PWx r4 = X.C57145PWx.A00(r5, r6, r3)
            goto L16
        L45:
            java.lang.IllegalStateException r0 = X.AbstractC166987dD.A13()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel.A01(com.instagram.music.search.query.viewmodel.MusicSearchQueryViewModel, X.1Ds):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [X.MqQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [X.MqQ, java.lang.Object] */
    public final void A02() {
        OIV oiv;
        C51572MqQ c51572MqQ;
        O8H o8h = (O8H) this.A09.A02();
        if (o8h != null) {
            Object obj = o8h.A01;
            if (obj != null) {
                MUG mug = (MUG) obj;
                OKv oKv = (OKv) mug.A03;
                C38071Gp0 c38071Gp0 = (C38071Gp0) mug.A00;
                if (c38071Gp0 == null) {
                    if (C18U.A06(C06090Tz.A05, this.A0L, 36329534924341641L)) {
                        oiv = this.A0H;
                        Object obj2 = this.A0F.A01.A01;
                        C14360o3.A0A(obj2);
                        OKv oKv2 = (OKv) obj2;
                        String str = oKv2.A01;
                        boolean z = oKv2.A03;
                        int i = oKv2.A00;
                        boolean z2 = oKv2.A02;
                        boolean z3 = oKv2.A04;
                        C14360o3.A0B(str, 1);
                        ?? obj3 = new Object();
                        obj3.A01 = str;
                        obj3.A03 = z;
                        obj3.A00 = i;
                        obj3.A02 = z2;
                        obj3.A04 = z3;
                        obj3.A04 = true;
                        c51572MqQ = obj3;
                    } else {
                        return;
                    }
                } else {
                    if (!c38071Gp0.A00()) {
                        return;
                    }
                    oiv = this.A0H;
                    String str2 = oKv.A01;
                    boolean z4 = oKv.A03;
                    int i2 = oKv.A00;
                    boolean z5 = oKv.A02;
                    boolean z6 = oKv.A04;
                    C14360o3.A0B(str2, 1);
                    ?? obj4 = new Object();
                    obj4.A01 = str2;
                    obj4.A03 = z4;
                    obj4.A00 = i2;
                    obj4.A02 = z5;
                    obj4.A04 = z6;
                    obj4.A03 = false;
                    obj4.A02 = false;
                    c51572MqQ = obj4;
                }
                oiv.A00(new OKv(c51572MqQ.A01, c51572MqQ.A00, c51572MqQ.A03, c51572MqQ.A02, c51572MqQ.A04), MSZ.A0V(this.A0E.A00.A0A).A07);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }
}
