package X;

import com.facebook.react.animated.NativeAnimatedModule;

/* loaded from: classes10.dex */
public final class T0Z implements InterfaceC65361Tip {
    public final /* synthetic */ long A00;
    public final /* synthetic */ NativeAnimatedModule A01;

    public T0Z(NativeAnimatedModule nativeAnimatedModule, long j) {
        this.A01 = nativeAnimatedModule;
        this.A00 = j;
    }

    @Override // X.InterfaceC65361Tip
    public final void ATL(C63309ShF c63309ShF) {
        NativeAnimatedModule nativeAnimatedModule = this.A01;
        nativeAnimatedModule.mPreOperations.A00(nativeAnimatedModule.getNodesManager(), this.A00);
    }
}
