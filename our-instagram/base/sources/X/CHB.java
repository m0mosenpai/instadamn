package X;

import android.graphics.Bitmap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* loaded from: classes5.dex */
public abstract class CHB {
    public static final void A00(C5Tl c5Tl, InterfaceC137546La interfaceC137546La, InterfaceC137546La interfaceC137546La2, InterfaceC137546La interfaceC137546La3, C9G c9g, MagicModPostCaptureTransform magicModPostCaptureTransform, C27866CQd c27866CQd, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z, boolean z2, boolean z3) {
        C9G c9g2 = c9g;
        InterfaceC137546La interfaceC137546La4 = interfaceC137546La3;
        C14360o3.A0B(interfaceC137546La, 0);
        c5Tl.Enr(-1831176547);
        if ((i2 & 64) != 0) {
            interfaceC137546La4 = null;
        }
        if ((i2 & 128) != 0) {
            c9g2 = null;
        }
        if (C0fH.A02()) {
            C0fH.A01(1255951520, "com.instagram.creation.genai.magicmod.common.ui.MagicModBackdropSegmentedImage (MagicModBackdropSegmentedImage.kt:48)");
        }
        Bitmap bitmap = ((C6LZ) interfaceC137546La).A00;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        C6L5 A00 = CYG.A00(C62Z.A00(interfaceC137546La), c5Tl);
        Alignment alignment = C118195Wf.A09;
        Modifier modifier = Modifier.A00;
        Modifier A002 = AbstractC27468CAo.A00(modifier, 0.5625f, false);
        c5Tl.Eno(-1737661465);
        if (!z) {
            modifier = C6L3.A00(modifier, A00, CHJ.A00(c5Tl));
        }
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        Modifier Eq3 = C6L2.A01(AbstractC25227BEk.A0G(c117505Tk, A002, modifier), CHJ.A00(c5Tl)).Eq3(AbstractC118185Wd.A01);
        InterfaceC1127857k A003 = C5XX.A00(alignment, false);
        int A004 = C5X2.A00(c5Tl);
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, Eq3);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A003, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A004)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A004);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        AbstractC28307Cdt.A02(c5Tl, c9g2, C5UA.A01(c5Tl, new DWM(magicModPostCaptureTransform, interfaceC16660sJ, interfaceC137546La, interfaceC137546La2, c27866CQd, width, height, 1, z, z3), 915476601), ((i >> 21) & 14) | 48, 0);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(237318674);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DXU(interfaceC137546La, interfaceC137546La2, c27866CQd, interfaceC16660sJ, interfaceC137546La4, c9g2, magicModPostCaptureTransform, i, i2, 0, z, z2, z3);
        }
    }
}
