package X;

import android.animation.Animator;

/* loaded from: classes4.dex */
public final class AN9 implements Animator.AnimatorListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ BEd A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AN9(BEd bEd, float f) {
        this.A01 = bEd;
        this.A00 = f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.Ed5(this.A00);
    }
}
