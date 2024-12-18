package X;

import androidx.compose.ui.Modifier;
import com.facebook.R;

/* loaded from: classes5.dex */
public abstract class BI8 {
    public static final void A00(C5Tl c5Tl, Modifier modifier, String str, int i, int i2) {
        int i3;
        Modifier modifier2 = modifier;
        C14360o3.A0B(str, 0);
        c5Tl.Enr(645118188);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= AbstractC25232BEp.A0S(c5Tl, modifier2);
        }
        if ((i3 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (i4 != 0) {
                modifier2 = Modifier.A00;
            }
            if (C0fH.A02()) {
                C0fH.A01(1467361992, "com.instagram.newsfeed.compose.ui.NFTruncationControlRow (NFTruncationControlRow.kt:23)");
            }
            Modifier A05 = AbstractC118185Wd.A05(modifier2, 32.0f);
            InterfaceC1127857k A0d = AbstractC25228BEl.A0d(c5Tl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A05);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0d, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            C5WR.A0q(c5Tl, AbstractC25226BEj.A0h(c5Tl), str, i3 & 14, AbstractC25226BEj.A0M(c5Tl));
            C5YS.A08(c5Tl, AbstractC25227BEk.A0K(Modifier.A00, 8.0f), C5Y7.A00(c5Tl, R.drawable.instagram_chevron_down_pano_outline_12, 0), C5YD.A00(c5Tl, 2131960994), 384, AbstractC25226BEj.A0L(c5Tl));
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(509259606);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = new DT2(modifier2, str, i2, i, 10);
        }
    }
}
