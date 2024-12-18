package X;

import android.view.View;
import android.view.animation.Animation;

/* renamed from: X.Ol2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class AnimationAnimationListenerC55509Ol2 implements Animation.AnimationListener {
    public final /* synthetic */ View A00;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC55509Ol2(View view) {
        this.A00 = view;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A00.setVisibility(8);
    }
}
