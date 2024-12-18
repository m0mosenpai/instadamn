package X;

import androidx.compose.foundation.lazy.LazyListState;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CYT {
    public static final void A00(C5Tl c5Tl, C26080Bg9 c26080Bg9, String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        c5Tl.Enr(-1195824134);
        if ((i & 48) == 0) {
            i2 = AbstractC25232BEp.A0S(c5Tl, c26080Bg9) | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ2);
        }
        if ((i2 & 9361) == 9360 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2034632737, "com.instagram.creator.agent.settings.keyword.KeywordLinkScreen (KeywordResponsesListFragment.kt:140)");
            }
            LazyListState A00 = C6IE.A00(c5Tl, 0, 0, 0, 3);
            c5Tl.Eno(1981688739);
            boolean z = true;
            boolean A1P = AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = C29887DGb.A00(interfaceC16820sZ, 10);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            BGP.A00(A00, c5Tl, (InterfaceC16820sZ) EEc);
            C1333560c A0P = AbstractC25229BEm.A0P(16.0f);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, 1981695720, i2) | AbstractC25233BEq.A1J(i2);
            if ((i2 & 57344) != 16384) {
                z = false;
            }
            boolean z2 = A1Y | z;
            Object EEc2 = c5Tl.EEc();
            if (z2 || EEc2 == C5UI.A00) {
                EEc2 = C30172DRc.A00(c5Tl, interfaceC16660sJ, interfaceC16660sJ2, c26080Bg9, 38);
            }
            C6IS.A03(A0P, A00, c5Tl, null, AbstractC25225BEi.A1B(A0K, EEc2, false), 12583296, 121, true);
            if (C0fH.A02()) {
                C0fH.A00(1222336918);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUT(interfaceC16660sJ2, interfaceC16820sZ, c26080Bg9, interfaceC16660sJ, str, i, 3);
        }
    }

    public static final void A01(C5Tl c5Tl, QJ0 qj0, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        c5Tl.Enr(-1142473146);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, qj0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i2 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2044629244, "com.instagram.creator.agent.settings.keyword.KeywordLinkRow (KeywordResponsesListFragment.kt:222)");
            }
            CIJ.A00(c5Tl, null, null, C5UA.A01(c5Tl, new DSA(0, qj0, interfaceC16660sJ2), 1537006395), C5UA.A01(c5Tl, new DSA(1, qj0, interfaceC16660sJ), -565447108), 3456, 3);
            if (C0fH.A02()) {
                C0fH.A00(-364015652);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(interfaceC16660sJ2, qj0, interfaceC16660sJ, i, 33);
        }
    }
}
