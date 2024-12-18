package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CWm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28014CWm {
    public static final boolean A01(BXF bxf, boolean z) {
        InterfaceC1131459c A01;
        CWQ cwq = bxf.A03;
        if (cwq != null && (A01 = cwq.A01()) != null) {
            C114205Dh A00 = CB5.A00(A01);
            long A06 = bxf.A06(z);
            float f = A00.A01;
            float f2 = A00.A02;
            float A012 = C119365at.A01(A06);
            if (f <= A012 && A012 <= f2) {
                float f3 = A00.A03;
                float f4 = A00.A00;
                float A02 = C119365at.A02(A06);
                if (f3 <= A02 && A02 <= f4) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static final void A00(BXF bxf, C5Tl c5Tl, BIZ biz, int i, boolean z) {
        int i2;
        c5Tl.Enr(-1344558920);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0b(c5Tl, z) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, biz);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, bxf);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(104851275, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:1000)");
            }
            int i3 = i2 & 14;
            boolean z2 = true;
            boolean A1X = AbstractC25225BEi.A1X(c5Tl, bxf, AbstractC167007dF.A1P(i3, 4));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C28775Cn7(bxf, z);
                c5Tl.FBy(EEc);
            }
            boolean AH6 = c5Tl.AH6(bxf);
            if (i3 != 4) {
                z2 = false;
            }
            boolean z3 = AH6 | z2;
            Object EEc2 = c5Tl.EEc();
            if (z3 || EEc2 == C5UI.A00) {
                EEc2 = new C28785CnH(bxf, z);
                c5Tl.FBy(EEc2);
            }
            InterfaceC30909DiM interfaceC30909DiM = (InterfaceC30909DiM) EEc2;
            boolean A04 = C5C2.A04(AbstractC25228BEl.A0G(bxf.A0K));
            C1130158n c1130158n = Modifier.A00;
            boolean AH62 = c5Tl.AH6(EEc);
            Object EEc3 = c5Tl.EEc();
            if (AH62 || EEc3 == C5UI.A00) {
                EEc3 = new D52(EEc, (InterfaceC23621Ds) null, 19, 42);
                c5Tl.FBy(EEc3);
            }
            Modifier A00 = C6KX.A00(c1130158n, EEc, (InterfaceC16620sF) EEc3);
            int i4 = i2 << 3;
            AbstractC28376Cfe.A02(interfaceC30909DiM, c5Tl, A00, biz, (i4 & 112) | (i4 & 896), 16, 0L, z, A04);
            if (C0fH.A02()) {
                C0fH.A00(1931350457);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30488DbX(i, 1, bxf, biz, z);
        }
    }
}
