package X;

import android.animation.Animator;

/* renamed from: X.Ci5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28511Ci5 implements Animator.AnimatorListener {
    public final /* synthetic */ C58622mL A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C28511Ci5(C58622mL c58622mL) {
        this.A00 = c58622mL;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.A01();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A01();
    }
}
