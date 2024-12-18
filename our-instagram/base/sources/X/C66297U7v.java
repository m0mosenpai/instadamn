package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.U7v, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66297U7v extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final /* synthetic */ UHD A01;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.A00 = true;
    }

    public C66297U7v(UHD uhd) {
        this.A01 = uhd;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00) {
            this.A00 = false;
            return;
        }
        UHD uhd = this.A01;
        if (((Number) uhd.A0K.getAnimatedValue()).floatValue() == 0.0f) {
            uhd.A02 = 0;
            uhd.A01(0);
        } else {
            uhd.A02 = 2;
            uhd.A0A.invalidate();
        }
    }
}
