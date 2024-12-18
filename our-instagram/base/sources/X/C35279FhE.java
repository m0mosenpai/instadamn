package X;

import android.animation.Animator;

/* renamed from: X.FhE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35279FhE implements Animator.AnimatorListener {
    public final /* synthetic */ C148086le A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C35279FhE(C148086le c148086le) {
        this.A00 = c148086le;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A00();
    }
}
