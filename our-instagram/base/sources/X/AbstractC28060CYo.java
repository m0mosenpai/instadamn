package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CYo, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28060CYo {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        int i3;
        C2DC A00;
        long A02;
        Modifier modifier2 = modifier;
        c5Tl.Enr(-368739020);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, interfaceC16660sJ) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-522090636, "com.instagram.opal.impl.ui.AudienceSelectButton (OpalAudienceSelectorFragment.kt:444)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 723168254);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q, obj);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C5XQ A0W = AbstractC25225BEi.A0W(1);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, 723176454, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == obj) {
                EEc = AbstractC25229BEm.A0v(c5Tl, interfaceC16660sJ, 35);
            }
            Modifier A002 = AbstractC27476CAx.A00(null, c5xo, modifier2, A0W, AbstractC25225BEi.A1B(c117505Tk, EEc, false), z, true);
            if (z) {
                c5Tl.Eno(943684188);
                A00 = C5Y7.A00(c5Tl, R.drawable.instagram_circle_check_pano_filled_24, 0);
                A02 = AbstractC25226BEj.A0N(c5Tl);
            } else {
                c5Tl.Eno(943926856);
                A00 = C5Y7.A00(c5Tl, R.drawable.checkbox, 0);
                A02 = C5AC.A02(AbstractC1132459m.A0K[(int) (r0 & 63)], C1132359l.A03(r0), C1132359l.A02(r0), C1132359l.A01(AbstractC25226BEj.A0G(c5Tl)), 0.2f);
            }
            C5YS.A06(c5Tl, A002, A00, A02);
            if (AbstractC25227BEk.A1b(c117505Tk, false)) {
                C0fH.A00(267122871);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTV(i, i2, 10, modifier2, interfaceC16660sJ, z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:77:0x0254, code lost:
    
        if (r47 == X.C74.A04) goto L82;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:100:0x0317. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A01(X.C5Tl r45, X.C74 r46, X.C74 r47, java.lang.String r48, java.util.List r49, X.InterfaceC16820sZ r50, X.InterfaceC16660sJ r51, X.InterfaceC16660sJ r52, X.InterfaceC16660sJ r53, int r54, int r55, boolean r56) {
        /*
            Method dump skipped, instructions count: 894
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC28060CYo.A01(X.5Tl, X.C74, X.C74, java.lang.String, java.util.List, X.0sZ, X.0sJ, X.0sJ, X.0sJ, int, int, boolean):void");
    }
}
