package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* loaded from: classes8.dex */
public final class LM1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SegmentedProgressBar A01;

    public LM1(SegmentedProgressBar segmentedProgressBar, int i) {
        this.A01 = segmentedProgressBar;
        this.A00 = i;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Object A0s = AbstractC43593JPy.A0s(valueAnimator);
        C14360o3.A0C(A0s, "null cannot be cast to non-null type kotlin.Float");
        SegmentedProgressBar segmentedProgressBar = this.A01;
        int i = SegmentedProgressBar.A0V;
        segmentedProgressBar.A0Q.put(this.A00, A0s);
        segmentedProgressBar.invalidate();
    }
}
