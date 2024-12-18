package X;

import android.graphics.Rect;

/* loaded from: classes10.dex */
public abstract class SS1 {
    public static final void A00(Rect rect, float f, float f2, float f3) {
        C14360o3.A0B(rect, 0);
        int i = rect.left;
        int i2 = rect.top;
        int width = rect.width();
        int height = rect.height();
        float f4 = width * f3;
        rect.left = (int) (i - f4);
        float f5 = height;
        rect.top = (int) (i2 - (f5 * f));
        rect.right = (int) (r4 + width + (f4 * 2.0f));
        rect.bottom = (int) (r2 + height + (f5 * (f + f2)));
    }

    public static final void A01(Rect rect, int i, int i2) {
        float f;
        float f2;
        float f3;
        C14360o3.A0B(rect, 0);
        float f4 = i;
        if (i < i2) {
            f = 0.8f;
        } else {
            f = 0.66f;
            if (i > i2) {
                float f5 = i2 * 0.9f;
                f2 = f5;
                f3 = (3.0f * f5) / 4.0f;
                float f6 = i / 2;
                float f7 = f3 / 2.0f;
                float f8 = i2 / 2;
                float f9 = f2 / 2.0f;
                rect.set((int) (f6 - f7), (int) (f8 - f9), (int) (f6 + f7), (int) (f8 + f9));
            }
        }
        f3 = f4 * f;
        f2 = (4.0f * f3) / 3.0f;
        float f62 = i / 2;
        float f72 = f3 / 2.0f;
        float f82 = i2 / 2;
        float f92 = f2 / 2.0f;
        rect.set((int) (f62 - f72), (int) (f82 - f92), (int) (f62 + f72), (int) (f82 + f92));
    }
}
