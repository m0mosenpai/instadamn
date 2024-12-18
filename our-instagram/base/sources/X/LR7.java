package X;

import android.graphics.drawable.TransitionDrawable;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;

/* loaded from: classes8.dex */
public final class LR7 implements Animation.AnimationListener {
    public final /* synthetic */ TransitionDrawable A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C7L2 A02;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public LR7(TransitionDrawable transitionDrawable, View view, C7L2 c7l2) {
        this.A02 = c7l2;
        this.A01 = view;
        this.A00 = transitionDrawable;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        AccelerateInterpolator accelerateInterpolator = this.A02.A00;
        C14360o3.A0B(accelerateInterpolator, 3);
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.05f, 1.0f, 1.05f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setDuration(1000L);
        scaleAnimation.setInterpolator(accelerateInterpolator);
        View view = this.A01;
        view.startAnimation(scaleAnimation);
        TransitionDrawable transitionDrawable = this.A00;
        if (transitionDrawable != null) {
            view.postDelayed(new RunnableC49827LzY(transitionDrawable), 750L);
        }
    }
}
