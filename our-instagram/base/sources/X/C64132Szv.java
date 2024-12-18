package X;

import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.Szv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64132Szv implements InterfaceC65350Tid {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60525R2p A01;

    public C64132Szv(C60525R2p c60525R2p, int i) {
        this.A01 = c60525R2p;
        this.A00 = i;
    }

    @Override // X.InterfaceC65350Tid
    public final void Dye(double d) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putInt("tag", this.A00);
        A0c.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, d);
        R3M reactApplicationContextIfActiveOrWarn = ((BaseJavaModule) this.A01.A02).getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("onAnimatedValueUpdate", A0c);
        }
    }
}
