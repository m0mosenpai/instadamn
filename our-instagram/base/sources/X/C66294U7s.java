package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.U7s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66294U7s extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C86173so A01;

    public C66294U7s(View view, C86173so c86173so) {
        this.A01 = c86173so;
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C86173so.A03(this.A00, this.A01);
    }
}
