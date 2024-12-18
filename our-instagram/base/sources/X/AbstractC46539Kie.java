package X;

import android.animation.ValueAnimator;

/* renamed from: X.Kie, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC46539Kie {
    public static final Object A00(C6FW c6fw) {
        ValueAnimator valueAnimator = (ValueAnimator) c6fw.A00.get(0);
        float A00 = AbstractC43593JPy.A00(c6fw.A03(1), "null cannot be cast to non-null type kotlin.Number");
        float A002 = AbstractC43593JPy.A00(c6fw.A03(2), "null cannot be cast to non-null type kotlin.Number");
        if (valueAnimator != null) {
            valueAnimator.setFloatValues(AbstractC167017dG.A00(valueAnimator), A00);
            valueAnimator.setDuration(A002 * 1000.0f);
            valueAnimator.start();
            return null;
        }
        return null;
    }
}
