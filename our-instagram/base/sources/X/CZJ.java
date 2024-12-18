package X;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateInterpolator;

/* loaded from: classes5.dex */
public abstract class CZJ {
    public static final void A00(C2XI c2xi, C77123cy c77123cy) {
        boolean A1a = AbstractC167017dG.A1a(c77123cy, c2xi);
        AbstractC25233BEq.A1C(c77123cy);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(-8.0f, 0.0f, 8.0f, 0.0f);
        ofFloat.setDuration(250L);
        ofFloat.setRepeatCount(A1a ? 1 : 0);
        ofFloat.setRepeatMode(A1a ? 1 : 0);
        ofFloat.setInterpolator(new AccelerateInterpolator());
        AbstractC25231BEo.A0w(new BFF(c2xi, 23), ofFloat, c77123cy);
    }

    public static final void A01(C2XI c2xi, C77123cy c77123cy, long j) {
        AbstractC167017dG.A1N(c77123cy, c2xi);
        AbstractC25233BEq.A1C(c77123cy);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(j);
        AbstractC25231BEo.A0w(new BFF(c2xi, 20), ofFloat, c77123cy);
    }
}
