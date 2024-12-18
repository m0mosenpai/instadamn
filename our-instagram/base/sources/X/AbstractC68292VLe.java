package X;

import android.graphics.Rect;

/* renamed from: X.VLe, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC68292VLe {
    public static final Rect[] A00(int i, int i2, int i3, boolean z) {
        Rect[] rectArr = new Rect[i3];
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            rectArr[i5] = new Rect();
        }
        if (i2 != 0) {
            double d = i2 / i3;
            while (i4 < i3) {
                int A00 = C1H4.A00(i4 * d);
                int i6 = i4 + 1;
                int A002 = i2 - C1H4.A00(i6 * d);
                Rect rect = rectArr[i4];
                if (i == 1) {
                    if (!z) {
                        rect.left = A00;
                        rect.right = A002;
                    } else {
                        rect.left = A002;
                        rect.right = A00;
                    }
                } else {
                    rect.top = A00;
                    rect.bottom = A002;
                }
                i4 = i6;
            }
        }
        return rectArr;
    }
}
