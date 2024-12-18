package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CGQ {
    public static final void A00(C5Tl c5Tl, String str, int i, int i2) {
        int i3;
        c5Tl.Enr(1999360640);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                str = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(266643886, "com.instagram.compose.ui.dialog.IgProgressDialog (IgProgressDialog.kt:13)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -1035278102);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new C6WQ(A0K, true);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0J = AbstractC25225BEi.A0J(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A0q, AbstractC25233BEq.A1O(c5Tl, -1035276356, i3));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == obj) {
                EEc = AbstractC25230BEn.A14(c5Tl, A0q, str, 20);
            }
            C117505Tk.A0I(A0J);
            C5UX.A05(c5Tl, (InterfaceC16820sZ) EEc);
            C0eB c0eB = C0eB.A00;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A0q, -1035272690);
            Object EEc2 = c5Tl.EEc();
            if (A1Z || EEc2 == obj) {
                EEc2 = C30185DRq.A01(c5Tl, A0q, 43);
            }
            C117505Tk.A0I(A0J);
            C5UX.A03(c5Tl, c0eB, (InterfaceC16660sJ) EEc2);
            if (C0fH.A02()) {
                C0fH.A00(2126573339);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSW(i2, str, i, 0);
        }
    }
}
