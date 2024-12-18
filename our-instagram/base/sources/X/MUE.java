package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes9.dex */
public final class MUE extends Drawable {
    public Bitmap A00;
    public String A01;
    public final float A02;
    public final Paint A03 = AbstractC166987dD.A0R();
    public final RectF A06 = AbstractC166987dD.A0X();
    public final InterfaceC09390do A04 = C57539PgD.A00(this, EnumC09460dv.A02, 48);
    public final Rect A05 = AbstractC166987dD.A0U();
    public final C54605OAg A07 = new C54605OAg();

    public final void A00(String str) {
        int length;
        if (str != null && (length = str.length()) != 0) {
            if (!str.equals(this.A01)) {
                try {
                    C54605OAg c54605OAg = this.A07;
                    float f = this.A02;
                    Paint paint = c54605OAg.A01;
                    paint.setTextSize(f);
                    Rect rect = c54605OAg.A02;
                    paint.getTextBounds(str, 0, length, rect);
                    Bitmap A0F = AbstractC167007dF.A0F(rect.width(), rect.height());
                    Canvas canvas = c54605OAg.A00;
                    canvas.setBitmap(A0F);
                    canvas.drawText(str, -rect.left, -rect.top, paint);
                    this.A00 = A0F;
                } catch (IllegalArgumentException e) {
                    C0w9.A04("EmojiDrawable_IllegalArgumentException", AnonymousClass001.A0v("emoji: ", str, " [", e.getMessage(), ']'), 1);
                    ((Paint) this.A04.getValue()).getTextBounds(str, 0, length, this.A05);
                }
            }
        } else {
            this.A00 = null;
        }
        this.A01 = str;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean quickReject;
        C14360o3.A0B(canvas, 0);
        RectF rectF = this.A06;
        if (Build.VERSION.SDK_INT >= 30) {
            quickReject = canvas.quickReject(rectF);
        } else {
            quickReject = canvas.quickReject(rectF, Canvas.EdgeType.BW);
        }
        if (!quickReject) {
            Bitmap bitmap = this.A00;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, getBounds().exactCenterX() - (bitmap.getWidth() / 2.0f), getBounds().exactCenterY() - (bitmap.getHeight() / 2.0f), this.A03);
                return;
            }
            String str = this.A01;
            if (str == null) {
                return;
            }
            float exactCenterX = getBounds().exactCenterX();
            Rect rect = this.A05;
            float exactCenterX2 = exactCenterX - rect.exactCenterX();
            float exactCenterY = getBounds().exactCenterY() - rect.exactCenterY();
            InterfaceC09390do interfaceC09390do = this.A04;
            Paint paint = (Paint) interfaceC09390do.getValue();
            Paint paint2 = this.A03;
            paint.setAlpha(paint2.getAlpha());
            ((Paint) interfaceC09390do.getValue()).setColorFilter(paint2.getColorFilter());
            canvas.drawText(str, exactCenterX2, exactCenterY, (Paint) interfaceC09390do.getValue());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        this.A06.set(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.A03.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.A03.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getHeight();
        }
        return this.A05.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            return bitmap.getWidth();
        }
        return this.A05.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A03.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A03.setColorFilter(colorFilter);
    }

    public MUE(float f) {
        this.A02 = f;
    }
}
