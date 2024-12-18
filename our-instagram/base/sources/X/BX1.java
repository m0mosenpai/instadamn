package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class BX1 extends Drawable {
    public Path A00 = null;
    public final float A01;
    public final float A02;
    public final float A03;
    public final int A04;
    public final RectF A05;
    public final boolean A06;
    public final boolean A07;
    public final Paint[] A08;
    public final Paint[] A09;
    public final Path[] A0A;
    public final float A0B;
    public final float A0C;
    public final Paint A0D;
    public final Paint A0E;
    public final RectF A0F;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        float f2;
        Path path = this.A0A[0];
        Paint paint = this.A08[0];
        Paint paint2 = this.A09[0];
        boolean z = this.A07;
        float f3 = 2.0f;
        if (z) {
            int save = canvas.save();
            RectF rectF = this.A05;
            float f4 = rectF.left;
            float f5 = this.A01;
            canvas.translate(f4 + f5, rectF.top + f5);
            canvas.drawPath(path, paint);
            float f6 = -f5;
            canvas.drawRect(0.0f, f6 - this.A03, rectF.width() - (f5 * 2.0f), f6, paint2);
            canvas.restoreToCount(save);
        }
        int save2 = canvas.save();
        RectF rectF2 = this.A05;
        float f7 = rectF2.right;
        float f8 = this.A01;
        canvas.translate(f7 - f8, rectF2.top + f8);
        canvas.rotate(90.0f);
        if (z) {
            canvas.drawPath(path, paint);
            f = 0.0f;
        } else {
            f = -f8;
        }
        float f9 = -f8;
        float f10 = f9 - this.A03;
        float height = rectF2.height();
        boolean z2 = this.A06;
        float f11 = 1.0f;
        if (z2) {
            f11 = 2.0f;
        }
        canvas.drawRect(f, f10, height - (f11 * f8), f9, paint2);
        canvas.restoreToCount(save2);
        if (z2) {
            int save3 = canvas.save();
            canvas.translate(rectF2.right - f8, rectF2.bottom - f8);
            canvas.rotate(180.0f);
            canvas.drawPath(path, paint);
            canvas.drawRect(0.0f, f10, rectF2.width() - (f8 * 2.0f), f9, paint2);
            canvas.restoreToCount(save3);
        }
        int save4 = canvas.save();
        canvas.translate(rectF2.left + f8, rectF2.bottom - f8);
        canvas.rotate(270.0f);
        if (z2) {
            canvas.drawPath(path, paint);
            f2 = 0.0f;
        } else {
            f2 = f9;
        }
        float height2 = rectF2.height();
        if (!z) {
            f3 = 1.0f;
        }
        canvas.drawRect(f2, f10, height2 - (f3 * f8), f9, paint2);
        canvas.restoreToCount(save4);
        if (f8 > 0.0f && (z || z2)) {
            if (this.A0C <= 0.0f && this.A0B <= 0.0f) {
                Path path2 = this.A00;
                Paint paint3 = this.A0E;
                if (path2 != null) {
                    canvas.drawPath(path2, paint3);
                    return;
                } else {
                    canvas.drawRoundRect(rectF2, f8, f8, paint3);
                    return;
                }
            }
            canvas.drawRoundRect(rectF2, f8, f8, this.A0D);
            canvas.drawRoundRect(this.A0F, f8, f8, this.A0E);
            return;
        }
        canvas.drawRect(rectF2, this.A0E);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        float f = this.A03;
        float f2 = this.A0B;
        int i = (int) (f - f2);
        float f3 = 0.0f;
        if (this.A07) {
            f3 = f;
        }
        float f4 = this.A0C;
        int i2 = (int) (f3 - f4);
        int i3 = (int) (f2 + f);
        if (!this.A06) {
            f = 0.0f;
        }
        rect.set(i, i2, i3, (int) (f + f4));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        LinearGradient linearGradient;
        float f;
        super.onBoundsChange(rect);
        RectF rectF = this.A05;
        float f2 = rect.left;
        float f3 = this.A03;
        float f4 = f2 + f3;
        float f5 = rect.top;
        boolean z = this.A07;
        float f6 = 0.0f;
        if (!z) {
            f3 = 0.0f;
        }
        float f7 = f5 + f3;
        float f8 = rect.right - f3;
        float f9 = rect.bottom;
        boolean z2 = this.A06;
        float f10 = 0.0f;
        if (z2) {
            f10 = f3;
        }
        rectF.set(f4, f7, f8, f9 - f10);
        RectF rectF2 = this.A0F;
        float f11 = this.A0B;
        float f12 = (rect.left + f3) - f11;
        float f13 = rect.top;
        float f14 = 0.0f;
        if (z) {
            f14 = f3;
        }
        float f15 = this.A0C;
        float f16 = (f13 + f14) - f15;
        float f17 = (rect.right - f3) - f11;
        float f18 = rect.bottom;
        if (z2) {
            f6 = f3;
        }
        rectF2.set(f12, f16, f17, (f18 - f6) - f15);
        if (z != z2) {
            Path path = this.A00;
            if (path == null) {
                this.A00 = AbstractC166987dD.A0T();
            } else {
                path.reset();
            }
            float[] fArr = new float[8];
            float f19 = 0.0f;
            if (z) {
                f = this.A01;
            } else {
                f = 0.0f;
            }
            Arrays.fill(fArr, 0, 4, f);
            if (z2) {
                f19 = this.A01;
            }
            Arrays.fill(fArr, 4, 8, f19);
            this.A00.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            this.A00 = null;
        }
        float f20 = this.A01;
        float f21 = -f20;
        RectF rectF3 = new RectF(f21, f21, f20, f20);
        RectF rectF4 = new RectF(rectF3);
        float f22 = -f3;
        rectF4.inset(f22, f22);
        int i = this.A04;
        float f23 = this.A02;
        int[] iArr = {AbstractC25689BWz.A00(i, f23 / 255.0f), AbstractC25689BWz.A00(i, (f23 * 0.5f) / 255.0f), AbstractC25689BWz.A00(i, 0.0f)};
        float[] fArr2 = {0.0f, 0.5f, 1.0f};
        float f24 = f20 + f3;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f24, iArr, fArr2, tileMode);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Path[] pathArr = this.A0A;
            if (i3 < pathArr.length) {
                Path path2 = pathArr[i3];
                path2.reset();
                path2.setFillType(Path.FillType.EVEN_ODD);
                this.A08[i3].setShader(radialGradient);
                if (i2 != 90) {
                    if (i2 != 180) {
                        if (i2 != 270) {
                            path2.moveTo(f21, 0.0f);
                            path2.rLineTo(f22, 0.0f);
                            linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f22 - f20, iArr, fArr2, tileMode);
                        } else {
                            i2 = 270;
                            path2.moveTo(0.0f, f20);
                            path2.rLineTo(0.0f, f3);
                            linearGradient = new LinearGradient(0.0f, 0.0f, f22 - f20, 0.0f, iArr, fArr2, tileMode);
                        }
                    } else {
                        i2 = 180;
                        path2.moveTo(f20, 0.0f);
                        path2.rLineTo(f3, 0.0f);
                        linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f24, iArr, fArr2, tileMode);
                    }
                } else {
                    i2 = 90;
                    path2.moveTo(0.0f, f21);
                    path2.rLineTo(0.0f, f22);
                    linearGradient = new LinearGradient(0.0f, 0.0f, f24, 0.0f, iArr, fArr2, tileMode);
                }
                float f25 = i2;
                path2.arcTo(rectF4, 180.0f + f25, 90.0f, false);
                path2.arcTo(rectF3, f25 + 270.0f, -90.0f, false);
                path2.close();
                this.A09[i3].setShader(linearGradient);
                i2 += 90;
                i3++;
            } else {
                return;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        for (Paint paint : this.A08) {
            paint.setAlpha(i);
        }
        for (Paint paint2 : this.A09) {
            paint2.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        for (Paint paint : this.A08) {
            paint.setColorFilter(colorFilter);
        }
        for (Paint paint2 : this.A09) {
            paint2.setColorFilter(colorFilter);
        }
    }

    public BX1(float f, float f2, float f3, float f4, int i, int i2, boolean z, boolean z2) {
        this.A01 = f;
        this.A03 = f2;
        this.A0B = f3;
        this.A0C = f4;
        this.A04 = i;
        float alpha = Color.alpha(i);
        this.A02 = alpha;
        this.A07 = z;
        this.A06 = z2;
        Paint A0R = AbstractC166987dD.A0R();
        this.A0E = A0R;
        Paint.Style style = Paint.Style.FILL;
        A0R.setStyle(style);
        A0R.setColor(i2);
        A0R.setAntiAlias(true);
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A0D = A0R2;
        A0R2.setStyle(style);
        A0R2.setColor(i);
        A0R2.setAntiAlias(true);
        A0R2.setAlpha(Math.round(alpha));
        this.A0A = new Path[4];
        this.A05 = AbstractC166987dD.A0X();
        this.A0F = AbstractC166987dD.A0X();
        this.A08 = new Paint[4];
        this.A09 = new Paint[4];
        int i3 = 0;
        do {
            this.A0A[i3] = new Path();
            Paint[] paintArr = this.A08;
            Paint paint = new Paint(4);
            paint.setStyle(style);
            paintArr[i3] = paint;
            this.A08[i3].setAntiAlias(true);
            Paint[] paintArr2 = this.A09;
            Paint paint2 = new Paint(4);
            paint2.setStyle(style);
            paintArr2[i3] = paint2;
            i3++;
        } while (i3 < 4);
    }
}
