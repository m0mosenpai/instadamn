package X;

/* renamed from: X.CDu, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27549CDu {
    public static final void A00(C5Tl c5Tl, CS5 cs5, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        BZO A01;
        BZP A06;
        boolean A1b = AbstractC25233BEq.A1b(interfaceC16660sJ, interfaceC16820sZ, cs5);
        c5Tl.Enr(395755620);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, cs5);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(71209670, "com.instagram.barcelona.common.ui.toast.BdsToastMessage (BdsToastMessage.kt:42)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1449968880);
            Object obj = C5UI.A00;
            Object obj2 = A0q;
            if (A0q == obj) {
                C136606Go A0R = AbstractC25230BEn.A0R(false);
                A0R.A00(Boolean.valueOf(A1b));
                c5Tl.FBy(A0R);
                obj2 = A0R;
            }
            C136606Go c136606Go = (C136606Go) obj2;
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C0eB c0eB = C0eB.A00;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c136606Go, AbstractC167007dF.A1P(i2 & 14, 4), AbstractC25227BEk.A1Z(c5Tl, cs5, -1449965728));
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == obj) {
                EEc = new MCQ(interfaceC16660sJ, cs5, c136606Go, null, 43);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c0eB, false);
            c5Tl.Eno(-1449961775);
            if (!AbstractC25231BEo.A1T(c136606Go.A00) && !AbstractC25231BEo.A1T(c136606Go.A01)) {
                c5Tl.Eno(-1449959051);
                boolean A1T = AbstractC25228BEl.A1T(i2);
                Object EEc2 = c5Tl.EEc();
                if (A1T || EEc2 == obj) {
                    EEc2 = new MCC(interfaceC16820sZ, null, 21);
                    c5Tl.FBy(EEc2);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc2, c0eB, false);
            }
            C117505Tk.A0L(A0K, false);
            A01 = AbstractC28503Chw.A01(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            InterfaceC118225Wj interfaceC118225Wj = C118195Wf.A05;
            BZO A00 = A01.A00(AbstractC28503Chw.A04(interfaceC118225Wj, 9));
            A06 = AbstractC28503Chw.A06(AbstractC25225BEi.A0I(null, 1.0f, 400.0f), 0.0f);
            AbstractC28495Cho.A02(A00, A06.A00(AbstractC28503Chw.A09(interfaceC118225Wj, 9)), c136606Go, c5Tl, null, null, C5UA.A01(c5Tl, new C30714DfC(5, interfaceC16660sJ, c136606Go, interfaceC16820sZ, cs5), 922067084), 200064, 18);
            if (C0fH.A02()) {
                C0fH.A00(-664765378);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16820sZ, cs5, interfaceC16660sJ, i, 14);
        }
    }
}
