package X;

import android.animation.Animator;
import android.view.View;

/* renamed from: X.FhK, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35285FhK implements Animator.AnimatorListener {
    public final /* synthetic */ Animator.AnimatorListener A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ C149566o8 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C35285FhK(Animator.AnimatorListener animatorListener, View view, C149566o8 c149566o8, boolean z, boolean z2) {
        this.A04 = z;
        this.A03 = z2;
        this.A02 = c149566o8;
        this.A00 = animatorListener;
        this.A01 = view;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C149566o8 c149566o8 = this.A02;
        c149566o8.A07.remove(this.A01);
        c149566o8.A01();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A02.A07.remove(this.A01);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        if (this.A04 && !this.A03) {
            this.A02.A02(this.A00);
        }
    }
}
