package X;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.OXa, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC55024OXa {
    public static final boolean A00(Canvas canvas, float f, float f2, float f3, float f4) {
        return canvas.quickReject(f, f2, f3, f4);
    }

    public static final boolean A01(Canvas canvas, Path path) {
        return canvas.quickReject(path);
    }

    public static final boolean A02(Canvas canvas, RectF rectF) {
        return canvas.quickReject(rectF);
    }
}
