package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Ttt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65778Ttt extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C3OO A02;
    public final /* synthetic */ AbstractC82213li A03;

    public C65778Ttt(View view, ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, AbstractC82213li abstractC82213li) {
        this.A03 = abstractC82213li;
        this.A02 = c3oo;
        this.A00 = view;
        this.A01 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00.setAlpha(1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        AbstractC82213li abstractC82213li = this.A03;
        C3OO c3oo = this.A02;
        abstractC82213li.A0O(c3oo);
        abstractC82213li.A00.remove(c3oo);
        abstractC82213li.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
