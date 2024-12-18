package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public final class ANC implements Animator.AnimatorListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C184668Hh A02;
    public final /* synthetic */ Runnable A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public ANC(View view, C184668Hh c184668Hh, Runnable runnable, float f) {
        this.A02 = c184668Hh;
        this.A01 = view;
        this.A00 = f;
        this.A03 = runnable;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C184668Hh c184668Hh = this.A02;
        ObjectAnimator objectAnimator = c184668Hh.A00;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            c184668Hh.A00 = null;
        }
        Runnable runnable = this.A03;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.A01;
        view.setVisibility(0);
        float f = this.A00;
        if (f == -1.0f) {
            f = 0.0f;
        }
        view.setAlpha(f);
    }
}
