package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CJp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27696CJp {
    public static final void A00(C5Tl c5Tl, ImageUrl imageUrl, int i) {
        int i2;
        c5Tl.Enr(-1633224372);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, imageUrl) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-1085358454, "com.instagram.reels.music.bottomsheet.MusicVinylMimicryBottomsheetContent (MusicVinylMimicryBottomsheetFragment.kt:97)");
            }
            InterfaceC118245Wl interfaceC118245Wl = C118195Wf.A00;
            C1130158n c1130158n = Modifier.A00;
            Modifier A0A = AbstractC118175Wb.A0A(c1130158n, 0.0f, C5XT.A00(c5Tl));
            InterfaceC1127857k A0Z = AbstractC25226BEj.A0Z(c5Tl, interfaceC118245Wl);
            int A00 = C5X2.A00(c5Tl);
            C117505Tk c117505Tk = (C117505Tk) c5Tl;
            C59P A04 = C117505Tk.A04(c117505Tk);
            Modifier A01 = C5X3.A01(c5Tl, A0A);
            AbstractC25233BEq.A11(c5Tl, c117505Tk);
            AbstractC25231BEo.A12(c5Tl, A0Z, A04);
            InterfaceC16620sF interfaceC16620sF = C5X8.A02;
            if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A00)) {
                AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A00);
            }
            AbstractC25225BEi.A1K(c5Tl, A01);
            c5Tl.Eno(1470333536);
            if (imageUrl != null) {
                C6LQ.A0A(c5Tl, AbstractC118175Wb.A0E(AbstractC118185Wd.A0C(c1130158n, 232.0f), 0.0f, 0.0f, 0.0f, 25.0f), C5Y9.A00(new C9SH(AbstractC25230BEn.A0P(c5Tl), AbstractC25229BEm.A0e(c5Tl), imageUrl, C05F.A01, "", "", -45.0f, -1, false, false), c5Tl), C5YJ.A04, 25008, 104);
            }
            C117505Tk.A0L(c117505Tk, false);
            C5WR.A0x(c5Tl, AbstractC25226BEj.A0d(c5Tl), C5YD.A00(c5Tl, 2131967947), AbstractC25226BEj.A0G(c5Tl));
            String A002 = C5YD.A00(c5Tl, 2131967946);
            long A0G = AbstractC25226BEj.A0G(c5Tl);
            C5WR.A0Z(c5Tl, AbstractC118175Wb.A0A(c1130158n, 0.0f, C5XT.A00(c5Tl)), AbstractC25226BEj.A0c(c5Tl), A002, A0G);
            if (AbstractC25227BEk.A1R(c5Tl)) {
                C0fH.A00(1299569017);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30497Dbg.A01(ASZ, imageUrl, i, 37);
        }
    }
}
