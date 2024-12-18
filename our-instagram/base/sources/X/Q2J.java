package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* loaded from: classes10.dex */
public final class Q2J extends Drawable {
    public float A00;
    public int A01;
    public int A02;
    public final float A03;
    public final float A04;
    public final Paint A05;
    public final Q2F A06;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A06.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A06.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A05.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A05.setColorFilter(colorFilter);
    }

    public Q2J(Typeface typeface, String str, int i) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A05 = A0R;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A01 = 0;
        this.A06 = new Q2F(typeface, str, i);
        A0R.setTypeface(typeface);
        A0R.setTextAlign(Paint.Align.CENTER);
        A0R.setTextSize(64.0f);
        Paint.FontMetrics fontMetrics = A0R.getFontMetrics();
        float f = fontMetrics.descent;
        float f2 = fontMetrics.ascent;
        this.A03 = 64.0f / ((f - f2) * 1.0625f);
        this.A04 = (-f2) / 64.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawText(this.A06.A01, (bounds.left + bounds.right) / 2, bounds.top + this.A00, this.A05);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 == this.A02 && i6 == this.A01) {
            return;
        }
        this.A02 = i5;
        this.A01 = i6;
        float min = Math.min(i5, i6) * this.A03;
        this.A05.setTextSize(min);
        this.A00 = min * this.A04;
    }
}
