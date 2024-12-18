package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;
import java.util.List;

/* loaded from: classes5.dex */
public abstract class CKU {
    public static final void A00(C5Tl c5Tl, C27878CQp c27878CQp, InterfaceC16820sZ interfaceC16820sZ, int i) {
        int i2;
        c5Tl.Enr(911372226);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0H(c5Tl, c27878CQp) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0I(c5Tl, interfaceC16820sZ);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1228088320, "com.instagram.wonderwall.ui.bottomsheet.NuxContent (WallNuxBottomSheetFragment.kt:123)");
            }
            C1130158n c1130158n = Modifier.A00;
            Modifier A0T = AbstractC25226BEj.A0T(c1130158n);
            InterfaceC1127857k A02 = AbstractC119595bH.A02(AbstractC118255Wn.A07, c5Tl, C118195Wf.A02, 0);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0T);
            InterfaceC16820sZ interfaceC16820sZ2 = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A02, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A00);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            InterfaceC1127857k A0b = AbstractC25226BEj.A0b(false);
            int A002 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, A0T);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ2);
            C5XJ.A00(c5Tl, A0b, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            AbstractC28504Chx.A02(c5Tl, A0T, new C26181Bi6(R.drawable.ig_illustrations_illo_boards, 100.0f), null, AbstractC136736Hc.A00(c5Tl, c27878CQp.A00), 48, 4084);
            c5Tl.ASW();
            c5Tl.Eno(-1724655177);
            List list = c27878CQp.A01;
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                C27879CQq c27879CQq = (C27879CQq) list.get(i3);
                AbstractC28474ChS.A05(c5Tl, new C26177Bi2(AbstractC136736Hc.A00(c5Tl, c27879CQq.A01), 0), c27879CQq.A00);
                AbstractC25227BEk.A16(c5Tl, c1130158n, 12.0f);
            }
            C117505Tk.A0L(c117505Tk, false);
            AbstractC28506Chz.A0D(interfaceC16820sZ, AbstractC136736Hc.A00(c5Tl, 2131976956), c5Tl, i2 & 112);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(-1400741900);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30508Dbr.A01(ASZ, interfaceC16820sZ, c27878CQp, i, 23);
        }
    }
}
