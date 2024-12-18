package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.animation.Animation;

/* renamed from: X.064, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass064 {
    public final AnimatorSet A00;
    public final Animation A01;

    public AnonymousClass064(Animator animator) {
        this.A01 = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.play(animator);
    }

    public AnonymousClass064(Animation animation) {
        this.A01 = animation;
        this.A00 = null;
    }
}
