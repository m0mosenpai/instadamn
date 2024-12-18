package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.U4b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66205U4b extends Drawable {
    public boolean A00;
    public final Path A01 = new Path();
    public final RectF A02;
    public final float[] A03;
    public final Paint A04;

    public final void A00(float f, float f2, float f3, float f4) {
        float[] fArr = this.A03;
        fArr[0] = f;
        int i = 1;
        fArr[1] = f;
        fArr[2] = f2;
        fArr[3] = f2;
        fArr[4] = f3;
        fArr[5] = f3;
        fArr[6] = f4;
        fArr[7] = f4;
        this.A00 = true;
        while (true) {
            if (i >= fArr.length) {
                break;
            }
            float f5 = fArr[i];
            if (Float.compare(f, f5) != 0) {
                this.A00 = false;
                Path path = this.A01;
                path.reset();
                path.addRoundRect(this.A02, fArr, Path.Direction.CW);
                break;
            }
            i++;
            f = f5;
        }
        invalidateSelf();
    }

    public final void A01(int i) {
        Paint paint = this.A04;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A00) {
            RectF rectF = this.A02;
            float f = this.A03[0];
            canvas.drawRoundRect(rectF, f, f, this.A04);
            return;
        }
        canvas.drawPath(this.A01, this.A04);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        float[] fArr = this.A03;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Float.compare(fArr[i], 0.0f) == 0) {
                    break;
                }
                i++;
            } else {
                if (this.A04.getAlpha() != 255) {
                    break;
                }
                return -1;
            }
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A04;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C66205U4b() {
        Paint paint = new Paint();
        this.A04 = paint;
        this.A02 = new RectF();
        this.A03 = new float[8];
        this.A00 = true;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        if (!this.A00) {
            Path path = this.A01;
            path.reset();
            path.addRoundRect(rectF, this.A03, Path.Direction.CW);
        }
    }
}
