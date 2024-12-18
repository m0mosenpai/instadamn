package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class U8N extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final RectF A06 = new RectF();
    public final RectF A04 = new RectF();
    public final RectF A05 = new RectF();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        RectF rectF = this.A06;
        Paint paint = this.A03;
        canvas.drawArc(rectF, 298.0f, 215.0f, false, paint);
        canvas.drawArc(this.A04, 121.0f, 208.0f, false, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Paint paint = this.A03;
        if (paint.getAlpha() != i) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public U8N(int i, int i2, int i3, int i4) {
        Paint paint = new Paint(1);
        this.A03 = paint;
        paint.setColor(i2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i);
        this.A00 = i3;
        this.A01 = i;
        this.A02 = i4 + i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        int i = rect.right;
        float sqrt = (float) ((i / 2) - (Math.sqrt(Math.pow(r4 - r6, 2.0d) / 2.0d) + (this.A00 / 2)));
        int i2 = rect.bottom;
        float f = i - i2;
        RectF rectF = this.A06;
        int i3 = this.A02;
        rectF.set(((i - r10) - i3) - sqrt, (((i2 - r10) - i3) - sqrt) + f, i - sqrt, (i2 - sqrt) + f);
        this.A04.set(rect.left + sqrt, rect.top + sqrt, r1 + r10 + i3 + sqrt, r0 + r10 + i3 + sqrt);
        RectF rectF2 = this.A05;
        int i4 = rect.right;
        float f2 = this.A01;
        rectF2.set((((i4 - r10) - i3) - sqrt) + f2, (((r3 - r10) - i3) - sqrt) + f + f2, (i4 - sqrt) - f2, ((rect.bottom - sqrt) + f) - f2);
    }
}
