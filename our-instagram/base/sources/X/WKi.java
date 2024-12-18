package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* loaded from: classes11.dex */
public final class WKi implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }

    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout != null && paint != null && (lineForOffset = layout.getLineForOffset(i6)) == layout.getLineCount() - 1) {
            C122745hA c122745hA = AbstractC122735h9.A01;
            if (layout.getEllipsisCount(lineForOffset) > 0) {
                float A00 = AbstractC122915hS.A00(paint, layout, lineForOffset) + AbstractC122915hS.A01(paint, layout, lineForOffset);
                if (A00 != 0.0f) {
                    C14360o3.A0A(canvas);
                    canvas.translate(A00, 0.0f);
                }
            }
        }
    }
}
