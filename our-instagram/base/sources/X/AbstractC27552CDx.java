package X;

/* renamed from: X.CDx, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27552CDx {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i, long j) {
        int i2;
        int A06 = AbstractC167007dF.A06(1, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-1641978535);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(c5Tl.AH3(j) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1016893729, "com.instagram.barcelona.compose.common.RepeatWhileStartedEvery (RepeatWhileStartedEvery.kt:13)");
            }
            Object AJX = c5Tl.AJX(C5VN.A00);
            Long valueOf = Long.valueOf(j);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, AJX, 53450900) | AbstractC167007dF.A1P(i2 & 14, 4) | AbstractC25231BEo.A1K(i2);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == C5UI.A00) {
                EEc = new C50121MBv(AJX, interfaceC16820sZ, null, A06, j);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            C5UX.A04(c5Tl, valueOf, (InterfaceC16620sF) EEc);
            C0eB c0eB = C0eB.A00;
            c5Tl.Eno(53456690);
            boolean A1M = AbstractC25231BEo.A1M(i2);
            Object EEc2 = c5Tl.EEc();
            if (A1M || EEc2 == C5UI.A00) {
                EEc2 = AbstractC25235BEs.A14(c5Tl, interfaceC16820sZ2, 29);
            }
            C117505Tk.A0I(A0J);
            C5UX.A03(c5Tl, c0eB, (InterfaceC16660sJ) EEc2);
            if (C0fH.A02()) {
                C0fH.A00(1879894286);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30216DSv(j, interfaceC16820sZ, interfaceC16820sZ2, i, 0);
        }
    }
}
