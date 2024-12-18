package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.wonderwall.model.WallImage;
import com.instagram.wonderwall.model.WallMenuConfig;
import java.util.Iterator;

/* loaded from: classes5.dex */
public abstract class CZ3 {
    public static final void A00(C5Tl c5Tl, WallMenuConfig wallMenuConfig, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        AbstractC167007dF.A1K(wallMenuConfig, interfaceC16660sJ);
        c5Tl.Enr(2059085830);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, wallMenuConfig, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1128739976, "com.instagram.wonderwall.ui.bottomsheet.WallMenuScreen (WallMenuScreen.kt:29)");
            }
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0Y = AbstractC25229BEm.A0Y(c5Tl, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Y, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(-1066659959);
            Iterator it = wallMenuConfig.A01.iterator();
            while (it.hasNext()) {
                A01(c5Tl, (C27916CSb) it.next(), interfaceC16660sJ, i2 & 112);
            }
            if (AbstractC25230BEn.A1U(c5Tl, c117505Tk, false)) {
                C0fH.A00(830462662);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, wallMenuConfig, interfaceC16660sJ, i, 22);
        }
    }

    public static final void A01(C5Tl c5Tl, C27916CSb c27916CSb, InterfaceC16660sJ interfaceC16660sJ, int i) {
        int i2;
        long A0O;
        C118125Vw A01;
        boolean A1R = AbstractC167007dF.A1R(0, c27916CSb, interfaceC16660sJ);
        c5Tl.Enr(2012363258);
        if ((i & 6) == 0) {
            i2 = AbstractC25230BEn.A04(AbstractC25233BEq.A1T(c5Tl, c27916CSb, i) ? 1 : 0) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16660sJ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1451482770, "com.instagram.wonderwall.ui.bottomsheet.MenuItem (WallMenuScreen.kt:34)");
            }
            C6ID A012 = AbstractC118255Wn.A01(0.0f);
            C1130158n c1130158n = Modifier.A00;
            InterfaceC1127857k A0a = AbstractC25230BEn.A0a(A012, c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A013 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A0a, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A013);
            if (c27916CSb.A03) {
                A0O = AbstractC25227BEk.A0g(c5Tl, 1721384631).A0E;
            } else {
                A0O = AbstractC25230BEn.A0O(c5Tl, 1721386128);
            }
            C117505Tk.A0L(c117505Tk, false);
            String A02 = AbstractC28470ChM.A02(c5Tl, c27916CSb.A01);
            boolean z = true;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            boolean A1P = AbstractC25233BEq.A1P(c5Tl, 1721389733, i2);
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !c5Tl.AH6(c27916CSb))) {
                z = false;
            }
            boolean z2 = A1P | z;
            Object EEc = c5Tl.EEc();
            if (z2 || EEc == C5UI.A00) {
                EEc = C29895DGj.A00(c5Tl, interfaceC16660sJ, c27916CSb, 14);
            }
            Modifier A05 = C5XR.A05(A0T, null, null, AbstractC25225BEi.A1A(c117505Tk, EEc, false), A1R);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            Modifier A08 = AbstractC118175Wb.A08(c1130158n, 12.0f);
            InterfaceC1127857k A003 = AbstractC118375Wz.A00(AbstractC118255Wn.A04, c5Tl, C118195Wf.A04);
            int A004 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A015 = C5X3.A01(c5Tl, A08);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A015, A1K);
            C6L0 c6l0 = C6L0.A00;
            WallImage wallImage = c27916CSb.A00;
            c5Tl.Eno(1806495851);
            if (wallImage != null) {
                AbstractC28470ChM.A05(c5Tl, wallImage, A02, 0.0f, 0, 8, A0O);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC25227BEk.A16(c5Tl, c1130158n, 12.0f);
            A01 = C118125Vw.A01(null, AbstractC25225BEi.A0X(c5Tl), null, null, null, 0, 0, 15728638, A0O, 0L, 0L);
            C5WR.A06(c5Tl, c6l0.A00(c1130158n), A01, A02);
            c5Tl.Eno(1806509355);
            if (c27916CSb.A04) {
                AbstractC28470ChM.A05(c5Tl, new WallImage.Drawable(R.drawable.instagram_check_pano_outline_24), null, 0.0f, 0, 14, 0L);
            }
            C117505Tk.A0L(c117505Tk, false);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1275468616);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, c27916CSb, interfaceC16660sJ, i, 21);
        }
    }
}
