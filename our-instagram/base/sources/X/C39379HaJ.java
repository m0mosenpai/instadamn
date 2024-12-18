package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.HaJ, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39379HaJ extends AbstractC672331o {
    public int A00;
    public int A01;
    public final InterfaceC671231d A02;
    public final C672131m A03;
    public final UserSession A04;
    public final InterfaceC61352qx A05;
    public final C672531q A06;
    public final C65192xH A07;
    public final InterfaceC670931a A08;
    public final C1PY A09;

    public C39379HaJ(UserSession userSession, InterfaceC61352qx interfaceC61352qx, C65192xH c65192xH, InterfaceC670931a interfaceC670931a, InterfaceC671231d interfaceC671231d, C1PY c1py, InterfaceC672031l interfaceC672031l, C672131m c672131m) {
        super(interfaceC670931a, interfaceC671231d, c1py, interfaceC672031l, true);
        this.A09 = c1py;
        this.A02 = interfaceC671231d;
        this.A08 = interfaceC670931a;
        this.A03 = c672131m;
        this.A07 = c65192xH;
        this.A05 = interfaceC61352qx;
        this.A04 = userSession;
        this.A06 = new C672531q(c65192xH);
    }

    @Override // X.AbstractC672431p
    public final int A01(int i, int i2) {
        return -1;
    }

    @Override // X.AbstractC672431p
    public final C1PZ A07(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        C14360o3.A0B(c59062n7, 0);
        A0N(c59062n7, interfaceC57162jr).A03(c59062n7, interfaceC57162jr);
        Number number = (Number) c59062n7.A04;
        if (number.intValue() > this.A01) {
            this.A01 = number.intValue();
        }
        InterfaceC62242sP interfaceC62242sP = ((AbstractC672431p) this).A04;
        if (interfaceC62242sP == null || (str = interfaceC62242sP.BK4(c59062n7.A03)) == null) {
            str = "";
        }
        if (!this.A03.A00(str)) {
            return A0M(c59062n7, interfaceC57162jr);
        }
        return C1PZ.A0K;
    }

    @Override // X.AbstractC672431p
    public final void A0C() {
        this.A01 = 0;
    }

    @Override // X.AbstractC672431p
    public final void A0G(C1PZ c1pz, int i, int i2, int i3, int i4) {
        C14360o3.A0B(c1pz, 0);
        super.A0G(c1pz, i, i2, i3, i4);
        this.A06.A06(this.A04, this.A02, c1pz, i, i3, this.A01);
    }

    @Override // X.AbstractC672331o
    public final C1PZ A0M(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Double C8M;
        Integer num;
        String BjF;
        C1PZ c1pz = new C1PZ(C05F.A0C);
        C672531q c672531q = this.A06;
        int i = this.A01;
        InterfaceC671231d interfaceC671231d = this.A02;
        C82373m0 A05 = c672531q.A05(interfaceC671231d, i);
        if (A05 != null) {
            int A02 = c672531q.A02(this.A04, A05);
            this.A00 = 0;
            if (A02 != -1 && c672531q.A07(A02)) {
                C671831j c671831j = A05.A03;
                if (c671831j != null) {
                    InterfaceC39571se interfaceC39571se = c671831j.A01;
                    if (interfaceC39571se != null && (C8M = interfaceC39571se.C8M()) != null) {
                        double doubleValue = C8M.doubleValue();
                        double A0L = A0L(interfaceC57162jr) / 1000.0d;
                        super.A05.BuQ().A00(A0L);
                        if (this.A05.Auo() == 0 && Double.compare(A0L, doubleValue) >= 0) {
                            c1pz.A01("time_rule_did_meet");
                            String str = c671831j.A07.A02;
                            if (str == null) {
                                str = "";
                            }
                            c1pz.A0F = str;
                            c1pz.A00 = A0L;
                            int A052 = A05(interfaceC671231d.BZU().subList(0, this.A01 + 1));
                            int A06 = A06(interfaceC671231d.BZU().subList(0, this.A01 + 1));
                            int i2 = new int[]{A052, A06}[0];
                            if (A06 > i2) {
                                i2 = A06;
                            }
                            c1pz.A06 = i2;
                            InterfaceC39571se interfaceC39571se2 = c671831j.A01;
                            if (interfaceC39571se2 != null && (BjF = interfaceC39571se2.BjF()) != null) {
                                num = AbstractC003100w.A0i(BjF);
                            } else {
                                num = null;
                            }
                            C38008Gnu A04 = c672531q.A04(A05, num, A052, A06, A02, this.A01);
                            this.A00 = A04.A00;
                            if (A04.A02) {
                                A0G(c1pz, A052, A06, A04.A01, this.A01);
                            }
                        }
                    }
                } else {
                    throw AbstractC166997dE.A0g();
                }
            }
            return C1PZ.A0K;
        }
        return c1pz;
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
        throw new UnsupportedOperationException("Method not decompiled: X.C39379HaJ.A0P(java.lang.Object):boolean");
    }

    @Override // X.AbstractC672331o
    public final boolean A0Q(String str) {
        C14360o3.A0B(str, 0);
        return this.A03.A00(str);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A03(C40861ut c40861ut, int i, int i2, int i3) {
        Integer num;
        String BjF;
        C671831j c671831j = (C671831j) c40861ut;
        C14360o3.A0B(c671831j, 0);
        InterfaceC39571se interfaceC39571se = c671831j.A01;
        if (interfaceC39571se != null && (BjF = interfaceC39571se.BjF()) != null) {
            num = AbstractC003100w.A0i(BjF);
        } else {
            num = null;
        }
        return C672531q.A01(num, i, i2, i3, this.A00);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return c82373m0.A03;
    }

    @Override // X.AbstractC672431p
    public final void A0B() {
        if (!C18U.A06(C06090Tz.A05, this.A04, 36314983575063484L)) {
            super.A0B();
        }
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        Integer num;
        String BjF;
        C671831j c671831j = (C671831j) c40861ut;
        C14360o3.A0B(c671831j, 3);
        InterfaceC39571se interfaceC39571se = c671831j.A01;
        if (interfaceC39571se != null && (BjF = interfaceC39571se.BjF()) != null) {
            num = AbstractC003100w.A0i(BjF);
        } else {
            num = null;
        }
        if (C672531q.A01(num, i, i2, i3, this.A00) <= this.A01) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        return AbstractC166987dD.A0H(obj);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ Object A0A(Object obj) {
        return this.A02.BUP(AbstractC166987dD.A0H(obj));
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

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0K(C40861ut c40861ut) {
        return false;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0I(InterfaceC57162jr interfaceC57162jr, C40861ut c40861ut, Object obj, int i, int i2, int i3, int i4, int i5) {
        return false;
    }
}
