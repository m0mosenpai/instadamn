package X;

import android.graphics.RectF;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.widget.ImageView;

/* renamed from: X.LzU, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC49823LzU implements Runnable {
    public final /* synthetic */ K5V A00;

    public RunnableC49823LzU(K5V k5v) {
        this.A00 = k5v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        K5V k5v = this.A00;
        Interpolator interpolator = K5V.A0Q;
        ImageView imageView = k5v.A02;
        if (imageView != null) {
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            C14360o3.A0C(layoutParams, AbstractC111324zv.A00(5));
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            RectF rectF = k5v.A0K;
            float f = rectF.top;
            float f2 = f + ((rectF.bottom - f) / 2.0f);
            if (k5v.A02 != null) {
                int measuredHeight = (int) (f2 - (r0.getMeasuredHeight() / 2.0f));
                if (marginLayoutParams.topMargin != measuredHeight) {
                    marginLayoutParams.topMargin = measuredHeight;
                    ImageView imageView2 = k5v.A02;
                    if (imageView2 != null) {
                        imageView2.requestLayout();
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        C14360o3.A0F("selfieFaceWarning");
        throw C00O.createAndThrow();
    }
}
