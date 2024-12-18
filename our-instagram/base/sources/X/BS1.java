package X;

import android.animation.Animator;

/* loaded from: classes5.dex */
public final class BS1 implements Animator.AnimatorListener {
    public final /* synthetic */ C25562BRz A00;
    public final /* synthetic */ String A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public BS1(C25562BRz c25562BRz, String str) {
        this.A00 = c25562BRz;
        this.A01 = str;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((InterfaceC16660sJ) this.A00.A01.A01).invoke(this.A01);
    }
}
