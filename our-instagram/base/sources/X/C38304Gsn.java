package X;

import android.graphics.Paint;
import android.text.style.ImageSpan;

/* renamed from: X.Gsn, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38304Gsn extends ImageSpan {
    @Override // android.text.style.DynamicDrawableSpan, android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        C14360o3.A0B(paint, 0);
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        getDrawable().setBounds(0, fontMetricsInt2.ascent, C1H4.A01((fontMetricsInt2.bottom - fontMetricsInt2.ascent) * (getDrawable().getIntrinsicWidth() / getDrawable().getIntrinsicHeight())), fontMetricsInt2.bottom);
        return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
    }
}
