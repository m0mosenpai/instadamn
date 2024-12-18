package X;

import android.animation.Animator;

/* loaded from: classes4.dex */
public final class AN3 implements Animator.AnimatorListener {
    public final /* synthetic */ C9LJ A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AN3(C9LJ c9lj) {
        this.A00 = c9lj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A0V = false;
    }
}
