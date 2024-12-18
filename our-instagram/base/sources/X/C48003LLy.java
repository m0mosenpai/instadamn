package X;

import android.animation.ValueAnimator;
import com.instagram.ui.widget.pageindicator.CirclePageIndicator;

/* renamed from: X.LLy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48003LLy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CirclePageIndicator A00;

    public C48003LLy(CirclePageIndicator circlePageIndicator) {
        this.A00 = circlePageIndicator;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        this.A00.setBackgroundScale(AbstractC167017dG.A00(valueAnimator));
    }
}
