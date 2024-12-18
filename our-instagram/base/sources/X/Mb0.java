package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes9.dex */
public final class Mb0 extends Drawable {
    public int A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final RectF A04;
    public final RectF A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A04;
        Paint paint = this.A03;
        canvas.drawRect(rectF, paint);
        canvas.drawRect(this.A05, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        A00(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public Mb0(int i) {
        Paint A0P = AbstractC166997dE.A0P();
        this.A03 = A0P;
        this.A04 = AbstractC166987dD.A0X();
        this.A05 = AbstractC166987dD.A0X();
        A0P.setColor(i);
    }

    public static final void A00(Mb0 mb0) {
        Rect bounds = mb0.getBounds();
        C14360o3.A07(bounds);
        RectF rectF = mb0.A04;
        float f = bounds.left;
        rectF.set(f, bounds.top, f + mb0.A00, bounds.bottom);
        RectF rectF2 = mb0.A05;
        float f2 = mb0.A02;
        rectF2.set(f2, bounds.top, f2 + mb0.A01, bounds.bottom);
    }
}
