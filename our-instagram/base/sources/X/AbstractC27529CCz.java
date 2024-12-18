package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.Constants;
import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.CCz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27529CCz {
    public static final void A00(C5Tl c5Tl, C26063Bfr c26063Bfr, C28370CfW c28370CfW, C7F6 c7f6, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16820sZ interfaceC16820sZ5, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16620sF interfaceC16620sF, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        int i3;
        int i4;
        c5Tl.Enr(1586146372);
        if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0H(c5Tl, c26063Bfr) | i;
        } else {
            i3 = i;
        }
        int i5 = 16;
        if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, c28370CfW);
        }
        if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0J(c5Tl, c7f6);
        }
        if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16610sE);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i3 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ);
        }
        if ((i & 196608) == 0) {
            i3 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((i & 1572864) == 0) {
            i3 |= AbstractC25232BEp.A0N(c5Tl, interfaceC16820sZ2);
        }
        if ((i & 12582912) == 0) {
            i3 |= AbstractC25232BEp.A0O(c5Tl, interfaceC16820sZ3);
        }
        if ((i & 100663296) == 0) {
            i3 |= AbstractC25232BEp.A0P(c5Tl, interfaceC16820sZ4);
        }
        if ((i & 805306368) == 0) {
            i3 |= AbstractC25232BEp.A0Q(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | AbstractC25231BEo.A0A(c5Tl, interfaceC16820sZ5);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (c5Tl.AH6(interfaceC16660sJ2)) {
                i5 = 32;
            }
            i4 |= i5;
        }
        if ((306783379 & i3) == 306783378 && (i4 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(946738738, "com.instagram.aistudio.home.view.Layout (AiAgentsHomeFragment.kt:313)");
            }
            LazyListState A0E = AbstractC25227BEk.A0E(c5Tl);
            C25246BFf A00 = BGQ.A00(null, c5Tl, interfaceC16820sZ5, 0.0f, (i4 << 3) & 112, 60, c26063Bfr.A05);
            Object A11 = AbstractC25225BEi.A11(c5Tl);
            BGU.A00(A0E, c5Tl, 895683776, 0);
            Modifier A002 = BGR.A00(AbstractC25232BEp.A0y(c5Tl, Modifier.A00), A00);
            boolean z = true;
            boolean A1U = AbstractC25228BEl.A1U(c5Tl, c28370CfW, AbstractC25233BEq.A1W(c5Tl, c26063Bfr, A11, -1011248319), AbstractC167007dF.A1P(458752 & i3, Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP)) | AbstractC25233BEq.A1K(i3) | AbstractC25234BEr.A1W(i3) | AbstractC25233BEq.A1M(i3) | AbstractC25234BEr.A1V(i3) | AbstractC25233BEq.A1N(1879048192, i3) | AbstractC25233BEq.A1I(i4);
            Object EEc = c5Tl.EEc();
            if (A1U || EEc == C5UI.A00) {
                EEc = new C25081B8c(c26063Bfr, A11, interfaceC16820sZ, c28370CfW, interfaceC16610sE, interfaceC16660sJ, interfaceC16820sZ4, interfaceC16820sZ3, interfaceC16620sF, interfaceC16660sJ2, 0);
                c5Tl.FBy(EEc);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            C6IS.A04(A0E, c5Tl, A002, (InterfaceC16660sJ) EEc, 0, 252, false);
            if (AbstractC166997dE.A1Z(c26063Bfr.A01, true)) {
                c5Tl.Eno(-1011200837);
                if ((i3 & 3670016) != 1048576) {
                    z = false;
                }
                Object EEc2 = c5Tl.EEc();
                if (z || EEc2 == C5UI.A00) {
                    EEc2 = DGX.A00(interfaceC16820sZ2, 35);
                    c5Tl.FBy(EEc2);
                }
                BGP.A00(A0E, c5Tl, AbstractC25225BEi.A1A(A0K, EEc2, false));
            }
            if (C0fH.A02()) {
                C0fH.A00(-698849338);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DY2(c26063Bfr, c28370CfW, c7f6, interfaceC16610sE, interfaceC16660sJ, interfaceC16820sZ, interfaceC16820sZ2, interfaceC16820sZ3, interfaceC16820sZ4, interfaceC16620sF, interfaceC16820sZ5, interfaceC16660sJ2, i, i2, 1);
        }
    }
}
