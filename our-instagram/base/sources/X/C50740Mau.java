package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.Mau, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50740Mau extends Drawable {
    public final Paint A00 = AbstractC166987dD.A0R();
    public final Rect A01 = AbstractC166987dD.A0U();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.clipOutRect(this.A01);
        canvas.drawRect(getBounds(), this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.A00.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A00.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
    }
}
