package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.U4x, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66227U4x extends Drawable {
    public final int A00;
    public final Paint A01;
    public final Paint A02;
    public final Path A03 = new Path();
    public final C66228U4y A04;
    public final C66228U4y A05;
    public final C66228U4y A06;
    public final U57 A07;
    public final boolean A08;
    public final float[] A09;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int save = canvas.save();
        try {
            try {
                if (this.A08) {
                    canvas.clipPath(this.A03);
                }
                canvas.drawColor(this.A00);
                int A0G = AbstractC166997dE.A0G(this);
                float A0H = AbstractC166997dE.A0H(this);
                canvas.drawRect(0.0f, 0.0f, A0H, A0G, this.A01);
                canvas.drawCircle(A0H, 0.0f, (int) Math.sqrt(((r0 * r0) / 4.0f) + ((A0G * A0G) / 4.0f)), this.A02);
                U57 u57 = this.A07;
                canvas.drawPath(u57.A01, u57.A00);
                C66228U4y c66228U4y = this.A05;
                canvas.drawPath(c66228U4y.A01, c66228U4y.A00);
                C66228U4y c66228U4y2 = this.A04;
                canvas.drawPath(c66228U4y2.A01, c66228U4y2.A00);
                C66228U4y c66228U4y3 = this.A06;
                canvas.drawPath(c66228U4y3.A01, c66228U4y3.A00);
            } catch (Exception unused) {
                AbstractC25241Le.A02("CDSHarmonizationCompanyGradientDrawable", "Exception when drawing CDSHarmonizationCompanyGradientDrawable");
            }
        } finally {
            canvas.restoreToCount(save);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.A08) {
            Path path = this.A03;
            path.reset();
            path.addRoundRect(new RectF(rect), this.A09, Path.Direction.CW);
            path.close();
        }
        int height = rect.height();
        float f = height;
        float width = rect.width();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A01.setShader(new LinearGradient(0.0f, f, width, 0.0f, -16751392, -16743685, tileMode));
        float f2 = width * (-0.333f);
        float f3 = (-0.333f) * f;
        float f4 = width * 1.333f;
        float f5 = 1.333f * f;
        U57 u57 = this.A07;
        VJ4 vj4 = u57.A03;
        vj4.A00 = f4;
        vj4.A01 = f5;
        VJ4 vj42 = u57.A04;
        vj42.A00 = f4;
        vj42.A01 = 0.55f * f;
        VJ4 vj43 = u57.A02;
        vj43.A00 = (-0.37f) * width;
        vj43.A01 = f5;
        C66228U4y c66228U4y = this.A06;
        VJ4 vj44 = c66228U4y.A05;
        vj44.A00 = f2;
        vj44.A01 = f3;
        VJ4 vj45 = c66228U4y.A06;
        vj45.A00 = 0.032f * width;
        vj45.A01 = f3;
        VJ4 vj46 = c66228U4y.A04;
        vj46.A00 = f2;
        vj46.A01 = 1.078f * f;
        VJ4 vj47 = c66228U4y.A02;
        vj47.A00 = 0.122f * width;
        vj47.A01 = 0.415f * f;
        VJ4 vj48 = c66228U4y.A03;
        vj48.A00 = (-0.01f) * width;
        vj48.A01 = 0.753f * f;
        C66228U4y c66228U4y2 = this.A04;
        VJ4 vj49 = c66228U4y2.A05;
        vj49.A00 = f2;
        vj49.A01 = f3;
        VJ4 vj410 = c66228U4y2.A06;
        vj410.A00 = 0.19f * width;
        vj410.A01 = f3;
        VJ4 vj411 = c66228U4y2.A04;
        vj411.A00 = f2;
        vj411.A01 = 1.087f * f;
        VJ4 vj412 = c66228U4y2.A02;
        vj412.A00 = 0.197f * width;
        vj412.A01 = 0.473f * f;
        VJ4 vj413 = c66228U4y2.A03;
        vj413.A00 = 0.025f * width;
        vj413.A01 = 0.803f * f;
        C66228U4y c66228U4y3 = this.A05;
        VJ4 vj414 = c66228U4y3.A05;
        vj414.A00 = f2;
        vj414.A01 = f3;
        VJ4 vj415 = c66228U4y3.A06;
        vj415.A00 = 0.355f * width;
        vj415.A01 = f3;
        VJ4 vj416 = c66228U4y3.A04;
        vj416.A00 = f2;
        vj416.A01 = 1.043f * f;
        VJ4 vj417 = c66228U4y3.A02;
        vj417.A00 = 0.27f * width;
        vj417.A01 = 0.49f * f;
        VJ4 vj418 = c66228U4y3.A03;
        vj418.A00 = 0.057f * width;
        vj418.A01 = f * 0.807f;
        this.A02.setShader(new RadialGradient(width, 0.0f, Math.max((float) Math.sqrt(((r1 * r1) / 4.0f) + ((height * height) / 4.0f)), Float.MIN_VALUE), new int[]{AbstractC25689BWz.A00(-1, 0.25f), AbstractC25689BWz.A00(-1, 0.0f)}, (float[]) null, tileMode));
        Path path2 = u57.A01;
        path2.reset();
        path2.moveTo(vj42.A00, vj42.A01);
        path2.lineTo(vj43.A00, vj43.A01);
        path2.lineTo(vj4.A00, vj4.A01);
        path2.close();
        c66228U4y3.A00();
        c66228U4y2.A00();
        c66228U4y.A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A07.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C66227U4x(int i, float[] fArr) {
        this.A00 = i;
        this.A09 = fArr;
        C14360o3.A0B(fArr, 0);
        int length = fArr.length;
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (fArr[i2] > 0.0f) {
                z = true;
                break;
            }
            i2++;
        }
        this.A08 = z;
        this.A01 = new Paint();
        this.A07 = new U57();
        this.A06 = new C66228U4y(-11695, 100);
        this.A04 = new C66228U4y(-44416, 190);
        this.A05 = new C66228U4y(-6278145, 175);
        Paint paint = new Paint();
        this.A02 = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setDither(true);
    }
}
