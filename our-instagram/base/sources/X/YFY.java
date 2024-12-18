package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class YFY implements MPE {
    public final int A00;
    public final int A01;
    public final Paint A02;

    @Override // X.MPE
    public final void AQQ(Canvas canvas, int i, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            canvas.drawRect(0.0f, i3, i, this.A01 + i3, this.A02);
            i3 += this.A00;
        }
    }

    public YFY(int i, Paint paint) {
        this.A02 = paint;
        this.A01 = i;
        this.A00 = i * 2;
    }
}
