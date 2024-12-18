package X;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;

/* loaded from: classes4.dex */
public final class A87 {
    public boolean A00;
    public final ValueAnimator A01;
    public final C2XI A02;

    public A87(C2XI c2xi, int i, int i2) {
        C14360o3.A0B(c2xi, 4);
        this.A02 = c2xi;
        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(i), Integer.valueOf(i2));
        ofObject.setDuration(300L);
        ofObject.setStartDelay(2000L);
        ANV.A00(ofObject, this, 1);
        this.A01 = ofObject;
    }
}
