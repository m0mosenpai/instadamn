package X;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.31f, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC671431f implements InterfaceC671531g {
    public int A00;
    public final InterfaceC62242sP A02;
    public final C1PY A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final LinkedHashSet A03 = new LinkedHashSet();
    public InterfaceC671731i A01 = new C671631h();

    public int A04(int i) {
        return 0;
    }

    public int A05(InterfaceC42381xS interfaceC42381xS, int i, int i2, int i3) {
        return ((i - i2) - i3) - 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ac, code lost:
    
        if (r11 != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ae, code lost:
    
        if (r30 <= 0) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00b4, code lost:
    
        if (A0I(r9) == false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b6, code lost:
    
        r15 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01b4, code lost:
    
        if (A0F(r5, r9) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01b6, code lost:
    
        r15 = X.C05F.A0Y;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01ba, code lost:
    
        if (r15 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01bc, code lost:
    
        r15 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01c2, code lost:
    
        if (r26.A06 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01cb, code lost:
    
        if (r32 < ((r4 - r30) + A04(r4))) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01cd, code lost:
    
        r15 = X.C05F.A0u;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01d8, code lost:
    
        r15 = X.C05F.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d6, code lost:
    
        if (r14 != false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C1PZ A09(X.InterfaceC42381xS r27, java.lang.Integer r28, java.lang.Object r29, int r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC671431f.A09(X.1xS, java.lang.Integer, java.lang.Object, int, int, int):X.1PZ");
    }

    public List A0B() {
        return ((C671331e) this).A03.A07();
    }

    public void A0C(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, C671831j c671831j, Integer num, int i) {
        Integer num2;
        C3YO A00;
        C25615BUc c25615BUc;
        if (this instanceof C671331e) {
            C671331e c671331e = (C671331e) this;
            C14360o3.A0B(c1pz, 1);
            C14360o3.A0B(num, 4);
            InterfaceC62242sP interfaceC62242sP = c671331e.A05;
            Object BUM = interfaceC42381xS.BUM();
            if (interfaceC62242sP.CdX(BUM)) {
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A0N;
            }
            if (c1pz.A0C != C05F.A01) {
                String str = null;
                if (!AbstractC114975Hn.A02(num)) {
                    A00 = C3YM.A00(c671331e.A01);
                    C3YP c3yp = C3YP.A05;
                    Integer num3 = C05F.A0j;
                    Integer valueOf = Integer.valueOf(c1pz.A03);
                    C38321qM A02 = C3XH.A02(((C82373m0) BUM).A01.A05);
                    if (A02 != null) {
                        str = A02.getId();
                    }
                    c25615BUc = new C25615BUc(c3yp, num3, valueOf, null, null, null, null, str);
                } else {
                    if (!c671831j.A0D(num, num2, (c1pz.A03 - i) - 1)) {
                        return;
                    }
                    A00 = C3YM.A00(c671331e.A01);
                    C3YP c3yp2 = C3YP.A05;
                    Integer num4 = C05F.A0j;
                    int i2 = c1pz.A03;
                    int i3 = (i2 - i) - 1;
                    C38321qM A022 = C3XH.A02(((C82373m0) BUM).A01.A05);
                    if (A022 != null) {
                        str = A022.getId();
                    }
                    c25615BUc = new C25615BUc(c3yp2, num4, Integer.valueOf(i2), null, null, Integer.valueOf(i3), null, str);
                }
                A00.A07(c25615BUc);
            }
        }
    }

    public void A0E(Object obj, int i, int i2, int i3) {
        C671331e c671331e = (C671331e) this;
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        C38321qM A02 = C3XH.A02(c82373m0.A01.A05);
        if (A02 != null) {
            C75113Zb BRZ = c671331e.A03.A0T.BRZ(A02);
            BRZ.A0V = i;
            BRZ.A0G = i2;
            BRZ.A0R = i3;
        }
    }

    public boolean A0G(C671831j c671831j, Object obj) {
        C671331e c671331e = (C671331e) this;
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return c671331e.A04.CeG(c82373m0.A01, c671331e.A03.A08(), c671831j.A09());
    }

    public boolean A0H(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return ((C671331e) this).A0J(c82373m0.A01);
    }

    public boolean A0I(Object obj) {
        return false;
    }

    @Override // X.InterfaceC43071ya
    public final void ATP(C59062n7 c59062n7, InterfaceC57162jr interfaceC57162jr) {
    }

    @Override // X.InterfaceC669630n
    public final String B5L() {
        return "";
    }

    @Override // X.InterfaceC669630n
    public final void CKM(C206209Bd c206209Bd, List list) {
    }

    @Override // X.InterfaceC671531g
    public final void COx() {
    }

    @Override // X.InterfaceC671531g
    public final void CtD(int i) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrA() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrD() {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrF(String str) {
    }

    @Override // X.InterfaceC671531g
    public final /* synthetic */ void DrJ() {
    }

    @Override // X.InterfaceC671531g
    public final void ECx() {
    }

    @Override // X.InterfaceC671531g
    public final void EF6(InterfaceC673031v interfaceC673031v) {
        C14360o3.A0B(interfaceC673031v, 0);
        this.A03.remove(interfaceC673031v);
    }

    @Override // X.InterfaceC671531g
    public final void EKX() {
    }

    @Override // X.InterfaceC671531g
    public final void EKY(C1PZ c1pz) {
    }

    @Override // X.InterfaceC671531g
    public final void EPQ(InterfaceC671731i interfaceC671731i) {
        C14360o3.A0B(interfaceC671731i, 0);
        this.A01 = interfaceC671731i;
    }

    public int A08(InterfaceC42381xS interfaceC42381xS, C671831j c671831j, Integer num, int i) {
        Integer num2;
        int i2;
        int i3;
        if (this instanceof C671331e) {
            C671331e c671331e = (C671331e) this;
            C14360o3.A0B(num, 2);
            List A08 = c671331e.A03.A08();
            int i4 = Integer.MAX_VALUE;
            int i5 = 0;
            for (Object obj : A08) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    AbstractC16960so.A1U();
                    throw C00O.createAndThrow();
                }
                if (((C3XG) obj).A06 == C1XV.A0F) {
                    i4 = i5;
                }
                i5 = i6;
            }
            if (c671331e.A05.CdX(interfaceC42381xS.BUM())) {
                num2 = C05F.A0C;
            } else {
                num2 = C05F.A0N;
            }
            Integer num3 = C05F.A0C;
            if (num == num3 && num2 == num3) {
                i2 = c671831j.A05();
            } else {
                Integer num4 = C05F.A0N;
                if (num == num4 && num2 == num4) {
                    i2 = c671831j.A05;
                } else {
                    i2 = c671831j.A04;
                }
            }
            if (!c671331e.A0C || (i3 = ((AbstractC671431f) c671331e).A00) <= 0) {
                i3 = 0;
            }
            if (!c671331e.A0A && i4 >= i) {
                Object min = Collections.min(AbstractC16960so.A1Q(Integer.valueOf(i4), Integer.valueOf(i + i2 + i3), Integer.valueOf(A08.size())));
                C14360o3.A07(min);
                return ((Number) min).intValue();
            }
            return Math.min(i + i2 + i3, A08.size());
        }
        return i;
    }

    public C671831j A0A(Object obj) {
        C82373m0 c82373m0 = (C82373m0) obj;
        C14360o3.A0B(c82373m0, 0);
        return c82373m0.A03;
    }

    public void A0D(InterfaceC42381xS interfaceC42381xS, C671831j c671831j, Integer num, Integer num2, int i, int i2, int i3) {
        String str;
        if (this instanceof C671331e) {
            C671331e c671331e = (C671331e) this;
            C14360o3.A0B(num, 3);
            C82373m0 c82373m0 = (C82373m0) interfaceC42381xS.BUM();
            C14360o3.A0B(c82373m0, 0);
            C3XG c3xg = c82373m0.A01;
            if (!c671331e.A0J(c3xg)) {
                if ((num2 == C05F.A0C || num2 == C05F.A0N) && !c671831j.A0D(num2, num, i) && i < 2 && i3 < c671831j.A06) {
                    C3YO A00 = C3YM.A00(c671331e.A01);
                    C3YP c3yp = C3YP.A05;
                    Integer num3 = C05F.A01;
                    Integer valueOf = Integer.valueOf(i2);
                    C38321qM A02 = C3XH.A02(c3xg.A05);
                    if (A02 != null) {
                        str = A02.getId();
                    } else {
                        str = null;
                    }
                    A00.A07(new C25615BUc(c3yp, num3, valueOf, null, null, Integer.valueOf(i), null, str));
                }
            }
        }
    }

    public boolean A0F(C671831j c671831j, Object obj) {
        if (this instanceof C671331e) {
            C671331e c671331e = (C671331e) this;
            C82373m0 c82373m0 = (C82373m0) obj;
            C14360o3.A0B(c82373m0, 0);
            InterfaceC670931a interfaceC670931a = c671331e.A04;
            C65192xH c65192xH = c671331e.A03;
            return interfaceC670931a.CQh(AbstractC001800i.A0O(c65192xH.A08(), c671831j.A09()), AbstractC001800i.A0O(c65192xH.A08(), c671831j.A09() - 1), c82373m0.A01);
        }
        return true;
    }

    @Override // X.InterfaceC671531g
    public final void A7z(InterfaceC673031v interfaceC673031v) {
        if (interfaceC673031v != null) {
            this.A03.add(interfaceC673031v);
        }
    }

    @Override // X.InterfaceC671531g
    public final InterfaceC673231x AMN() {
        return new C673131w();
    }

    @Override // X.InterfaceC671531g
    public final C51G AND() {
        return new C43000Izq();
    }

    @Override // X.InterfaceC669630n
    public final java.util.Set Bts() {
        return C16910sj.A00;
    }

    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b8, code lost:
    
        r21 = A06(r8, r2, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01c0, code lost:
    
        if (r37.A07 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c6, code lost:
    
        if (r5.A09() == r4) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c8, code lost:
    
        r2.A01("pushdown_rule_met");
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x01cf, code lost:
    
        if (r37.A00 != 0) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x01d1, code lost:
    
        r37.A00 = r5.A09() - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01d8, code lost:
    
        if (r7 == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x01de, code lost:
    
        if (r8.Boz() == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01e0, code lost:
    
        r2.A01("delay_pushdown_retry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01e5, code lost:
    
        A0E(r6, r5.A09() - r4, r3, r0);
        r37.A01.BuQ().A04(r2.A00(), r5.A09(), "Insert push down");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0204, code lost:
    
        if (r11.CdX(r6) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0206, code lost:
    
        r10 = X.C05F.A0C;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x027e, code lost:
    
        r10 = X.C05F.A0N;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0103, code lost:
    
        if (r2 < r3) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d5, code lost:
    
        if (r17 > 0) goto L31;
     */
    @Override // X.InterfaceC671531g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ct4(int r38) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC671431f.Ct4(int):void");
    }

    public AbstractC671431f(InterfaceC62242sP interfaceC62242sP, C1PY c1py, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9) {
        this.A04 = c1py;
        this.A02 = interfaceC62242sP;
        this.A07 = z;
        this.A0A = z2;
        this.A05 = z3;
        this.A08 = z4;
        this.A0C = z5;
        this.A0D = z6;
        this.A06 = z7;
        this.A09 = z8;
        this.A0B = z9;
    }

    public int A07(InterfaceC42381xS interfaceC42381xS, C671831j c671831j) {
        return c671831j.A09();
    }

    @Override // X.InterfaceC671531g
    public final C1PZ AGn(List list) {
        return C1PZ.A0K;
    }

    public int A06(InterfaceC42381xS interfaceC42381xS, C1PZ c1pz, int i) {
        return c1pz.A03;
    }
}
