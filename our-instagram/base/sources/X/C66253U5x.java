package X;

import android.animation.Animator;

/* renamed from: X.U5x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66253U5x implements Animator.AnimatorPauseListener {
    public final /* synthetic */ C63142tr A00;
    public final /* synthetic */ String A01;

    public C66253U5x(C63142tr c63142tr, String str) {
        this.A00 = c63142tr;
        this.A01 = str;
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        C63142tr c63142tr = this.A00;
        if (c63142tr != null) {
            C66254U5y c66254U5y = (C66254U5y) c63142tr.A02.get(this.A01);
            if (c66254U5y != null) {
                c66254U5y.A01 = -1;
                c66254U5y.A06 = false;
            }
        }
    }

    @Override // android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        C63142tr c63142tr = this.A00;
        if (c63142tr != null) {
            C66254U5y c66254U5y = (C66254U5y) c63142tr.A02.get(this.A01);
            if (c66254U5y != null) {
                c66254U5y.A06 = true;
            }
        }
    }
}
