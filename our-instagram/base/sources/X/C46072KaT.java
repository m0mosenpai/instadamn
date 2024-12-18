package X;

import android.animation.Animator;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.KaT, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C46072KaT extends AbstractC87373uv {
    public final /* synthetic */ CircularImageView A00;

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        C14360o3.A0B(animator, 0);
        onAnimationEnd(animator);
    }

    @Override // X.AbstractC87373uv, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C14360o3.A0B(animator, 0);
        this.A00.setVisibility(4);
        animator.removeListener(this);
    }

    public C46072KaT(CircularImageView circularImageView) {
        this.A00 = circularImageView;
    }
}
