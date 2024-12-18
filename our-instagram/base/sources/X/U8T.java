package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes11.dex */
public final class U8T extends Drawable {
    public Bitmap A00;
    public String A01;
    public ColorStateList A02;
    public final Rect A03;
    public final TextPaint A04;
    public final float A05;
    public final float A06;
    public final float A07;
    public final float A08;
    public final float A09;
    public final float A0A;
    public final int A0B;
    public final Paint A0C;
    public final Paint A0D;
    public final RectF A0E;
    public final Drawable A0F;

    public U8T(Context context, Integer num) {
        Paint paint = new Paint(1);
        this.A0C = paint;
        this.A0F = context.getDrawable(R.drawable.instagram_calendar_pano_outline_24);
        this.A0B = context.getColor(AbstractC53242c7.A07(context));
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-16777216);
        TextPaint textPaint = new TextPaint(1);
        this.A04 = textPaint;
        textPaint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A11));
        textPaint.setTextSize(AbstractC13880nE.A00(context, 12.5f));
        textPaint.setColor(-16777216);
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A0A = AbstractC13880nE.A00(context, 0.5f);
        Integer num2 = C05F.A01;
        PorterDuff.Mode mode = PorterDuff.Mode.CLEAR;
        if (num == num2) {
            AbstractC166997dE.A1D(paint, mode);
        } else {
            AbstractC166997dE.A1D(textPaint, mode);
        }
        this.A0D = new Paint(1);
        this.A0E = new RectF();
        boolean z = num == num2;
        this.A05 = AbstractC13880nE.A00(context, z ? 3.0f : 1.0f);
        this.A06 = AbstractC13880nE.A00(context, z ? 3.0f : 1.0f);
        this.A07 = AbstractC13880nE.A00(context, z ? 3.0f : 1.0f);
        this.A09 = AbstractC13880nE.A00(context, 1.5f);
        this.A08 = AbstractC13880nE.A00(context, z ? 9.0f : 7.0f);
        this.A03 = new Rect();
        int i = Calendar.getInstance().get(5);
        C02R.A01(i, 1, DatePickerDialogModule.ARG_DATE, 31);
        String format = NumberFormat.getInstance(Locale.getDefault()).format(i);
        this.A01 = format;
        TextPaint textPaint2 = this.A04;
        C14360o3.A0A(format);
        textPaint2.getTextBounds(format, 0, format.length(), this.A03);
        this.A00 = null;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        if (this.A00 == null) {
            Bitmap createBitmap = Bitmap.createBitmap(bounds.width(), bounds.height(), Bitmap.Config.ARGB_8888);
            this.A00 = createBitmap;
            C14360o3.A0A(createBitmap);
            Canvas canvas2 = new Canvas(createBitmap);
            Drawable drawable = this.A0F;
            C14360o3.A0A(drawable);
            drawable.draw(canvas2);
            RectF rectF = this.A0E;
            float f = this.A09;
            canvas2.drawRoundRect(rectF, f, f, this.A0C);
            String str = this.A01;
            if (str != null) {
                float centerX = rectF.centerX();
                float f2 = this.A0A;
                float centerY = rectF.centerY();
                Rect rect = this.A03;
                canvas2.drawText(str, centerX - f2, ((centerY - rect.top) - (rect.height() / 2.0f)) - f2, this.A04);
            }
        }
        Bitmap bitmap = this.A00;
        C14360o3.A0A(bitmap);
        canvas.drawBitmap(bitmap, bounds.left, bounds.top, this.A0D);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        C14360o3.A0B(rect, 0);
        super.onBoundsChange(rect);
        Drawable drawable = this.A0F;
        C14360o3.A0A(drawable);
        drawable.setBounds(rect);
        RectF rectF = this.A0E;
        rectF.set(rect);
        rectF.left += this.A06;
        rectF.top += this.A08;
        rectF.right -= this.A07;
        rectF.bottom -= this.A05;
        this.A00 = null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        ColorStateList colorStateList = this.A02;
        if (colorStateList == null) {
            return false;
        }
        AbstractC166997dE.A1F(this, colorStateList.getColorForState(iArr, this.A0B));
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.A0F;
        C14360o3.A0A(drawable);
        return drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.A0F;
        C14360o3.A0A(drawable);
        return drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0D.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0D.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.A02 = colorStateList;
        if (colorStateList != null) {
            AbstractC166997dE.A1F(this, colorStateList.getColorForState(getState(), this.A0B));
        } else {
            clearColorFilter();
        }
    }
}
