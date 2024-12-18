package X;

import android.graphics.PointF;
import android.opengl.Matrix;

/* loaded from: classes11.dex */
public final class W57 {
    public static final float[] A05 = {1.0f, 0.0f, -3.0f, 2.0f, 0.0f, 1.0f, -2.0f, 1.0f, 0.0f, 0.0f, -1.0f, 1.0f, 0.0f, 0.0f, 3.0f, -2.0f};
    public static final float[] A06 = {0.0f, -6.0f, 6.0f, 0.0f, 1.0f, -4.0f, 3.0f, 0.0f, 0.0f, -2.0f, 3.0f, 0.0f, 0.0f, 6.0f, -6.0f, 0.0f};
    public float A00 = -1.0f;
    public final float[] A01;
    public final float[] A02;
    public final float[] A03;
    public final float[] A04;

    public final void A01(float[] fArr, float f) {
        float f2 = f * f;
        Matrix.multiplyMV(fArr, 0, this.A04, 0, new float[]{1.0f, f, f2, f2 * f}, 0);
    }

    public final float A00() {
        float f = this.A00;
        float f2 = 0.0f;
        if (f >= 0.0f) {
            return f;
        }
        float f3 = 1.0f / 10.0f;
        int i = 0;
        PointF pointF = new PointF(this.A02[0], this.A03[0]);
        PointF pointF2 = new PointF(0.0f, 0.0f);
        float f4 = f3;
        do {
            float[] fArr = this.A01;
            A01(fArr, f4);
            pointF2.set(fArr[0], fArr[1]);
            f2 += (float) AbstractC43594JPz.A00(pointF.x - pointF2.x, pointF.y - pointF2.y);
            pointF.set(pointF2);
            i++;
            f4 += f3;
        } while (i < 10);
        this.A00 = f2;
        return f2;
    }

    public W57(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[16];
        this.A01 = fArr3;
        float[] fArr4 = new float[16];
        this.A04 = fArr4;
        this.A02 = fArr;
        this.A03 = fArr2;
        float[] fArr5 = A05;
        Matrix.multiplyMV(fArr3, 0, fArr5, 0, fArr, 0);
        Matrix.multiplyMV(fArr3, 4, fArr5, 0, fArr2, 0);
        float[] fArr6 = A06;
        Matrix.multiplyMV(fArr3, 8, fArr6, 0, fArr, 0);
        Matrix.multiplyMV(fArr3, 12, fArr6, 0, fArr2, 0);
        Matrix.transposeM(fArr4, 0, fArr3, 0);
    }
}
