package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.8RK, reason: invalid class name */
/* loaded from: classes4.dex */
public class C8RK extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public final Paint A03;
    public final RectF A04;
    public final RectF A05;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A04;
        float f = this.A00;
        Paint paint = this.A03;
        canvas.drawRoundRect(rectF, f, f, paint);
        RectF rectF2 = this.A05;
        float f2 = this.A00;
        canvas.drawRoundRect(rectF2, f2, f2, paint);
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

    public static final void A00(C8RK c8rk) {
        c8rk.A04.set(c8rk.getBounds().left, c8rk.getBounds().top, c8rk.getBounds().left + c8rk.A01, c8rk.getBounds().bottom);
        c8rk.A05.set(c8rk.getBounds().right - c8rk.A02, c8rk.getBounds().top, c8rk.getBounds().right, c8rk.getBounds().bottom);
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

    public C8RK(int i, int i2) {
        Paint paint = new Paint(1);
        this.A03 = paint;
        this.A04 = new RectF();
        this.A05 = new RectF();
        this.A00 = i2;
        paint.setColor(i);
    }
}
