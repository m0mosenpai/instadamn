package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.Choreographer;

/* renamed from: X.U8n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ChoreographerFrameCallbackC66314U8n extends Drawable implements Choreographer.FrameCallback {
    public int A00;
    public Bitmap A01;
    public long A03;
    public final XEC A04;
    public final Rect A07;
    public final Paint A06 = new Paint(2);
    public final RectF A08 = new RectF();
    public boolean A02 = true;
    public final AbstractRunnableC14200nk A09 = new V65(this);
    public final Runnable A05 = new RunnableC71307Wrb(this);

    public ChoreographerFrameCallbackC66314U8n(XEC xec) {
        this.A04 = xec;
        this.A07 = new Rect(0, 0, xec.getWidth(), xec.getHeight());
        try {
            this.A01 = Bitmap.createBitmap(xec.getWidth(), xec.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e) {
            C0w9.A06("BloksGif", "Failed to create buffer", e);
            throw e;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        try {
            Bitmap bitmap = this.A01;
            C14360o3.A0A(bitmap);
            canvas.drawBitmap(bitmap, this.A07, this.A08, this.A06);
            if (this.A02) {
                this.A02 = false;
                Choreographer.getInstance().postFrameCallback(this);
            }
        } catch (RuntimeException e) {
            C0w9.A06("BloksGif", "Failed to draw buffer", e);
            throw e;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A08.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A04.getHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A04.getWidth();
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.A03;
        if (j2 > 0) {
            i = (int) (currentTimeMillis - j2);
        } else {
            i = 0;
        }
        this.A00 = (this.A00 + i) % this.A04.getDuration();
        this.A03 = currentTimeMillis;
        C14120nc.A00().ATO(this.A09);
    }
}
