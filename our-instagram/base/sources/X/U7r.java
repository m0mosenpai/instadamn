package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* loaded from: classes11.dex */
public final class U7r extends AnimatorListenerAdapter {
    public final /* synthetic */ View A00;

    public U7r(View view) {
        this.A00 = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.setVisibility(8);
    }
}
