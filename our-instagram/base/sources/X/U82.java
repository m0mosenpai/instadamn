package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* loaded from: classes11.dex */
public final class U82 extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewPropertyAnimator A01;
    public final /* synthetic */ VK2 A02;
    public final /* synthetic */ AbstractC82213li A03;

    public U82(View view, ViewPropertyAnimator viewPropertyAnimator, VK2 vk2, AbstractC82213li abstractC82213li) {
        this.A03 = abstractC82213li;
        this.A02 = vk2;
        this.A01 = viewPropertyAnimator;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.setListener(null);
        View view = this.A00;
        view.setAlpha(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        AbstractC82213li abstractC82213li = this.A03;
        VK2 vk2 = this.A02;
        abstractC82213li.A0C(vk2.A04);
        abstractC82213li.A02.remove(vk2.A04);
        abstractC82213li.A0V();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
