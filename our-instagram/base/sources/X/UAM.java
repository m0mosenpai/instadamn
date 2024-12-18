package X;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;

/* loaded from: classes11.dex */
public final class UAM extends View {
    public static final float[] A0G = {0.0f, 0.05f, 0.14f, 0.26f, 0.42f, 0.43f, 0.7f, 0.92f};
    public static final int[] A0H = {-11229, -80351, -155365, -367087, -649981, -652286, -2947736, -4652876};
    public int A00;
    public ValueAnimator A01;
    public Matrix A02;
    public Matrix A03;
    public Paint A04;
    public Paint A05;
    public Point A06;
    public RectF A07;
    public RectF A08;
    public boolean A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public int A0E;
    public int A0F;

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        super.onDraw(canvas);
        float min = this.A00 * Math.min(this.A0D / 0.5f, 1.0f);
        Point point = this.A06;
        C14360o3.A0A(point);
        float f = point.x;
        Point point2 = this.A06;
        C14360o3.A0A(point2);
        float f2 = point2.y;
        Paint paint = this.A04;
        C14360o3.A0A(paint);
        canvas.drawCircle(f, f2, min, paint);
        if (this.A0D >= 0.5f) {
            canvas.setMatrix(this.A03);
            RectF rectF = this.A08;
            C14360o3.A0A(rectF);
            float f3 = this.A0A;
            Paint paint2 = this.A05;
            C14360o3.A0A(paint2);
            canvas.drawRoundRect(rectF, f3, f3, paint2);
            if (this.A0D >= 0.75f) {
                canvas.setMatrix(this.A02);
                RectF rectF2 = this.A07;
                C14360o3.A0A(rectF2);
                float f4 = this.A0A;
                Paint paint3 = this.A05;
                C14360o3.A0A(paint3);
                canvas.drawRoundRect(rectF2, f4, f4, paint3);
            }
        }
        this.A09 = false;
    }

    public final void A00(float f) {
        if (this.A0D == f && !this.A09) {
            return;
        }
        this.A0D = f;
        this.A09 = true;
        Paint paint = this.A04;
        C14360o3.A0A(paint);
        float f2 = this.A0F;
        float f3 = this.A0E;
        float min = Math.min(this.A0D / 0.5f, 1.0f);
        paint.setStrokeWidth((f3 * min) + ((1.0f - min) * f2));
        float max = Math.max(0.0f, this.A0D - 0.5f) / 0.5f;
        float min2 = Math.min(1.0f, max / 0.4f);
        float max2 = Math.max(0.0f, max - 0.4f) / 0.6f;
        float f4 = this.A0E / 2.0f;
        RectF rectF = this.A07;
        C14360o3.A0A(rectF);
        C14360o3.A0A(this.A06);
        float f5 = r0.x - f4;
        C14360o3.A0A(this.A06);
        float f6 = r0.y - f4;
        C14360o3.A0A(this.A06);
        float f7 = r0.x + (this.A0B * max2);
        C14360o3.A0A(this.A06);
        rectF.set(f5, f6, f7, r0.y + f4);
        RectF rectF2 = this.A08;
        C14360o3.A0A(rectF2);
        C14360o3.A0A(this.A06);
        float f8 = r0.x - this.A0C;
        C14360o3.A0A(this.A06);
        float f9 = r0.y - f4;
        Point point = this.A06;
        C14360o3.A0A(point);
        float f10 = point.x;
        float f11 = this.A0C;
        float f12 = (f10 - f11) + ((f11 + f4) * min2);
        C14360o3.A0A(this.A06);
        rectF2.set(f8, f9, f12, r0.y + f4);
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int min = Math.min(size, size2);
        this.A0F = (min * 3) / 8;
        int i3 = min / 12;
        this.A0E = i3;
        int i4 = (min / 2) - (i3 / 2);
        this.A00 = i4;
        this.A0A = i3 / 4.0f;
        float f = i4;
        this.A0C = (int) (0.45f * f);
        this.A0B = (int) (f * 0.65f);
        Point point = this.A06;
        C14360o3.A0A(point);
        point.set(size / 2, size2 / 2);
        Matrix matrix = this.A02;
        C14360o3.A0A(matrix);
        Point point2 = this.A06;
        C14360o3.A0A(point2);
        float f2 = point2.x;
        C14360o3.A0A(this.A06);
        matrix.setRotate(-90.0f, f2, r0.y);
        Matrix matrix2 = this.A03;
        C14360o3.A0A(matrix2);
        Point point3 = this.A06;
        C14360o3.A0A(point3);
        float f3 = point3.x;
        C14360o3.A0A(this.A06);
        matrix2.setRotate(0.0f, f3, r0.y);
        Point point4 = this.A06;
        C14360o3.A0A(point4);
        float f4 = point4.x - this.A00;
        Point point5 = this.A06;
        C14360o3.A0A(point5);
        float f5 = point5.y + this.A00;
        Point point6 = this.A06;
        C14360o3.A0A(point6);
        float f6 = point6.x + this.A00;
        C14360o3.A0A(this.A06);
        LinearGradient linearGradient = new LinearGradient(f4, f5, f6, r0.y - this.A00, A0H, A0G, Shader.TileMode.CLAMP);
        Paint paint = this.A04;
        C14360o3.A0A(paint);
        paint.setShader(linearGradient);
        Paint paint2 = this.A05;
        C14360o3.A0A(paint2);
        paint2.setShader(linearGradient);
        this.A09 = true;
        A00(this.A0D);
    }
}
