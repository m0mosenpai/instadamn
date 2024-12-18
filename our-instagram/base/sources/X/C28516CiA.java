package X;

import android.animation.Animator;

/* renamed from: X.CiA, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28516CiA implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C51762Yz A01;
    public final /* synthetic */ C51762Yz A02;
    public final /* synthetic */ boolean A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C28516CiA(C51762Yz c51762Yz, C51762Yz c51762Yz2, int i, boolean z) {
        this.A03 = z;
        this.A02 = c51762Yz;
        this.A00 = i;
        this.A01 = c51762Yz2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A03) {
            AbstractC25227BEk.A1K(this.A02, this.A00);
            this.A01.A00();
        }
    }
}
