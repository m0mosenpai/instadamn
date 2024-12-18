package X;

import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes8.dex */
public abstract class LH1 {
    public static final Path A00(RectF rectF, Integer num, float f, float f2) {
        float f3;
        float f4;
        AbstractC167007dF.A1E(rectF, 0, num);
        Path A0T = AbstractC166987dD.A0T();
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                A0T.moveTo(rectF.left + (rectF.right / 2.0f), rectF.bottom);
                A02(A0T, rectF, f, f2);
                A01(A0T, rectF, f, f2);
                f3 = rectF.left + (rectF.right / 2.0f);
                f4 = rectF.bottom;
            } else {
                throw B4Z.A00();
            }
        } else {
            A0T.moveTo(rectF.left + (rectF.right / 2.0f), rectF.top);
            A01(A0T, rectF, f, f2);
            A02(A0T, rectF, f, f2);
            f3 = rectF.left + (rectF.right / 2.0f);
            f4 = rectF.top;
        }
        A0T.lineTo(f3, f4);
        return A0T;
    }

    public static void A01(Path path, RectF rectF, float f, float f2) {
        path.lineTo(rectF.right - f, rectF.top);
        float f3 = rectF.right;
        float f4 = rectF.top;
        path.quadTo(f3, f4, f3, f4 + f2);
        path.lineTo(rectF.right, rectF.bottom - f2);
        float f5 = rectF.right;
        float f6 = rectF.bottom;
        path.quadTo(f5, f6, f5 - f, f6);
    }

    public static void A02(Path path, RectF rectF, float f, float f2) {
        path.lineTo(rectF.left + f, rectF.bottom);
        float f3 = rectF.left;
        float f4 = rectF.bottom;
        path.quadTo(f3, f4, f3, f4 - f2);
        path.lineTo(rectF.left, rectF.top + f2);
        float f5 = rectF.left;
        float f6 = rectF.top;
        path.quadTo(f5, f6, f5 + f, f6);
    }
}
