package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.4ye, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110664ye implements ValueAnimator.AnimatorUpdateListener {
    public WeakReference A00;

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C110644yc c110644yc = (C110644yc) this.A00.get();
        if (c110644yc != null) {
            c110644yc.A00(valueAnimator.getAnimatedFraction());
        }
    }
}
