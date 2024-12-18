package X;

import android.animation.Animator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* loaded from: classes4.dex */
public final class ANA implements Animator.AnimatorListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }

    public ANA(SegmentedProgressBar segmentedProgressBar, int i) {
        this.A01 = segmentedProgressBar;
        this.A00 = i;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        SegmentedProgressBar segmentedProgressBar = this.A01;
        int i = SegmentedProgressBar.A0V;
        segmentedProgressBar.A0S.remove(this.A00);
    }
}
