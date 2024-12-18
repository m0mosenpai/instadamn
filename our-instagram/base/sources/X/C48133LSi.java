package X;

import com.google.common.util.concurrent.SettableFuture;

/* renamed from: X.LSi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48133LSi implements InterfaceC48212Jk {
    public final /* synthetic */ SettableFuture A00;

    public C48133LSi(SettableFuture settableFuture) {
        this.A00 = settableFuture;
    }

    @Override // X.InterfaceC48212Jk
    public final void invoke(Throwable th) {
        this.A00.setException(new Exception("Banyan Graph QL failure"));
    }
}
