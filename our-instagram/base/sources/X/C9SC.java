package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.9SC, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SC extends Drawable implements Drawable.Callback {
    public int A00;
    public Shader A01;
    public final Paint A02;
    public final Resources A03;
    public final Bitmap A04;
    public final Bitmap A05;
    public final Canvas A06;

    public C9SC(Context context, int i, int i2, int i3) {
        Resources A0M = AbstractC166997dE.A0M(context);
        this.A03 = A0M;
        Bitmap A00 = C0fK.A00(C6RR.A00(A0M, i), i2, i3, false);
        C14360o3.A07(A00);
        this.A04 = A00;
        Bitmap A0F = AbstractC167007dF.A0F(A00.getWidth(), A00.getHeight());
        this.A05 = A0F;
        this.A06 = new Canvas(A0F);
        Paint A0S = AbstractC166987dD.A0S(1);
        A0S.setAlpha(255);
        this.A02 = A0S;
        this.A00 = -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Shader shader = this.A01;
        Paint paint = this.A02;
        if (shader != null) {
            paint.setShader(shader);
        } else {
            paint.setColor(AbstractC167017dG.A02(this.A00, paint.getAlpha()));
        }
        Bitmap bitmap = this.A05;
        bitmap.eraseColor(0);
        Canvas canvas2 = this.A06;
        canvas2.drawBitmap(this.A04, 0.0f, 0.0f, paint);
        AbstractC166997dE.A1D(paint, PorterDuff.Mode.SRC_ATOP);
        canvas2.save();
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode(null);
        paint.setShader(null);
        canvas.drawBitmap(bitmap, AbstractC166987dD.A0E(this), getBounds().top, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A02.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        AbstractC167027dH.A0j(this, runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        AbstractC167027dH.A0i(this, runnable);
    }
}
