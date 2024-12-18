package X;

import android.animation.Animator;
import android.view.View;

/* loaded from: classes11.dex */
public final class WGw implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;
    public final boolean A02;

    public WGw(int i, Object obj, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = z;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.A00) {
            case 0:
                ((View) this.A01).setVisibility(AbstractC167007dF.A05(this.A02 ? 1 : 0));
                return;
            case 1:
                AbstractC67878V0j abstractC67878V0j = (AbstractC67878V0j) this.A01;
                abstractC67878V0j.A0M = false;
                if (!this.A02) {
                    return;
                }
                abstractC67878V0j.A0N = true;
                return;
            default:
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A00 == 0) {
            ((View) this.A01).setVisibility(0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
