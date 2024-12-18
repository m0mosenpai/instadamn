package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* renamed from: X.Maw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C50742Maw extends Drawable {
    public final int A00;
    public final Drawable A01;
    public final C89533yt A02;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A02.draw(canvas);
        this.A01.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A02.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
        this.A01.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
    }

    public C50742Maw(Drawable drawable, C89533yt c89533yt, int i) {
        this.A02 = c89533yt;
        this.A01 = drawable;
        this.A00 = i;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float intrinsicWidth = getIntrinsicWidth() / 2.0f;
        float f3 = f - intrinsicWidth;
        float intrinsicHeight = getIntrinsicHeight() / 2.0f;
        float f4 = f2 - intrinsicHeight;
        float f5 = f + intrinsicWidth;
        float f6 = f2 + intrinsicHeight;
        C89533yt c89533yt = this.A02;
        float f7 = c89533yt.A01;
        c89533yt.setBounds((int) f3, (int) f4, (int) (f3 + f7), (int) (f4 + f7));
        Drawable drawable = this.A01;
        float f8 = this.A00;
        drawable.setBounds((int) (f5 - f8), (int) (f6 - f8), (int) f5, (int) f6);
    }
}
