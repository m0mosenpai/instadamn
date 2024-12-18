package X;

import com.facebook.common.dextricks.DalvikInternals;

/* renamed from: X.BIt, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25324BIt {
    public static final void A00(C5Tl c5Tl, AbstractC59962oe abstractC59962oe, InterfaceC16620sF interfaceC16620sF, int i, boolean z, boolean z2, boolean z3) {
        int i2;
        C14360o3.A0B(abstractC59962oe, 0);
        c5Tl.Enr(1791188404);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, abstractC59962oe) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0c(c5Tl, z);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0d(c5Tl, z2);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0e(c5Tl, z3);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0L(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 9363) == 9362 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1560857942, "com.instagram.compose.fragment.IgRoot (IgRoot.kt:17)");
            }
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 647723673);
            if (A0q == C5UI.A00) {
                A0q = C023409i.A0A.A06(abstractC59962oe.requireArguments());
                c5Tl.FBy(A0q);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            int i3 = i2 << 3;
            C5VW.A03(c5Tl, (AbstractC12990ll) A0q, abstractC59962oe.getModuleName(), interfaceC16620sF, AbstractC25233BEq.A01(i3 & 896, i3 & 7168, i3), 0, z, z2, z3);
            if (C0fH.A02()) {
                C0fH.A00(277342122);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DTB(abstractC59962oe, interfaceC16620sF, i, z, z2, z3);
        }
    }
}
