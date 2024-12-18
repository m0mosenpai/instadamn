package X;

import android.graphics.Rect;

/* loaded from: classes4.dex */
public abstract class A0S {
    public static Rect A00(Rect rect, int i, int i2, int i3, int i4) {
        if (i == i3 && i2 == i4) {
            return new Rect(rect);
        }
        float f = i3;
        float f2 = i4;
        float max = Math.max(i / f, i2 / f2);
        Rect A0U = AbstractC166987dD.A0U();
        A0U.left = (int) ((rect.left * max) + 0.5f);
        int i5 = (int) ((rect.right * max) + 0.5f);
        A0U.right = i5;
        A0U.top = (int) ((rect.top * max) + 0.5f);
        int i6 = (int) ((rect.bottom * max) + 0.5f);
        A0U.bottom = i6;
        A0U.right = (int) Math.min(i5, (f * max) + 0.5f);
        A0U.bottom = (int) Math.min(i6, (f2 * max) + 0.5f);
        return A0U;
    }
}
