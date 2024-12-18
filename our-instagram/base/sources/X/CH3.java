package X;

import android.content.Context;

/* loaded from: classes5.dex */
public abstract class CH3 {
    public static final void A00(boolean z, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(1179702144);
        if ((i2 & 6) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1343629870, "com.instagram.creation.genai.common.ui.KeyFrameView (KeyFrameView.kt:12)");
            }
            Context A0K = AbstractC25228BEl.A0K(c5Tl);
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 1877157489);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = C68U.A00(A0K, i);
                c5Tl.FBy(A0q);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, A0q, 1877161116) | AbstractC25231BEo.A1K(i3);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = new DHP(9, A0q, z);
                c5Tl.FBy(EEc);
            }
            AbstractC28450Cgz.A02(c5Tl, null, AbstractC25225BEi.A1B(c117505Tk, EEc, false), null, 0, 6);
            if (C0fH.A02()) {
                C0fH.A00(-1918052139);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DS2(i, z, i2);
        }
    }
}
