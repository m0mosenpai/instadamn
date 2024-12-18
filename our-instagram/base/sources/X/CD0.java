package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CD0 {
    public static final void A00(InterfaceC16820sZ interfaceC16820sZ, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(interfaceC16820sZ, 0);
        c5Tl.Enr(-90769869);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-721034936, "com.instagram.aistudio.home.view.button.AiHomeShareButton (AiHomeShareButton.kt:16)");
            }
            C2DC A00 = C5Y7.A00(c5Tl, R.drawable.instagram_direct_pano_outline_24, 0);
            long A0L = AbstractC25226BEj.A0L(c5Tl);
            Modifier A04 = AbstractC118185Wd.A04(Modifier.A00);
            c5Tl.Eno(-1238481175);
            boolean A1S = AbstractC25228BEl.A1S(i2);
            Object EEc = c5Tl.EEc();
            if (A1S || EEc == C5UI.A00) {
                EEc = new C50157MDk(interfaceC16820sZ, 1);
                c5Tl.FBy(EEc);
            }
            AbstractC25225BEi.A1V(c5Tl, false);
            C5YS.A06(c5Tl, C5XR.A06(A04, (InterfaceC16820sZ) EEc), A00, A0L);
            if (C0fH.A02()) {
                C0fH.A00(320454674);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30499Dbi.A01(ASZ, interfaceC16820sZ, i, 13);
        }
    }
}
