package X;

import android.view.View;

/* renamed from: X.Ntn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC53976Ntn {
    public static final boolean A00(View view, float f, float f2) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        if (f <= i || f >= i + view.getWidth() || f2 <= i2 || f2 >= i2 + view.getHeight()) {
            return false;
        }
        return true;
    }
}
