package X;

import androidx.compose.foundation.lazy.LazyListState;

/* renamed from: X.CYi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28054CYi {
    public static final void A00(LazyListState lazyListState, C5Tl c5Tl, C51748MtX c51748MtX, C44532Jmc c44532Jmc, int i) {
        int i2;
        boolean A1b = AbstractC25233BEq.A1b(lazyListState, c44532Jmc, c51748MtX);
        c5Tl.Enr(-701351235);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, lazyListState) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c44532Jmc);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, c51748MtX);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(374108466, "com.instagram.direct.securityalert.setting.ui.Success (SecurityAlertSettingView.kt:61)");
            }
            Object A19 = AbstractC25226BEj.A19(c5Tl);
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, A19, AbstractC25233BEq.A1W(c5Tl, c44532Jmc, c51748MtX, 411725594));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = new C50364MLq(20, c51748MtX, A19, c44532Jmc);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C6IS.A04(lazyListState, c5Tl, null, (InterfaceC16660sJ) EEc, ((i2 << 3) & 112) | 12582912, 125, A1b);
            if (C0fH.A02()) {
                C0fH.A00(-683961085);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c44532Jmc, lazyListState, c51748MtX, i, 46);
        }
    }

    public static final void A01(C5Tl c5Tl, C44532Jmc c44532Jmc, int i) {
        int i2;
        C14360o3.A0B(c44532Jmc, 0);
        c5Tl.Enr(759299125);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c44532Jmc) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-470635741, "com.instagram.direct.securityalert.setting.ui.SecurityAlertSettingScreen (SecurityAlertSettingView.kt:43)");
            }
            InterfaceC74963Ym A02 = C6IB.A02(c5Tl, c44532Jmc.A04, 0);
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            Object obj = ((C51760Mtj) A02.getValue()).A02;
            if (obj != C05F.A00 && obj != C05F.A01 && obj != C05F.A0C) {
                if (obj == C05F.A0N) {
                    C51748MtX c51748MtX = (C51748MtX) ((C51760Mtj) A02.getValue()).A00;
                    if (c51748MtX != null) {
                        A00(A0E, c5Tl, c51748MtX, c44532Jmc, (i2 << 3) & 112);
                    } else {
                        throw AbstractC166997dE.A0g();
                    }
                } else {
                    throw B4Z.A00();
                }
            }
            if (C0fH.A02()) {
                C0fH.A00(1476163440);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, c44532Jmc, i, 14);
        }
    }
}
