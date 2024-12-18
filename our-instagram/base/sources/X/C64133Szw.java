package X;

import com.facebook.react.animated.NativeAnimatedModule;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.modules.intent.IntentModule;

/* renamed from: X.Szw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64133Szw implements InterfaceC65350Tid {
    public final /* synthetic */ int A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public C64133Szw(NativeAnimatedModule nativeAnimatedModule, int i) {
        this.A01 = nativeAnimatedModule;
        this.A00 = i;
    }

    @Override // X.InterfaceC65350Tid
    public final void Dye(double d) {
        WritableNativeMap A0c = AbstractC58321PtD.A0c();
        A0c.putInt("tag", this.A00);
        A0c.putDouble(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, d);
        R3M reactApplicationContextIfActiveOrWarn = this.A01.getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E("onAnimatedValueUpdate", A0c);
        }
    }
}
