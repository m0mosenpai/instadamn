package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CCk, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27514CCk {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, interfaceC16820sZ, interfaceC16820sZ2);
        c5Tl.Enr(-698927442);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, interfaceC16820sZ) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ2);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(2093692779, "com.instagram.aistudio.editor.AiImproveResponseOptionsScreen (AiImproveResponseOptionsScreen.kt:19)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A00 = C30711Df9.A00(AbstractC25226BEj.A0T(c1130158n), C5XU.A00, 0);
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A00);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            boolean A1O = AbstractC25233BEq.A1O(c5Tl, -705686997, i2);
            Object EEc = c5Tl.EEc();
            if (A1O || EEc == C5UI.A00) {
                EEc = C29907DGv.A00(c5Tl, interfaceC16820sZ, 7);
            }
            AbstractC25705BXp.A02(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R), null, C5Y7.A00(c5Tl, R.drawable.instagram_comment_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131952671), AbstractC136736Hc.A00(c5Tl, 2131952670), interfaceC16820sZ, 0, (i2 << 12) & 57344, 114636, 0L, false);
            boolean A1Y = AbstractC25234BEr.A1Y(c5Tl, -705674481, i2);
            Object EEc2 = c5Tl.EEc();
            if (A1Y || EEc2 == C5UI.A00) {
                EEc2 = C29907DGv.A01(interfaceC16820sZ2, 8);
                c5Tl.FBy(EEc2);
            }
            AbstractC25705BXp.A02(c5Tl, C5XR.A05(c1130158n, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc2, false), A1R), null, C5Y7.A00(c5Tl, R.drawable.instagram_document_lined_pano_outline_24, 0), null, AbstractC136736Hc.A00(c5Tl, 2131952673), AbstractC136736Hc.A00(c5Tl, 2131952672), interfaceC16820sZ2, 0, (i2 << 9) & 57344, 114636, 0L, false);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1003664278);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30507Dbq(interfaceC16820sZ, interfaceC16820sZ2, i, 11);
        }
    }
}
