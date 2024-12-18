package X;

import android.view.animation.Animation;

/* renamed from: X.Sol, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class AnimationAnimationListenerC63518Sol implements Animation.AnimationListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SZp A01;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    public AnimationAnimationListenerC63518Sol(SZp sZp, int i) {
        this.A01 = sZp;
        this.A00 = i;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A03.remove(this.A00);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        this.A01.A03.put(this.A00, animation);
    }
}
