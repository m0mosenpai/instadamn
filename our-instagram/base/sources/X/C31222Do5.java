package X;

import android.animation.Animator;

/* renamed from: X.Do5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31222Do5 implements Animator.AnimatorListener {
    public final /* synthetic */ C149566o8 A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C31222Do5(C149566o8 c149566o8) {
        this.A00 = c149566o8;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C149566o8 c149566o8 = this.A00;
        c149566o8.A01 = null;
        c149566o8.A01();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C6QW.A00("countdown_sticker_confetti");
    }
}
