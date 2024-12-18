package X;

import android.animation.Animator;

/* loaded from: classes5.dex */
public final class D1L implements Runnable {
    public final /* synthetic */ C77123cy A00;

    public D1L(C77123cy c77123cy) {
        this.A00 = c77123cy;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Animator animator = (Animator) AbstractC25225BEi.A12(this.A00);
        if (animator != null) {
            animator.start();
        }
    }
}
