package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.animation.AlphaAnimation;
import android.widget.TextView;

/* renamed from: X.JiR, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44329JiR extends AnimatorListenerAdapter {
    public final /* synthetic */ AlphaAnimation A00;
    public final /* synthetic */ C44736JrJ A01;
    public final /* synthetic */ C141596ac A02;

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C44329JiR(AlphaAnimation alphaAnimation, C44736JrJ c44736JrJ, C141596ac c141596ac) {
        this.A01 = c44736JrJ;
        this.A00 = alphaAnimation;
        this.A02 = c141596ac;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        TextView textView = this.A01.A01;
        textView.setVisibility(0);
        textView.startAnimation(this.A00);
        this.A02.A0e = true;
    }
}
