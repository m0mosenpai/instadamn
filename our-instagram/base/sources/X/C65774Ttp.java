package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Ttp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65774Ttp extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C3OO A04;
    public final /* synthetic */ AbstractC82213li A05;

    public C65774Ttp(View view, ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, AbstractC82213li abstractC82213li, int i, int i2) {
        this.A05 = abstractC82213li;
        this.A04 = c3oo;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A03.setListener(null);
        AbstractC82213li abstractC82213li = this.A05;
        C3OO c3oo = this.A04;
        abstractC82213li.A0P(c3oo);
        abstractC82213li.A04.remove(c3oo);
        abstractC82213li.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
