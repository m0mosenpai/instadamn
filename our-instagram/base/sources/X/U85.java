package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes11.dex */
public final class U85 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C3OO A02;
    public final /* synthetic */ C82203lh A03;

    public U85(View view, ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, C82203lh c82203lh) {
        this.A03 = c82203lh;
        this.A02 = c3oo;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.setAlpha(1.0f);
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        viewPropertyAnimator.setUpdateListener(null);
        viewPropertyAnimator.setListener(null);
        C82203lh c82203lh = this.A03;
        C3OO c3oo = this.A02;
        c82203lh.A0Q(c3oo);
        c82203lh.A0A.remove(c3oo);
        c82203lh.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
