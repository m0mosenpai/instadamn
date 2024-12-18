package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes5.dex */
public final class BQ4 extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public BQ4(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != 0) {
            super.onAnimationCancel(animator);
        } else {
            ((InterfaceC73603YNf) this.A01).DH5(true);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00 != 0) {
            AbstractC25232BEp.A1O(this.A02);
            ((C51762Yz) this.A01).A00();
            return;
        }
        C28946Cpu c28946Cpu = (C28946Cpu) this.A02;
        if (c28946Cpu.A01) {
            return;
        }
        ((InterfaceC73603YNf) this.A01).DH5(false);
        c28946Cpu.A00 = false;
    }
}
