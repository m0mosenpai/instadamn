package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;

/* loaded from: classes4.dex */
public final class AN7 implements Animator.AnimatorListener {
    public final /* synthetic */ AnimatorSet A00;
    public final /* synthetic */ View A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AN7(AnimatorSet animatorSet, View view) {
        this.A01 = view;
        this.A00 = animatorSet;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AbstractC167007dF.A0x(this.A01);
        this.A00.removeAllListeners();
    }
}
