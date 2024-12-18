package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.FhJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35284FhJ implements Animator.AnimatorListener {
    public final /* synthetic */ Animator.AnimatorListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C149566o8 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public C35284FhJ(Animator.AnimatorListener animatorListener, View view, C149566o8 c149566o8, boolean z, boolean z2) {
        this.A02 = c149566o8;
        this.A01 = view;
        this.A04 = z;
        this.A03 = z2;
        this.A00 = animatorListener;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C149566o8 c149566o8 = this.A02;
        boolean contains = c149566o8.A07.contains(this.A01);
        if (this.A04 && this.A03 && contains) {
            c149566o8.A02(this.A00);
        }
    }
}
