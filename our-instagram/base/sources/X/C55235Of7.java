package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;

/* renamed from: X.Of7, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C55235Of7 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ SegmentedProgressBar A00;

    public C55235Of7(SegmentedProgressBar segmentedProgressBar) {
        this.A00 = segmentedProgressBar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A00.invalidate();
    }
}
