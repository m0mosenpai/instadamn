package X;

import android.graphics.PointF;
import com.facebook.common.math.matrix.Matrix4;

/* loaded from: classes4.dex */
public final class A5U {
    public final Matrix4 A00;

    public A5U(float f, float f2, float f3, int i, int i2) {
        float f4;
        float f5;
        float f6 = (i * f2) / (i2 * f3);
        float f7 = 0.0f + 0.0f + 180.0f;
        if (f7 % 90.0f == 0.0f) {
            f = f7 % 180.0f != 0.0f ? 1.0f / f : f;
            if (f > f6) {
                f5 = f / f6;
                f4 = 1.0f;
            } else {
                f4 = f6 / f;
                f5 = 1.0f;
            }
            PointF pointF = new PointF(-(1.0f / (f5 * 1.0f)), 1.0f / (f4 * 1.0f));
            PointF pointF2 = new PointF(0.0f - (0.0f * pointF.x), (-1.0f) * (0.0f - (pointF.y * 0.0f)));
            Matrix4 matrix4 = new Matrix4();
            matrix4.A02(pointF.x, pointF.y);
            Matrix4 matrix42 = new Matrix4();
            matrix42.A01(f7);
            Matrix4 matrix43 = new Matrix4();
            matrix43.A03(pointF2.x, pointF2.y, 0.0f);
            matrix42.A05(matrix4.A01);
            matrix43.A05(matrix42.A01);
            this.A00 = matrix43;
            return;
        }
        throw AbstractC166987dD.A12("Only rotation angles multiple of 90 deg are supported");
    }
}
