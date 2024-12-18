package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CK8 {
    public static final void A00(String str, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(1676781912);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(364554104, "com.instagram.schools.management.components.BottomSheetHeader (BottomSheetHeader.kt:16)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0b, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A08(c5Tl, AbstractC25227BEk.A0H(c1130158n, 12.0f).Eq3(AbstractC25225BEi.A0P(C119645bN.A00, c1130158n)), AbstractC25226BEj.A0d(c5Tl), str, i2 & 14);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1194922209);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30500Dbj.A01(ASZ, str, i, 14);
        }
    }
}
