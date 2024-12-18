package X;

import androidx.compose.ui.Modifier;

/* renamed from: X.CHy, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27653CHy {
    public static final void A00(Modifier modifier, C5Tl c5Tl, int i, int i2) {
        int i3;
        c5Tl.Enr(167942937);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, modifier) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(299774876, "com.instagram.creator.achievements.modules.views.LoadingSpinner (LoadingSpinner.kt:11)");
            }
            InterfaceC1127857k A0Z = AbstractC25230BEn.A0Z();
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, modifier);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            BIR.A00(c5Tl, AbstractC25225BEi.A0P(C119645bN.A00, Modifier.A00));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(707234046);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, modifier, i2, i, 15);
        }
    }
}
