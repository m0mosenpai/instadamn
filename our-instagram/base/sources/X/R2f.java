package X;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* loaded from: classes10.dex */
public class R2f extends AbstractC62966SZj {
    public double A00;
    public double A01;
    public InterfaceC65350Tid A02;

    public static void A00(SMC smc, WritableNativeMap writableNativeMap, boolean z) {
        writableNativeMap.putBoolean("finished", z);
        writableNativeMap.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, smc.A01.A00);
    }

    public final double A05() {
        if (Double.isNaN(this.A01 + this.A00)) {
            A04();
        }
        return this.A01 + this.A00;
    }

    public R2f(ReadableMap readableMap) {
        double d;
        double d2;
        if (readableMap != null) {
            d = readableMap.getDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
        } else {
            d = Double.NaN;
        }
        this.A00 = d;
        if (readableMap != null) {
            d2 = readableMap.getDouble("offset");
        } else {
            d2 = 0.0d;
        }
        this.A01 = d2;
    }

    @Override // X.AbstractC62966SZj
    public String A03() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC62966SZj.A02(this, "ValueAnimatedNode[", A1C);
        A1C.append("]: value: ");
        A1C.append(this.A00);
        A1C.append(" offset: ");
        A1C.append(this.A01);
        return A1C.toString();
    }

    public R2f() {
        this(null);
    }
}
