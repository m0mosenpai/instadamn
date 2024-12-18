package X;

import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

/* loaded from: classes5.dex */
public final class BTO {
    public long A00;
    public final BTO A01;
    public final AbstractC136616Gp A02;
    public final C6LO A03 = new ParcelableSnapshotMutableLongState(0);
    public final C6LO A04 = new ParcelableSnapshotMutableLongState(Long.MIN_VALUE);
    public final InterfaceC74953Yl A05;
    public final InterfaceC74953Yl A06;
    public final InterfaceC74953Yl A07;
    public final InterfaceC74953Yl A08;
    public final C6MK A09;
    public final C6MK A0A;
    public final String A0B;
    public final InterfaceC74963Ym A0C;

    public static final long A00(BTO bto) {
        C6MK c6mk = bto.A09;
        int size = c6mk.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((C28795CnR) c6mk.get(i)).A04.BPC());
        }
        C6MK c6mk2 = bto.A0A;
        int size2 = c6mk2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            j = Math.max(j, A00((BTO) c6mk2.get(i2)));
        }
        return j;
    }

    private final void A01() {
        C6MK c6mk = this.A09;
        int size = c6mk.size();
        for (int i = 0; i < size; i++) {
            ((C28795CnR) c6mk.get(i)).A03.EUc(-2.0f);
        }
        C6MK c6mk2 = this.A0A;
        int size2 = c6mk2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((BTO) c6mk2.get(i2)).A01();
        }
    }

    public final long A02() {
        BTO bto = this.A01;
        if (bto != null) {
            return bto.A02();
        }
        return this.A03.BPC();
    }

    public final InterfaceC31030DkT A03() {
        return (InterfaceC31030DkT) this.A06.getValue();
    }

    public final Object A04() {
        return ((C136606Go) this.A02).A00.getValue();
    }

    public final void A05() {
        this.A04.EYa(Long.MIN_VALUE);
        AbstractC136616Gp abstractC136616Gp = this.A02;
        if (abstractC136616Gp instanceof C136606Go) {
            ((C136606Go) abstractC136616Gp).A00.Egh(this.A07.getValue());
        }
        if (this.A01 == null) {
            this.A03.EYa(0L);
        }
        AbstractC25227BEk.A1A(abstractC136616Gp.A00, false);
        C6MK c6mk = this.A0A;
        int size = c6mk.size();
        for (int i = 0; i < size; i++) {
            ((BTO) c6mk.get(i)).A05();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0086, code lost:
    
        if (X.AbstractC25230BEn.A1X(r1) == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A06(long r11, boolean r13) {
        /*
            r10 = this;
            X.6LO r6 = r10.A04
            long r3 = r6.BPC()
            r5 = 1
            r1 = -9223372036854775808
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L7e
            r6.EYa(r11)
            X.6Gp r0 = r10.A02
            X.3Yl r1 = r0.A00
        L14:
            X.AbstractC25227BEk.A1A(r1, r5)
        L17:
            r1 = 0
            X.3Yl r0 = r10.A08
            X.AbstractC25227BEk.A1A(r0, r1)
            X.6MK r6 = r10.A09
            int r4 = r6.size()
            r3 = 0
        L24:
            if (r3 >= r4) goto L89
            java.lang.Object r7 = r6.get(r3)
            X.CnR r7 = (X.C28795CnR) r7
            X.3Yl r0 = r7.A07
            boolean r0 = X.AbstractC25230BEn.A1X(r0)
            if (r0 != 0) goto L72
            r0 = r11
            if (r13 == 0) goto L43
            X.3Yl r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            X.62C r0 = (X.C62C) r0
            long r0 = r0.Azo()
        L43:
            X.3Yl r9 = r7.A05
            java.lang.Object r2 = r9.getValue()
            X.62C r2 = (X.C62C) r2
            java.lang.Object r8 = r2.CEW(r0)
            X.3Yl r2 = r7.A09
            r2.Egh(r8)
            java.lang.Object r2 = r9.getValue()
            X.62C r2 = (X.C62C) r2
            X.5Xc r2 = r2.CEl(r0)
            r7.A00 = r2
            java.lang.Object r2 = r9.getValue()
            X.62C r2 = (X.C62C) r2
            boolean r0 = r2.CUo(r0)
            if (r0 == 0) goto L72
            r1 = 1
            X.3Yl r0 = r7.A07
            X.AbstractC25227BEk.A1A(r0, r1)
        L72:
            X.3Yl r0 = r7.A07
            boolean r0 = X.AbstractC25230BEn.A1X(r0)
            if (r0 != 0) goto L7b
            r5 = 0
        L7b:
            int r3 = r3 + 1
            goto L24
        L7e:
            X.6Gp r0 = r10.A02
            X.3Yl r1 = r0.A00
            boolean r0 = X.AbstractC25230BEn.A1X(r1)
            if (r0 != 0) goto L17
            goto L14
        L89:
            X.6MK r4 = r10.A0A
            int r3 = r4.size()
            r2 = 0
        L90:
            if (r2 >= r3) goto Lc3
            java.lang.Object r6 = r4.get(r2)
            X.BTO r6 = (X.BTO) r6
            X.3Yl r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.6Gp r0 = r6.A02
            X.6Go r0 = (X.C136606Go) r0
            X.3Yl r0 = r0.A00
            boolean r0 = X.AbstractC25229BEm.A1V(r0, r1)
            if (r0 != 0) goto Lad
            r6.A06(r11, r13)
        Lad:
            X.3Yl r0 = r6.A07
            java.lang.Object r1 = r0.getValue()
            X.6Gp r0 = r6.A02
            X.6Go r0 = (X.C136606Go) r0
            X.3Yl r0 = r0.A00
            boolean r0 = X.AbstractC25229BEm.A1V(r0, r1)
            if (r0 != 0) goto Lc0
            r5 = 0
        Lc0:
            int r2 = r2 + 1
            goto L90
        Lc3:
            if (r5 == 0) goto Lc8
            r10.A05()
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BTO.A06(long, boolean):void");
    }

    public final void A08(Object obj) {
        InterfaceC74953Yl interfaceC74953Yl = this.A07;
        if (!AbstractC25229BEm.A1U(interfaceC74953Yl, obj)) {
            this.A06.Egh(new C28713Cm5(interfaceC74953Yl.getValue(), obj));
            InterfaceC74953Yl interfaceC74953Yl2 = ((C136606Go) this.A02).A00;
            if (!AbstractC25229BEm.A1V(interfaceC74953Yl, interfaceC74953Yl2.getValue())) {
                interfaceC74953Yl2.Egh(interfaceC74953Yl.getValue());
            }
            interfaceC74953Yl.Egh(obj);
            if (this.A04.BPC() == Long.MIN_VALUE) {
                AbstractC25227BEk.A1A(this.A08, true);
            }
            A01();
        }
    }

    public final void A09(Object obj, long j, Object obj2) {
        this.A04.EYa(Long.MIN_VALUE);
        AbstractC136616Gp abstractC136616Gp = this.A02;
        AbstractC25227BEk.A1A(abstractC136616Gp.A00, false);
        InterfaceC74953Yl interfaceC74953Yl = this.A05;
        if (!AbstractC25230BEn.A1X(interfaceC74953Yl) || !AbstractC25229BEm.A1U(((C136606Go) abstractC136616Gp).A00, obj) || !AbstractC25229BEm.A1U(this.A07, obj2)) {
            InterfaceC74953Yl interfaceC74953Yl2 = ((C136606Go) abstractC136616Gp).A00;
            if (!AbstractC25229BEm.A1U(interfaceC74953Yl2, obj) && (abstractC136616Gp instanceof C136606Go)) {
                interfaceC74953Yl2.Egh(obj);
            }
            this.A07.Egh(obj2);
            AbstractC25227BEk.A1A(interfaceC74953Yl, true);
            this.A06.Egh(new C28713Cm5(obj, obj2));
        }
        C6MK c6mk = this.A0A;
        int size = c6mk.size();
        for (int i = 0; i < size; i++) {
            BTO bto = (BTO) c6mk.get(i);
            C14360o3.A0C(bto, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (AbstractC25230BEn.A1X(bto.A05)) {
                bto.A09(((C136606Go) bto.A02).A00.getValue(), j, bto.A07.getValue());
            }
        }
        C6MK c6mk2 = this.A09;
        int size2 = c6mk2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ((C28795CnR) c6mk2.get(i2)).A01(j);
        }
        this.A00 = j;
    }

    public final boolean A0A() {
        C6MK c6mk = this.A09;
        int size = c6mk.size();
        for (int i = 0; i < size; i++) {
            c6mk.get(i);
        }
        C6MK c6mk2 = this.A0A;
        int size2 = c6mk2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            if (((BTO) c6mk2.get(i2)).A0A()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        C6MK c6mk = this.A09;
        int size = c6mk.size();
        String str = "Transition animation values: ";
        for (int i = 0; i < size; i++) {
            Object obj = c6mk.get(i);
            StringBuilder A11 = AbstractC166997dE.A11(str);
            A11.append(obj);
            str = AbstractC166997dE.A0x(", ", A11);
        }
        return str;
    }

    public BTO(BTO bto, AbstractC136616Gp abstractC136616Gp, String str) {
        this.A02 = abstractC136616Gp;
        this.A01 = bto;
        this.A0B = str;
        this.A07 = AbstractC25230BEn.A0U(((C136606Go) abstractC136616Gp).A00.getValue());
        this.A06 = AbstractC25229BEm.A0R(new C28713Cm5(((C136606Go) this.A02).A00.getValue(), ((C136606Go) this.A02).A00.getValue()));
        Boolean A0a = AbstractC166997dE.A0a();
        this.A08 = AbstractC25229BEm.A0R(A0a);
        this.A09 = new C6MK();
        this.A0A = new C6MK();
        this.A05 = AbstractC25229BEm.A0R(A0a);
        this.A0C = DGT.A00(null, this, 3);
    }

    public final void A07(C5Tl c5Tl, Object obj, int i) {
        int i2;
        c5Tl.Enr(-1493585151);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, obj, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, this);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1477163447, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:1211)");
            }
            if (!AbstractC25230BEn.A1X(this.A05)) {
                c5Tl.Eno(1822507602);
                A08(obj);
                if (AbstractC25229BEm.A1V(((C136606Go) this.A02).A00, obj) && this.A04.BPC() == Long.MIN_VALUE && !AbstractC25230BEn.A1X(this.A08)) {
                    c5Tl.Eno(1823982427);
                } else {
                    Object A0q = AbstractC25227BEk.A0q(c5Tl, 1822738893);
                    Object obj2 = C5UI.A00;
                    C19L c19l = ((C137536Kz) AbstractC25234BEr.A0b(c5Tl, A0q, obj2)).A00;
                    boolean AH6 = c5Tl.AH6(c19l) | AbstractC25231BEo.A1K(i2);
                    Object EEc = c5Tl.EEc();
                    if (AH6 || EEc == obj2) {
                        EEc = DRZ.A00(c5Tl, c19l, this, 7);
                    }
                    C5UX.A01(c5Tl, c19l, this, (InterfaceC16660sJ) EEc);
                }
                AbstractC25225BEi.A1T(c5Tl);
            } else {
                c5Tl.Eno(1823992347);
            }
            if (AbstractC25230BEn.A1Y(c5Tl)) {
                C0fH.A00(1213182392);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, this, obj, i, 0);
        }
    }
}
