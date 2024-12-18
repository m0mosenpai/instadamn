package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;

/* loaded from: classes5.dex */
public abstract class CHL {
    public static final void A00(C5Tl c5Tl, MagicModPostCaptureTransform magicModPostCaptureTransform, InterfaceC16620sF interfaceC16620sF, int i) {
        C14360o3.A0B(interfaceC16620sF, 1);
        if (AbstractC25235BEs.A1W(c5Tl, 1904811584)) {
            C0fH.A01(1022789424, "com.instagram.creation.genai.magicmod.common.ui.MagicModTransformationContainer (MagicModTransformationContainer.kt:18)");
        }
        C1130158n c1130158n = Modifier.A00;
        Modifier A0U = AbstractC25226BEj.A0U(c1130158n);
        Alignment alignment = C118195Wf.A09;
        InterfaceC1127857k A00 = C5XX.A00(alignment, false);
        int A002 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, A0U);
        InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
        InterfaceC16620sF interfaceC16620sF2 = C5X8.A03;
        InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF2);
        InterfaceC16620sF interfaceC16620sF3 = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A002);
        }
        InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
        Modifier A0Y = AbstractC25230BEn.A0Y(AbstractC27468CAo.A00(c1130158n, 0.5625f, false), new C57744PjX(magicModPostCaptureTransform, 15));
        InterfaceC1127857k A003 = C5XX.A00(alignment, false);
        int A004 = C5X2.A00(c5Tl);
        C59P A042 = C117505Tk.A04(c117505Tk);
        Modifier A012 = C5X3.A01(c5Tl, A0Y);
        AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
        C5XJ.A00(c5Tl, A003, interfaceC16620sF2);
        if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF3, A004);
        }
        C5XJ.A00(c5Tl, A012, A1K);
        AbstractC25231BEo.A14(c5Tl, interfaceC16620sF, i >> 3);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(-2120874888);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, magicModPostCaptureTransform, interfaceC16620sF, i, 44);
        }
    }
}
