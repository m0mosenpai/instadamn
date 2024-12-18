package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cfq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28387Cfq {
    public static final void A00(C5Tl c5Tl, Modifier modifier, int i, long j) {
        int i2;
        int i3;
        C14360o3.A0B(modifier, 0);
        c5Tl.Enr(-198695447);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0E(c5Tl, j);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-2055387440, "com.instagram.compose.igds.components.segmentedtabs.Indicator (IgdsSegmentedTab.kt:162)");
            }
            if (C14640oc.A0E()) {
                c5Tl.Eno(2094337534);
                i3 = R.dimen.abc_control_corner_material;
            } else {
                c5Tl.Eno(2094421699);
                i3 = R.dimen.account_recs_header_image_margin;
            }
            float A02 = C5XT.A02(c5Tl, i3);
            AbstractC25225BEi.A1V(c5Tl, false);
            AbstractC25229BEm.A16(c5Tl, AbstractC118185Wd.A08(modifier, A02), j);
            if (C0fH.A02()) {
                C0fH.A00(-1220332711);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DST(j, modifier, i, 1);
        }
    }

    public static final void A02(C5Tl c5Tl, String str, int i, int i2, int i3) {
        int i4;
        String str2 = str;
        c5Tl.Enr(583368074);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 14) == 0) {
            i4 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 112) == 0) {
            i4 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i4 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i5 != 0) {
                str2 = null;
            }
            if (C0fH.A02()) {
                C0fH.A01(-477726937, "com.instagram.compose.igds.components.segmentedtabs.TabIcon (IgdsSegmentedTab.kt:147)");
            }
            C5YS.A08(c5Tl, AbstractC118185Wd.A0I(Modifier.A00, Float.NaN, Float.NaN, 24.0f, 24.0f), AbstractC25226BEj.A0Y(c5Tl, i4, i), str2, (i4 & 112) | 392, ((C1132359l) c5Tl.AJX(C6L9.A00)).A00);
            if (C0fH.A02()) {
                C0fH.A00(187425340);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DSI(i, str2, i2, i3);
        }
    }

    public static final void A01(C5Tl c5Tl, Modifier modifier, C26038BfR c26038BfR, int i, int i2, long j, boolean z) {
        int i3;
        boolean z2;
        long A0M;
        boolean z3 = z;
        Modifier modifier2 = modifier;
        C14360o3.A0B(c26038BfR, 2);
        c5Tl.Enr(1074287620);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= AbstractC25232BEp.A0c(c5Tl, z3);
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, c26038BfR);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= AbstractC25232BEp.A0G(c5Tl, j);
        }
        if ((i3 & 5851) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (i5 != 0) {
                z3 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(1055132609, "com.instagram.compose.igds.components.segmentedtabs.IgdsSegmentedTabImpl (IgdsSegmentedTab.kt:104)");
            }
            if (AbstractC25227BEk.A1U(c5Tl, 884371092)) {
                C0fH.A01(-580563335, "com.instagram.compose.igds.components.segmentedtabs.rememberContentColor (IgdsSegmentedTab.kt:183)");
            }
            if (z3) {
                c5Tl.Eno(-299114751);
                z2 = false;
                A0M = AbstractC25226BEj.A0G(c5Tl);
            } else {
                c5Tl.Eno(-299061121);
                z2 = false;
                A0M = AbstractC25226BEj.A0M(c5Tl);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, z2);
            InterfaceC74953Yl A00 = C5WZ.A00(c5Tl, AbstractC25225BEi.A0S(A0M));
            if (C0fH.A02()) {
                C0fH.A00(1668102199);
            }
            C117505Tk.A0L(A0K, z2);
            AbstractC25230BEn.A17(c5Tl, AbstractC25229BEm.A0S(C6L9.A00, ((C1132359l) A00.getValue()).A00), new DSV(j, modifier2, c26038BfR, 5), 569338052);
            if (C0fH.A02()) {
                C0fH.A00(-49905430);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUD(modifier2, c26038BfR, i, i2, 0, j, z3);
        }
    }

    public static final void A03(String str, C5Tl c5Tl, int i) {
        int i2;
        c5Tl.Enr(1463914649);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1047875626, "com.instagram.compose.igds.components.segmentedtabs.TabText (IgdsSegmentedTab.kt:142)");
            }
            C5WR.A0k(c5Tl, null, str, i2 & 14, 32766);
            if (C0fH.A02()) {
                C0fH.A00(-1789329222);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 3);
        }
    }
}
