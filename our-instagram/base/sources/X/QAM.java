package X;

/* loaded from: classes10.dex */
public final class QAM extends C2O7 {
    @Override // X.C2O7
    public final boolean A02(C2O4 future, C2O4 expect, AbstractC49192Nt update) {
        boolean z;
        synchronized (update) {
            if (update.listeners == future) {
                update.listeners = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2O7
    public final boolean A03(C2O2 future, C2O2 expect, AbstractC49192Nt update) {
        boolean z;
        synchronized (update) {
            if (update.waiters == future) {
                update.waiters = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2O7
    public final boolean A04(AbstractC49192Nt future, Object expect, Object update) {
        boolean z;
        synchronized (future) {
            if (future.value == expect) {
                future.value = update;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.C2O7
    public final void A00(C2O2 waiter, C2O2 newValue) {
        waiter.next = newValue;
    }

    @Override // X.C2O7
    public final void A01(C2O2 waiter, Thread newValue) {
        waiter.thread = newValue;
    }
}
