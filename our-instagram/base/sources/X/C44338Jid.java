package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.Jid, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44338Jid extends Drawable {
    public final float A00;
    public final BitmapShader A01;
    public final Paint A02;
    public final RectF A03 = AbstractC166987dD.A0X();

    public C44338Jid(Bitmap bitmap, float f) {
        this.A00 = f;
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.A01 = bitmapShader;
        Paint A0R = AbstractC166987dD.A0R();
        this.A02 = A0R;
        A0R.setAntiAlias(true);
        A0R.setShader(bitmapShader);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A03;
        float f = this.A00;
        canvas.drawRoundRect(rectF, f, f, this.A02);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A03.set(0.0f, 0.0f, rect.width(), rect.height());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
    }
}
