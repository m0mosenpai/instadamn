package X;

import android.view.animation.Animation;

/* renamed from: X.Fpy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class AnimationAnimationListenerC35724Fpy implements Animation.AnimationListener {
    public final /* synthetic */ C2OG A00;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC35724Fpy(C2OG c2og) {
        this.A00 = c2og;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C2OG.A04(this.A00);
    }
}
