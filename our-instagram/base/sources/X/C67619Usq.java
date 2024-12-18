package X;

import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;
import com.facebook.react.uimanager.events.RCTEventEmitter;

/* renamed from: X.Usq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C67619Usq extends Sb5 {
    public final double A00;
    public final boolean A01;

    @Override // X.Sb5
    public final String A05() {
        return "topValueChange";
    }

    @Override // X.Sb5
    public final void A09(RCTEventEmitter rCTEventEmitter) {
        int i = this.A02;
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("target", this.A02);
        writableNativeMap.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, this.A00);
        writableNativeMap.putBoolean("fromUser", this.A01);
        rCTEventEmitter.receiveEvent(i, "topValueChange", writableNativeMap);
    }

    public C67619Usq(int i, boolean z, double d) {
        int i2 = Sb5.A06;
        Sb5.A06 = i2 + 1;
        super.A01 = i2;
        A08(-1, i);
        this.A00 = d;
        this.A01 = z;
    }
}
