package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.CFq, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27597CFq {
    public static final void A00(C5Tl c5Tl, C168497fj c168497fj, ImageUrl imageUrl, InterfaceC16660sJ interfaceC16660sJ, int i) {
        boolean A1b = AbstractC25233BEq.A1b(imageUrl, c168497fj, interfaceC16660sJ);
        if (AbstractC25235BEs.A1W(c5Tl, -257582844)) {
            C0fH.A01(-1995834530, "com.instagram.comments.mvvm.view.compose.RoundedVisualThumbnail (RoundedVisualThumbnail.kt:26)");
        }
        C2DB A0w = AbstractC25226BEj.A0w(c5Tl, imageUrl, i);
        Modifier A0X = AbstractC25228BEl.A0X(AbstractC118185Wd.A0D(AbstractC118185Wd.A08(AbstractC118175Wb.A0E(Modifier.A00, 0.0f, 2.0f, 0.0f, 0.0f), 126.0f), 81.0f), 8.0f);
        C5XO c5xo = (C5XO) AbstractC25234BEr.A0Y(c5Tl, -1731981746);
        AbstractC25225BEi.A1V(c5Tl, false);
        C6LQ.A0B(c5Tl, AbstractC118655Yf.A00(c5xo, A0X, null, null, new D8L(20, interfaceC16660sJ, c168497fj), null, new D8L(21, interfaceC16660sJ, c168497fj), A1b), A0w, C5YJ.A00, "", 24632);
        if (C0fH.A02()) {
            C0fH.A00(174112813);
        }
        C5UU ASZ = c5Tl.ASZ();
        if (ASZ != null) {
            ASZ.A06 = C30509Dbs.A01(imageUrl, interfaceC16660sJ, c168497fj, i, 16);
        }
    }
}
