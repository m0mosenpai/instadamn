package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes11.dex */
public final class U84 extends AnimatorListenerAdapter {
    public final long A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C66292U7o A02;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C14360o3.A0B(animator, 0);
        C66292U7o c66292U7o = this.A02;
        if (c66292U7o.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        c66292U7o.A00 = 0;
        c66292U7o.A01 = true;
        C66292U7o.A00(c66292U7o, new C57560PgY(c66292U7o, 46));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i;
        C14360o3.A0B(animator, 0);
        C66292U7o c66292U7o = this.A02;
        if (c66292U7o.A00 == 0 && animator.getStartDelay() != 0) {
            animator.setStartDelay(this.A00);
        }
        int i2 = c66292U7o.A00 + 1;
        c66292U7o.A00 = i2;
        if (!c66292U7o.A01 && ((i = this.A01) == -1 || i2 < i)) {
            animator.start();
            return;
        }
        c66292U7o.A00 = 0;
        c66292U7o.A01 = false;
        C66292U7o.A00(c66292U7o, new C57560PgY(c66292U7o, 47));
    }

    public U84(C66292U7o c66292U7o, int i) {
        this.A02 = c66292U7o;
        this.A01 = i;
        this.A00 = c66292U7o.A05.getStartDelay();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        C66292U7o c66292U7o = this.A02;
        if (c66292U7o.A00 == 0) {
            C66292U7o.A00(c66292U7o, new C57560PgY(c66292U7o, 48));
        }
    }
}
