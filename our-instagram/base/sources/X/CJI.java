package X;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.facebook.common.dextricks.DalvikInternals;

/* loaded from: classes5.dex */
public abstract class CJI {
    public static final void A00(C5Tl c5Tl, BJ3 bj3, InterfaceC58121Ppk interfaceC58121Ppk, String str, String str2, String str3, String str4, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        boolean A1R = AbstractC167007dF.A1R(0, str, str2);
        AbstractC167007dF.A1E(str3, 2, str4);
        AbstractC167007dF.A1G(bj3, 4, interfaceC16820sZ);
        c5Tl.Enr(2048991113);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, str2);
        }
        if ((i & 384) == 0) {
            i2 |= AbstractC25232BEp.A0T(c5Tl, str3);
        }
        if ((i & 3072) == 0) {
            i2 |= AbstractC25232BEp.A0U(c5Tl, str4);
        }
        if ((i & DalvikInternals.IOPRIO_BACKGROUND) == 0) {
            i2 |= AbstractC25232BEp.A0V(c5Tl, bj3);
        }
        if ((196608 & i) == 0) {
            i2 |= AbstractC25232BEp.A0M(c5Tl, interfaceC16820sZ);
        }
        if ((1572864 & i) == 0) {
            i2 |= AbstractC25232BEp.A0X(c5Tl, interfaceC58121Ppk);
        }
        if ((599187 & i2) == 599186 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-584215958, "com.instagram.newsfeed.compose.ui.SuggestedUserColumn (SuggestedUserColumn.kt:46)");
            }
            C2DB A00 = AbstractC43541zP.A00(c5Tl, AbstractC25225BEi.A0t(str));
            BI3 bi3 = BI3.A03;
            C29192Ctx c29192Ctx = C29192Ctx.A00;
            float Aea = c29192Ctx.Aea();
            BI2 bi2 = new BI2(Aea, Aea, c29192Ctx.AeX(), c29192Ctx.AeY());
            C14360o3.A0B(bi3.A01, 0);
            C1130158n c1130158n = Modifier.A00;
            Modifier A0D = AbstractC118185Wd.A0D(c1130158n, 146.0f);
            long A0D2 = AbstractC25225BEi.A0D(c5Tl);
            C5XL.A02(c5Tl);
            Modifier A03 = C6L7.A03(A0D, C5WE.A00, 0.5f, A0D2);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A03);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0b, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            Modifier AB5 = C119645bN.A00.AB5(C118195Wf.A0D, c1130158n);
            Object A0q2 = AbstractC25227BEk.A0q(c5Tl, -79178592);
            Object obj = C5UI.A00;
            C5XO c5xo = (C5XO) AbstractC25232BEp.A1C(c5Tl, A0q2, obj);
            C117505Tk.A0L(c117505Tk, false);
            InterfaceC118075Vr interfaceC118075Vr = (InterfaceC118075Vr) c5Tl.AJX(C5WM.A00);
            c5Tl.Eno(-79174474);
            int i3 = i2 & 3670016;
            boolean A1P = AbstractC167007dF.A1P(i3, 1048576);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == obj) {
                EEc = AbstractC25230BEn.A0z(c5Tl, interfaceC58121Ppk, 32);
            }
            AbstractC25229BEm.A17(c5Tl, AbstractC118185Wd.A02(C118195Wf.A09, AbstractC118185Wd.A0C(C5XR.A02(interfaceC118075Vr, c5xo, AB5, AbstractC25225BEi.A1A(c117505Tk, EEc, false)), 28.0f)), C5Y7.A00(c5Tl, R.drawable.small_x, 0), C5YD.A00(c5Tl, 2131960994));
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            FillElement fillElement = AbstractC118185Wd.A02;
            Modifier A08 = AbstractC118175Wb.A08(c1130158n.Eq3(fillElement), 12.0f);
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A003 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0Z, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A003)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A003);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            BGD.A02(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 12.0f), A00, bi2, 384);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C118125Vw A0h = AbstractC25226BEj.A0h(c5Tl);
            C5WR.A0B(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 0.0f, 0.0f, 2.0f), A0h, str2, 3, A1R ? 1 : 0, 2, AbstractC25225BEi.A03(i2), 390, 11128, A0G);
            int i4 = i2 >> 6;
            C5WR.A03(c5Tl, null, AbstractC25225BEi.A0Y(c5Tl), null, null, null, str3, null, 3, 2, 2, 2, (i4 & 14) | 805306368, 390, 10618, AbstractC25226BEj.A0M(c5Tl), 0L, 0L, false);
            AbstractC25276BGq.A00(c5Tl, AbstractC118175Wb.A0E(c1130158n, 0.0f, 12.0f, 0.0f, 0.0f).Eq3(fillElement), bj3, null, interfaceC16820sZ, ((i2 >> 12) & 14) | 48 | (i4 & 7168), 4);
            c5Tl.ASW();
            c5Tl.ASW();
            boolean A1S = AbstractC25229BEm.A1S(c5Tl, -582716328, i3, 1048576);
            Object EEc2 = c5Tl.EEc();
            if (A1S || EEc2 == obj) {
                EEc2 = new PZS(interfaceC58121Ppk, null, 44);
                c5Tl.FBy(EEc2);
            }
            if (AbstractC25232BEp.A1V(c5Tl, c117505Tk, EEc2, str4, false)) {
                C0fH.A00(-1104134758);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new C30265DUs(bj3, interfaceC58121Ppk, str, str2, str3, str4, interfaceC16820sZ, i);
        }
    }
}
