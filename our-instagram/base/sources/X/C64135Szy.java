package X;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;

/* renamed from: X.Szy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64135Szy implements Callback {
    public boolean A00 = false;
    public final int A01;
    public final InterfaceC65353Tih A02;

    @Override // com.facebook.react.bridge.Callback
    public final void invoke(Object... objArr) {
        if (!this.A00) {
            this.A02.invokeCallback(this.A01, Arguments.fromJavaArgs(objArr));
            this.A00 = true;
            return;
        }
        throw AbstractC166987dD.A18("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
    }

    public C64135Szy(InterfaceC65353Tih interfaceC65353Tih, int i) {
        this.A02 = interfaceC65353Tih;
        this.A01 = i;
    }
}
