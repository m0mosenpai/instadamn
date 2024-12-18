package X;

import android.graphics.RectF;

/* loaded from: classes11.dex */
public final class W2t {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public Double A05;
    public boolean A06;

    public W2t(RectF rectF, double d, float f, boolean z) {
        C14360o3.A0B(rectF, 1);
        this.A01 = rectF.left;
        this.A04 = rectF.top;
        this.A02 = rectF.right;
        this.A00 = rectF.bottom;
        this.A03 = f;
        this.A05 = Double.valueOf(d);
        this.A06 = z;
    }

    public W2t() {
    }
}
