package X;

import android.app.Dialog;
import android.widget.RatingBar;

/* renamed from: X.OlM, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55528OlM implements RatingBar.OnRatingBarChangeListener {
    public final /* synthetic */ RatingBar.OnRatingBarChangeListener A00;
    public final /* synthetic */ O70 A01;

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        C14360o3.A0B(ratingBar, 0);
        this.A00.onRatingChanged(ratingBar, f, z);
        Dialog dialog = this.A01.A00;
        if (dialog != null) {
            dialog.dismiss();
            return;
        }
        throw AbstractC166997dE.A0g();
    }

    public C55528OlM(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, O70 o70) {
        this.A00 = onRatingBarChangeListener;
        this.A01 = o70;
    }
}
