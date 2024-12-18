package X;

import android.animation.ObjectAnimator;
import android.view.View;

/* loaded from: classes4.dex */
public abstract class AJq {
    public static final C55942hf A00 = C55942hf.A02(3.0d);

    public static void A00(View view) {
        ObjectAnimator.ofFloat(view, "rotation", 0.0f, -4.0f, 4.0f, -4.0f, 0.0f).setDuration(300L).start();
    }

    public static void A01(View view, boolean z) {
        AbstractC125325le A002 = AbstractC125325le.A00(view);
        float f = 0.5f;
        if (z) {
            f = 1.0f;
        }
        A002.A0I(f);
        A002.A0H();
    }
}
