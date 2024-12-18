package X;

import android.graphics.Matrix;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.Avq, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class RunnableC24656Avq implements Runnable {
    public final /* synthetic */ IgSimpleImageView A00;
    public final /* synthetic */ C210429Sh A01;

    public RunnableC24656Avq(IgSimpleImageView igSimpleImageView, C210429Sh c210429Sh) {
        this.A00 = igSimpleImageView;
        this.A01 = c210429Sh;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IgSimpleImageView igSimpleImageView = this.A00;
        Matrix A0Q = AbstractC166987dD.A0Q();
        C210429Sh c210429Sh = this.A01;
        float intrinsicWidth = c210429Sh.getIntrinsicWidth();
        float f = c210429Sh.A04;
        A0Q.setRectToRect(AbstractC166987dD.A0Y(intrinsicWidth, f), AbstractC166987dD.A0Y(AbstractC166987dD.A07(igSimpleImageView), f), Matrix.ScaleToFit.CENTER);
        igSimpleImageView.setImageMatrix(A0Q);
        igSimpleImageView.setImageDrawable(c210429Sh);
    }
}
