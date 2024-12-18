package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U88 extends AnimatorListenerAdapter implements XE3 {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final ViewGroup A03;
    public final /* synthetic */ UK3 A04;

    @Override // X.XE3
    public final void DvP(AbstractC66024TyM abstractC66024TyM) {
    }

    @Override // X.XE3
    public final void DvR(AbstractC66024TyM abstractC66024TyM) {
    }

    public U88(View view, View view2, ViewGroup viewGroup, UK3 uk3) {
        this.A04 = uk3;
        this.A03 = viewGroup;
        this.A01 = view;
        this.A02 = view2;
    }

    private void A00() {
        this.A02.setTag(R.id.save_overlay_view, null);
        this.A03.getOverlay().remove(this.A01);
        this.A00 = false;
    }

    @Override // X.XE3
    public final void DvN(AbstractC66024TyM abstractC66024TyM) {
        if (this.A00) {
            A00();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.A03.getOverlay().remove(this.A01);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        View view = this.A01;
        if (view.getParent() == null) {
            this.A03.getOverlay().add(view);
        } else {
            this.A04.A0F();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator, boolean z) {
        if (z) {
            View view = this.A02;
            View view2 = this.A01;
            view.setTag(R.id.save_overlay_view, view2);
            this.A03.getOverlay().add(view2);
            this.A00 = true;
        }
    }

    @Override // X.XE3
    public final void DvO(AbstractC66024TyM abstractC66024TyM) {
        abstractC66024TyM.A0B(this);
    }

    @Override // X.XE3
    public final /* synthetic */ void DvT(AbstractC66024TyM abstractC66024TyM, boolean z) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        A00();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator, boolean z) {
        if (!z) {
            A00();
        }
    }
}
