package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.FhH, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35282FhH implements Animator.AnimatorListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C149566o8 A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C35282FhH(View view, C149566o8 c149566o8) {
        this.A01 = c149566o8;
        this.A00 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A01.A07.remove(this.A00);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.A07.remove(this.A00);
    }
}
