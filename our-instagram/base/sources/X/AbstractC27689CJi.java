package X;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;

/* renamed from: X.CJi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27689CJi {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, int i, int i2) {
        int i3;
        C14360o3.A0B(imageUrl, 0);
        c5Tl.Enr(2081974839);
        if ((i2 & 14) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= AbstractC25232BEp.A09(c5Tl, i);
        }
        if ((i3 & 91) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(1028234775, "com.instagram.potato.reply.PotatoReplySheetLikerCircle (PotatoReplySheetLikerCircle.kt:24)");
            }
            C1130158n c1130158n = Modifier.A00;
            Alignment alignment = C118195Wf.A0E;
            InterfaceC1127857k A00 = C5XX.A00(alignment, false);
            int A002 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, c1130158n);
            InterfaceC16820sZ interfaceC16820sZ = C5X8.A00;
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            InterfaceC16620sF interfaceC16620sF = C5X8.A03;
            InterfaceC16620sF A0q = AbstractC25229BEm.A0q(c5Tl, A00, A04, interfaceC16620sF);
            InterfaceC16620sF interfaceC16620sF2 = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A002);
            }
            InterfaceC16620sF A1K = AbstractC25226BEj.A1K(c5Tl, A01);
            C119645bN c119645bN = C119645bN.A00;
            BII.A01(c5Tl, null, AbstractC43541zP.A00(c5Tl, new SimpleImageUrl(imageUrl)), null, i, 0.0f, 0.0f, 64, 1020, 0L, 0L, false, false);
            Modifier AB5 = c119645bN.AB5(C118195Wf.A07, AbstractC28010CWi.A00(c1130158n, 3.0f, 3.0f));
            InterfaceC1127857k A003 = C5XX.A00(alignment, false);
            int A004 = C5X2.A00(c5Tl);
            C59P A042 = C117505Tk.A04(c117505Tk);
            Modifier A012 = C5X3.A01(c5Tl, AB5);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A003, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A042, A0q) || !AbstractC25231BEo.A1O(c5Tl, A004)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A004);
            }
            C5XJ.A00(c5Tl, A012, A1K);
            Modifier A013 = C6L3.A01(AbstractC118185Wd.A0C(c1130158n, 2.0f + 8.0f), C5WF.A00, AbstractC25226BEj.A09(c5Tl));
            InterfaceC1127857k A005 = C5XX.A00(alignment, false);
            int A006 = C5X2.A00(c5Tl);
            C59P A043 = C117505Tk.A04(c117505Tk);
            Modifier A014 = C5X3.A01(c5Tl, A013);
            AbstractC25233BEq.A12(c5Tl, c117505Tk, interfaceC16820sZ);
            C5XJ.A00(c5Tl, A005, interfaceC16620sF);
            if (AbstractC25225BEi.A1W(c5Tl, c117505Tk, A043, A0q) || !AbstractC25231BEo.A1O(c5Tl, A006)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF2, A006);
            }
            C5XJ.A00(c5Tl, A014, A1K);
            C5YS.A02(c5Tl, AbstractC25225BEi.A0P(c119645bN, AbstractC118185Wd.A0C(c1130158n, 8.0f)), C5Y7.A00(c5Tl, R.drawable.instagram_heart_pano_filled_24, 0), 56, C5XL.A00(c5Tl).A0Q);
            c5Tl.ASW();
            if (AbstractC25230BEn.A1T(c5Tl)) {
                C0fH.A00(-1078872762);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30501Dbk.A01(ASZ, imageUrl, i, i2, 20);
        }
    }
}
