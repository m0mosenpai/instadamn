package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.style.LineBackgroundSpan;

/* renamed from: X.9Pk, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C209749Pk implements C6S2, LineBackgroundSpan {
    /* JADX WARN: Type inference failed for: r0v0, types: [X.XCW, java.lang.Object] */
    @Override // X.C6S2
    public final XCW Bz1() {
        return new Object();
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C14360o3.A0B(canvas, 0);
        C14360o3.A0B(paint, 1);
        C14360o3.A0B(charSequence, 7);
        if (charSequence instanceof Spanned) {
            Spanned spanned = (Spanned) charSequence;
            C0s6 A00 = AbstractC13190m5.A00(spanned.getSpans(i6, i7, C6S0.class));
            while (A00.hasNext()) {
                ((C6S0) A00.next()).AQX(canvas, paint, spanned, i8, i6, i7, i, i4);
            }
        }
    }
}
