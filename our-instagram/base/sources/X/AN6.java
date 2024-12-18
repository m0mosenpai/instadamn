package X;

import android.animation.Animator;
import android.graphics.drawable.Drawable;
import com.instagram.creation.capture.quickcapture.ephemeralmediatoggle.EphemeralMediaToggleView;

/* loaded from: classes4.dex */
public final class AN6 implements Animator.AnimatorListener {
    public final /* synthetic */ C9C4 A00;
    public final /* synthetic */ EphemeralMediaToggleView A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public AN6(C9C4 c9c4, EphemeralMediaToggleView ephemeralMediaToggleView) {
        this.A01 = ephemeralMediaToggleView;
        this.A00 = c9c4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.A01.A00.setImageDrawable((Drawable) this.A00.A03);
    }
}
