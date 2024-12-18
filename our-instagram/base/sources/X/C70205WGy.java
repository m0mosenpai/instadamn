package X;

import android.animation.ValueAnimator;

/* renamed from: X.WGy, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70205WGy implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ UHD A00;

    public C70205WGy(UHD uhd) {
        this.A00 = uhd;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int floatValue = (int) (((Number) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        UHD uhd = this.A00;
        uhd.A0O.setAlpha(floatValue);
        uhd.A0M.setAlpha(floatValue);
        uhd.A0A.invalidate();
    }
}
