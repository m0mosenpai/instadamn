package X;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.Of3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55231Of3 implements Animator.AnimatorListener {
    public final int A00;
    public final Object A01;

    public C55231Of3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.A01;
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                return;
            case 2:
            default:
                return;
            case 3:
                ((View) this.A01).setTag(null);
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        switch (this.A00) {
            case 0:
                AbstractC166987dD.A1Y(this.A01);
                return;
            case 1:
                ValueAnimator valueAnimator = (ValueAnimator) this.A01;
                valueAnimator.removeAllListeners();
                valueAnimator.removeAllUpdateListeners();
                return;
            case 2:
                C55076OaW c55076OaW = (C55076OaW) this.A01;
                if (c55076OaW.A09 != EnumC53149Nf4.A05 || (view = c55076OaW.A05) == null || view.getVisibility() != 0) {
                    return;
                }
                AbstractC167007dF.A0x(c55076OaW.A05);
                return;
            case 3:
                ((View) this.A01).setTag(null);
                return;
            case 4:
                C51042Mgs A07 = ((AbstractC67878V0j) this.A01).A07();
                AbstractC166987dD.A1Z(new PYs(A07, null, 21), AbstractC141776au.A00(A07));
                return;
            default:
                PJ5 pj5 = (PJ5) this.A01;
                pj5.A01 = true;
                pj5.A05.dismiss();
                return;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        View view;
        View view2;
        if (2 - this.A00 == 0) {
            C55076OaW c55076OaW = (C55076OaW) this.A01;
            if (c55076OaW.A09 != EnumC53149Nf4.A05 && (view = c55076OaW.A05) != null && view.getVisibility() != 0 && (view2 = c55076OaW.A05) != null) {
                view2.setVisibility(0);
            }
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }
}
