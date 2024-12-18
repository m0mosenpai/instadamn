package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.9SP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9SP extends Drawable implements InterfaceC55932he {
    public float A00;
    public String A01;
    public boolean A02;
    public final C55982hj A03;
    public final Paint A04;
    public final Path A05;
    public final TextPaint A08;
    public final RectF A07 = AbstractC166987dD.A0X();
    public final Rect A06 = AbstractC166987dD.A0U();

    @Override // X.InterfaceC55932he
    public final void Dnj(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnk(C55982hj c55982hj) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnl(C55982hj c55982hj) {
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // X.InterfaceC55932he
    public final void Dnm(C55982hj c55982hj) {
        this.A00 = (float) c55982hj.A09.A00;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (this.A00 != 0.0f) {
            int width = canvas.getWidth();
            float height = canvas.getHeight();
            float f = height / 2.0f;
            float min = (float) Math.min(Math.max(AbstractC70163Da.A01(this.A00, 1.0d), 0.0d), 1.0d);
            TextPaint textPaint = this.A08;
            String str = this.A01;
            textPaint.getTextBounds(str, 0, str.length(), this.A06);
            float f2 = width;
            float f3 = f2 - height;
            this.A01 = TextUtils.ellipsize(this.A01, textPaint, f3, TextUtils.TruncateAt.END).toString();
            float f4 = f3 * min;
            float f5 = ((f2 - f4) / 2.0f) - f;
            float f6 = f2 / 2.0f;
            int A0A = AbstractC166987dD.A0A(min, 255.0f);
            boolean z = this.A02;
            Paint paint = this.A04;
            int i = 255;
            if (z) {
                i = 179;
            }
            paint.setAlpha(i);
            textPaint.setAlpha(i);
            Path path = this.A05;
            path.reset();
            RectF rectF = this.A07;
            rectF.set(0.0f, 0.0f, height, height);
            path.arcTo(rectF, 90.0f, 180.0f, false);
            path.moveTo(f, 0.0f);
            rectF.set(f4, 0.0f, f4 + height, height);
            path.arcTo(rectF, 270.0f, 180.0f, false);
            path.lineTo(f, height);
            path.offset(f5, 0.0f);
            canvas.drawPath(path, paint);
            canvas.clipPath(path);
            textPaint.setAlpha(A0A);
            canvas.drawText(this.A01, f6, f - r11.centerY(), textPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z = this.A02;
        this.A02 = false;
        boolean z2 = false;
        for (int i : iArr) {
            if (i == 16842919 || i == 16842908) {
                this.A02 = true;
                z2 = true;
                break;
            }
        }
        if (z2 == z) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public C9SP(String str, float f, int i, int i2) {
        this.A01 = str;
        TextPaint textPaint = new TextPaint();
        this.A08 = textPaint;
        textPaint.setColor(i);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(f);
        textPaint.setAntiAlias(true);
        this.A05 = AbstractC166987dD.A0T();
        Paint A0R = AbstractC166987dD.A0R();
        this.A04 = A0R;
        A0R.setColor(i2);
        A0R.setAntiAlias(true);
        C55982hj A0R2 = AbstractC167007dF.A0R();
        A0R2.A09(C55942hf.A04(30.0d, 7.0d));
        A0R2.A06 = true;
        A0R2.A0A(this);
        this.A03 = A0R2;
    }
}
