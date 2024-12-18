package X;

import android.animation.Animator;

/* loaded from: classes4.dex */
public final class AMx implements Animator.AnimatorListener {
    public final /* synthetic */ C8EL A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AMx(C8EL c8el) {
        this.A00 = c8el;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC56392iX interfaceC56392iX = this.A00.A04;
        interfaceC56392iX.getView().setVisibility(8);
        interfaceC56392iX.getView().setAlpha(1.0f);
    }
}
