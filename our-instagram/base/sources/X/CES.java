package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class CES {
    public static final void A00(C5Tl c5Tl, Modifier modifier, InterfaceC132315yA interfaceC132315yA, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        float f;
        Modifier modifier2 = modifier;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(-1436521541);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, interfaceC132315yA) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= AbstractC25232BEp.A0T(c5Tl, modifier2);
        }
        if ((i3 & 147) == 146 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(-1760219065, "com.instagram.barcelona.feed.post.ui.PostTranslateButton (PostTranslateButton.kt:26)");
            }
            Modifier A0C = AbstractC118185Wd.A0C(modifier2, 20.0f);
            InterfaceC1127857k A00 = C5XX.A00(C118195Wf.A09, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0C);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A00, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            boolean z = interfaceC132315yA instanceof C45167Jz8;
            if (z) {
                f = 1.0f;
            } else {
                f = 0.5f;
                if (interfaceC132315yA instanceof C48249LWy) {
                    f = 0.0f;
                }
            }
            C2DC A003 = C5Y7.A00(c5Tl, R.drawable.barcelona_translate_outline_14, 0);
            int i5 = 2131953753;
            if (z) {
                i5 = 2131953747;
            }
            String A004 = C5YD.A00(c5Tl, i5);
            C1130158n c1130158n = Modifier.A00;
            C5YS.A07(c5Tl, C5XR.A05(CB8.A00(c1130158n, f), AbstractC25225BEi.A0W(0), null, interfaceC16820sZ, true), A003, null, A004, 0, 24, 0L);
            c5Tl.Eno(-924905695);
            if (interfaceC132315yA instanceof C48249LWy) {
                AbstractC27548CDt.A00(c5Tl, AbstractC118185Wd.A0C(c1130158n, 18.0f), BIX.A01(c5Tl), 70, 0);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(-1042504762);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30490DbZ(i, i2, 14, modifier2, interfaceC132315yA, interfaceC16820sZ);
        }
    }
}
