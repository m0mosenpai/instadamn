package X;

import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.LinearInterpolator;

/* renamed from: X.KrJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC47062KrJ {
    public static final void A00(View view) {
        C14360o3.A0B(view, 0);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setDuration(225L);
        alphaAnimation.setAnimationListener(new AnimationAnimationListenerC35726Fq0(view, 3));
        view.startAnimation(alphaAnimation);
    }
}
