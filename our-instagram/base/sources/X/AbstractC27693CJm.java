package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.List;

/* renamed from: X.CJm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27693CJm {
    public static final void A00(C5Tl c5Tl, C27062Bwl c27062Bwl, List list, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i, boolean z, boolean z2) {
        int i2;
        c5Tl.Enr(695204399);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, c27062Bwl);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16660sJ2);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ3);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0g(c5Tl, z);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0h(c5Tl, z2);
        }
        if ((i2 & 599187) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1136804371, "com.instagram.profile.slideoutmenu.fragment.ProfileOptionsMenu (ProfileMenuFragment.kt:126)");
            }
            boolean z3 = false;
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, A00, -525969185) | AbstractC25231BEo.A1N(i2, 57344, Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            Object EEc = c5Tl.EEc();
            if (A1Y || EEc == C5UI.A00) {
                EEc = new PZX(A00, interfaceC16660sJ3, (InterfaceC23621Ds) null, 36);
                c5Tl.FBy(EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C117505Tk.A0L(c117505Tk, false);
            C5UX.A04(c5Tl, A00, (InterfaceC16620sF) EEc);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, -525961418) | AbstractC25233BEq.A1L(i2) | AbstractC25234BEr.A1T(i2) | AbstractC25233BEq.A1J(i2);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            }
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c27062Bwl, A1Z, z3);
            Object EEc2 = c5Tl.EEc();
            if (A1U || EEc2 == C5UI.A00) {
                EEc2 = new DI7(list, c27062Bwl, interfaceC16660sJ, interfaceC16660sJ2, 1, z, z2);
                c5Tl.FBy(EEc2);
            }
            C6IS.A04(A00, c5Tl, null, AbstractC25225BEi.A1B(c117505Tk, EEc2, false), 0, 253, false);
            if (C0fH.A02()) {
                C0fH.A00(883791968);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30268DUv(c27062Bwl, list, interfaceC16660sJ, interfaceC16660sJ2, interfaceC16660sJ3, i, z, z2);
        }
    }
}
