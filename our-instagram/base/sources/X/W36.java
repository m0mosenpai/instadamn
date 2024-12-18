package X;

import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;

/* loaded from: classes11.dex */
public final class W36 {
    public float A00;
    public float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final Paint A09;

    public static Paint A00(float f, float f2, float f3, int i) {
        Paint paint = new Paint();
        paint.setAntiAlias(false);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
        paint.setShader(new RadialGradient(0.0f, 0.0f, Math.max(f2, f3), new int[]{AbstractC25689BWz.A00(i, f), AbstractC25689BWz.A00(i, 0.0f)}, (float[]) null, Shader.TileMode.CLAMP));
        return paint;
    }

    public W36(float f, float f2, int i, float f3, int i2, float f4) {
        this.A06 = i;
        this.A04 = f3;
        this.A05 = f4;
        this.A02 = f;
        this.A03 = f2;
        this.A00 = f;
        this.A01 = f2;
        this.A07 = A00(0.3f, f3, f4, i2);
        this.A08 = A00(0.5f, f3 * 1.5f, 1.5f * f4, i2);
        this.A09 = A00(0.8f, f3 * 2.0f, f4 * 2.0f, i2);
    }
}
