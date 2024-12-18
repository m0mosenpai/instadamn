package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U87 extends AnimatorListenerAdapter implements XE3 {
    public boolean A00 = false;
    public final View A01;

    @Override // X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvT(AbstractC66024TyM abstractC66024TyM, boolean z) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        onAnimationEnd(animator, false);
    }

    @Override // X.XE3
    public final void DvP(AbstractC66024TyM abstractC66024TyM) {
        float f;
        View view = this.A01;
        if (view.getVisibility() == 0) {
            f = VZP.A02.A00(view);
        } else {
            f = 0.0f;
        }
        view.setTag(R.id.transition_pause_alpha, Float.valueOf(f));
    }

    @Override // X.XE3
    public final void DvR(AbstractC66024TyM abstractC66024TyM) {
        this.A01.setTag(R.id.transition_pause_alpha, null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        VZP.A02.A03(this.A01, 1.0f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (view.hasOverlappingRendering() && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, null);
        }
    }

    public U87(View view) {
        this.A01 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (this.A00) {
            this.A01.setLayerType(0, null);
        }
        if (!z) {
            VZP.A02.A03(this.A01, 1.0f);
        }
    }
}
