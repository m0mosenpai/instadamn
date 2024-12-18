package X;

/* renamed from: X.RSv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60784RSv extends AbstractC25081Km {
    @Override // X.AbstractC25081Km
    public final C25141Ks A00(C25141Ks future, AbstractC25011Ke update) {
        C25141Ks c25141Ks;
        synchronized (update) {
            boolean z = AbstractC25011Ke.A02;
            c25141Ks = update.listeners;
            if (c25141Ks != future) {
                update.listeners = future;
            }
        }
        return c25141Ks;
    }

    @Override // X.AbstractC25081Km
    public final C25121Kq A01(C25121Kq future, AbstractC25011Ke update) {
        C25121Kq c25121Kq;
        synchronized (update) {
            boolean z = AbstractC25011Ke.A02;
            c25121Kq = update.waiters;
            if (c25121Kq != future) {
                update.waiters = future;
            }
        }
        return c25121Kq;
    }

    @Override // X.AbstractC25081Km
    public final boolean A04(C25141Ks future, C25141Ks expect, AbstractC25011Ke update) {
        boolean z;
        synchronized (update) {
            boolean z2 = AbstractC25011Ke.A02;
            if (update.listeners == future) {
                update.listeners = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.AbstractC25081Km
    public final boolean A05(C25121Kq future, C25121Kq expect, AbstractC25011Ke update) {
        boolean z;
        synchronized (update) {
            boolean z2 = AbstractC25011Ke.A02;
            if (update.waiters == future) {
                update.waiters = expect;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.AbstractC25081Km
    public final boolean A06(AbstractC25011Ke future, Object expect, Object update) {
        boolean z;
        synchronized (future) {
            boolean z2 = AbstractC25011Ke.A02;
            if (future.value == expect) {
                future.value = update;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // X.AbstractC25081Km
    public final void A02(C25121Kq waiter, C25121Kq newValue) {
        waiter.next = newValue;
    }

    @Override // X.AbstractC25081Km
    public final void A03(C25121Kq waiter, Thread newValue) {
        waiter.thread = newValue;
    }
}
