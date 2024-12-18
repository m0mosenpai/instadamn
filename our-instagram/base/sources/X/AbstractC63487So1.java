package X;

import android.graphics.Paint;
import android.text.style.LeadingMarginSpan;

/* renamed from: X.So1, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63487So1 implements LeadingMarginSpan {
    public float A00;
    public int A01;
    public Paint A02;

    public final void A00(Paint paint) {
        if (this instanceof R8M) {
            C14360o3.A0B(paint, 0);
            if (this.A02 == null) {
                Paint paint2 = new Paint(paint);
                this.A02 = paint2;
                paint2.setColor(this.A01);
                AbstractC166987dD.A1R(this.A02);
                this.A02.setTextAlign(Paint.Align.RIGHT);
                return;
            }
            return;
        }
        if (this.A02 != null) {
            return;
        }
        Paint paint3 = new Paint(paint);
        this.A02 = paint3;
        paint3.setColor(this.A01);
        AbstractC166987dD.A1R(this.A02);
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return (int) this.A00;
    }
}
