package X;

import android.animation.Animator;

/* renamed from: X.Iet, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41777Iet implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C97624Zx A01;
    public final /* synthetic */ Wm1 A02;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C14360o3.A0B(animator, 0);
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C14360o3.A0B(animator, 0);
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C41777Iet(C97624Zx c97624Zx, Wm1 wm1, int i) {
        this.A00 = i;
        this.A02 = wm1;
        this.A01 = c97624Zx;
    }
}
