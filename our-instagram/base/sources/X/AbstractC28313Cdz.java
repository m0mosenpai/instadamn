package X;

import androidx.compose.ui.Modifier;
import com.facebook.common.dextricks.DalvikInternals;
import java.util.List;

/* renamed from: X.Cdz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28313Cdz {
    public static final void A00(C5Tl c5Tl, C6C7 c6c7, String str, String str2, String str3, String str4, int i) {
        int i2;
        c5Tl.Enr(1772771777);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c6c7, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, str4);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(214384360, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AddLinkToString (AvoidedTopicsFragment.kt:217)");
            }
            if (AbstractC001900j.A0a(str, str2, false)) {
                C14360o3.A0B(str, 0);
                int A0E = AbstractC25230BEn.A0E(str, str2);
                int A04 = AbstractC25226BEj.A04(str2, A0E);
                c6c7.A06(new C5W3(null, null, null, C5W5.A03, null, 65530, AbstractC25226BEj.A0C(c5Tl), 0L, 0L), A0E, A04);
                c6c7.A0A(str3, str4, A0E, A04);
            }
            if (C0fH.A02()) {
                C0fH.A00(-1462190913);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTK(c6c7, str, str2, str3, str4, i);
        }
    }

    public static final void A01(C5Tl c5Tl, C45116Jxl c45116Jxl, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, int i) {
        int i2;
        c5Tl.Enr(899390154);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c45116Jxl) | i;
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
                C0fH.A01(1288919493, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicItem (AvoidedTopicsFragment.kt:185)");
            }
            C1130158n c1130158n = Modifier.A00;
            boolean A1X = AbstractC25226BEj.A1X(c5Tl, c45116Jxl, AbstractC25233BEq.A1P(c5Tl, 843576566, i2));
            Object EEc = c5Tl.EEc();
            if (A1X || EEc == C5UI.A00) {
                EEc = C29894DGi.A00(c5Tl, c45116Jxl, interfaceC16660sJ, 37);
            }
            AbstractC25225BEi.A1T(c5Tl);
            CIJ.A00(c5Tl, null, C5XR.A06(c1130158n, (InterfaceC16820sZ) EEc), C30485DbU.A00(c5Tl, interfaceC16660sJ2, c45116Jxl, 47, -987767371), C5UA.A01(c5Tl, C30481DbQ.A00(c45116Jxl, 42), -1671997676), 3456, 2);
            if (C0fH.A02()) {
                C0fH.A00(-291642362);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(c45116Jxl, interfaceC16660sJ2, interfaceC16660sJ, i, 28);
        }
    }

    public static final void A02(C5Tl c5Tl, C6R c6r, List list, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16660sJ interfaceC16660sJ2, InterfaceC16660sJ interfaceC16660sJ3, int i) {
        int i2;
        c5Tl.Enr(-1064128814);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, list) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0J(c5Tl, interfaceC16660sJ2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16820sZ);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16660sJ3);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0W(c5Tl, c6r);
        }
        if ((74899 & i2) == 74898 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1436877765, "com.instagram.creator.agent.settings.avoidedtopics.fragment.AvoidedTopicsContent (AvoidedTopicsFragment.kt:166)");
            }
            boolean z = true;
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, list, 1301688770) | AbstractC167007dF.A1P(i2 & 112, 32) | AbstractC167007dF.A1P(i2 & 896, 256) | AbstractC167007dF.A1P(i2 & 7168, C3OO.FLAG_MOVED) | AbstractC25234BEr.A1W(i2);
            if ((i2 & 458752) != 131072) {
                z = false;
            }
            boolean z2 = A1Z | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = new C43752JWo(7, list, interfaceC16660sJ2, interfaceC16660sJ3, interfaceC16660sJ, c6r, interfaceC16820sZ);
                c5Tl.FBy(EEc);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A09(c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-954843652);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV8(interfaceC16660sJ, list, interfaceC16660sJ3, interfaceC16820sZ, interfaceC16660sJ2, c6r, i, 4);
        }
    }
}
