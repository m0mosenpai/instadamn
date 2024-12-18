package X;

import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

/* renamed from: X.4SA, reason: invalid class name */
/* loaded from: classes2.dex */
public abstract class C4SA {
    public static void A00(final View view, int i, final boolean z, boolean z2) {
        if (view != null) {
            int visibility = view.getVisibility();
            if (z) {
                if (visibility == 0) {
                    return;
                }
            } else if (visibility != 0) {
                return;
            }
            if (!z2) {
                int i2 = 4;
                if (z) {
                    i2 = 0;
                }
                view.setVisibility(i2);
                return;
            }
            view.clearAnimation();
            float alpha = view.getAlpha();
            float f = 0.0f;
            if (z) {
                f = 1.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(alpha, f);
            alphaAnimation.setDuration(i);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            alphaAnimation.setAnimationListener(new Animation.AnimationListener() { // from class: X.4YC
                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    View view2 = view;
                    int i3 = 4;
                    if (z) {
                        i3 = 0;
                    }
                    view2.setVisibility(i3);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public final void onAnimationStart(Animation animation) {
                    view.setVisibility(0);
                }
            });
            view.startAnimation(alphaAnimation);
        }
    }
}
