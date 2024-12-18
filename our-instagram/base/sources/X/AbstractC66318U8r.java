package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.U8r, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public abstract class AbstractC66318U8r extends Drawable implements XD1, InterfaceC162887Qz {
    public InterfaceC162877Qy A01;
    public final Drawable A0F;
    public boolean A03 = false;
    public boolean A04 = false;
    public final Path A0J = new Path();
    public boolean A00 = true;
    public final Path A0I = new Path();
    public final float[] A0H = new float[8];
    public final float[] A0G = new float[8];
    public final RectF A0E = new RectF();
    public final RectF A0D = new RectF();
    public final RectF A0B = new RectF();
    public final RectF A0C = new RectF();
    public final Matrix A05 = new Matrix();
    public final Matrix A08 = new Matrix();
    public final Matrix A07 = new Matrix();
    public final Matrix A09 = new Matrix();
    public final Matrix A06 = new Matrix();
    public final Matrix A0A = new Matrix();
    public boolean A02 = true;

    @Override // X.XD1
    public final void ERO(boolean z) {
        this.A03 = true;
        this.A02 = true;
        invalidateSelf();
    }

    @Override // X.XD1
    public final void Ec4(float[] fArr) {
        boolean z = false;
        C0Hf.A02(AbstractC167007dF.A1P(fArr.length, 8), "radii should have exactly 8 values");
        System.arraycopy(fArr, 0, this.A0H, 0, 8);
        this.A04 = false;
        int i = 0;
        do {
            z |= AbstractC167007dF.A1O((fArr[i] > 0.0f ? 1 : (fArr[i] == 0.0f ? 0 : -1)));
            this.A04 = z;
            i++;
        } while (i < 8);
        this.A02 = true;
        invalidateSelf();
    }

    @Override // X.XD1
    public final void Ec5(float f) {
        C0Hf.A01(MSY.A1R((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1))));
        Arrays.fill(this.A0H, f);
        this.A04 = f != 0.0f;
        this.A02 = true;
        invalidateSelf();
    }

    public void A00() {
        RectF rectF;
        InterfaceC162877Qy interfaceC162877Qy = this.A01;
        Matrix matrix = this.A07;
        if (interfaceC162877Qy != null) {
            interfaceC162877Qy.CAW(matrix);
            InterfaceC162877Qy interfaceC162877Qy2 = this.A01;
            rectF = this.A0E;
            interfaceC162877Qy2.BpW(rectF);
        } else {
            matrix.reset();
            rectF = this.A0E;
            AbstractC65702TsY.A0x(rectF, this);
        }
        RectF rectF2 = this.A0B;
        Drawable drawable = this.A0F;
        rectF2.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        RectF rectF3 = this.A0C;
        AbstractC65702TsY.A0x(rectF3, drawable);
        Matrix matrix2 = this.A05;
        matrix2.setRectToRect(rectF2, rectF3, Matrix.ScaleToFit.FILL);
        Matrix matrix3 = this.A09;
        if (!matrix.equals(matrix3) || !matrix2.equals(this.A08)) {
            this.A00 = true;
            matrix.invert(this.A06);
            Matrix matrix4 = this.A0A;
            matrix4.set(matrix);
            matrix4.preConcat(matrix2);
            matrix3.set(matrix);
            this.A08.set(matrix2);
        }
        RectF rectF4 = this.A0D;
        if (!rectF.equals(rectF4)) {
            this.A02 = true;
            rectF4.set(rectF);
        }
    }

    public final void A01() {
        float[] fArr;
        if (this.A02) {
            Path path = this.A0I;
            path.reset();
            RectF rectF = this.A0E;
            float f = 0.0f / 2.0f;
            rectF.inset(f, f);
            if (this.A03) {
                AbstractC65703TsZ.A1F(path, rectF);
            } else {
                int i = 0;
                while (true) {
                    fArr = this.A0G;
                    if (i >= fArr.length) {
                        break;
                    }
                    fArr[i] = (this.A0H[i] + 0.0f) - f;
                    i++;
                }
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
            }
            float f2 = (-0.0f) / 2.0f;
            rectF.inset(f2, f2);
            Path path2 = this.A0J;
            path2.reset();
            float f3 = 0.0f + 0.0f;
            rectF.inset(f3, f3);
            if (this.A03) {
                path2.addCircle(rectF.centerX(), rectF.centerY(), Math.min(rectF.width(), rectF.height()) / 2.0f, Path.Direction.CW);
            } else {
                path2.addRoundRect(rectF, this.A0H, Path.Direction.CW);
            }
            float f4 = -f3;
            rectF.inset(f4, f4);
            path2.setFillType(Path.FillType.WINDING);
            this.A02 = false;
        }
    }

    public boolean A02() {
        if (!this.A03 && !this.A04) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void clearColorFilter() {
        this.A0F.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A0F.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A0F.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0F.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0F.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A0F.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.A0F.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.A0F.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.A0F.setColorFilter(colorFilter);
    }

    public AbstractC66318U8r(Drawable drawable) {
        this.A0F = drawable;
    }

    @Override // X.InterfaceC162887Qz
    public final void Eg9(InterfaceC162877Qy interfaceC162877Qy) {
        this.A01 = interfaceC162877Qy;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C1VI.A00();
        this.A0F.draw(canvas);
        C1VI.A00();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(int i, PorterDuff.Mode mode) {
        this.A0F.setColorFilter(i, mode);
    }
}
