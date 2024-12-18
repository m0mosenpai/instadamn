package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.animation.DecelerateInterpolator;
import java.lang.reflect.Array;
import java.util.HashMap;

/* renamed from: X.Jiy, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44359Jiy extends Drawable {
    public static final HashMap A0B;
    public String A02;
    public String A03;
    public C72833XoS A04;
    public float[][] A06;
    public final Paint A07;
    public final DecelerateInterpolator A0A = new DecelerateInterpolator();
    public final RectF A09 = AbstractC166987dD.A0X();
    public final Rect A08 = AbstractC166987dD.A0U();
    public long A00 = -1;
    public Integer A01 = C05F.A01;
    public Integer A05 = C05F.A00;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public static void A00(C44359Jiy c44359Jiy) {
        String str = c44359Jiy.A02;
        if (str != null) {
            try {
                C72833XoS A00 = Y3L.A00(c44359Jiy.A01, str, null);
                c44359Jiy.A04 = A00;
                if (A00.A03.A01 < 41) {
                    try {
                        c44359Jiy.A04 = Y3L.A00(c44359Jiy.A01, c44359Jiy.A02, A0B);
                    } catch (C72450Xdu unused) {
                    }
                }
                C72829XoL c72829XoL = c44359Jiy.A04.A03;
                float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, c72829XoL.A00, c72829XoL.A01);
                c44359Jiy.A06 = fArr;
                for (int i = 0; i < c72829XoL.A00; i++) {
                    for (int i2 = 0; i2 < c72829XoL.A01; i2++) {
                        float[] fArr2 = fArr[i];
                        double random = Math.random();
                        fArr2[i2] = (float) random;
                        if (random > 0.25d) {
                            float[] fArr3 = fArr[i];
                            fArr3[i2] = AbstractC13600mm.A01(fArr3[i2], 0.0f, 1.0f, 0.0f, 0.5f);
                        } else {
                            float[] fArr4 = fArr[i];
                            fArr4[i2] = AbstractC13600mm.A01(fArr4[i2], 0.0f, 1.0f, 0.0f, 1.0f);
                        }
                    }
                }
                c44359Jiy.invalidateSelf();
            } catch (C72450Xdu e) {
                C0w9.A07("QRCodeDrawable#encoding failed", e);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float A01;
        if (this.A04 != null) {
            Rect bounds = getBounds();
            int width = bounds.width();
            int height = bounds.height();
            int i = bounds.left;
            int i2 = bounds.top;
            C72829XoL c72829XoL = this.A04.A03;
            canvas.save();
            float width2 = bounds.width();
            int i3 = c72829XoL.A01;
            float f2 = i3;
            float f3 = width2 / f2;
            float height2 = bounds.height();
            int i4 = c72829XoL.A00;
            float f4 = i4;
            float f5 = height2 / f4;
            float f6 = 0.08f * f3;
            Rect rect = this.A08;
            float f7 = f2 * 0.33333334f;
            float f8 = 0.33333334f * f4;
            float f9 = f2 / 2.0f;
            float f10 = f4 / 2.0f;
            float f11 = f7 / 2.0f;
            float f12 = f8 / 2.0f;
            rect.set((int) Math.ceil(f9 - f11), (int) Math.ceil(f10 - f12), (int) Math.floor(f9 + f11), (int) Math.floor(f10 + f12));
            for (int i5 = 0; i5 < i4; i5++) {
                for (int i6 = 0; i6 < i3; i6++) {
                    if (c72829XoL.A02[i5][i6] > 0) {
                        int i7 = i3 - 1;
                        int i8 = i4 - 1;
                        if ((i6 >= 7 || i5 >= 7) && ((i6 <= i7 - 7 || i5 >= 7) && ((i6 >= 7 || i5 <= i8 - 7) && !rect.contains(i6, i5)))) {
                            float interpolation = this.A0A.getInterpolation(0.0f / 2000.0f);
                            float[][] fArr = this.A06;
                            fArr.getClass();
                            float f13 = fArr[i5][i6] + interpolation;
                            float floor = f13 - ((float) Math.floor(f13));
                            if (floor < 0.5f) {
                                A01 = AbstractC13600mm.A01(floor, 0.0f, 0.5f, 0.75f, 1.0f);
                            } else {
                                A01 = AbstractC13600mm.A01(floor, 0.5f, 1.0f, 1.0f, 0.75f);
                            }
                            float f14 = f3 / 2.0f;
                            canvas.drawCircle((i6 * f3) + f14 + i, (i5 * f5) + (f5 / 2.0f) + i2, (f14 * A01) - f6, this.A07);
                        }
                    }
                }
            }
            int A0A = AbstractC166987dD.A0A(f3, 7.0f);
            int A0A2 = AbstractC166987dD.A0A(7.0f, f5);
            RectF rectF = this.A09;
            float f15 = i;
            float f16 = i2;
            float f17 = i + A0A;
            float f18 = i2 + A0A2;
            rectF.set(f15, f16, f17, f18);
            int intValue = this.A05.intValue();
            Paint paint = this.A07;
            if (intValue != 1) {
                LJX.A00(canvas, paint, rectF);
            } else {
                LJX.A01(canvas, paint, rectF);
            }
            rectF.set(r6 - A0A, f16, i + width, f18);
            if (intValue != 1) {
                LJX.A00(canvas, paint, rectF);
            } else {
                LJX.A01(canvas, paint, rectF);
            }
            rectF.set(f15, r5 - A0A2, f17, i2 + height);
            if (intValue != 1) {
                LJX.A00(canvas, paint, rectF);
            } else {
                LJX.A01(canvas, paint, rectF);
            }
            float width3 = rect.width() * f3 * 0.06f;
            rectF.set((rect.left * f3) + f15 + width3, (rect.top * f5) + f16 + width3, (f15 + (rect.right * f3)) - width3, (f16 + (rect.bottom * f5)) - width3);
            C14360o3.A0B(paint, 1);
            canvas.save();
            Path path = LJX.A00;
            if (intValue != 1) {
                path.reset();
                path.moveTo(39.0f, 26.0f);
                path.cubicTo(46.18f, 26.0f, 52.0f, 31.82f, 52.0f, 39.0f);
                path.cubicTo(52.0f, 46.18f, 46.18f, 52.0f, 39.0f, 52.0f);
                path.cubicTo(31.82f, 52.0f, 26.0f, 46.18f, 26.0f, 39.0f);
                path.cubicTo(26.0f, 31.82f, 31.82f, 26.0f, 39.0f, 26.0f);
                path.lineTo(39.0f, 26.0f);
                path.close();
                path.moveTo(39.0f, 58.93f);
                path.cubicTo(50.01f, 58.93f, 58.93f, 50.01f, 58.93f, 39.0f);
                path.cubicTo(58.93f, 27.99f, 50.01f, 19.07f, 39.0f, 19.07f);
                path.cubicTo(27.99f, 19.07f, 19.07f, 27.99f, 19.07f, 39.0f);
                path.cubicTo(19.07f, 50.01f, 27.99f, 58.93f, 39.0f, 58.93f);
                path.lineTo(39.0f, 58.93f);
                path.close();
                path.moveTo(60.23f, 22.53f);
                path.cubicTo(62.87f, 22.53f, 65.0f, 20.4f, 65.0f, 17.77f);
                path.cubicTo(65.0f, 15.14f, 62.87f, 13.0f, 60.23f, 13.0f);
                path.cubicTo(57.6f, 13.0f, 55.47f, 15.14f, 55.47f, 17.77f);
                path.cubicTo(55.47f, 20.4f, 57.6f, 22.53f, 60.23f, 22.53f);
                path.lineTo(60.23f, 22.53f);
                path.close();
                path.moveTo(7.16f, 23.19f);
                path.cubicTo(7.34f, 19.38f, 7.97f, 17.31f, 8.51f, 15.93f);
                path.cubicTo(9.22f, 14.11f, 10.06f, 12.8f, 11.43f, 11.43f);
                path.cubicTo(12.8f, 10.07f, 14.1f, 9.22f, 15.93f, 8.51f);
                path.cubicTo(17.31f, 7.97f, 19.38f, 7.34f, 23.19f, 7.16f);
                path.cubicTo(27.32f, 6.97f, 28.55f, 6.93f, 39.0f, 6.93f);
                path.cubicTo(49.44f, 6.93f, 50.68f, 6.97f, 54.8f, 7.16f);
                path.cubicTo(58.62f, 7.34f, 60.69f, 7.97f, 62.07f, 8.51f);
                path.cubicTo(63.89f, 9.22f, 65.2f, 10.07f, 66.57f, 11.43f);
                path.cubicTo(67.93f, 12.8f, 68.78f, 14.11f, 69.49f, 15.93f);
                path.cubicTo(70.03f, 17.31f, 70.66f, 19.38f, 70.84f, 23.19f);
                path.cubicTo(71.03f, 27.32f, 71.07f, 28.56f, 71.07f, 39.0f);
                path.cubicTo(71.07f, 49.45f, 71.03f, 50.68f, 70.84f, 54.81f);
                path.cubicTo(70.66f, 58.62f, 70.03f, 60.69f, 69.49f, 62.07f);
                path.cubicTo(68.78f, 63.89f, 67.93f, 65.2f, 66.57f, 66.57f);
                path.cubicTo(65.2f, 67.93f, 63.89f, 68.78f, 62.07f, 69.49f);
                path.cubicTo(60.69f, 70.03f, 58.62f, 70.66f, 54.8f, 70.84f);
                path.cubicTo(50.68f, 71.03f, 49.45f, 71.07f, 39.0f, 71.07f);
                path.cubicTo(28.55f, 71.07f, 27.32f, 71.03f, 23.19f, 70.84f);
                path.cubicTo(19.38f, 70.66f, 17.31f, 70.03f, 15.93f, 69.49f);
                path.cubicTo(14.1f, 68.78f, 12.8f, 67.93f, 11.43f, 66.57f);
                path.cubicTo(10.06f, 65.2f, 9.22f, 63.89f, 8.51f, 62.07f);
                path.cubicTo(7.97f, 60.69f, 7.34f, 58.62f, 7.16f, 54.81f);
                path.cubicTo(6.97f, 50.68f, 6.93f, 49.45f, 6.93f, 39.0f);
                path.cubicTo(6.93f, 28.56f, 6.97f, 27.32f, 7.16f, 23.19f);
                path.lineTo(7.16f, 23.19f);
                path.close();
                path.moveTo(13.45f, 75.95f);
                path.cubicTo(15.93f, 76.92f, 18.77f, 77.58f, 22.92f, 77.76f);
                path.cubicTo(27.08f, 77.96f, 28.41f, 78.0f, 39.0f, 78.0f);
                path.cubicTo(49.59f, 78.0f, 50.92f, 77.96f, 55.08f, 77.76f);
                path.cubicTo(59.23f, 77.58f, 62.07f, 76.92f, 64.55f, 75.95f);
                path.cubicTo(67.11f, 74.96f, 69.28f, 73.62f, 71.45f, 71.45f);
                path.cubicTo(73.62f, 69.29f, 74.96f, 67.11f, 75.95f, 64.55f);
                path.cubicTo(76.92f, 62.07f, 77.58f, 59.23f, 77.76f, 55.08f);
                path.cubicTo(77.95f, 50.92f, 78.0f, 49.59f, 78.0f, 39.0f);
                path.cubicTo(78.0f, 28.41f, 77.95f, 27.08f, 77.76f, 22.92f);
                path.cubicTo(77.58f, 18.77f, 76.92f, 15.93f, 75.95f, 13.45f);
                path.cubicTo(74.96f, 10.89f, 73.62f, 8.71f, 71.45f, 6.55f);
                path.cubicTo(69.28f, 4.38f, 67.11f, 3.04f, 64.55f, 2.05f);
                path.cubicTo(62.07f, 1.08f, 59.23f, 0.42f, 55.08f, 0.24f);
                path.cubicTo(50.92f, 0.05f, 49.59f, 0.0f, 39.0f, 0.0f);
                path.cubicTo(28.41f, 0.0f, 27.08f, 0.05f, 22.92f, 0.24f);
                path.cubicTo(18.77f, 0.42f, 15.93f, 1.08f, 13.45f, 2.05f);
                path.cubicTo(10.89f, 3.04f, 8.71f, 4.38f, 6.55f, 6.55f);
                path.cubicTo(4.38f, 8.71f, 3.04f, 10.89f, 2.05f, 13.45f);
                path.cubicTo(1.08f, 15.93f, 0.42f, 18.77f, 0.23f, 22.92f);
                path.cubicTo(0.05f, 27.08f, 0.0f, 28.41f, 0.0f, 39.0f);
                path.cubicTo(0.0f, 49.59f, 0.05f, 50.92f, 0.23f, 55.08f);
                path.cubicTo(0.42f, 59.23f, 1.08f, 62.07f, 2.05f, 64.55f);
                path.cubicTo(3.04f, 67.11f, 4.38f, 69.29f, 6.55f, 71.45f);
                path.cubicTo(8.71f, 73.62f, 10.89f, 74.96f, 13.45f, 75.95f);
                path.close();
                f = 78.0f;
            } else {
                path.reset();
                path.moveTo(30.36f, 54.0f);
                path.lineTo(30.34f, 54.0f);
                path.cubicTo(23.35f, 53.95f, 17.97f, 51.59f, 14.35f, 46.98f);
                path.cubicTo(11.14f, 42.88f, 9.48f, 37.17f, 9.42f, 30.02f);
                path.lineTo(9.42f, 29.99f);
                path.cubicTo(9.48f, 22.83f, 11.14f, 17.13f, 14.35f, 13.02f);
                path.cubicTo(17.97f, 8.41f, 23.35f, 6.05f, 30.34f, 6.0f);
                path.lineTo(30.36f, 6.0f);
                path.lineTo(30.37f, 6.0f);
                path.cubicTo(35.74f, 6.04f, 40.23f, 7.45f, 43.71f, 10.2f);
                path.cubicTo(46.99f, 12.78f, 49.3f, 16.45f, 50.57f, 21.13f);
                path.lineTo(46.58f, 22.27f);
                path.cubicTo(44.43f, 14.35f, 38.97f, 10.3f, 30.35f, 10.24f);
                path.cubicTo(24.67f, 10.28f, 20.37f, 12.11f, 17.57f, 15.67f);
                path.cubicTo(14.96f, 19.01f, 13.61f, 23.83f, 13.56f, 30.0f);
                path.cubicTo(13.61f, 36.17f, 14.96f, 40.99f, 17.58f, 44.33f);
                path.cubicTo(20.37f, 47.89f, 24.67f, 49.72f, 30.36f, 49.76f);
                path.cubicTo(35.49f, 49.72f, 38.88f, 48.5f, 41.7f, 45.67f);
                path.cubicTo(44.91f, 42.45f, 44.86f, 38.49f, 43.83f, 36.08f);
                path.cubicTo(43.22f, 34.66f, 42.12f, 33.48f, 40.63f, 32.58f);
                path.cubicTo(40.26f, 35.28f, 39.42f, 37.47f, 38.12f, 39.12f);
                path.cubicTo(36.39f, 41.32f, 33.94f, 42.53f, 30.83f, 42.7f);
                path.cubicTo(28.48f, 42.83f, 26.22f, 42.26f, 24.46f, 41.1f);
                path.cubicTo(22.38f, 39.72f, 21.17f, 37.62f, 21.04f, 35.17f);
                path.cubicTo(20.91f, 32.79f, 21.84f, 30.6f, 23.64f, 29.01f);
                path.cubicTo(25.36f, 27.48f, 27.78f, 26.59f, 30.64f, 26.42f);
                path.cubicTo(32.75f, 26.3f, 34.72f, 26.4f, 36.54f, 26.71f);
                path.cubicTo(36.3f, 25.22f, 35.81f, 24.04f, 35.08f, 23.19f);
                path.cubicTo(34.07f, 22.02f, 32.52f, 21.43f, 30.47f, 21.41f);
                path.cubicTo(30.45f, 21.41f, 30.43f, 21.41f, 30.41f, 21.41f);
                path.cubicTo(28.76f, 21.41f, 26.52f, 21.88f, 25.09f, 24.05f);
                path.lineTo(21.66f, 21.7f);
                path.cubicTo(23.57f, 18.79f, 26.68f, 17.18f, 30.41f, 17.18f);
                path.cubicTo(30.44f, 17.18f, 30.47f, 17.18f, 30.49f, 17.18f);
                path.cubicTo(36.74f, 17.22f, 40.46f, 21.13f, 40.83f, 27.96f);
                path.cubicTo(41.04f, 28.05f, 41.25f, 28.15f, 41.46f, 28.24f);
                path.cubicTo(44.37f, 29.64f, 46.5f, 31.77f, 47.62f, 34.38f);
                path.cubicTo(49.18f, 38.03f, 49.32f, 43.96f, 44.59f, 48.7f);
                path.cubicTo(40.98f, 52.32f, 36.59f, 53.96f, 30.37f, 54.0f);
                path.lineTo(30.36f, 54.0f);
                path.lineTo(30.36f, 54.0f);
                path.close();
                path.moveTo(32.32f, 30.62f);
                path.cubicTo(31.85f, 30.62f, 31.37f, 30.63f, 30.87f, 30.66f);
                path.cubicTo(27.29f, 30.87f, 25.05f, 32.55f, 25.18f, 34.95f);
                path.cubicTo(25.31f, 37.46f, 28.01f, 38.63f, 30.62f, 38.48f);
                path.cubicTo(33.01f, 38.35f, 36.12f, 37.4f, 36.65f, 31.06f);
                path.cubicTo(35.33f, 30.77f, 33.88f, 30.62f, 32.32f, 30.62f);
                path.close();
                f = 60.0f;
            }
            LJX.A02(canvas, paint, rectF, f);
            canvas.restore();
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    static {
        HashMap A1G = AbstractC166987dD.A1G();
        A0B = A1G;
        AbstractC166997dE.A1U(EnumC72362Xby.QR_VERSION, A1G, 6);
    }

    public C44359Jiy() {
        Paint A0S = AbstractC166987dD.A0S(3);
        this.A07 = A0S;
        A0S.setColor(-16777216);
        AbstractC166987dD.A1R(A0S);
    }
}
