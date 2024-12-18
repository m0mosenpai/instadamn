package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.CjS, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28587CjS implements LeadingMarginSpan {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Context A03;

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (this.A00 * 2) + this.A02;
    }

    public /* synthetic */ C28587CjS(Context context, int i, int i2) {
        int A07 = AbstractC53242c7.A07(context);
        this.A03 = context;
        this.A00 = i;
        this.A02 = i2;
        this.A01 = A07;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        float A02;
        AbstractC167017dG.A1N(canvas, paint);
        C14360o3.A0B(charSequence, 7);
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            int color = paint.getColor();
            AbstractC166987dD.A1R(paint);
            int i8 = this.A01;
            if (i8 != AbstractC53242c7.A07(this.A03)) {
                paint.setColor(i8);
            }
            int i9 = this.A00;
            float f = i + (i2 * i9);
            if (layout != null) {
                A02 = layout.getLineBaseline(layout.getLineForOffset(i6)) - i9;
            } else {
                A02 = AbstractC166987dD.A02(i3 + i5);
            }
            canvas.drawCircle(f, A02, i9, paint);
            paint.setStyle(style);
            paint.setColor(color);
        }
    }
}
