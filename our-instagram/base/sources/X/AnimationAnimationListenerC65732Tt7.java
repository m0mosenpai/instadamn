package X;

import android.view.animation.Animation;

/* renamed from: X.Tt7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class AnimationAnimationListenerC65732Tt7 implements Animation.AnimationListener {
    public final /* synthetic */ C65731Tt6 A00;

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }

    public AnimationAnimationListenerC65732Tt7(C65731Tt6 c65731Tt6) {
        this.A00 = c65731Tt6;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        C65731Tt6 c65731Tt6 = this.A00;
        c65731Tt6.A02.setVisibility(8);
        c65731Tt6.A01 = true;
    }
}
