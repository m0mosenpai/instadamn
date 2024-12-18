package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: X.JXy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43785JXy extends AnimatorListenerAdapter {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C58652mO A01;
    public final /* synthetic */ JYW A02;

    public C43785JXy(C58652mO c58652mO, JYW jyw, int i) {
        this.A02 = jyw;
        this.A01 = c58652mO;
        this.A00 = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        JYW jyw = this.A02;
        C58652mO c58652mO = this.A01;
        long j = this.A00;
        jyw.A05.setImageDrawable(c58652mO);
        if (j > 0) {
            c58652mO.EH0((int) j);
        } else {
            c58652mO.EH1();
        }
        c58652mO.E4S();
    }
}
