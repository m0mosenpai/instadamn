package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.Uss, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67621Uss extends Sb5 {
    public final double A00;

    @Override // X.Sb5
    public final String A05() {
        return "topSlidingComplete";
    }

    @Override // X.Sb5
    public final boolean A0B() {
        return false;
    }

    @Override // X.Sb5
    public final InterfaceC65657Tqj A04() {
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("target", this.A02);
        writableNativeMap.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this.A00);
        return writableNativeMap;
    }

    public C67621Uss(int i, int i2, double d) {
        super(i, i2);
        this.A00 = d;
    }
}
