package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;

/* renamed from: X.8RM, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8RM extends C8RI {
    @Override // X.C8RI, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        int width = getBounds().width();
        int height = getBounds().height();
        float width2 = getBounds().width() * this.A00;
        float f = this.A0D;
        float f2 = width2 + f;
        float width3 = (getBounds().width() * this.A01) - f;
        int i = this.A04;
        RectF rectF = new RectF();
        Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        Canvas canvas2 = new Canvas(createBitmap);
        Paint paint = new Paint(1);
        paint.setColor(i);
        paint.setStyle(Paint.Style.FILL);
        float f3 = height;
        canvas2.drawRect(0.0f, 0.0f, width, f3, paint);
        paint.setColor(0);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_ATOP));
        rectF.set(f2, 0.0f, width3, f3);
        float f4 = this.A0C;
        canvas2.drawRoundRect(rectF, f4, f4, paint);
        canvas.drawBitmap(createBitmap, 0.0f, 0.0f, (Paint) null);
        super.draw(canvas);
    }
}
