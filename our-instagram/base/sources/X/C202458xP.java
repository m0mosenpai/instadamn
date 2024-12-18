package X;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.8xP, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202458xP extends Drawable implements C5RR, InterfaceC133125ze {
    public final C217819kE A00;
    public final int A01;
    public final int A02;
    public final Bitmap A03;
    public final Paint A04;
    public final RectF A05;

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        if (this.A03 != null) {
            C14360o3.A07(getBounds());
            canvas.save();
            canvas.translate(r2.left, r2.top);
            canvas.drawRect(this.A05, this.A04);
            canvas.restore();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // X.C5RR
    public final C5NL C0T() {
        return this.A00;
    }

    @Override // X.InterfaceC133125ze
    public final String C5K() {
        return "fb_community_tap_state_id_key";
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A02;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A04.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C202458xP(Bitmap bitmap, C217819kE c217819kE, int i, int i2) {
        this.A00 = c217819kE;
        this.A03 = bitmap;
        this.A02 = i;
        this.A01 = i2;
        Paint paint = new Paint(3);
        this.A04 = paint;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
        this.A05 = new RectF(0.0f, 0.0f, i, i2);
    }
}
