package X;

import com.google.common.util.concurrent.SettableFuture;

/* loaded from: classes4.dex */
public final class AXW implements InterfaceC48212Jk {
    public final /* synthetic */ SettableFuture A00;

    public AXW(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        this.A00.set(null);
    }
}
