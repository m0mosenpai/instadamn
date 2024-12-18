package X;

import android.graphics.Rect;

/* renamed from: X.8oH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC197468oH {
    public static final int A00(int i, Rect rect) {
        if (rect != null) {
            int i2 = rect.top;
            int i3 = rect.bottom;
            if (i2 < i3) {
                return i3 - i2;
            }
            AbstractC12120kG.A07("TransformMatrixConfigUtil", AnonymousClass001.A0p("Invalid crop top=", " bottom=", " originalHeight=", i2, i3, i), null);
            return i;
        }
        return i;
    }

    public static final int A01(int i, Rect rect) {
        if (rect != null) {
            int i2 = rect.left;
            int i3 = rect.right;
            if (i2 < i3) {
                return i3 - i2;
            }
            AbstractC12120kG.A07("TransformMatrixConfigUtil", AnonymousClass001.A0p("Invalid crop left=", " right=", " originalWidth=", i2, i3, i), null);
            return i;
        }
        return i;
    }
}
