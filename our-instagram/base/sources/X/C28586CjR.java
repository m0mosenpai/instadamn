package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.CjR, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28586CjR implements LeadingMarginSpan {
    public final int A00;
    public final int A01;
    public final int A02;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.A00 * 2) + this.A02;
    }

    public C28586CjR(int i, int i2, int i3) {
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float f;
        AbstractC167017dG.A1N(canvas, paint);
        C14360o3.A0B(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            AbstractC166987dD.A1R(paint);
            paint.setColor(this.A01);
            if (layout != null) {
                f = layout.getLineBaseline(layout.getLineForOffset(i6)) - (this.A00 * 2.0f);
            } else {
                f = (i3 + i5) / 2.0f;
            }
            canvas.drawCircle(i + (i2 * r0), f, this.A00, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }
}
