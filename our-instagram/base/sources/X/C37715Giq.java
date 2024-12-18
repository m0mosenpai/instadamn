package X;

import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObj;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Giq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37715Giq extends AbstractC672331o {
    public int A00;
    public int A01;
    public C9B3 A02;
    public Long A03;
    public int A04;
    public final UserSession A05;
    public final C26281Pj A06;
    public final InterfaceC670931a A07;
    public final InterfaceC62242sP A08;
    public final InterfaceC671231d A09;
    public final C31H A0A;
    public final C672131m A0B;
    public final AbstractC39459Hbl A0C;
    public final C37556GgC A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37715Giq(UserSession userSession, C1PC c1pc, InterfaceC670931a interfaceC670931a, InterfaceC62242sP interfaceC62242sP, InterfaceC671231d interfaceC671231d, C31H c31h, C1PY c1py, InterfaceC672031l interfaceC672031l, C672131m c672131m, AbstractC39459Hbl abstractC39459Hbl, C37556GgC c37556GgC) {
        super(interfaceC670931a, interfaceC671231d, c1py, interfaceC672031l, true);
        C06090Tz c06090Tz = C06090Tz.A05;
        boolean A06 = C18U.A06(c06090Tz, userSession, 36318526924396803L);
        this.A09 = interfaceC671231d;
        this.A07 = interfaceC670931a;
        this.A0B = c672131m;
        this.A0A = c31h;
        this.A08 = interfaceC62242sP;
        this.A0E = A06;
        this.A02 = new C9B3(1);
        this.A06 = C26271Pi.A02.A00(c1pc);
        this.A0C = abstractC39459Hbl;
        this.A05 = userSession;
        this.A0D = c37556GgC;
        this.A0F = C18U.A06(c06090Tz, userSession, 36318526924200193L);
        this.A0G = C18U.A06(c06090Tz, userSession, 36318526924396803L);
    }

    @Override // X.AbstractC672431p
    public final int A01(int i, int i2) {
        return -1;
    }

    @Override // X.AbstractC672431p
    public final C1PZ A07(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        String str;
        C14360o3.A0B(c59062n7, 0);
        this.A04++;
        A0N(c59062n7, interfaceC57162jr).A03(c59062n7, interfaceC57162jr);
        Object obj = c59062n7.A04;
        if (obj != null) {
            if (A04(obj) > this.A01) {
                int A04 = A04(obj);
                this.A01 = A04;
                super.A05.BuQ().A02(A04);
            }
            A04(obj);
            InterfaceC62242sP interfaceC62242sP = ((AbstractC672431p) this).A04;
            if (interfaceC62242sP == null || (str = interfaceC62242sP.BK4(c59062n7.A03)) == null) {
                str = "";
            }
            if (!this.A0B.A00(str)) {
                return A0M(c59062n7, interfaceC57162jr);
            }
            this.A02.A01++;
            return C1PZ.A0K;
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // X.AbstractC672431p
    public final Object A0A(Object obj) {
        C14360o3.A0B(obj, 0);
        return this.A09.BUP(A04(obj));
    }

    @Override // X.AbstractC672431p
    public final void A0B() {
    }

    @Override // X.AbstractC672431p
    public final void A0C() {
        this.A01 = 0;
        super.A05.BuQ().A02(0);
        C3Z9 BuQ = super.A05.BuQ();
        BuQ.A01.clear();
        W5F w5f = BuQ.A00;
        if (w5f != null) {
            w5f.A01();
        }
    }

    @Override // X.AbstractC672431p
    public final void A0G(C1PZ c1pz, int i, int i2, int i3, int i4) {
        Double d;
        C38321qM c38321qM;
        BrandSafetyContentBlocklistBitmapQLObj AiW;
        List Ag9;
        C38321qM c38321qM2;
        BrandSafetyContentBlocklistBitmapQLObj AiW2;
        List Ag92;
        InterfaceC39571se interfaceC39571se;
        String BjF;
        InterfaceC39571se interfaceC39571se2;
        C75113Zb c75113Zb;
        C14360o3.A0B(c1pz, 0);
        super.A0G(c1pz, i, i2, i3, i4);
        c1pz.A0C = C05F.A0Y;
        Object A0R = A0R();
        if (A0R != null) {
            C206239Bg c206239Bg = (C206239Bg) A0R;
            C14360o3.A0B(c206239Bg, 0);
            AbstractC39459Hbl abstractC39459Hbl = this.A0C;
            C120985dq c120985dq = (C120985dq) c206239Bg.A03;
            int A0C = abstractC39459Hbl.A0C(c120985dq);
            if (A0C != -1) {
                c1pz.A07 = A0C;
            }
            C38321qM c38321qM3 = c120985dq.A02;
            if (c38321qM3 != null) {
                c75113Zb = abstractC39459Hbl.BRZ(c38321qM3);
                if (c75113Zb != null) {
                    c75113Zb.A0F = i3 - i;
                }
            } else {
                c75113Zb = null;
            }
            if (C18U.A06(C06090Tz.A05, this.A05, 36317899857598104L)) {
                List A0J = abstractC39459Hbl.A0J();
                if (c75113Zb != null) {
                    InterfaceC62242sP interfaceC62242sP = this.A08;
                    String BK4 = interfaceC62242sP.BK4(A0J.get(i3 - 1));
                    String BK42 = interfaceC62242sP.BK4(A0J.get(i3));
                    c75113Zb.A1R = BK4;
                    c75113Zb.A1N = BK42;
                }
            }
        }
        C206239Bg c206239Bg2 = (C206239Bg) A0R();
        if (c206239Bg2 != null) {
            AbstractC39459Hbl abstractC39459Hbl2 = this.A0C;
            C37644Ghd C09 = abstractC39459Hbl2.C09((C120985dq) c206239Bg2.A03);
            C671831j c671831j = (C671831j) c206239Bg2.A04;
            Integer num = null;
            if (c671831j != null && (interfaceC39571se2 = c671831j.A01) != null) {
                d = interfaceC39571se2.C8M();
            } else {
                d = null;
            }
            C09.A00 = d;
            if (c671831j != null && (interfaceC39571se = c671831j.A01) != null && (BjF = interfaceC39571se.BjF()) != null) {
                num = AbstractC003100w.A0i(BjF);
            }
            C09.A02 = num;
            C120985dq A0G = abstractC39459Hbl2.A0G(i3 - 1);
            if (A0G != null && (c38321qM2 = A0G.A02) != null && (AiW2 = c38321qM2.A0C.AiW()) != null && (Ag92 = AiW2.Ag9()) != null) {
                ArrayList A01 = C5IK.A00.A01(Ag92);
                C75113Zb c75113Zb2 = C09.A0E;
                if (c75113Zb2 != null) {
                    c75113Zb2.A1h = A01;
                }
            }
            C120985dq A0G2 = abstractC39459Hbl2.A0G(i3);
            if (A0G2 != null && (c38321qM = A0G2.A02) != null && (AiW = c38321qM.A0C.AiW()) != null && (Ag9 = AiW.Ag9()) != null) {
                ArrayList A012 = C5IK.A00.A01(Ag9);
                C75113Zb c75113Zb3 = C09.A0E;
                if (c75113Zb3 != null) {
                    c75113Zb3.A1g = A012;
                }
            }
        }
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ boolean A0H(InterfaceC57162jr interfaceC57162jr, C1PZ c1pz, C40861ut c40861ut, int i, int i2, int i3) {
        C14360o3.A0B(c40861ut, 3);
        if (A03(c40861ut, i, i2, i3) <= this.A01) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC672331o
    public final C1PZ A0M(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        Double C8M;
        C1PZ c1pz = new C1PZ(C05F.A0C);
        Object A0R = A0R();
        if (A0R == null) {
            this.A02.A03++;
            return c1pz;
        }
        C206239Bg c206239Bg = (C206239Bg) A0R;
        C14360o3.A0B(c206239Bg, 0);
        AbstractC39459Hbl abstractC39459Hbl = this.A0C;
        int A0C = abstractC39459Hbl.A0C((C120985dq) c206239Bg.A03);
        this.A00 = 0;
        if (A0C != -1) {
            C671831j c671831j = (C671831j) A09(A0R);
            InterfaceC671231d interfaceC671231d = this.A09;
            int A05 = A05(interfaceC671231d.BZU().subList(0, this.A01 + 1));
            int A06 = A06(interfaceC671231d.BZU().subList(0, this.A01 + 1));
            if (c671831j != null) {
                InterfaceC39571se interfaceC39571se = c671831j.A01;
                if (interfaceC39571se != null && (C8M = interfaceC39571se.C8M()) != null) {
                    double doubleValue = C8M.doubleValue();
                    if (!this.A0E || doubleValue >= 1.0d) {
                        double A0L = A0L(interfaceC57162jr) / 1000.0d;
                        super.A05.BuQ().A00(A0L);
                        boolean z = false;
                        if (this.A0D.A0A() == C05F.A00) {
                            z = true;
                            if (Double.compare(A0L, doubleValue) >= 0) {
                                c1pz.A01("time_rule_did_meet");
                                String str = c671831j.A07.A02;
                                if (str == null) {
                                    str = "";
                                }
                                c1pz.A0F = str;
                                c1pz.A00 = A0L;
                                int i = new int[]{A05, A06}[0];
                                if (A06 > i) {
                                    i = A06;
                                }
                                c1pz.A06 = i;
                                abstractC39459Hbl.A0J();
                                int A03 = A03(c671831j, A05, A06, A0C);
                                this.A08.BYX(A0R);
                                while (A03 < A0C) {
                                    if (A03(c671831j, A05, A06, A0C) > this.A01) {
                                        A0G(c1pz, A05, A06, A03(c671831j, A05, A06, A0C), this.A01);
                                        return c1pz;
                                    }
                                    this.A00++;
                                    A03 = A03(c671831j, A05, A06, A0C);
                                }
                                this.A02.A00++;
                            }
                        }
                        C9B3 c9b3 = this.A02;
                        if (!z) {
                            c9b3.A06++;
                        } else {
                            c9b3.A05++;
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            this.A02.A02++;
        }
        return C1PZ.A0K;
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
    public final boolean A0P(java.lang.Object r5) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C37715Giq.A0P(java.lang.Object):boolean");
    }

    @Override // X.AbstractC672331o
    public final boolean A0Q(String str) {
        C14360o3.A0B(str, 0);
        return this.A0B.A00(str);
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A03(C40861ut c40861ut, int i, int i2, int i3) {
        int[] iArr;
        int intValue;
        String BjF;
        C671831j c671831j = (C671831j) c40861ut;
        C14360o3.A0B(c671831j, 0);
        InterfaceC39571se interfaceC39571se = c671831j.A01;
        Integer num = null;
        if (interfaceC39571se != null && (BjF = interfaceC39571se.BjF()) != null) {
            num = AbstractC003100w.A0i(BjF);
        }
        Integer num2 = ((C40861ut) c671831j).A00.A07;
        if (this.A0G && i == -1 && i2 == -1 && num2 != null) {
            iArr = new int[2];
            intValue = num2.intValue();
        } else {
            if (num == null) {
                return i3;
            }
            if (i == -1 && i2 == -1) {
                return i3;
            }
            iArr = new int[2];
            int i4 = new int[]{i, i2}[0];
            if (i2 > i4) {
                i4 = i2;
            }
            intValue = i4 + num.intValue() + 1;
        }
        iArr[0] = intValue;
        iArr[1] = i3;
        int i5 = iArr[0];
        if (i3 < i5) {
            i5 = i3;
        }
        return i5 + this.A00;
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ int A04(Object obj) {
        C37644Ghd c37644Ghd = (C37644Ghd) obj;
        C14360o3.A0B(c37644Ghd, 0);
        return c37644Ghd.A06();
    }

    @Override // X.AbstractC672431p
    public final /* bridge */ /* synthetic */ C40861ut A09(Object obj) {
        C206239Bg c206239Bg = (C206239Bg) obj;
        C14360o3.A0B(c206239Bg, 0);
        return (C40861ut) c206239Bg.A04;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000e, code lost:
    
        if (r1 != true) goto L8;
     */
    @Override // X.AbstractC672331o, X.AbstractC672431p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void A0E(X.C59062n7 r6, X.InterfaceC57162jr r7, java.lang.Object r8, int r9) {
        /*
            r5 = this;
            boolean r0 = r5.A0F
            if (r0 == 0) goto L6f
            X.2sP r0 = r5.A04
            r2 = 1
            if (r0 == 0) goto L10
            boolean r1 = r0.CdX(r8)
            r0 = 1
            if (r1 == r2) goto L11
        L10:
            r0 = 0
        L11:
            r3 = 0
            if (r0 != 0) goto L1e
            X.2sP r0 = r5.A04
            if (r0 == 0) goto L32
            boolean r0 = r0.CZK(r8)
            if (r0 != r2) goto L32
        L1e:
            java.lang.Object r4 = r6.A04
            X.Ghd r4 = (X.C37644Ghd) r4
            double r0 = r5.A0L(r7)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r4.A01 = r0
            java.lang.Long r0 = r5.A03
            r4.A04 = r0
            r5.A03 = r3
        L32:
            X.Hbl r1 = r5.A0C
            int r0 = r9 + (-1)
            X.5dq r1 = r1.A0G(r0)
            if (r1 == 0) goto L4b
            X.2sP r0 = r5.A04
            if (r0 == 0) goto L73
            boolean r0 = r0.CX8(r1)
            if (r0 != r2) goto L73
        L46:
            r0 = 1
        L47:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
        L4b:
            X.2sP r0 = r5.A04
            if (r0 == 0) goto L6f
            boolean r0 = r0.CdX(r8)
            if (r0 != 0) goto L6f
            X.2sP r0 = r5.A04
            if (r0 == 0) goto L6f
            boolean r0 = r0.CZK(r8)
            if (r0 != 0) goto L6f
            boolean r0 = X.AbstractC166997dE.A1Z(r3, r2)
            if (r0 == 0) goto L6f
            java.lang.Long r0 = r5.A03
            if (r0 != 0) goto L6f
            java.lang.Long r0 = X.AbstractC31173DnH.A0g()
            r5.A03 = r0
        L6f:
            super.A0E(r6, r7, r8, r9)
            return
        L73:
            X.2sP r0 = r5.A04
            if (r0 == 0) goto L7e
            boolean r0 = r0.CX7(r1)
            if (r0 != r2) goto L7e
            goto L46
        L7e:
            r0 = 0
            goto L47
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37715Giq.A0E(X.2n7, X.2jr, java.lang.Object, int):void");
    }

    public final Object A0R() {
        List A0J = this.A0C.A0J();
        int size = A0J.size();
        int i = this.A01;
        if (size <= i) {
            return null;
        }
        ListIterator listIterator = A0J.listIterator(i);
        while (listIterator.hasNext()) {
            int nextIndex = listIterator.nextIndex();
            Object next = listIterator.next();
            InterfaceC62242sP interfaceC62242sP = this.A08;
            if (interfaceC62242sP.CX8(next) || interfaceC62242sP.CX7(next)) {
                return this.A09.BUP(nextIndex);
            }
        }
        return null;
    }

    @Override // X.AbstractC672331o
    public final boolean A0O(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
        if (interfaceC57162jr.CGk(c59062n7) >= 0.5d) {
            InterfaceC62242sP interfaceC62242sP = this.A08;
            Object obj = c59062n7.A03;
            if (!interfaceC62242sP.CX8(obj) && !interfaceC62242sP.CX7(obj)) {
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
