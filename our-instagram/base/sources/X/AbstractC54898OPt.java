package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

/* renamed from: X.OPt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54898OPt {
    public static final void A00(View view, boolean z) {
        C14360o3.A0B(view, 0);
        if (!"animating_show".equals(view.getTag())) {
            if (view.getVisibility() == 0 && view.getAlpha() == 1.0f) {
                return;
            }
            MSX.A10(view);
            if (z) {
                view.setVisibility(0);
                view.setTag("animating_show");
                view.setAlpha(0.0f);
                MSY.A0F(MSX.A0A(view, 1.0f).setInterpolator(new AccelerateDecelerateInterpolator())).withEndAction(new RunnableC56916PNj(view)).setListener(new C55231Of3(view, 3)).start();
                return;
            }
            view.setVisibility(0);
        }
    }

    public static final boolean A01(View view, boolean z) {
        C14360o3.A0B(view, 0);
        if ("animating_hide".equals(view.getTag()) || (view.getVisibility() == 8 && view.getAlpha() == 0.0f)) {
            return false;
        }
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            animate.cancel();
            view.setTag("animating_hide");
            MSX.A14(MSY.A0F(MSX.A0A(view, 0.0f).setInterpolator(new AccelerateDecelerateInterpolator())).setListener(new C55231Of3(view, 3)), new RunnableC56915PNi(view));
            return true;
        }
        animate.cancel();
        view.setVisibility(8);
        return true;
    }
}
