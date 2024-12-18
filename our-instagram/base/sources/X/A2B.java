package X;

import android.graphics.DashPathEffect;
import android.graphics.Paint;

/* loaded from: classes4.dex */
public abstract class A2B {
    public static final Paint A00() {
        Paint A0P = AbstractC166997dE.A0P();
        A0P.setColor(-1);
        A0P.setPathEffect(new DashPathEffect(new float[]{32.0f, 21.333334f}, 0.0f));
        A0P.setStyle(Paint.Style.STROKE);
        A0P.setStrokeWidth(8.0f);
        A0P.setStrokeCap(Paint.Cap.ROUND);
        return A0P;
    }
}
