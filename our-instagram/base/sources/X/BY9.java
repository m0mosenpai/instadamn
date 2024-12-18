package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes5.dex */
public final class BY9 extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public BY9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C51762Yz c51762Yz;
        C6U c6u;
        switch (this.A00) {
            case 0:
                c51762Yz = (C51762Yz) this.A01;
                c6u = C6U.A03;
                break;
            case 1:
                c51762Yz = (C51762Yz) this.A01;
                c6u = C6U.A04;
                break;
            default:
                C14360o3.A0B(animator, 0);
                super.onAnimationEnd(animator);
                BZA bza = (BZA) this.A01;
                if (bza.A00) {
                    bza.A01.start();
                    return;
                }
                return;
        }
        c51762Yz.A01(c6u);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.A00) {
            case 0:
            case 1:
                ((C51762Yz) this.A01).A01(C6U.A02);
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
