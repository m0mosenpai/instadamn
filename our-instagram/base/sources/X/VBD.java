package X;

import android.animation.Animator;

/* loaded from: classes11.dex */
public final class VBD extends AbstractC87373uv {
    public final /* synthetic */ W33 A00;

    public VBD(W33 w33) {
        this.A00 = w33;
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A00.A04.setVisibility(8);
    }
}
