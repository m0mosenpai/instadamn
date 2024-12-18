package X;

import android.widget.RatingBar;
import java.util.HashMap;

/* renamed from: X.OlN, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55529OlN implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ InterfaceC55362gb A00;
    public final /* synthetic */ C4NJ A01;

    public C55529OlN(InterfaceC55362gb interfaceC55362gb, C4NJ c4nj) {
        this.A00 = interfaceC55362gb;
        this.A01 = c4nj;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        Integer num;
        HashMap A1G = AbstractC166987dD.A1G();
        A1G.put("rating", String.valueOf(f));
        if (f > 4.0f) {
            num = C05F.A01;
        } else {
            num = C05F.A0C;
        }
        this.A00.Dco(this.A01, num, A1G);
    }
}
