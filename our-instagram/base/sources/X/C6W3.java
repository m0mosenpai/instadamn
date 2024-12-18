package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6W3, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C6W3 {
    public static final float A00 = (float) Math.sqrt(5.0d);

    public static float A00(Context context, float f) {
        if (f == 0.0f) {
            f = 2.1474836E9f;
        }
        float f2 = context.getResources().getDisplayMetrics().density;
        return f2 * f2 * (-f) * A00;
    }

    public static void A01(View view, C6W1 c6w1) {
        float width = view.getWidth();
        float f = c6w1.A09;
        if (c6w1.A0I) {
            f = (f * width) / 100.0f;
        }
        view.setTranslationX(f);
        float height = view.getHeight();
        float f2 = c6w1.A0A;
        if (c6w1.A0J) {
            f2 = (f2 * height) / 100.0f;
        }
        view.setTranslationY(f2);
        if (c6w1.A0F) {
            float width2 = view.getWidth();
            float f3 = c6w1.A02;
            if (c6w1.A0G) {
                f3 = (f3 * width2) / 100.0f;
            }
            view.setPivotX(f3);
            float height2 = view.getHeight();
            float f4 = c6w1.A03;
            if (c6w1.A0H) {
                f4 = (f4 * height2) / 100.0f;
            }
            view.setPivotY(f4);
        }
    }
}
