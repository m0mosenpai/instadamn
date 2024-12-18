package X;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineHeightSpan;

/* renamed from: X.Igx, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C41859Igx implements LineHeightSpan.WithDensity {
    public final float A00;

    public final void A00(Paint.FontMetricsInt fontMetricsInt, float f) {
        int i;
        float f2 = this.A00;
        int ceil = (int) Math.ceil(f2 * f);
        int i2 = fontMetricsInt.descent;
        if (i2 > f2) {
            int min = Math.min(ceil, i2);
            fontMetricsInt.descent = min;
            fontMetricsInt.bottom = min;
            i = 0;
        } else {
            int i3 = fontMetricsInt.ascent;
            int i4 = -i3;
            if (i4 + i2 > ceil) {
                fontMetricsInt.bottom = i2;
                i = (-ceil) + i2;
            } else {
                int i5 = fontMetricsInt.bottom;
                if (i4 + i5 > ceil) {
                    fontMetricsInt.top = i3;
                    fontMetricsInt.bottom = i3 + ceil;
                    return;
                }
                int i6 = fontMetricsInt.top;
                if ((-i6) + i5 > ceil) {
                    i = i5 - ceil;
                    fontMetricsInt.top = i;
                }
                double d = (ceil - r0) / 2.0f;
                int ceil2 = (int) (i6 - Math.ceil(d));
                fontMetricsInt.top = ceil2;
                int floor = (int) (i5 + Math.floor(d));
                fontMetricsInt.bottom = floor;
                fontMetricsInt.ascent = ceil2;
                fontMetricsInt.descent = floor;
                return;
            }
        }
        fontMetricsInt.ascent = i;
        fontMetricsInt.top = i;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        A00(fontMetricsInt, 1.0f);
    }

    public C41859Igx(float f) {
        this.A00 = f;
    }

    @Override // android.text.style.LineHeightSpan.WithDensity
    public final void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt, TextPaint textPaint) {
        A00(fontMetricsInt, textPaint.density);
    }
}
