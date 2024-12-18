package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;
import android.text.style.LineBackgroundSpan;

/* loaded from: classes4.dex */
public final class APp implements LineBackgroundSpan {
    public int A00;
    public int A01;
    public final Rect A02 = AbstractC166987dD.A0U();
    public final float[] A03;
    public final int[] A04;

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C9T8 c9t8;
        String charSequence2 = charSequence.toString();
        Rect rect = this.A02;
        paint.getTextBounds(charSequence2, i6, i7, rect);
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            int i9 = (i + i2) / 2;
            if (i9 != this.A00 || rect.width() != this.A01) {
                this.A00 = i9;
                this.A01 = rect.width();
                C9T8[] c9t8Arr = (C9T8[]) spannable.getSpans(i6, i7, C9T8.class);
                CharSequence subSequence = charSequence.subSequence(i6, i7);
                if (c9t8Arr.length > 0) {
                    c9t8 = c9t8Arr[0];
                } else {
                    c9t8 = new C9T8(subSequence, this.A03, this.A04);
                    spannable.setSpan(c9t8, i6, i7, 18);
                }
                c9t8.A03 = subSequence.toString();
                c9t8.A00 = i9;
            }
        }
    }

    public APp(float[] fArr, int[] iArr) {
        this.A04 = iArr;
        this.A03 = fArr;
    }
}
