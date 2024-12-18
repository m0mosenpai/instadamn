package X;

import android.animation.Animator;

/* renamed from: X.AMw, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23134AMw implements Animator.AnimatorListener {
    public final /* synthetic */ C8Q6 A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C23134AMw(C8Q6 c8q6) {
        this.A00 = c8q6;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C8Q6.A0J(this.A00);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C8Q6.A0J(this.A00);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A08 = true;
    }
}
