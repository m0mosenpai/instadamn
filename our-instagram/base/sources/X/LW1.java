package X;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: classes8.dex */
public final class LW1 implements XDA {
    public final float A00;
    public final float A01;
    public final int A02;
    public final Bitmap A03;
    public final Rect A04;

    public LW1(Resources resources, Bitmap bitmap, int i) {
        this.A03 = bitmap;
        this.A02 = i;
        this.A01 = bitmap.getScaledWidth(resources.getDisplayMetrics()) / i;
        this.A00 = bitmap.getScaledHeight(resources.getDisplayMetrics()) / 1.0f;
        this.A04 = new Rect(0, 0, bitmap.getWidth() / i, bitmap.getHeight() / 1);
    }

    @Override // X.XDA
    public final void AQW(Canvas canvas, Paint paint, Rect rect, int i) {
        C14360o3.A0B(paint, 3);
        int i2 = this.A02;
        Rect rect2 = this.A04;
        Bitmap bitmap = this.A03;
        rect2.offsetTo((bitmap.getWidth() * (i % i2)) / i2, (bitmap.getHeight() * (i / i2)) / 1);
        canvas.drawBitmap(bitmap, rect2, rect, paint);
    }

    @Override // X.XDA
    public final float BJG() {
        return this.A00;
    }

    @Override // X.XDA
    public final float BJH() {
        return this.A01;
    }
}
