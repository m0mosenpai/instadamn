package X;

import android.graphics.Paint;
import android.util.DisplayMetrics;
import android.util.TypedValue;

/* loaded from: classes10.dex */
public class R8J extends R8H {
    public Paint A00;
    public final float A01;
    public final float A02;
    public final Integer A03;

    public R8J(DisplayMetrics displayMetrics, Integer num, int i, int i2) {
        super(displayMetrics, i);
        this.A03 = num;
        super.A01 = i2;
        float applyDimension = TypedValue.applyDimension(2, 2.0f, displayMetrics);
        this.A01 = applyDimension;
        float applyDimension2 = TypedValue.applyDimension(2, 8.0f, displayMetrics);
        this.A02 = applyDimension2;
        float f = super.A00;
        float f2 = applyDimension + applyDimension2;
        super.A00 = f < f2 ? f2 : f;
    }
}
