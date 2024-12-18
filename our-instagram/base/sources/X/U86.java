package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes11.dex */
public final class U86 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ C3OO A02;
    public final /* synthetic */ C82203lh A03;
    public final /* synthetic */ InterfaceC162347Ow A04;

    public U86(View view, ViewPropertyAnimator viewPropertyAnimator, C3OO c3oo, C82203lh c82203lh, InterfaceC162347Ow interfaceC162347Ow) {
        this.A03 = c82203lh;
        this.A02 = c3oo;
        this.A00 = view;
        this.A04 = interfaceC162347Ow;
        this.A01 = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        View view = this.A00;
        view.setAlpha(1.0f);
        view.setTranslationY(0.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC162347Ow interfaceC162347Ow = this.A04;
        if (interfaceC162347Ow != null) {
            interfaceC162347Ow.AI4();
        }
        ViewPropertyAnimator viewPropertyAnimator = this.A01;
        viewPropertyAnimator.setUpdateListener(null);
        viewPropertyAnimator.setListener(null);
        C82203lh c82203lh = this.A03;
        C3OO c3oo = this.A02;
        c82203lh.A0O(c3oo);
        ((AbstractC82213li) c82203lh).A00.remove(c3oo);
        c82203lh.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
