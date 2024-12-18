package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* renamed from: X.04E, reason: invalid class name */
/* loaded from: classes.dex */
public final class C04E {
    public final WeakReference A00;

    public final void A00() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void A01() {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public final void A02(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void A03(float f) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void A04(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void A05(long j) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
    }

    public final void A06(Interpolator interpolator) {
        View view = (View) this.A00.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
    }

    public final void A07(final C04F c04f) {
        AnimatorListenerAdapter animatorListenerAdapter;
        final View view = (View) this.A00.get();
        if (view != null) {
            ViewPropertyAnimator animate = view.animate();
            if (c04f != null) {
                animatorListenerAdapter = new AnimatorListenerAdapter() { // from class: X.04C
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        c04f.CwU(view);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        c04f.CwY(view);
                    }

                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        c04f.Cwg(view);
                    }
                };
            } else {
                animatorListenerAdapter = null;
            }
            animate.setListener(animatorListenerAdapter);
        }
    }

    public C04E(View view) {
        this.A00 = new WeakReference(view);
    }
}
