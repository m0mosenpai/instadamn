package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CXH {
    public static final void A01(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i) {
        int i2;
        AbstractC167007dF.A1K(c5Hc, interfaceC16620sF);
        c5Tl.Enr(705353642);
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
                C0fH.A01(1026444266, "com.instagram.aistudio.editor.AiCrossAppDiscoverabilityScreen (AiCrossAppDiscoverabilityScreen.kt:24)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            AbstractC25705BXp.A0N(c5Tl, C5Y7.A00(c5Tl, R.drawable.instagram_app_instagram_pano_outline_24, 0), new BY4(C5YD.A00(c5Tl, 2131952759), false), C5YD.A00(c5Tl, 2131952760));
            A00(c5Tl, interfaceC16620sF, c5Hc, AbstractC25225BEi.A01(i2));
            C5WR.A0Y(c5Tl, AbstractC118175Wb.A02(c1130158n), AbstractC25225BEi.A0Y(c5Tl), C5YD.A00(c5Tl, 2131952761), AbstractC25226BEj.A0M(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1483043320);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16620sF, c5Hc, i, 10);
        }
    }

    public static final void A00(C5Tl c5Tl, InterfaceC16620sF interfaceC16620sF, C5Hc c5Hc, int i) {
        int i2;
        int i3;
        c5Tl.Enr(-1981665885);
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
                C0fH.A01(-650532145, "com.instagram.aistudio.editor.AddCrossAppsList (AiCrossAppDiscoverabilityScreen.kt:47)");
            }
            Iterator it = c5Hc.iterator();
            while (it.hasNext()) {
                C51741MtQ c51741MtQ = (C51741MtQ) it.next();
                int ordinal = ((EnumC61203Rh3) c51741MtQ.A01).ordinal();
                if (ordinal != 2) {
                    i3 = R.drawable.instagram_app_whatsapp_pano_outline_24;
                    if (ordinal != 3) {
                        i3 = R.drawable.instagram_app_instagram_pano_outline_24;
                    }
                } else {
                    i3 = R.drawable.instagram_app_messenger_pano_outline_24;
                }
                C2DC A00 = C5Y7.A00(c5Tl, i3, 0);
                String str = c51741MtQ.A02;
                String str2 = c51741MtQ.A03;
                boolean z = c51741MtQ.A04;
                boolean AH6 = c5Tl.AH6(c51741MtQ) | AbstractC25235BEs.A1X(c5Tl, 779365025, i2);
                Object EEc = c5Tl.EEc();
                if (AH6 || EEc == C5UI.A00) {
                    EEc = AbstractC25230BEn.A12(c5Tl, c51741MtQ, interfaceC16620sF, 18);
                }
                AbstractC25225BEi.A1V(c5Tl, false);
                AbstractC25705BXp.A0P(c5Tl, A00, new C29199Cu4((InterfaceC16660sJ) EEc, z, false), str, str2);
            }
            if (C0fH.A02()) {
                C0fH.A00(828819893);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30507Dbq.A01(ASZ, interfaceC16620sF, c5Hc, i, 9);
        }
    }
}
