package X;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* renamed from: X.Vgv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69054Vgv {
    public final float[] A00;
    public final float[] A01;
    public final float[] A02;

    public C69054Vgv(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        int i = ((int) (length / 1.0f)) + 1;
        this.A01 = new float[i];
        this.A02 = new float[i];
        this.A00 = new float[i];
        float[] fArr = new float[2];
        float[] fArr2 = new float[2];
        for (int i2 = 0; i2 < i; i2++) {
            pathMeasure.getPosTan((i2 * length) / (i - 1), fArr, fArr2);
            this.A01[i2] = fArr[0];
            this.A02[i2] = fArr[1];
            this.A00[i2] = ((((float) Math.atan2(fArr2[1], fArr2[0])) / 3.1415927f) * 180.0f) + 90.0f;
        }
    }
}
