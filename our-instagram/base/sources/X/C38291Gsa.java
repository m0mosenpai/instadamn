package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: X.Gsa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38291Gsa extends AnimatorListenerAdapter {
    public final int A00;
    public final Object A01;

    public C38291Gsa(View view, int i) {
        this.A00 = i;
        this.A01 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ((View) this.A01).setVisibility(4);
    }
}
