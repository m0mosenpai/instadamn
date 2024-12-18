package X;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes11.dex */
public final class U8K extends Drawable {
    public float A00;
    public int A01;
    public ColorStateList A02;
    public final int A03;
    public final Paint A04;
    public final Paint A05;
    public final RectF A06;
    public final Drawable A07;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public U8K(ColorStateList colorStateList, Drawable drawable, float f, int i, int i2, int i3, int i4) {
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        this.A06 = new RectF();
        if (i3 > 0 && i4 != 0) {
            this.A03 = i3;
            Paint paint2 = new Paint(1);
            this.A05 = paint2;
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setColor(i4);
            paint2.setStrokeWidth(i3);
        }
        this.A01 = i;
        this.A00 = f;
        this.A02 = colorStateList;
        this.A07 = drawable;
        AbstractC166997dE.A1F(drawable, i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int round = Math.round((Math.min(bounds.height(), bounds.width()) - (this.A01 * 2.0f)) / 2.0f);
        RectF rectF = this.A06;
        AbstractC65702TsY.A0x(rectF, this);
        rectF.inset(0.0f, 0.0f);
        Paint paint = this.A04;
        paint.setColor(this.A02.getColorForState(getState(), 0));
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), round, paint);
        Paint paint2 = this.A05;
        if (paint2 != null) {
            float f = this.A03 / 2.0f;
            rectF.inset(f, f);
            float f2 = this.A00;
            canvas.drawRoundRect(rectF, f2, f2, paint2);
        }
        Drawable drawable = this.A07;
        if (drawable != null) {
            canvas.save();
            Rect bounds2 = drawable.getBounds();
            if ((bounds2.width() == 0 || bounds2.height() == 0) && drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                AbstractC167017dG.A14(drawable);
            }
            canvas.translate((bounds.width() / 2.0f) - (bounds2.width() / 2.0f), (bounds.height() / 2.0f) - (bounds2.height() / 2.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
    }
}
