package X;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

/* loaded from: classes10.dex */
public abstract class SMC {
    public int A00;
    public R2f A01;
    public Callback A02;
    public boolean A03;

    public final void A01(ReadableMap readableMap) {
        int i;
        double d;
        int i2;
        int size;
        int i3;
        if (this instanceof R2i) {
            R2i r2i = (R2i) this;
            C14360o3.A0B(readableMap, 0);
            r2i.A07 = readableMap.getDouble("stiffness");
            r2i.A05 = readableMap.getDouble("damping");
            r2i.A06 = readableMap.getDouble("mass");
            r2i.A02 = r2i.A0F.A01;
            r2i.A01 = readableMap.getDouble("toValue");
            r2i.A04 = readableMap.getDouble("restSpeedThreshold");
            r2i.A00 = readableMap.getDouble("restDisplacementThreshold");
            r2i.A0D = readableMap.getBoolean("overshootClamping");
            boolean z = true;
            if (readableMap.hasKey("iterations")) {
                i3 = readableMap.getInt("iterations");
            } else {
                i3 = 1;
            }
            r2i.A0B = i3;
            if (i3 != 0) {
                z = false;
            }
            ((SMC) r2i).A03 = z;
            r2i.A0A = 0;
            r2i.A09 = 0.0d;
            r2i.A0E = false;
            return;
        }
        if (this instanceof R2h) {
            R2h r2h = (R2h) this;
            C14360o3.A0B(readableMap, 0);
            ReadableArray array = readableMap.getArray("frames");
            boolean z2 = false;
            if (array != null && r2h.A06.length != (size = array.size())) {
                double[] dArr = new double[size];
                for (int i4 = 0; i4 < size; i4++) {
                    dArr[i4] = array.getDouble(i4);
                }
                r2h.A06 = dArr;
            }
            if (readableMap.hasKey("toValue") && readableMap.getType("toValue") == ReadableType.Number) {
                d = readableMap.getDouble("toValue");
            } else {
                d = 0.0d;
            }
            r2h.A01 = d;
            if (readableMap.hasKey("iterations") && readableMap.getType("iterations") == ReadableType.Number) {
                i2 = readableMap.getInt("iterations");
            } else {
                i2 = 1;
            }
            r2h.A03 = i2;
            r2h.A02 = 1;
            if (i2 == 0) {
                z2 = true;
            }
            ((SMC) r2h).A03 = z2;
            r2h.A05 = -1L;
            return;
        }
        R2g r2g = (R2g) this;
        C14360o3.A0B(readableMap, 0);
        r2g.A03 = readableMap.getDouble("velocity");
        r2g.A00 = readableMap.getDouble("deceleration");
        r2g.A06 = -1L;
        r2g.A01 = 0.0d;
        r2g.A02 = 0.0d;
        boolean z3 = true;
        if (readableMap.hasKey("iterations")) {
            i = readableMap.getInt("iterations");
        } else {
            i = 1;
        }
        r2g.A05 = i;
        r2g.A04 = 1;
        if (i != 0) {
            z3 = false;
        }
        ((SMC) r2g).A03 = z3;
    }
}
