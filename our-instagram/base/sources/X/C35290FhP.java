package X;

import android.animation.ValueAnimator;
import com.instagram.clips.animatedthumbnail.AnimatedThumbnailView;

/* renamed from: X.FhP, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35290FhP implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnimatedThumbnailView A00;
    public final /* synthetic */ C15100pQ A01;

    public C35290FhP(AnimatedThumbnailView animatedThumbnailView, C15100pQ c15100pQ) {
        this.A01 = c15100pQ;
        this.A00 = animatedThumbnailView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C14360o3.A0B(valueAnimator, 0);
        int A0D = AbstractC25230BEn.A0D(valueAnimator.getAnimatedValue(), "null cannot be cast to non-null type kotlin.Int");
        C15100pQ c15100pQ = this.A01;
        if (A0D != c15100pQ.A00) {
            c15100pQ.A00 = A0D;
            AnimatedThumbnailView animatedThumbnailView = this.A00;
            animatedThumbnailView.A00 = A0D;
            animatedThumbnailView.invalidate();
        }
    }
}
