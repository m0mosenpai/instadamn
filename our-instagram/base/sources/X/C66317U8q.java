package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.U8q, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66317U8q extends Drawable implements XD1 {
    public int A00;
    public final float[] A08 = new float[8];
    public final float[] A06 = new float[8];
    public final Paint A03 = new Paint(1);
    public boolean A02 = false;
    public final Path A05 = new Path();
    public final Path A04 = new Path();
    public final RectF A07 = new RectF();
    public int A01 = 255;

    @Override // X.XD1
    public final void ERO(boolean z) {
        this.A02 = true;
        A00();
        invalidateSelf();
    }

    @Override // X.XD1
    public final void Ec4(float[] fArr) {
        C0Hf.A02(AbstractC167007dF.A1P(fArr.length, 8), "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, this.A08, 0, 8);
        A00();
        invalidateSelf();
    }

    @Override // X.XD1
    public final void Ec5(float f) {
        C0Hf.A02(MSY.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))), "radius should be non negative");
        Arrays.fill(this.A08, f);
        A00();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    private void A00() {
        float[] fArr;
        Path path = this.A05;
        path.reset();
        Path path2 = this.A04;
        path2.reset();
        RectF rectF = this.A07;
        AbstractC65702TsY.A0x(rectF, this);
        float f = 0.0f / 2.0f;
        rectF.inset(f, f);
        if (this.A02) {
            AbstractC65703TsZ.A1F(path2, rectF);
        } else {
            int i = 0;
            while (true) {
                fArr = this.A06;
                if (i >= fArr.length) {
                    break;
                }
                fArr[i] = (this.A08[i] + 0.0f) - f;
                i++;
            }
            path2.addRoundRect(rectF, fArr, Path.Direction.CW);
        }
        float f2 = (-0.0f) / 2.0f;
        rectF.inset(f2, f2);
        float f3 = 0.0f + 0.0f;
        rectF.inset(f3, f3);
        if (this.A02) {
            AbstractC65703TsZ.A1F(path, rectF);
        } else {
            path.addRoundRect(rectF, this.A08, Path.Direction.CW);
        }
        float f4 = -f3;
        rectF.inset(f4, f4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i;
        if (i2 != 255) {
            i3 = i & 16777215;
            if (i2 != 0) {
                i3 |= (((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24;
            }
        }
        paint.setColor(i3);
        paint.setStyle(Paint.Style.FILL);
        paint.setFilterBitmap(false);
        canvas.drawPath(this.A05, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        int i = this.A00;
        int i2 = this.A01;
        int i3 = i;
        if (i2 != 255) {
            i3 = i & 16777215;
            if (i2 != 0) {
                i3 |= (((i >>> 24) * (i2 + (i2 >> 7))) >> 8) << 24;
            }
        }
        int i4 = i3 >>> 24;
        if (i4 != 0) {
            if (i4 == 255) {
                return -1;
            }
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (i != this.A01) {
            this.A01 = i;
            invalidateSelf();
        }
    }

    public C66317U8q(int i) {
        this.A00 = 0;
        if (this.A00 != i) {
            this.A00 = i;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        A00();
    }
}
