package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.facebook.R;
import java.text.DateFormat;
import java.util.Date;

/* renamed from: X.8xW, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202528xW extends Drawable implements C5RR {
    public final Integer A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final Resources A0A;
    public final Bitmap A0B;
    public final Bitmap A0C;
    public final Canvas A0D;
    public final LinearGradient A0E;
    public final LinearGradient A0F;
    public final Paint A0G;
    public final PorterDuffXfermode A0H;
    public final Rect A0I;
    public final RectF A0J;
    public final String A0K;
    public final int[] A0L;

    public C202528xW(Context context, Integer num, int i, long j) {
        this.A00 = num;
        String format = DateFormat.getTimeInstance().format(new Date(j));
        this.A0K = format;
        Resources resources = context.getResources();
        this.A0A = resources;
        this.A0H = new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP);
        Paint paint = new Paint(1);
        paint.setTextSize(resources.getDimension(R.dimen.contextual_sticker_tray_text_size));
        paint.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A0V));
        this.A0G = paint;
        Rect rect = new Rect();
        paint.getTextBounds(format, 0, format.length(), rect);
        this.A0I = rect;
        this.A0J = new RectF();
        this.A02 = context.getColor(R.color.design_dark_default_color_on_background);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right);
        this.A05 = dimensionPixelSize;
        int A01 = AbstractC13690mv.A01(context, 8);
        this.A04 = A01;
        this.A01 = resources.getDimensionPixelSize(R.dimen.abc_button_inset_vertical_material);
        Bitmap A00 = C6RR.A00(resources, R.drawable.instagram_clock_dotted_pano_outline_24);
        this.A0B = A00;
        Bitmap createBitmap = Bitmap.createBitmap(A00.getWidth(), A00.getHeight(), Bitmap.Config.ARGB_8888);
        C14360o3.A07(createBitmap);
        this.A0C = createBitmap;
        this.A0D = new Canvas(createBitmap);
        int i2 = dimensionPixelSize * 2;
        this.A09 = Math.min(i, rect.width() + i2 + A00.getWidth() + A01);
        this.A03 = rect.height() + i2;
        int[] A0x = AbstractC001800i.A0x(AbstractC16960so.A1Q(Integer.valueOf(context.getColor(R.color.green_5)), Integer.valueOf(context.getColor(R.color.cyan_5))));
        this.A0L = A0x;
        this.A07 = context.getColor(AbstractC53242c7.A09(context));
        this.A08 = context.getColor(R.color.igds_gradient_cyan);
        this.A06 = context.getColor(AbstractC53242c7.A0H(context, R.attr.igds_color_icon_badge));
        float centerX = getBounds().centerX() - (rect.width() / 2);
        float width = rect.width();
        Shader.TileMode tileMode = Shader.TileMode.REPEAT;
        this.A0F = new LinearGradient(centerX, 0.0f, width, 0.0f, A0x, (float[]) null, tileMode);
        this.A0E = new LinearGradient(0.0f, 0.0f, A00.getWidth(), 0.0f, A0x, (float[]) null, tileMode);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        C14360o3.A0B(canvas, 0);
        Paint paint = this.A0G;
        paint.setColor(this.A02);
        RectF rectF = this.A0J;
        rectF.set(getBounds().centerX(), getBounds().centerY(), getBounds().centerX(), getBounds().centerY());
        rectF.inset((-this.A09) / 2, (-this.A03) / 2);
        float f = this.A01;
        canvas.drawRoundRect(rectF, f, f, paint);
        int min = Math.min(Math.abs(this.A0I.top), (int) Math.abs(paint.getFontMetrics().ascent));
        Integer num = this.A00;
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        i = this.A06;
                    } else {
                        throw new RuntimeException();
                    }
                } else {
                    i = this.A08;
                }
            } else {
                i = this.A07;
            }
            paint.setColor(i);
        } else {
            paint.setShader(this.A0F);
        }
        String str = this.A0K;
        float f2 = rectF.left;
        float f3 = this.A05;
        Bitmap bitmap = this.A0B;
        canvas.drawText(str, f2 + f3 + bitmap.getWidth() + this.A04, getBounds().centerY() + (min / 2), paint);
        Bitmap bitmap2 = this.A0C;
        bitmap2.eraseColor(0);
        if (num == C05F.A00) {
            paint.setShader(this.A0E);
        }
        Canvas canvas2 = this.A0D;
        canvas2.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        paint.setXfermode(this.A0H);
        canvas2.save();
        float f4 = rectF.left + f3;
        canvas2.translate(-f4, 0.0f);
        canvas2.drawPaint(paint);
        canvas2.restore();
        paint.setXfermode(null);
        paint.setShader(null);
        canvas.drawBitmap(bitmap2, f4, getBounds().centerY() - (bitmap.getHeight() / 2), paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.5NL, java.lang.Object] */
    @Override // X.C5RR
    public final C5NL C0T() {
        return new Object();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A09;
    }
}
