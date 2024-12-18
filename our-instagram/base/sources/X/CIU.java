package X;

import androidx.compose.ui.Modifier;

/* loaded from: classes5.dex */
public abstract class CIU {
    public static final void A00(C5Tl c5Tl, InterfaceC16820sZ interfaceC16820sZ, int i, int i2) {
        int i3;
        C14360o3.A0B(interfaceC16820sZ, 1);
        c5Tl.Enr(976992500);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A08(c5Tl, i) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-475386122, "com.instagram.direct.fragment.thread.chatsettings.customthemepreview.CreateButton (CreateButton.kt:24)");
            }
            C1130158n c1130158n = Modifier.A00;
            long j = C1132359l.A01;
            Modifier A0X = AbstractC25226BEj.A0X(AbstractC25228BEl.A0X(AbstractC118185Wd.A08(AbstractC25226BEj.A0T(c1130158n), 32.0f), 8.0f), i << 32);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, -1671471153, i3);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = new C50165MDs(interfaceC16820sZ, 9);
                c5Tl.FBy(EEc);
            }
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            Modifier A0I = AbstractC25235BEs.A0I(c5Tl, c117505Tk, A0X, (InterfaceC16820sZ) EEc);
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(AbstractC118255Wn.A02, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0I);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0a, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0Z(c5Tl, AbstractC25235BEs.A0G(C6GM.A00, c1130158n), AbstractC25226BEj.A0h(c5Tl), C5YD.A00(c5Tl, 2131957370), AbstractC25226BEj.A0G(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1206725562);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, interfaceC16820sZ, i, i2, 16);
        }
    }
}
