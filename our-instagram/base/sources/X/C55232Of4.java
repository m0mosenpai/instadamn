package X;

import android.animation.Animator;

/* renamed from: X.Of4, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55232Of4 implements Animator.AnimatorListener {
    public final InterfaceC16820sZ A00;
    public final /* synthetic */ PCP A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C55232Of4(PCP pcp, InterfaceC16820sZ interfaceC16820sZ) {
        this.A01 = pcp;
        this.A00 = interfaceC16820sZ;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.invoke();
    }
}
