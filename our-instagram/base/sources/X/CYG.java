package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CYG {
    public static final void A01(C5Tl c5Tl, C9G c9g, C28224CcU c28224CcU, MagicModPostCaptureTransform magicModPostCaptureTransform, InterfaceC16660sJ interfaceC16660sJ, InterfaceC16610sE interfaceC16610sE, int i, int i2) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        InterfaceC16610sE interfaceC16610sE2 = interfaceC16610sE;
        C9G c9g2 = c9g;
        MagicModPostCaptureTransform magicModPostCaptureTransform2 = magicModPostCaptureTransform;
        c5Tl.Enr(-279273166);
        if ((i2 & 2) != 0) {
            magicModPostCaptureTransform2 = null;
        }
        if ((i2 & 4) != 0) {
            c9g2 = null;
        }
        if ((i2 & 8) != 0) {
            interfaceC16610sE2 = CMW.A00;
        }
        if ((i2 & 16) != 0) {
            interfaceC16660sJ2 = DNA.A00;
        }
        if (C0fH.A02()) {
            C0fH.A01(1817875679, "com.instagram.creation.genai.magicmod.common.ui.MagicModImage (MagicModImage.kt:39)");
        }
        if (c28224CcU != null) {
            bitmap = c28224CcU.A00;
        } else {
            bitmap = null;
        }
        C6L5 A00 = A00(bitmap, c5Tl);
        if (c28224CcU != null) {
            bitmap2 = c28224CcU.A00;
        } else {
            bitmap2 = null;
        }
        boolean A1Y = AbstractC25227BEk.A1Y(c5Tl, bitmap2, 1800577398);
        Object EEc = c5Tl.EEc();
        if (A1Y || EEc == C5UI.A00) {
            if (c28224CcU != null && (bitmap3 = c28224CcU.A00) != null) {
                EEc = new C6LZ(bitmap3);
            } else {
                EEc = null;
            }
            c5Tl.FBy(EEc);
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C117505Tk.A0L(c117505Tk, false);
        C5UX.A04(c5Tl, c28224CcU, new PZV(c28224CcU, interfaceC16660sJ2, null, 10));
        if (EEc != null) {
            Alignment alignment = C118195Wf.A09;
            Modifier A002 = C6L3.A00(C6L2.A01(AbstractC27468CAo.A00(Modifier.A00, 0.5625f, false), CHJ.A00(c5Tl)), A00, CHJ.A00(c5Tl));
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A002);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A003, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A004);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC28307Cdt.A02(c5Tl, c9g2, C5UA.A01(c5Tl, new BWE(1, interfaceC16610sE2, C119645bN.A00, c28224CcU, magicModPostCaptureTransform2, EEc), 119686897), ((i >> 6) & 14) | 48, 0);
            c5Tl.ASW();
        }
        if (C0fH.A02()) {
            C0fH.A00(2101790434);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DV5(interfaceC16660sJ2, magicModPostCaptureTransform2, c28224CcU, interfaceC16610sE2, c9g2, i, i2, 9);
        }
    }

    public static final C6L5 A00(Bitmap bitmap, C5Tl c5Tl) {
        List A1J;
        long A00;
        long A002;
        if (AbstractC25227BEk.A1U(c5Tl, -32844941)) {
            C0fH.A01(757658907, "com.instagram.creation.genai.magicmod.common.ui.rememberBitmapGradientBackgroundBrush (MagicModImage.kt:76)");
        }
        if (bitmap != null) {
            BackgroundGradientColors A01 = AbstractC14570oV.A01(bitmap, C05F.A00);
            A1J = AbstractC25232BEp.A1G(AbstractC25227BEk.A0O(A01.A01), A01.A00 << 32);
            A00 = AbstractC119395aw.A00(0.0f, 0.0f);
            A002 = AbstractC119395aw.A00(0.0f, Float.POSITIVE_INFINITY);
        } else {
            A1J = AbstractC166987dD.A1J(AbstractC25225BEi.A0S(C5XL.A00(c5Tl).A11));
            A00 = AbstractC119395aw.A00(0.0f, 0.0f);
            A002 = AbstractC119395aw.A00(Float.POSITIVE_INFINITY, 0.0f);
        }
        C25766Ba5 A003 = C6L6.A00(A1J, A00, A002);
        if (C0fH.A02()) {
            C0fH.A00(-504676036);
        }
        AbstractC25225BEi.A1T(c5Tl);
        return A003;
    }
}
