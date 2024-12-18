package X;

import android.graphics.PointF;

/* loaded from: classes11.dex */
public abstract class VVR {
    public static final C69305VlD A00(PointF pointF, W48 w48, int i, int i2) {
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        return new C69305VlD(w48.A00(pointF.x - f, pointF.y - f2), w48.A00(pointF.x + f, pointF.y - f2), w48.A00(pointF.x + f, pointF.y + f2), w48.A00(pointF.x - f, pointF.y + f2), w48.A00(pointF.x, pointF.y));
    }
}
