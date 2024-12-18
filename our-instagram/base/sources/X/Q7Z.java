package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;

/* loaded from: classes10.dex */
public final class Q7Z extends Q42 {
    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C63218SfO.A00();
        C63169SeU c63169SeU = this.A01;
        C62894SWa c62894SWa = c63169SeU.A01;
        Typeface typeface = c62894SWa.A00;
        Typeface typeface2 = paint.getTypeface();
        paint.setTypeface(typeface);
        canvas.drawText(c62894SWa.A03, c63169SeU.A00 * 2, 2, f, i4, paint);
        paint.setTypeface(typeface2);
    }
}
