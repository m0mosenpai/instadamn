package X;

import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.31n, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C672231n extends AbstractC672331o {
    public int A00;
    public int A01;
    public C9B3 A02;
    public boolean A03;
    public int A04;
    public final UserSession A05;
    public final C672531q A06;
    public final C65192xH A07;
    public final InterfaceC62242sP A08;
    public final InterfaceC671231d A09;
    public final C31H A0A;
    public final C672131m A0B;
    public final boolean A0C;
    public final InterfaceC61352qx A0D;
    public final C26281Pj A0E;
    public final C1PC A0F;
    public final InterfaceC670931a A0G;
    public final C1PY A0H;
    public final boolean A0I;
    public final boolean A0J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0073, code lost:
    
        if (X.C18U.A06(r2, r10, 36319347261578433L) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C672231n(com.instagram.common.session.UserSession r10, X.InterfaceC61352qx r11, X.C65192xH r12, X.C1PC r13, X.InterfaceC670931a r14, X.InterfaceC62242sP r15, X.InterfaceC671231d r16, X.C31H r17, X.C1PY r18, X.InterfaceC672031l r19, X.C672131m r20) {
        /*
            r9 = this;
            r8 = 1
            r0 = 11
            X.C14360o3.A0B(r15, r0)
            r0 = 12
            X.C14360o3.A0B(r13, r0)
            r3 = r9
            r4 = r14
            r5 = r16
            r6 = r18
            r7 = r19
            r3.<init>(r4, r5, r6, r7, r8)
            r9.A0H = r6
            r9.A09 = r5
            r9.A0G = r14
            r0 = r20
            r9.A0B = r0
            r9.A07 = r12
            r9.A0D = r11
            r9.A05 = r10
            r0 = r17
            r9.A0A = r0
            r9.A08 = r15
            r9.A0F = r13
            X.9B3 r0 = new X.9B3
            r0.<init>(r8)
            r9.A02 = r0
            X.0Tz r2 = X.C06090Tz.A05
            r0 = 36314983575260095(0x81044900070bbf, double:3.029080069471654E-306)
            boolean r0 = X.C18U.A06(r2, r10, r0)
            r9.A0C = r0
            X.31q r0 = new X.31q
            r0.<init>(r12)
            r9.A06 = r0
            r0 = 36314983575325632(0x81044900080bc0, double:3.0290800695131E-306)
            boolean r0 = X.C18U.A06(r2, r10, r0)
            r9.A0J = r0
            X.1Pi r0 = X.C26271Pi.A02
            X.1Pj r0 = r0.A00(r13)
            r9.A0E = r0
            X.0Tz r2 = X.C06090Tz.A06
            r0 = 36318797505763820(0x8107c1000019ec, double:3.031492014479675E-306)
            boolean r0 = X.C18U.A06(r2, r10, r0)
            if (r0 != 0) goto L75
            r0 = 36319347261578433(0x81084100001cc1, double:3.0318396822705253E-306)
            boolean r1 = X.C18U.A06(r2, r10, r0)
            r0 = 0
            if (r1 == 0) goto L76
        L75:
            r0 = 1
        L76:
            r9.A0I = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672231n.<init>(com.instagram.common.session.UserSession, X.2qx, X.2xH, X.1PC, X.31a, X.2sP, X.31d, X.31H, X.1PY, X.31l, X.31m):void");
    }

    @Override // X.AbstractC672431p
    public final int A05(List list) {
        C14360o3.A0B(list, 0);
        if (this.A0J) {
            C672531q c672531q = this.A06;
            int i = this.A00;
            InterfaceC671231d interfaceC671231d = this.A09;
            return c672531q.A03(this.A05, this.A08, interfaceC671231d, i);
        }
        return super.A05(list);
    }

    @Override // X.AbstractC672431p
    public final int A06(List list) {
        C14360o3.A0B(list, 0);
        if (this.A0J) {
            int i = this.A00;
            return C672531q.A00(this.A08, this.A09, i);
        }
        return super.A06(list);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        if (r2 < r4) goto L24;
     */
    @Override // X.AbstractC672431p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1PZ A07(X.C59062n7 r6, X.InterfaceC57162jr r7) {
        /*
            r5 = this;
            r4 = 0
            X.C14360o3.A0B(r6, r4)
            int r0 = r5.A01
            int r0 = r0 + 1
            r5.A01 = r0
            X.3m1 r0 = r5.A0N(r6, r7)
            r0.A03(r6, r7)
            java.lang.Object r3 = r6.A04
            r2 = r3
            java.lang.Number r2 = (java.lang.Number) r2
            int r1 = r2.intValue()
            int r0 = r5.A00
            if (r1 <= r0) goto L2f
            int r1 = r2.intValue()
            r5.A00 = r1
            X.31i r0 = r5.A05
            X.3Z9 r0 = r0.BuQ()
            r0.A02(r1)
            r5.A03 = r4
        L2f:
            X.C14360o3.A06(r3)
            int r4 = r2.intValue()
            X.2xH r0 = r5.A07
            java.util.List r0 = r0.A08()
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L41:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L57
            java.lang.Object r0 = r3.next()
            X.3XG r0 = (X.C3XG) r0
            X.1XV r1 = r0.A06
            X.1XV r0 = X.C1XV.A0F
            if (r1 != r0) goto L76
            if (r2 < 0) goto L57
            if (r2 < r4) goto L79
        L57:
            boolean r0 = r5.A03
            if (r0 != 0) goto L79
            X.2sP r1 = r5.A04
            if (r1 == 0) goto L67
            java.lang.Object r0 = r6.A03
            java.lang.String r1 = r1.BK4(r0)
            if (r1 != 0) goto L69
        L67:
            java.lang.String r1 = ""
        L69:
            X.31m r0 = r5.A0B
            boolean r0 = r0.A00(r1)
            if (r0 != 0) goto L82
            X.1PZ r0 = r5.A0M(r6, r7)
            return r0
        L76:
            int r2 = r2 + 1
            goto L41
        L79:
            X.9B3 r1 = r5.A02
            int r0 = r1.A04
            int r0 = r0 + 1
            r1.A04 = r0
            goto L8a
        L82:
            X.9B3 r1 = r5.A02
            int r0 = r1.A01
            int r0 = r0 + 1
            r1.A01 = r0
        L8a:
            X.1PZ r0 = X.C1PZ.A0K
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672231n.A07(X.2n7, X.2jr):X.1PZ");
    }

    @Override // X.AbstractC672431p
    public final void A0C() {
        this.A00 = 0;
        super.A05.BuQ().A02(0);
        C3Z9 BuQ = super.A05.BuQ();
        BuQ.A01.clear();
        W5F w5f = BuQ.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0132, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A06, r6, 36312866155922778L) != false) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    @Override // X.AbstractC672431p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0G(X.C1PZ r8, int r9, int r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672231n.A0G(X.1PZ, int, int, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r1 == null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d3, code lost:
    
        if (r20.A0E.A02(r1, r15, r0) != false) goto L38;
     */
    @Override // X.AbstractC672331o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1PZ A0M(X.C59062n7 r21, X.InterfaceC57162jr r22) {
        /*
            Method dump skipped, instructions count: 563
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672231n.A0M(X.2n7, X.2jr):X.1PZ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r1.contains(r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r1 != true) goto L8;
     */
    @Override // X.AbstractC672331o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ boolean A0P(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r5 == 0) goto L3f
            X.2sP r0 = r4.A04
            if (r0 == 0) goto Le
            boolean r1 = r0.CdX(r5)
            r0 = 1
            if (r1 == r3) goto Lf
        Le:
            r0 = 0
        Lf:
            r2 = 0
            if (r0 == 0) goto L22
            java.util.List r1 = r4.A09
            X.2sP r0 = r4.A04
            if (r0 == 0) goto L3d
            java.lang.String r0 = r0.BF8(r5)
        L1c:
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L3c
        L22:
            X.2sP r0 = r4.A04
            if (r0 == 0) goto L3f
            boolean r0 = r0.CZK(r5)
            if (r0 != r3) goto L3f
            java.util.List r1 = r4.A0A
            X.2sP r0 = r4.A04
            if (r0 == 0) goto L36
            java.lang.String r2 = r0.BF8(r5)
        L36:
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L3f
        L3c:
            return r3
        L3d:
            r0 = r2
            goto L1c
        L3f:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C672231n.A0P(java.lang.Object):boolean");
    }

    @Override // X.AbstractC672331o
    public final boolean A0Q(String str) {
        C14360o3.A0B(str, 0);
        return this.A0B.A00(str);
    }

    public final int A0R(C671831j c671831j, int i, int i2, int i3) {
        String BjF;
        Integer A0j;
        C14360o3.A0B(c671831j, 0);
        InterfaceC39571se interfaceC39571se = c671831j.A01;
        if (interfaceC39571se != null && (BjF = interfaceC39571se.BjF()) != null && (A0j = AbstractC003100w.A0j(BjF, 10)) != null) {
            int i4 = new int[]{i, i2}[0];
            if (i2 > i4) {
                i4 = i2;
            }
            int i5 = new int[]{i4 + A0j.intValue() + 1, i3}[0];
            if (i3 < i5) {
                i5 = i3;
            }
            return i5 + this.A04;
        }
        return i3;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return ((Number) obj).intValue();
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return this.A09.BUP(((Number) obj).intValue());
    }

    @Override // X.AbstractC672431p
    public final void A0B() {
        if (!C18U.A06(C06090Tz.A05, this.A05, 36314983575063484L)) {
            super.A06 = false;
        }
    }

    public final C82373m0 A0S() {
        List A07 = this.A07.A07();
        int size = A07.size();
        int i = this.A00;
        if (size <= i) {
            return null;
        }
        ListIterator listIterator = A07.listIterator(i);
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            C3XG c3xg = (C3XG) listIterator.next();
            if (C3YW.A00(c3xg) || C3YW.A03(c3xg)) {
                return (C82373m0) this.A09.BUP(nextIndex);
            }
        }
        return null;
    }

    @Override // X.AbstractC672331o
    public final boolean A0O(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (interfaceC57162jr.CGk(c59062n7) >= 0.5d) {
            int A02 = this.A07.A02(-1);
            Number number = (Number) c59062n7.A04;
            if (number != null && A02 == number.intValue() && !C3YW.A01((C3XG) c59062n7.A03)) {
                return true;
            }
        }
        return false;
    }
}
