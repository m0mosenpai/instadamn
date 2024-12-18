package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;

/* loaded from: classes11.dex */
public final class U8S extends Drawable {
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final Context A09;
    public final Paint A0A;
    public final Paint A0B;
    public final Rect A0C;
    public final RectF A0D;
    public final Drawable A0E;
    public final TextPaint A0F;
    public final Integer A0G;
    public final boolean A0H;

    public U8S(Context context, Integer num) {
        this.A09 = context;
        this.A0G = num;
        this.A06 = AbstractC13880nE.A00(context, 24.0f);
        this.A07 = AbstractC13880nE.A00(context, 6.0f);
        this.A01 = AbstractC13880nE.A00(context, 14.0f);
        this.A00 = AbstractC13880nE.A00(context, 18.0f);
        this.A02 = AbstractC13880nE.A00(context, 5.0f);
        this.A03 = AbstractC13880nE.A00(context, 100.0f);
        float A00 = AbstractC13880nE.A00(context, 1.5f);
        this.A04 = A00;
        this.A05 = AbstractC13880nE.A00(context, 10.0f);
        Drawable drawable = context.getDrawable(R.drawable.instagram_shopping_cart_pano_outline_24);
        if (drawable != null) {
            AbstractC25231BEo.A0x(context, drawable, AbstractC53242c7.A08(context));
        } else {
            drawable = null;
        }
        this.A0E = drawable;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        AbstractC166987dD.A1N(context, paint, AbstractC53242c7.A08(context));
        paint.setStrokeWidth(A00);
        this.A0A = paint;
        TextPaint textPaint = new TextPaint(1);
        AbstractC166987dD.A1N(context, textPaint, AbstractC53242c7.A08(context));
        textPaint.setTextSize(AbstractC13880nE.A00(context, 14.0f));
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
        this.A0F = textPaint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.FILL);
        AbstractC166987dD.A1N(context, paint2, AbstractC53242c7.A0D(context));
        this.A0B = paint2;
        this.A0D = new RectF();
        Rect rect = new Rect();
        this.A0C = rect;
        this.A08 = AbstractC13880nE.A00(context, 8.0f);
        boolean z = num != null && num.intValue() > 0;
        this.A0H = z;
        if (z) {
            textPaint.getTextBounds(String.valueOf(num), 0, String.valueOf(num).length(), rect);
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
        Drawable drawable = this.A0E;
        if (drawable != null) {
            int i = rect.left;
            int centerY = rect.centerY() - (drawable.getIntrinsicHeight() / 2);
            drawable.setBounds(i, centerY, rect.right - ((int) this.A06), drawable.getIntrinsicHeight() + centerY);
            if (this.A0H) {
                RectF rectF = this.A0D;
                AbstractC65702TsY.A0x(rectF, drawable);
                float f = rectF.top - (((int) this.A07) + (this.A04 / 2.0f));
                rectF.top = f;
                float f2 = rectF.left + this.A01;
                rectF.left = f2;
                rectF.bottom = f + this.A00;
                float f3 = f2 + (this.A02 * 2.0f);
                float width = this.A0C.width();
                float f4 = this.A08;
                if (width < f4) {
                    width = f4;
                }
                rectF.right = f3 + width;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (this.A0E != null) {
            return (int) (r0.getIntrinsicHeight() + (this.A05 * 2.0f));
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (this.A0E != null) {
            return (int) (r0.getIntrinsicWidth() + this.A06);
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setAlpha(i);
        }
        this.A0B.setAlpha(i);
        this.A0A.setAlpha(i);
        this.A0F.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        this.A0F.setColorFilter(colorFilter);
        this.A0A.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        AbstractC167007dF.A0r(canvas);
        Drawable drawable = this.A0E;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        if (this.A0H) {
            RectF rectF = this.A0D;
            float f = this.A03;
            canvas.drawRoundRect(rectF, f, f, this.A0B);
            canvas.drawRoundRect(rectF, f, f, this.A0A);
            canvas.drawText(String.valueOf(this.A0G), rectF.centerX(), rectF.centerY() + (this.A0C.height() / 2.0f), this.A0F);
        }
        canvas.restore();
    }
}
