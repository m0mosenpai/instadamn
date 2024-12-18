package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.Cdv, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC28309Cdv {
    public static final void A02(String str, String str2, C5Tl c5Tl, int i) {
        int i2;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(1255177158);
        if ((i & 14) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i2 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1219675912, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbarTitle (MagicModToolbar.kt:145)");
            }
            Modifier A0Q = AbstractC25225BEi.A0Q(AbstractC25227BEk.A0L(Modifier.A00, 12.0f));
            InterfaceC1127857k A0e = AbstractC25228BEl.A0e(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0Q);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0e, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0B(c5Tl, null, AbstractC25225BEi.A0X(c5Tl), str, 3, 1, 2, i2 & 14, 390, 11130, AbstractC25226BEj.A08(c5Tl));
            c5Tl.Eno(328923181);
            if (str2 != null) {
                C5WR.A0B(c5Tl, null, AbstractC25226BEj.A0c(c5Tl), str2, 3, 2, 2, (i2 >> 3) & 14, 390, 11130, AbstractC25226BEj.A0M(c5Tl));
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(784089491);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30195DSa(str, str2, i, 0);
        }
    }

    public static final void A01(C5Tl c5Tl, C51760Mtj c51760Mtj, C61 c61, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, InterfaceC16820sZ interfaceC16820sZ3, InterfaceC16820sZ interfaceC16820sZ4, InterfaceC16660sJ interfaceC16660sJ, int i, int i2, boolean z) {
        InterfaceC118225Wj interfaceC118225Wj;
        InterfaceC16820sZ interfaceC16820sZ5 = interfaceC16820sZ4;
        C61 c612 = c61;
        InterfaceC16820sZ interfaceC16820sZ6 = interfaceC16820sZ3;
        InterfaceC16820sZ interfaceC16820sZ7 = interfaceC16820sZ2;
        InterfaceC16660sJ interfaceC16660sJ2 = interfaceC16660sJ;
        AbstractC167007dF.A1K(c51760Mtj, interfaceC16820sZ);
        c5Tl.Enr(47427287);
        if ((i2 & 4) != 0) {
            interfaceC16660sJ2 = DNC.A00;
        }
        if ((i2 & 8) != 0) {
            interfaceC16820sZ7 = DBV.A00;
        }
        if ((i2 & 16) != 0) {
            interfaceC16820sZ6 = DBW.A00;
        }
        if ((i2 & 32) != 0) {
            c612 = null;
        }
        if ((i2 & 64) != 0) {
            interfaceC16820sZ5 = DBX.A00;
        }
        boolean A1V = AbstractC25226BEj.A1V(i2 & 128, z);
        if (C0fH.A02()) {
            C0fH.A01(1294397634, "com.instagram.creation.genai.magicmod.common.ui.MagicModToolbar (MagicModToolbar.kt:50)");
        }
        C1130158n c1130158n = Modifier.A00;
        InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
        int A00 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, c1130158n);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A0b, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        CH1.A00(c5Tl, AbstractC118185Wd.A08(c1130158n, C5XT.A02(c5Tl, R.dimen.avatar_reel_ring_size_extra_large)), C60.A03, 6, 0);
        if (c51760Mtj.A00 instanceof C26193BiJ) {
            interfaceC118225Wj = C118195Wf.A05;
        } else {
            interfaceC118225Wj = C118195Wf.A04;
        }
        AbstractC27628CGz.A00(c5Tl, interfaceC118225Wj, AbstractC118175Wb.A0E(c1130158n, 12.0f, 14.0f, 12.0f, 0.0f), C5UA.A01(c5Tl, new C30217DSw(c51760Mtj, interfaceC16820sZ, interfaceC16820sZ6, 12.0f, 2), -600228985), C5UA.A01(c5Tl, C30481DbQ.A00(c51760Mtj, 3), 1830521480), C5UA.A01(c5Tl, new C30272DUz(0, interfaceC16820sZ6, interfaceC16660sJ2, c612, c51760Mtj, interfaceC16820sZ7, interfaceC16820sZ5, A1V), -33695351), 438, 0);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(599295911);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30316DWr(c612, interfaceC16820sZ5, interfaceC16820sZ7, interfaceC16660sJ2, interfaceC16820sZ6, c51760Mtj, interfaceC16820sZ, i, i2, 2, A1V);
        }
    }

    public static final String A00(C5Tl c5Tl, C5QE c5qe) {
        String str;
        if (AbstractC25227BEk.A1U(c5Tl, -1701023697)) {
            C0fH.A01(-1651642634, "com.instagram.creation.genai.magicmod.common.ui.resolveToolBarString (MagicModToolbar.kt:173)");
        }
        if (c5qe != null) {
            str = BHY.A01(c5Tl, c5qe);
        } else {
            str = null;
        }
        if (C0fH.A02()) {
            C0fH.A00(339526442);
        }
        AbstractC25225BEi.A1T(c5Tl);
        return str;
    }
}
