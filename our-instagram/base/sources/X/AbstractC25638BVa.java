package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.BVa, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25638BVa {
    public static final void A00(C5Tl c5Tl, UserSession userSession, String str, InterfaceC16620sF interfaceC16620sF, int i, int i2, boolean z) {
        int i3;
        boolean z2 = z;
        C14360o3.A0B(str, 0);
        AbstractC167017dG.A1Q(userSession, interfaceC16620sF);
        c5Tl.Enr(107645343);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, userSession);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= AbstractC25232BEp.A0K(c5Tl, interfaceC16620sF);
        }
        if ((i3 & 1171) == 1170 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                z2 = false;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1982059946, "com.instagram.barcelona.bds.core.BdsRoot (BdsRoot.kt:30)");
            }
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -1972464701, i3);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = new C25639BVb(str);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            if (AbstractC25233BEq.A1Y(c5Tl, new DS9(2, interfaceC16620sF, z2), new C117685Ud[]{C5VZ.A00.A02(EEc), AbstractC117915Vb.A00.A02(EEc), AbstractC117935Vd.A00.A02(userSession), C5VX.A00.A02(userSession)}, -1373397793)) {
                C0fH.A00(-1216885954);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DUP(userSession, interfaceC16620sF, str, i, i2, 0, z2);
        }
    }
}
