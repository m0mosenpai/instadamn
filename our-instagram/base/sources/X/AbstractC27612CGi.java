package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import com.facebook.R;

/* renamed from: X.CGi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27612CGi {
    public static final void A00(Context context, Drawable drawable, C5Tl c5Tl, InterfaceC137546La interfaceC137546La, int i) {
        C2DC c25770Ba9;
        AbstractC167007dF.A1D(drawable, 0, context);
        if (AbstractC25235BEs.A1W(c5Tl, 1561993431)) {
            C0fH.A01(-1302385833, "com.instagram.creation.capture.assetpicker.cutout.ui.CutoutVideoStickerStylizedImage (CutoutVideoStickerStylizedImage.kt:29)");
        }
        int A09 = AbstractC167007dF.A09(AbstractC53172bz.A01(context), R.attr.igds_color_secondary_background);
        if (interfaceC137546La != null) {
            c25770Ba9 = new C25768Ba7(interfaceC137546La);
        } else {
            c25770Ba9 = new C25770Ba9(AbstractC25225BEi.A0B(A09));
        }
        Alignment alignment = C118195Wf.A09;
        C1130158n c1130158n = Modifier.A00;
        InterfaceC1127857k A00 = C5XX.A00(alignment, false);
        int A002 = C5X2.A00(c5Tl);
        C117505Tk c117505Tk = (C117505Tk) c5Tl;
        C59P A04 = C117505Tk.A04(c117505Tk);
        Modifier A01 = C5X3.A01(c5Tl, c1130158n);
        AbstractC25233BEq.A11(c5Tl, c117505Tk);
        AbstractC25231BEo.A12(c5Tl, A00, A04);
        InterfaceC16620sF interfaceC16620sF = C5X8.A02;
        if (c117505Tk.A0K || !AbstractC25231BEo.A1O(c5Tl, A002)) {
            AbstractC25231BEo.A15(c5Tl, interfaceC16620sF, A002);
        }
        AbstractC25225BEi.A1K(c5Tl, A01);
        C6LQ.A04(c5Tl, AbstractC25228BEl.A0X(AbstractC25226BEj.A0U(c1130158n), C5XT.A02(c5Tl, R.dimen.account_discovery_bottom_gap)), c25770Ba9);
        C6LQ.A07(c5Tl, null, C5Y9.A00(drawable, c5Tl), 56, 124);
        if (AbstractC25227BEk.A1R(c5Tl)) {
            C0fH.A00(230918258);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(drawable, interfaceC137546La, context, i, 22);
        }
    }
}
