package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Spannable;

/* renamed from: X.9q9, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C221449q9 extends C209849Pv {
    public int A00;
    public int A01;
    public final float[] A02;
    public final int[] A03;
    public final int[] A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C221449q9(float[] fArr, int[] iArr, int[] iArr2, int i, int i2, int i3) {
        super(i, i2, i3, false, i3, i3);
        C14360o3.A0B(iArr2, 6);
        this.A03 = iArr;
        this.A02 = fArr;
        this.A04 = iArr2;
    }

    @Override // X.C209849Pv, android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        boolean A1R = AbstractC167007dF.A1R(0, canvas, paint);
        C14360o3.A0B(charSequence, 7);
        super.drawBackground(canvas, paint, i, i2, i3, i4, i5, charSequence, i6, i7, i8);
        if (charSequence instanceof Spannable) {
            Spannable spannable = (Spannable) charSequence;
            CharSequence subSequence = charSequence.subSequence(0, A1R ? 1 : 0);
            String obj = charSequence.toString();
            int length = charSequence.length();
            Rect rect = this.A0B;
            paint.getTextBounds(obj, 0, length, rect);
            int width = rect.width();
            int i9 = ((i + i2) - width) / 2;
            int height = ((i3 + i5) - rect.height()) / 2;
            if (i9 != this.A00 || width != this.A01) {
                this.A00 = i9;
                this.A01 = width;
                Rect A0U = AbstractC166987dD.A0U();
                paint.getTextBounds(subSequence.toString(), 0, A1R ? 1 : 0, A0U);
                int width2 = A0U.width() + i9;
                int height2 = A0U.height() + height;
                spannable.setSpan(new C9T8(charSequence, null, this.A04), A1R ? 1 : 0, i7, 18);
                int[] iArr = this.A03;
                spannable.setSpan(new C9T7(C05F.A01, this.A02, iArr, i9, width2, height, height2), 0, A1R ? 1 : 0, 18);
            }
        }
    }
}
