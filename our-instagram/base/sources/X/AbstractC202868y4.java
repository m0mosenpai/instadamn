package X;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* renamed from: X.8y4, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC202868y4 extends C202878y5 {
    public final Rect A00 = new Rect();
    public final int A01;

    public AbstractC202868y4(Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        RectF rectF = AbstractC13880nE.A01;
        this.A01 = (int) TypedValue.applyDimension(1, 15.0f, displayMetrics);
    }

    @Override // X.C202878y5, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(paint, 1);
        C14360o3.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (this.A04 == this.A05) {
            TextPaint textPaint = this.A06;
            String obj = charSequence.toString();
            int i9 = this.A04;
            int i10 = this.A03;
            Rect rect = this.A00;
            textPaint.getTextBounds(obj, i9, i10, rect);
            float f = super.A01;
            rect.set(Math.round(f), rect.top + i4, Math.round(f + this.A02), i4 + Math.max(rect.bottom, this.A01));
        }
    }

    public AbstractC202868y4(int i) {
        this.A01 = i;
    }
}
