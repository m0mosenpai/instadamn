package X;

import android.animation.Animator;
import android.widget.ImageView;

/* loaded from: classes8.dex */
public final class LLm implements Animator.AnimatorListener {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ AnonymousClass693 A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public LLm(ImageView imageView, AnonymousClass693 anonymousClass693) {
        this.A01 = anonymousClass693;
        this.A00 = imageView;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        AnonymousClass693 anonymousClass693 = this.A01;
        if (anonymousClass693 != null) {
            this.A00.setImageDrawable(anonymousClass693);
            anonymousClass693.EH1();
            anonymousClass693.E4S();
        }
    }
}
