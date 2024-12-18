package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import com.facebook.R;
import java.util.concurrent.TimeUnit;

/* renamed from: X.JXk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43771JXk extends Drawable {
    public float A00;
    public ValueAnimator A01;
    public LGO A02;
    public LGO A03;
    public Integer A04;
    public final long A05;
    public final Context A06;
    public final Paint A07;
    public final Paint A08;
    public final RectF A09;
    public final Paint A0A;
    public final Rect A0B;
    public final Rect A0C;
    public final RectF A0D = new RectF();
    public final RectF A0E;
    public final TextPaint A0F;
    public final InterfaceC09390do A0G;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public static void A00(C43771JXk c43771JXk) {
        ValueAnimator valueAnimator = c43771JXk.A01;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            c43771JXk.A01.removeAllListeners();
            c43771JXk.A01.cancel();
            c43771JXk.A01 = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float f;
        LGO lgo = this.A02;
        if (lgo != null) {
            boolean A1X = AbstractC167007dF.A1X(lgo.A00, EnumC46141Kbf.STATUS);
            ValueAnimator valueAnimator = this.A01;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                f = AbstractC166987dD.A09(this.A01.getAnimatedValue());
            } else {
                f = 1.0f;
            }
            Integer num = this.A04;
            num.intValue();
            switch (num.intValue()) {
                case 2:
                case 3:
                case 6:
                    break;
                case 4:
                case 5:
                default:
                    canvas.drawOval(this.A0D, this.A07);
                    break;
            }
            if (A1X) {
                String str = null;
                str.getClass();
                TextPaint textPaint = this.A0F;
                textPaint.setTextSize(AbstractC166997dE.A0G(this) * 0.175f * f);
                textPaint.getTextBounds((String) null, 0, str.length(), this.A0C);
                RectF rectF = this.A0D;
                canvas.drawText(null, rectF.centerX(), rectF.centerY() - r3.centerY(), textPaint);
                return;
            }
            RectF rectF2 = new RectF(this.A0E);
            float f2 = 1.0f - f;
            rectF2.inset((rectF2.height() / 2.0f) * f2, (rectF2.height() / 2.0f) * f2);
            canvas.drawOval(rectF2, this.A0A);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        float f;
        RectF rectF;
        RectF rectF2;
        float f2;
        super.onBoundsChange(rect);
        float height = rect.height();
        Integer num = this.A04;
        switch (num.intValue()) {
            case 2:
                f = 1.8f;
                break;
            case 3:
            case 6:
                f = 1.0f;
                break;
            case 4:
            case 5:
            default:
                f = 0.45f;
                break;
            case 7:
                f = 3.0f;
                break;
        }
        float f3 = f * height;
        float f4 = rect.right;
        float f5 = f4 - f3;
        if (f5 <= 0.0f) {
            float abs = Math.abs(f5) / 2.0f;
            rectF = this.A0D;
            rectF.set(Math.round((rect.left - abs) / 2.0f) * 2, Math.round((rect.top - abs) / 2.0f) * 2, Math.round((f4 + abs) / 2.0f) * 2, Math.round((rect.bottom + abs) / 2.0f) * 2);
            rectF2 = this.A0E;
            rectF2.set(Math.round((rect.left - abs) / 2.0f) * 2, Math.round((rect.top - abs) / 2.0f) * 2, Math.round((rect.right + abs) / 2.0f) * 2, Math.round((rect.bottom + abs) / 2.0f) * 2);
        } else {
            rectF = this.A0D;
            float f6 = rect.bottom;
            rectF.set(f5, f6 - f3, f4, f6);
            rectF2 = this.A0E;
            float f7 = rect.right;
            float f8 = rect.bottom;
            rectF2.set(f7 - f3, f8 - f3, f7, f8);
        }
        RectF rectF3 = this.A09;
        rectF3.set(rectF);
        if (rectF3.width() > 0.0f) {
            Paint paint = this.A08;
            paint.setShader(new RadialGradient(rectF3.centerX(), rectF3.centerY(), rectF3.width() / 2.0f, new int[]{paint.getColor(), 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
        }
        float f9 = 0.05f * height;
        rectF.inset(f9, f9);
        switch (num.intValue()) {
            case 2:
            case 3:
                f2 = 0.1f;
                break;
            default:
                f2 = 0.125f;
                break;
        }
        float f10 = f2 * height;
        rectF2.inset(f10, f10);
        float f11 = rectF2.left;
        float f12 = this.A00;
        rectF2.left = f11 + f12;
        rectF2.right += f12;
        Rect rect2 = this.A0B;
        rectF.round(rect2);
        rect2.inset((int) (rect2.width() * 0.275f), (int) (rect2.height() * 0.275f));
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        ValueAnimator valueAnimator = this.A01;
        if (valueAnimator != null) {
            if (!z) {
                valueAnimator.pause();
            } else {
                valueAnimator.resume();
            }
        }
        return super.setVisible(z, z2);
    }

    public C43771JXk(Context context, Integer num, TimeUnit timeUnit) {
        this.A06 = context;
        Paint paint = new Paint();
        this.A07 = paint;
        paint.setColor(context.getColor(R.color.design_dark_default_color_on_background));
        paint.setAntiAlias(true);
        this.A0E = new RectF();
        this.A00 = 0.0f;
        Paint paint2 = new Paint();
        this.A0A = paint2;
        paint2.setColor(context.getColor(R.color.presence_indicator_color));
        paint2.setAntiAlias(true);
        this.A0C = new Rect();
        TextPaint textPaint = new TextPaint();
        this.A0F = textPaint;
        textPaint.setTextAlign(Paint.Align.CENTER);
        this.A0B = new Rect();
        this.A09 = new RectF();
        Paint paint3 = new Paint();
        this.A08 = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.A05 = timeUnit.toMillis(300L);
        this.A0G = AbstractC09440dt.A01(new M8Y(this, 5));
        if (this.A04 != num) {
            this.A04 = num;
            onBoundsChange(getBounds());
            invalidateSelf();
        }
    }
}
