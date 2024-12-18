package X;

/* loaded from: classes5.dex */
public abstract class CCZ {
    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i) {
        int i2;
        C14360o3.A0B(interfaceC16620sF, 1);
        c5Tl.Enr(-1693718920);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c5Hc) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16620sF);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1604109154, "com.instagram.aistudio.editor.AiCapabilitiesScreen (AiCapabilitiesScreen.kt:22)");
            }
            boolean A1K = AbstractC25231BEo.A1K(i2) | AbstractC25227BEk.A1Z(c5Tl, c5Hc, -104343684);
            Object EEc = c5Tl.EEc();
            if (A1K || EEc == C5UI.A00) {
                EEc = AbstractC25230BEn.A12(c5Tl, c5Hc, interfaceC16620sF, 15);
            }
            AbstractC25228BEl.A1O(c5Tl);
            C6IS.A08(c5Tl, (InterfaceC16660sJ) EEc);
            if (C0fH.A02()) {
                C0fH.A00(-1504907826);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16620sF, c5Hc, i, 8);
        }
    }
}
