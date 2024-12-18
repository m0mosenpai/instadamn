package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.facebook.R;

/* renamed from: X.JiY, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44333JiY extends Drawable {
    public Bitmap A00;
    public final Paint A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A06 = AbstractC166987dD.A0U();
    public final Rect A05 = AbstractC166987dD.A0U();

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C44333JiY(Context context) {
        Paint A0S = AbstractC166987dD.A0S(1);
        this.A01 = A0S;
        Paint.Style style = Paint.Style.FILL;
        A0S.setStyle(style);
        Paint A0S2 = AbstractC166987dD.A0S(1);
        this.A04 = A0S2;
        AbstractC43592JPx.A1E(A0S2);
        AbstractC166987dD.A1N(context, A0S2, R.color.audio_bar_action_color_enabled);
        A0S2.setStrokeWidth(AbstractC13880nE.A00(context, 1.5f));
        Paint A0S3 = AbstractC166987dD.A0S(3);
        this.A03 = A0S3;
        A0S3.setStyle(style);
        this.A02 = AbstractC43592JPx.A01(context, 5);
        A0S3.setColorFilter(C3DY.A00(context.getColor(R.color.audio_bar_action_color_enabled)));
        this.A01.setColor(context.getColor(AbstractC53242c7.A0C(context)));
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2.0f, this.A01);
        canvas.drawCircle(bounds.exactCenterX(), bounds.exactCenterY(), bounds.width() / 2.0f, this.A04);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            Rect rect = this.A06;
            rect.set(0, 0, bitmap.getWidth(), bitmap.getHeight());
            Rect rect2 = this.A05;
            int i = bounds.left;
            int i2 = this.A02;
            rect2.set(i + i2, bounds.top + i2, bounds.right - i2, bounds.bottom - i2);
            canvas.drawBitmap(bitmap, rect, rect2, this.A03);
        }
    }
}
