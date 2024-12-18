package X;

import android.view.accessibility.AccessibilityManager;

/* renamed from: X.BVf, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC25643BVf {
    public static final C5UP A00 = new C5UQ(C25642BVe.A00);

    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, int i) {
        int i2;
        C14360o3.A0B(interfaceC16620sF, 0);
        c5Tl.Enr(395577785);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16620sF) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-399677750, "com.instagram.barcelona.bds.core.BdsAccessibilityState (BdsAccessibilityState.kt:18)");
            }
            Object systemService = AbstractC25228BEl.A0K(c5Tl).getSystemService("accessibility");
            C14360o3.A0C(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
            AccessibilityManager accessibilityManager = (AccessibilityManager) systemService;
            Object A0q = AbstractC25227BEk.A0q(c5Tl, 507032067);
            Object obj = C5UI.A00;
            if (A0q == obj) {
                A0q = new C25644BVg(accessibilityManager);
                c5Tl.FBy(A0q);
            }
            C117505Tk A0K = AbstractC25225BEi.A0K(c5Tl, false);
            boolean A1Z = AbstractC25227BEk.A1Z(c5Tl, accessibilityManager, 507035475);
            Object EEc = c5Tl.EEc();
            if (A1Z || EEc == obj) {
                EEc = AbstractC25230BEn.A12(c5Tl, accessibilityManager, A0q, 39);
            }
            AbstractC25228BEl.A1J(c5Tl, A0K, EEc, accessibilityManager, false);
            AbstractC117695Ue.A00(c5Tl, A00.A02(A0q), interfaceC16620sF, ((i2 << 3) & 112) | 8);
            if (C0fH.A02()) {
                C0fH.A00(-670713530);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16620sF, i, 19);
        }
    }
}
