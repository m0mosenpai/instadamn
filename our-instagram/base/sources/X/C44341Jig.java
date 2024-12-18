package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jig, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44341Jig extends Drawable {
    public int A00;
    public int A01;
    public final boolean A04;
    public final float A05;
    public final int A06;
    public final Paint A07 = AbstractC166987dD.A0S(1);
    public final RectF A03 = AbstractC166987dD.A0X();
    public final RectF A02 = AbstractC166987dD.A0X();

    public C44341Jig(Context context, int i, int i2, boolean z) {
        this.A00 = i;
        this.A01 = i2;
        this.A04 = z;
        this.A05 = AbstractC43594JPz.A02(context);
        this.A06 = context.getColor(AbstractC53242c7.A0B(context));
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Rect A0V;
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(rect);
        int i = rect.right;
        int i2 = (int) ((this.A01 * i) / 100.0d);
        RectF rectF = this.A02;
        if (this.A04) {
            A0V = AbstractC166987dD.A0V(Math.max(i - i2, rect.left), rect.top, i, rect.bottom);
        } else {
            A0V = AbstractC166987dD.A0V(rect.left, rect.top, i2, rect.bottom);
        }
        rectF.set(A0V);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        Paint paint = this.A07;
        paint.setColor(this.A06);
        RectF rectF = this.A03;
        float f = this.A05;
        canvas.drawRoundRect(rectF, f, f, paint);
        paint.setColor(this.A00);
        canvas.drawRoundRect(this.A02, f, f, paint);
        canvas.restore();
    }
}
