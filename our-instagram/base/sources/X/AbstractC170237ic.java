package X;

import android.view.View;

/* renamed from: X.7ic, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC170237ic {
    public static final int A00(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int i3 = Integer.MIN_VALUE;
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                i3 = AbstractC63123SdR.MAX_SIGNED_POWER_OF_TWO;
                if (mode != 1073741824) {
                    throw new IllegalStateException(AnonymousClass001.A0O("Invalid spec mode: ", mode));
                }
            } else {
                return AbstractC75953b0.A00;
            }
        }
        int max = Math.max(0, size - i2);
        int i4 = AbstractC75953b0.A00;
        return View.MeasureSpec.makeMeasureSpec(max, i3);
    }
}
