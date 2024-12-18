package X;

import android.animation.Animator;

/* renamed from: X.Iev, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41779Iev implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C97624Zx A01;
    public final /* synthetic */ Wm1 A02;
    public final /* synthetic */ C146036i0 A03;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    public C41779Iev(C97624Zx c97624Zx, Wm1 wm1, C146036i0 c146036i0, int i) {
        this.A03 = c146036i0;
        this.A00 = i;
        this.A02 = wm1;
        this.A01 = c97624Zx;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        this.A03.A0F.EJJ();
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.A00 != this.A02.A00()) {
            this.A01.A00();
        }
        this.A03.A0F.EJJ();
        animator.removeListener(this);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A03.A0F.EJE("tapped");
    }
}
