package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spannable;

/* renamed from: X.9q8, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221439q8 extends C209849Pv {
    public int A00;
    public int A01;
    public final int[] A02;

    public C221439q8(int[] iArr, int i, int i2, int i3, int i4) {
        super(-1, i, i2, false, i3, i4);
        this.A02 = iArr;
    }

    @Override // X.C209849Pv, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C9T8 c9t8;
        AbstractC167007dF.A1K(canvas, paint);
        C14360o3.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (charSequence instanceof Spannable) {
            int i9 = (i + i2) / 2;
            if (i9 != this.A00 || this.A0B.width() != this.A01) {
                this.A00 = i9;
                this.A01 = this.A0B.width();
                Spannable spannable = (Spannable) charSequence;
                C9T8[] c9t8Arr = (C9T8[]) spannable.getSpans(i6, i7, C9T8.class);
                CharSequence subSequence = charSequence.subSequence(i6, i7);
                if (c9t8Arr.length > 0) {
                    c9t8 = c9t8Arr[0];
                } else {
                    c9t8 = new C9T8(subSequence, null, this.A02);
                    spannable.setSpan(c9t8, i6, i7, 18);
                }
                c9t8.A03 = subSequence.toString();
                c9t8.A00 = i9;
            }
        }
    }
}
