package X;

import android.animation.Animator;
import android.os.SystemClock;

/* renamed from: X.WGu, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70202WGu implements Animator.AnimatorListener {
    public final /* synthetic */ C139306Sl A00;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C70202WGu(C139306Sl c139306Sl) {
        this.A00 = c139306Sl;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C141596ac c141596ac;
        C139306Sl c139306Sl = this.A00;
        if (c139306Sl.A02 != null && SystemClock.uptimeMillis() - r0.A0P > VWF.A00(c139306Sl.A06) && (c141596ac = c139306Sl.A02) != null) {
            c141596ac.A0k = true;
        }
    }
}
