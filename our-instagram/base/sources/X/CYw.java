package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CYw {
    public static final void A01(C5Tl c5Tl, Modifier modifier, float f, float f2, int i, boolean z) {
        int i2;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(300916487);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A05(c5Tl, f);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A06(c5Tl, f2);
        }
        if ((i2 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-545742791, "com.instagram.rtc.presentation.aistatus.ThinkingStateAnimation (ThinkingStateAnimation.kt:46)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, -262702860);
            Object obj = C5UI.A00;
            C5Y1 c5y1 = (C5Y1) AbstractC25236BEt.A0W(c5Tl, A0q, obj);
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -262701445);
            if (A0q2 == obj) {
                A0q2 = AbstractC25232BEp.A0w(c5Tl, C21.A00);
            }
            InterfaceC74953Yl A0M = AbstractC25225BEi.A0M(A0K, A0q2, false);
            long j = C5XL.A00(c5Tl).A0U;
            C5UP c5up = C5V2.A01;
            float EqT = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(4.0f);
            float EqT2 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(f2);
            float EqT3 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(20.0f);
            float EqT4 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(f);
            float EqT5 = AbstractC25226BEj.A0j(c5Tl, c5up).EqT(7.0f);
            Object value = A0M.getValue();
            C27274C1z c27274C1z = C27274C1z.A00;
            if (C14360o3.A0K(value, c27274C1z)) {
                c5Tl.Eno(446759052);
                boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, c5y1, -262682003);
                Object EEc = c5Tl.EEc();
                if (A1Z || EEc == obj) {
                    EEc = new PZL(c5y1, A0M, null, 17);
                    c5Tl.FBy(EEc);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc, c5y1, false);
                C117505Tk.A0L(A0K, false);
            } else if (C14360o3.A0K(value, C22.A00)) {
                c5Tl.Eno(447234096);
                boolean A1Z2 = AbstractC25227BEk.A1Z(c5Tl, c5y1, -262666679);
                Object EEc2 = c5Tl.EEc();
                if (A1Z2 || EEc2 == obj) {
                    EEc2 = new PZL(c5y1, A0M, null, 18);
                    c5Tl.FBy(EEc2);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc2, c5y1, false);
                C117505Tk.A0L(A0K, false);
            } else if (C14360o3.A0K(value, C23.A00)) {
                c5Tl.Eno(447674544);
                boolean A1Z3 = AbstractC25227BEk.A1Z(c5Tl, c5y1, -262652471);
                Object EEc3 = c5Tl.EEc();
                if (A1Z3 || EEc3 == obj) {
                    EEc3 = new PZL(c5y1, A0M, null, 19);
                    c5Tl.FBy(EEc3);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc3, c5y1, false);
                C117505Tk.A0L(A0K, false);
            } else if (C14360o3.A0K(value, C20.A00)) {
                c5Tl.Eno(448112481);
                boolean A1Z4 = AbstractC25227BEk.A1Z(c5Tl, c5y1, -262638344);
                Object EEc4 = c5Tl.EEc();
                if (A1Z4 || EEc4 == obj) {
                    EEc4 = new PZL(c5y1, A0M, null, 20);
                    c5Tl.FBy(EEc4);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc4, c5y1, false);
                C117505Tk.A0L(A0K, false);
            } else if (value instanceof NU6) {
                c5Tl.Eno(448551348);
                boolean A1X = AbstractC25232BEp.A1X(c5Tl, c5y1, value, -262606083) | AbstractC25233BEq.A1I(i2);
                Object EEc5 = c5Tl.EEc();
                if (A1X || EEc5 == obj) {
                    EEc5 = new C50533MSm(c5y1, value, A0M, null, 16, z);
                    c5Tl.FBy(EEc5);
                }
                AbstractC25228BEl.A1K(c5Tl, A0K, EEc5, c5y1, false);
                C117505Tk.A0L(A0K, false);
            } else if (C14360o3.A0K(value, C21.A00)) {
                c5Tl.Eno(449372476);
                C117505Tk.A0L(A0K, false);
                if (z) {
                    A0M.Egh(c27274C1z);
                }
            } else {
                throw AbstractC25231BEo.A0v(c5Tl, A0K, -262682753, false);
            }
            boolean A1V = AbstractC25235BEs.A1V(c5Tl, EqT5, EqT4, AbstractC25235BEs.A1V(c5Tl, EqT, EqT3, AbstractC25226BEj.A1W(c5Tl, j, AbstractC25227BEk.A1Z(c5Tl, c5y1, -262593885)))) | c5Tl.AH1(EqT2);
            Object EEc6 = c5Tl.EEc();
            if (A1V || EEc6 == obj) {
                EEc6 = new C30178DRi(c5y1, A0M, EqT, EqT3, EqT5, EqT4, EqT2, j);
                c5Tl.FBy(EEc6);
            }
            AbstractC119665bP.A00(c5Tl, modifier, AbstractC25225BEi.A1B(A0K, EEc6, false), i2 & 14);
            if (C0fH.A02()) {
                C0fH.A00(-1036211133);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30211DSq(modifier, f, f2, i, z);
        }
    }

    public static final float A00(float f) {
        double cos;
        double d;
        double d2 = f * 2.0f * 3.141592653589793d;
        if (d2 < 3.141592653589793d) {
            cos = Math.cos(d2) * (-0.6d);
            d = 0.6d;
        } else {
            cos = Math.cos(d2) * (-0.1d);
            d = 1.1d;
        }
        return (float) (cos + d);
    }
}
