package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jin, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44348Jin extends Drawable {
    public String A00;
    public final Paint A01;
    public final Rect A02;
    public final Drawable A03;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A03.draw(canvas);
        String str = this.A00;
        if (str != null && str.length() != 0) {
            canvas.drawText(str, AbstractC166997dE.A0F(this), this.A02.bottom, this.A01);
        }
    }

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

    public C44348Jin(int i, int i2, int i3, int i4) {
        Paint A0R = AbstractC166987dD.A0R();
        this.A01 = A0R;
        A0R.setFilterBitmap(true);
        A0R.setAntiAlias(true);
        A0R.setTypeface(Typeface.DEFAULT_BOLD);
        A0R.setTextAlign(Paint.Align.CENTER);
        A0R.setTextSize(i2);
        A0R.setColor(i3);
        Rect A0U = AbstractC166987dD.A0U();
        this.A02 = A0U;
        C44332JiX c44332JiX = new C44332JiX(i4);
        this.A03 = c44332JiX;
        A0R.getTextBounds("0:00:00", 0, 7, A0U);
        A0U.offsetTo(i, i);
        int i5 = i * 2;
        setBounds(0, 0, A0U.width() + i5, A0U.height() + i5);
        c44332JiX.setBounds(getBounds());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return AbstractC166997dE.A0G(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return AbstractC166997dE.A0H(this);
    }
}
