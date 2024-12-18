package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jib, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44336Jib extends Drawable {
    public Bitmap A00;
    public final InterfaceC09390do A01 = AbstractC09440dt.A01(MEt.A00);
    public final RectF A02 = AbstractC166987dD.A0X();

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.A02, (Paint) this.A01.getValue());
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

    public C44336Jib(Bitmap bitmap) {
        this.A00 = bitmap;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.A02.set(i, i2, i3, i4);
    }
}
