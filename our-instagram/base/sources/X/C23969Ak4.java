package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.Ak4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23969Ak4 implements InterfaceC191378do {
    public final /* synthetic */ SettableFuture A00;

    public C23969Ak4(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.InterfaceC191378do
    public final void onFailure(String str, boolean z) {
        this.A00.set(AbstractC166997dE.A0a());
    }

    @Override // X.InterfaceC191378do
    public final void onSuccess() {
        this.A00.set(AbstractC166997dE.A0b());
    }
}
