package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* loaded from: classes12.dex */
public final class YFX implements MPE {
    public final YFY A00;
    public final YFZ A01;

    @Override // X.MPE
    public final void AQQ(Canvas canvas, int i, int i2) {
        this.A00.AQQ(canvas, i, i2);
        this.A01.AQQ(canvas, i, i2);
    }

    public YFX(int i, Paint paint) {
        this.A00 = new YFY(i, paint);
        this.A01 = new YFZ(i, paint);
    }
}
