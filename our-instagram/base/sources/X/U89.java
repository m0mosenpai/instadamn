package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class U89 extends AnimatorListenerAdapter implements XE3 {
    public boolean A01;
    public final int A02;
    public final View A03;
    public final ViewGroup A04;
    public boolean A00 = false;
    public final boolean A05 = true;

    public U89(View view, int i) {
        this.A03 = view;
        this.A02 = i;
        this.A04 = (ViewGroup) view.getParent();
        A00(true);
    }

    @Override // X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvP(AbstractC66024TyM abstractC66024TyM) {
        A00(false);
        if (!this.A00) {
            VZP.A02.A04(this.A03, this.A02);
        }
    }

    @Override // X.XE3
    public final void DvR(AbstractC66024TyM abstractC66024TyM) {
        A00(true);
        if (!this.A00) {
            VZP.A02.A04(this.A03, 0);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    private void A00(boolean z) {
        ViewGroup viewGroup;
        if (this.A05 && this.A01 != z && (viewGroup = this.A04) != null) {
            this.A01 = z;
            AbstractC68621VXx.A00(viewGroup, z);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.A00) {
            VZP.A02.A04(this.A03, this.A02);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        A00(false);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            VZP.A02.A04(this.A03, 0);
            ViewGroup viewGroup = this.A04;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
    }

    @Override // X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        abstractC66024TyM.A0B(this);
    }

    @Override // X.XE3
    public final /* synthetic */ void DvT(AbstractC66024TyM abstractC66024TyM, boolean z) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            if (!this.A00) {
                VZP.A02.A04(this.A03, this.A02);
                ViewGroup viewGroup = this.A04;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            A00(false);
        }
    }
}
