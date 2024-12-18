package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.Spannable;
import android.text.Spanned;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.text.style.LineBackgroundSpan;

/* loaded from: classes4.dex */
public final class APq implements LineBackgroundSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Rect A04;
    public final RectF A05;
    public final int[] A06;

    public APq(int[] iArr, int i, int i2, int i3) {
        this.A02 = i;
        this.A00 = i2;
        this.A01 = i3;
        this.A06 = iArr;
        Paint A0P = AbstractC166997dE.A0P();
        this.A03 = A0P;
        this.A05 = AbstractC166987dD.A0X();
        this.A04 = AbstractC166987dD.A0U();
        A0P.setColor(-1);
        AbstractC166987dD.A1R(A0P);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        AbstractC167017dG.A1N(canvas, paint);
        C14360o3.A0B(charSequence, 7);
        String A03 = AbstractC13670mt.A03(charSequence.toString());
        Rect rect = this.A04;
        paint.getTextBounds(A03, i6, i7, rect);
        int i9 = 0;
        if (charSequence instanceof Spannable) {
            C0s6 A00 = AbstractC13190m5.A00(((Spanned) charSequence).getSpans(i6, i7, ImageSpan.class));
            while (A00.hasNext()) {
                i9 += AbstractC166997dE.A0H(((DynamicDrawableSpan) A00.next()).getDrawable());
            }
        }
        int width = rect.width() + i9;
        int i10 = (i + i2) / 2;
        RectF rectF = this.A05;
        int i11 = width / 2;
        int i12 = this.A00;
        float f = (i10 - i11) - i12;
        int i13 = i4 + rect.top;
        int i14 = this.A01;
        float f2 = i12 + i10 + i11;
        rectF.set(f, i13 - i14, f2, i4 + rect.bottom + i14);
        paint.setShader(new LinearGradient(f, 0.0f, f2, 0.0f, this.A06, (float[]) null, Shader.TileMode.CLAMP));
        float f3 = this.A02;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        paint.setShader(null);
    }
}
