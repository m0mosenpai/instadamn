package X;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: X.JeD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class RunnableC44088JeD implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ View A02;

    public RunnableC44088JeD(View view, View view2, float f) {
        this.A02 = view;
        this.A00 = f;
        this.A01 = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AnimatorSet animatorSet = new AnimatorSet();
        View view = this.A02;
        float f = this.A00;
        View view2 = this.A01;
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(500L), ObjectAnimator.ofFloat(view, "translationY", 0.0f, f).setDuration(500L), ObjectAnimator.ofFloat(view2, "alpha", 0.0f, 1.0f).setDuration(500L), ObjectAnimator.ofFloat(view2, "translationY", -f, 0.0f).setDuration(500L));
        animatorSet.start();
    }
}
