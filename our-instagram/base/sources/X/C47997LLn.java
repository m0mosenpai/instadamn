package X;

import android.animation.Animator;

/* renamed from: X.LLn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C47997LLn implements Animator.AnimatorListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C51762Yz A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C47997LLn(C51762Yz c51762Yz, long j) {
        this.A01 = c51762Yz;
        this.A00 = j;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A01.A02(new C2Z3(this.A00));
    }
}
