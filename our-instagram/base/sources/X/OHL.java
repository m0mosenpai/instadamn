package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;

/* loaded from: classes9.dex */
public final class OHL {
    public final AccelerateDecelerateInterpolator A00 = new AccelerateDecelerateInterpolator();

    public final void A00(View view, boolean z) {
        C14360o3.A0B(view, 0);
        if (view.getVisibility() == 0) {
            if (z) {
                view.setTranslationY(0.0f);
                MSX.A10(view);
                MSX.A14(MSY.A0F(MSX.A0A(view, 0.0f).translationY(view.getMeasuredHeight()).setInterpolator(this.A00)), new RunnableC56925PNs(view));
                return;
            }
            view.setVisibility(8);
        }
    }
}
