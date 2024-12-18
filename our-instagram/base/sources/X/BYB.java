package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import kotlin.Deprecated;

/* loaded from: classes5.dex */
public final class BYB extends Drawable {
    public final Paint A00 = AbstractC166987dD.A0R();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        canvas.drawRect(getBounds(), this.A00);
    }

    @Override // android.graphics.drawable.Drawable
    @Deprecated(message = "Deprecated in superclass")
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
