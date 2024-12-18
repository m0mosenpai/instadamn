package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;

/* loaded from: classes10.dex */
public final class Q43 extends ReplacementSpan {
    public final String A00;

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return (int) (paint.measureText(this.A00, 0, 1) + paint.measureText(charSequence, i, i2));
    }

    public Q43(String str) {
        this.A00 = str;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append((Object) charSequence.subSequence(i, i2));
        canvas.drawText(AbstractC166997dE.A0x(this.A00, A1C), f, i4, paint);
    }
}
