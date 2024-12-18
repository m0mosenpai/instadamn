package X;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes4.dex */
public final class AMy implements Animator.AnimatorListener {
    public final /* synthetic */ View A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AMy(View view) {
        this.A00 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.setRotation(0.0f);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.setRotation(0.0f);
    }
}
