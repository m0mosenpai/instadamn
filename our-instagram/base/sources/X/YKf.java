package X;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes12.dex */
public final class YKf extends AtomicReference implements InterfaceC41801wU {
    @Override // X.InterfaceC41801wU
    public final void dispose() {
        Object andSet;
        if (get() != null && (andSet = getAndSet(null)) != null) {
            ((Runnable) andSet).run();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("RunnableDisposable(disposed=");
        A1C.append(AbstractC25229BEm.A1Z(get()));
        A1C.append(", ");
        A1C.append(get());
        return AbstractC166997dE.A0x(")", A1C);
    }
}
