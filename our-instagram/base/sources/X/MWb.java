package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes9.dex */
public final class MWb extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C71L A01;

    public MWb(View view, C71L c71l) {
        this.A01 = c71l;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C71L c71l = this.A01;
        if (c71l.A03 == C05F.A01) {
            AbstractC167007dF.A0x(this.A00);
            c71l.A04 = true;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C71L c71l = this.A01;
        if (c71l.A03 == C05F.A00) {
            View view = this.A00;
            if (view != null) {
                view.setVisibility(0);
            }
            c71l.A04 = false;
        }
    }
}
