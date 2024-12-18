package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.LwP, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C49632LwP implements MPE {
    public Paint A00;
    public Paint A01;
    public final int A02;
    public final int A03;

    @Override // X.MPE
    public final void AQQ(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i) {
            int i4 = 0;
            while (i4 < i2) {
                int i5 = this.A03;
                float f = i3 + i5;
                float f2 = i5 + i4;
                canvas.drawRect(i3, i4, f, f2, this.A00);
                int i6 = this.A02;
                float f3 = i3 + i6;
                int i7 = i6 + i4;
                canvas.drawRect(f, f2, f3, i7, this.A01);
                i4 = i7;
            }
            i3 += this.A02;
        }
    }

    public C49632LwP(int i) {
        this.A02 = i;
        this.A03 = i / 2;
        Paint A0R = AbstractC166987dD.A0R();
        this.A00 = A0R;
        A0R.setColor(587137024);
        Paint A0R2 = AbstractC166987dD.A0R();
        this.A01 = A0R2;
        A0R2.setColor(570425344);
    }
}
