package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jie, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44339Jie extends Drawable {
    public Paint A00;
    public final Paint A01;
    public final double A02;
    public final RectF A03 = AbstractC166987dD.A0X();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A03;
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A00);
        canvas.drawRoundRect(rectF, 999.0f, 999.0f, this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        RectF rectF = this.A03;
        rectF.set(rect);
        float f = (float) this.A02;
        rectF.inset(f, f);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public C44339Jie(int i, int i2, int i3) {
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setColor(i2);
        AbstractC43592JPx.A1E(A0S);
        A0S.setStrokeWidth(i);
        this.A01 = A0S;
        this.A02 = i / 2.0d;
        Paint A0S2 = AbstractC166987dD.A0S(1);
        A0S2.setColor(i3);
        this.A00 = A0S2;
    }
}
