package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public final class BYH extends Drawable {
    public final float A00;
    public final float A01;
    public final int A02;
    public final RectF A03 = AbstractC166987dD.A0X();
    public final boolean A04;
    public final boolean A05;
    public final Paint A06;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A06;
        RectF rectF = this.A03;
        float f = rectF.left;
        boolean z = this.A05;
        float f2 = rectF.top;
        if (z) {
            f2 += this.A01;
        }
        boolean z2 = this.A04;
        float f3 = rectF.bottom;
        if (z2) {
            f3 -= this.A01;
        }
        canvas.drawLine(f, f2, f, f3, paint);
        float f4 = rectF.right;
        float f5 = rectF.top;
        if (z) {
            f5 += this.A01;
        }
        float f6 = rectF.bottom;
        if (z2) {
            f6 -= this.A01;
        }
        canvas.drawLine(f4, f5, f4, f6, paint);
        if (z) {
            float f7 = rectF.left;
            float f8 = this.A01;
            float f9 = rectF.top;
            canvas.drawLine(f7 + f8, f9, rectF.right - f8, f9, paint);
        }
        if (z2) {
            float f10 = rectF.left;
            float f11 = this.A01;
            float f12 = rectF.bottom;
            canvas.drawLine(f10 + f11, f12, rectF.right - f11, f12, paint);
        }
        if (z) {
            float f13 = rectF.left;
            float f14 = rectF.top;
            float f15 = this.A01 * 2.0f;
            canvas.drawArc(new RectF(f13, f14, f13 + f15, f14 + f15), 180.0f, 90.0f, false, paint);
            float f16 = rectF.right;
            float f17 = rectF.top;
            canvas.drawArc(new RectF(f16 - f15, f17, f16, f17 + f15), 270.0f, 90.0f, false, paint);
        }
        if (z2) {
            float f18 = rectF.left;
            float f19 = rectF.bottom;
            float f20 = this.A01 * 2.0f;
            canvas.drawArc(new RectF(f18, f19 - f20, f18 + f20, f19), 90.0f, 90.0f, false, paint);
            float f21 = rectF.right;
            float f22 = rectF.bottom;
            canvas.drawArc(new RectF(f21 - f20, f22 - f20, f21, f22), 0.0f, 90.0f, false, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C14360o3.A0B(rect, 0);
        float f = this.A01;
        float f2 = f - 0.0f;
        int i = (int) f2;
        float f3 = 0.0f;
        if (this.A05) {
            f3 = f2;
        }
        int i2 = (int) f3;
        float f4 = 0.0f + f;
        int i3 = (int) f4;
        float f5 = 0.0f;
        if (this.A04) {
            f5 = f4;
        }
        rect.set(i, i2, i3, (int) f5);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Object valueOf;
        Object valueOf2;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        float f = rect.left;
        float f2 = this.A01;
        float f3 = f + f2;
        boolean z = this.A05;
        int i = rect.top;
        if (z) {
            valueOf = Float.valueOf(i + f2);
        } else {
            valueOf = Integer.valueOf(i);
        }
        float A09 = AbstractC166987dD.A09(valueOf);
        float f4 = rect.right - f2;
        boolean z2 = this.A04;
        int i2 = rect.bottom;
        if (z2) {
            valueOf2 = Float.valueOf(i2 - f2);
        } else {
            valueOf2 = Integer.valueOf(i2);
        }
        rectF.set(f3, A09, f4, AbstractC166987dD.A09(valueOf2));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A06.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A06.setColorFilter(colorFilter);
    }

    public BYH(float f, float f2, int i, boolean z, boolean z2) {
        this.A01 = f;
        this.A00 = f2;
        this.A02 = i;
        this.A05 = z;
        this.A04 = z2;
        Paint A0R = AbstractC166987dD.A0R();
        A0R.setColor(this.A02);
        A0R.setStrokeWidth(this.A00);
        A0R.setStyle(Paint.Style.STROKE);
        A0R.setAntiAlias(true);
        this.A06 = A0R;
    }
}
