package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.W0x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC70063W0x {
    public static final float[] A01 = new float[2];
    public static final Matrix A00 = new Matrix();

    public static PointF A00(PointF pointF, View view) {
        float[] fArr = A01;
        fArr[0] = pointF.x - view.getLeft();
        fArr[1] = pointF.y - view.getTop();
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        matrix2.reset();
        return new PointF(fArr[0], fArr[1]);
    }
}
