package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* loaded from: classes5.dex */
public abstract class CKW {
    public static final void A00(C5Tl c5Tl, GifUrlImpl gifUrlImpl, String str, int i) {
        int i2;
        AbstractC167007dF.A1K(str, gifUrlImpl);
        c5Tl.Enr(318165240);
        if ((i & 6) == 0) {
            i2 = AbstractC25232BEp.A0R(c5Tl, str) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= AbstractC25232BEp.A0S(c5Tl, gifUrlImpl);
        }
        if ((i2 & 19) == 18 && c5Tl.Bxj()) {
            c5Tl.Em9();
        } else {
            if (C0fH.A02()) {
                C0fH.A01(-29492650, "com.instagram.wonderwall.ui.compose.components.GifAttachmentPreview (WallGifAttachment.kt:17)");
            }
            c5Tl.Eno(-1322574566);
            int i3 = i2 & 112;
            boolean A1P = AbstractC167007dF.A1P(i3, 32);
            Object EEc = c5Tl.EEc();
            if (A1P || EEc == C5UI.A00) {
                EEc = Float.valueOf(AbstractC46673Kkq.A00(gifUrlImpl));
                c5Tl.FBy(EEc);
            }
            float A09 = AbstractC166987dD.A09(EEc);
            AbstractC25225BEi.A1V(c5Tl, false);
            CGR.A00(c5Tl, AbstractC25228BEl.A0X(AbstractC27468CAo.A00(AbstractC25228BEl.A0W(), A09, false), 12.0f), gifUrlImpl, str, null, A09, 0, (i2 & 14) | 3072 | i3, 32);
            if (C0fH.A02()) {
                C0fH.A00(-547031991);
            }
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            C30503Dbm.A01(ASZ, gifUrlImpl, str, i, 14);
        }
    }
}
