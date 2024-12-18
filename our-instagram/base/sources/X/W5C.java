package X;

import android.graphics.PointF;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* loaded from: classes11.dex */
public final class W5C {
    public static final PointF A09 = new PointF(0.0f, 0.0f);
    public W57 A04;
    public float A06;
    public W57 A07;
    public final NavigableMap A08 = new TreeMap();
    public float A02 = 0.0f;
    public float A03 = 1.0f;
    public float A05 = 0.0f;
    public float A01 = 1.0f;
    public float A00 = 0.0f;

    public final void A01(float[] fArr, int i) {
        float A00;
        float f;
        float f2 = i * this.A03;
        if (f2 < this.A01 || f2 > this.A00) {
            Map.Entry floorEntry = this.A08.floorEntry(Float.valueOf(f2));
            if (floorEntry == null) {
                this.A04 = null;
                this.A01 = 1.0f;
                A00 = 0.0f;
            } else {
                this.A04 = (W57) floorEntry.getValue();
                float floatValue = ((Number) floorEntry.getKey()).floatValue();
                this.A01 = floatValue;
                A00 = floatValue + this.A04.A00();
            }
            this.A00 = A00;
        }
        W57 w57 = this.A04;
        if (w57 != null) {
            f = (f2 - this.A01) / w57.A00();
        } else {
            w57 = this.A07;
            w57.getClass();
            f = 1.0f;
        }
        w57.A01(fArr, f);
    }

    public final void A00(PointF pointF, PointF pointF2, float f) {
        W57 w57 = this.A07;
        if (w57 == null) {
            PointF pointF3 = A09;
            float f2 = pointF3.x;
            float[] fArr = {f2, f2, pointF2.x, pointF.x};
            float f3 = pointF3.y;
            this.A07 = new W57(fArr, new float[]{f3, f3, pointF2.y, pointF.y});
            this.A06 = f;
            return;
        }
        float[] fArr2 = w57.A02;
        float[] fArr3 = {fArr2[3], fArr2[2], pointF2.x, pointF.x};
        float[] fArr4 = w57.A03;
        W57 w572 = new W57(fArr3, new float[]{fArr4[3], fArr4[2], pointF2.y, pointF.y});
        this.A07 = w572;
        this.A08.put(Float.valueOf(this.A02), w572);
        this.A02 += this.A07.A00();
        this.A05 = f - this.A06;
    }
}
