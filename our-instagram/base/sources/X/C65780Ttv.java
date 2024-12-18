package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: X.Ttv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C65780Ttv extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ View A02;
    public final /* synthetic */ ViewPropertyAnimator A03;
    public final /* synthetic */ C3OO A04;
    public final /* synthetic */ C82203lh A05;
    public final /* synthetic */ InterfaceC162347Ow A06;

    public C65780Ttv(View view, ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, C82203lh c82203lh, InterfaceC162347Ow interfaceC162347Ow, int i, int i2) {
        this.A05 = c82203lh;
        this.A04 = c3oo;
        this.A06 = interfaceC162347Ow;
        this.A00 = i;
        this.A02 = view;
        this.A01 = i2;
        this.A03 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A06.AI4();
        if (this.A00 != 0) {
            this.A02.setTranslationX(0.0f);
        }
        if (this.A01 != 0) {
            this.A02.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewPropertyAnimator viewPropertyAnimator = this.A03;
        viewPropertyAnimator.setUpdateListener(null);
        viewPropertyAnimator.setListener(null);
        C82203lh c82203lh = this.A05;
        C3OO c3oo = this.A04;
        c82203lh.A0P(c3oo);
        ((AbstractC82213li) c82203lh).A04.remove(c3oo);
        c82203lh.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
