package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextPaint;
import com.facebook.R;

/* renamed from: X.3LP, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3LP extends Drawable implements Drawable.Callback {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public Paint A04;
    public Drawable A05;
    public boolean A06;
    public long A07;
    public Paint A08;
    public boolean A09;
    public final Context A0A;
    public final int A0B;
    public final int A0C;
    public final int A0D;
    public final Rect A0E;
    public final RectF A0F;
    public final Drawable A0G;
    public final C55982hj A0H;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C3LP(android.content.Context r3, int r4) {
        /*
            r2 = this;
            r0 = 1
            X.C14360o3.A0B(r3, r0)
            r0 = 2130970276(0x7f0406a4, float:1.7549258E38)
            int r1 = X.AbstractC53242c7.A0H(r3, r0)
            android.graphics.Paint r0 = X.C3LQ.A00
            int r0 = r3.getColor(r1)
            android.graphics.drawable.Drawable r1 = X.C3LQ.A05(r3, r4, r0)
            r0 = 24
            r2.<init>(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3LP.<init>(android.content.Context, int):void");
    }

    public final void A02(int i, int i2) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Context context = this.A0A;
        int round = Math.round(AbstractC13880nE.A04(context, 8));
        shapeDrawable.setIntrinsicWidth(round);
        shapeDrawable.setIntrinsicHeight(round);
        shapeDrawable.setColorFilter(C3DY.A00(context.getColor(AbstractC53242c7.A0H(context, i))));
        this.A01 = Math.round(AbstractC13880nE.A04(context, i2));
        invalidateSelf();
        this.A02 = Math.round(AbstractC13880nE.A04(context, 0));
        invalidateSelf();
        this.A00 = AbstractC13880nE.A04(context, 8);
        invalidateSelf();
        if (shapeDrawable != this.A05) {
            this.A05 = shapeDrawable;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String obj;
        float f;
        int height;
        C14360o3.A0B(canvas, 0);
        C55982hj c55982hj = this.A0H;
        float f2 = (float) c55982hj.A09.A00;
        Rect bounds = getBounds();
        C14360o3.A07(bounds);
        float exactCenterX = bounds.exactCenterX() + bounds.left;
        float exactCenterY = bounds.exactCenterY() + bounds.top;
        float f3 = 1.0f - 0.0f;
        float f4 = 0.7f - 1.0f;
        float f5 = 0.0f;
        if (f3 != 0.0f) {
            f5 = (f2 - 0.0f) / f3;
        }
        float f6 = (f5 * f4) + 1.0f;
        int A02 = (int) AbstractC13600mm.A02(f2, 0.0f, 1.0f, 255.0f, 0.0f);
        if (A02 > 0) {
            canvas.save();
            canvas.scale(f6, f6, exactCenterX, exactCenterY);
            Drawable drawable = this.A0G;
            canvas.translate(exactCenterX - (drawable.getBounds().width() / 2.0f), exactCenterY - (drawable.getBounds().height() / 2.0f));
            drawable.setAlpha(A02);
            drawable.draw(canvas);
            canvas.restore();
        }
        float max = Math.max(f2, 0.0f);
        int A022 = (int) AbstractC13600mm.A02(f2, 0.0f, 1.0f, 0.0f, 255.0f);
        if (A022 > 0) {
            canvas.save();
            canvas.scale(max, max, exactCenterX, exactCenterY);
            Drawable drawable2 = this.A0G;
            canvas.translate(exactCenterX - (drawable2.getBounds().width() / 2.0f), exactCenterY - (drawable2.getBounds().height() / 2.0f));
            drawable2.setAlpha(A022);
            drawable2.draw(canvas);
            canvas.restore();
        }
        int level = getLevel();
        if (level < 1) {
            obj = "";
        } else {
            int i = this.A03;
            if (level <= i) {
                obj = String.valueOf(level);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                sb.append('+');
                obj = sb.toString();
            }
        }
        if (this.A05 != null || obj != null) {
            Paint paint = this.A08;
            C14360o3.A0A(paint);
            int length = obj.length();
            Rect rect = this.A0E;
            paint.getTextBounds(obj, 0, length, rect);
            Drawable drawable3 = this.A05;
            if (drawable3 != null) {
                if (drawable3.getBounds().width() == 0) {
                    Drawable drawable4 = this.A05;
                    C14360o3.A0A(drawable4);
                    Drawable drawable5 = this.A05;
                    C14360o3.A0A(drawable5);
                    int intrinsicWidth = drawable5.getIntrinsicWidth();
                    Drawable drawable6 = this.A05;
                    C14360o3.A0A(drawable6);
                    drawable4.setBounds(0, 0, intrinsicWidth, drawable6.getIntrinsicHeight());
                }
                Drawable drawable7 = this.A05;
                C14360o3.A0A(drawable7);
                rect.set(drawable7.getBounds());
            } else {
                int i2 = -this.A0D;
                rect.inset(i2, i2);
                if (rect.height() > rect.width()) {
                    rect.inset((rect.height() - rect.width()) / (-2), 0);
                }
            }
            if (rect.height() != this.A00) {
                rect.inset(0, (int) Math.ceil((-(r1 - rect.height())) / 2.0f));
            }
            if (rect.width() < this.A00) {
                rect.inset((int) Math.ceil((-(r1 - rect.width())) / 2.0f), 0);
            }
            canvas.save();
            canvas.scale(max, max, exactCenterX, exactCenterY);
            float width = (bounds.right - (rect.width() / 2.0f)) + this.A01;
            if (this.A06) {
                f = bounds.top;
                height = bounds.height();
            } else {
                f = bounds.top;
                height = rect.height();
            }
            canvas.translate(width, (f + (height / 2.0f)) - this.A02);
            RectF rectF = this.A0F;
            rectF.set(rect.width() / (-2.0f), rect.height() / (-2.0f), rect.width() / 2.0f, rect.height() / 2.0f);
            float height2 = rectF.height() / 2.0f;
            float height3 = rectF.height() / 2.0f;
            Paint paint2 = this.A04;
            C14360o3.A0A(paint2);
            canvas.drawRoundRect(rectF, height2, height3, paint2);
            if (this.A09) {
                Paint paint3 = this.A08;
                C14360o3.A0A(paint3);
                paint3.setStyle(Paint.Style.STROKE);
                float height4 = rectF.height() / 2.0f;
                float height5 = rectF.height() / 2.0f;
                Paint paint4 = this.A08;
                C14360o3.A0A(paint4);
                canvas.drawRoundRect(rectF, height4, height5, paint4);
                Paint paint5 = this.A08;
                C14360o3.A0A(paint5);
                paint5.setStyle(Paint.Style.FILL);
            }
            if (this.A05 != null) {
                canvas.save();
                Drawable drawable8 = this.A05;
                C14360o3.A0A(drawable8);
                C14360o3.A07(drawable8.getBounds());
                canvas.translate((-r2.width()) / 2.0f, (-r2.height()) / 2.0f);
                Drawable drawable9 = this.A05;
                C14360o3.A0A(drawable9);
                drawable9.draw(canvas);
                canvas.restore();
            } else {
                Paint paint6 = this.A08;
                C14360o3.A0A(paint6);
                float descent = paint6.descent();
                Paint paint7 = this.A08;
                C14360o3.A0A(paint7);
                float ascent = (descent - paint7.ascent()) / 2.0f;
                Paint paint8 = this.A08;
                C14360o3.A0A(paint8);
                float descent2 = ascent - paint8.descent();
                Paint paint9 = this.A08;
                C14360o3.A0A(paint9);
                canvas.drawText(obj, 0.0f, descent2, paint9);
            }
            canvas.restore();
        }
        if (!c55982hj.A0C()) {
            invalidateSelf();
        }
        if (this.A07 == 0) {
            this.A07 = System.currentTimeMillis();
        }
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
    public final boolean onStateChange(int[] iArr) {
        C14360o3.A0B(iArr, 0);
        int[] state = getState();
        C14360o3.A07(state);
        int length = state.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            if (state[i2] == 16843518) {
                i = 1;
                break;
            }
            i2++;
        }
        super.onStateChange(iArr);
        int[] state2 = getState();
        C14360o3.A07(state2);
        int length2 = state2.length;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= length2) {
                break;
            }
            if (state2[i4] == 16843518) {
                i3 = 1;
                break;
            }
            i4++;
        }
        float f = i3;
        long j = this.A07;
        if (j != 0 && System.currentTimeMillis() - j >= 100) {
            this.A0H.A06(f);
        } else {
            this.A0H.A08(f, true);
        }
        invalidateSelf();
        if (i == i3) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
    }

    private final void A00(int i) {
        Context context = this.A0A;
        float A04 = AbstractC13880nE.A04(context, 12);
        TextPaint textPaint = new TextPaint(1);
        this.A08 = textPaint;
        textPaint.setStrokeWidth(this.A0B);
        Paint paint = this.A08;
        C14360o3.A0A(paint);
        paint.setColor(context.getColor(i));
        Paint paint2 = this.A08;
        C14360o3.A0A(paint2);
        paint2.setTypeface(AbstractC15960qq.A00(context).A02(EnumC15950qp.A11));
        Paint paint3 = this.A08;
        C14360o3.A0A(paint3);
        paint3.setTextSize(A04);
        Paint paint4 = this.A08;
        C14360o3.A0A(paint4);
        paint4.setTextAlign(Paint.Align.CENTER);
    }

    public final void A01() {
        Context context = this.A0A;
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_primary_background);
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A04;
        C14360o3.A0A(paint2);
        paint2.setColor(context.getColor(A0H));
        A00(AbstractC53242c7.A0H(context, R.attr.igds_color_primary_text));
        this.A09 = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A0C;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.A0G.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.A0G.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public C3LP(Context context, Drawable drawable, int i) {
        this.A0A = context;
        this.A0G = drawable;
        drawable.setCallback(this);
        this.A0C = Math.round(AbstractC13880nE.A04(context, i));
        this.A00 = AbstractC13880nE.A04(context, 18);
        this.A0D = Math.round(AbstractC13880nE.A04(context, 5));
        this.A01 = Math.round(AbstractC13880nE.A04(context, 8));
        this.A02 = Math.round(AbstractC13880nE.A04(context, 8));
        this.A0B = Math.round(AbstractC13880nE.A00(context, 2.0f));
        int A0H = AbstractC53242c7.A0H(context, R.attr.igds_color_icon_badge);
        Paint paint = new Paint(1);
        this.A04 = paint;
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = this.A04;
        C14360o3.A0A(paint2);
        paint2.setColor(this.A0A.getColor(A0H));
        this.A0E = new Rect();
        this.A0F = new RectF();
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        this.A0H = AbstractC13560mi.A00().A02();
        A00(AbstractC53242c7.A0H(context, R.attr.igds_color_text_on_color));
        this.A03 = 99;
    }
}
