package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes11.dex */
public final class U7q extends AnimatorListenerAdapter {
    public final /* synthetic */ C59322nb A00;

    public U7q(C59322nb c59322nb) {
        this.A00 = c59322nb;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A02(false);
    }
}
