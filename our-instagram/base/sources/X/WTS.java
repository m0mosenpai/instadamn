package X;

import android.os.Bundle;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;

/* loaded from: classes11.dex */
public final class WTS implements InterfaceC71942XBr {
    public final NativeLifecycleCallback$NativeCallback A00;
    public final Integer A01 = C05F.A01;

    @Override // X.InterfaceC71942XBr
    public final Integer CBp() {
        return this.A01;
    }

    @Override // X.InterfaceC71942XBr
    public final void EqA(String str, Bundle bundle) {
        bundle.putParcelable(str, this.A00);
    }

    public WTS(NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback) {
        this.A00 = nativeLifecycleCallback$NativeCallback;
    }
}
