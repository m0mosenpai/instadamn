package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.RSw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60785RSw extends AbstractC25081Km {
    public final AtomicReferenceFieldUpdater A00;
    public final AtomicReferenceFieldUpdater A01;
    public final AtomicReferenceFieldUpdater A02;
    public final AtomicReferenceFieldUpdater A03;
    public final AtomicReferenceFieldUpdater A04;

    @Override // X.AbstractC25081Km
    public final C25141Ks A00(C25141Ks future, AbstractC25011Ke update) {
        return (C25141Ks) this.A00.getAndSet(update, future);
    }

    @Override // X.AbstractC25081Km
    public final C25121Kq A01(C25121Kq future, AbstractC25011Ke update) {
        return (C25121Kq) this.A04.getAndSet(update, future);
    }

    @Override // X.AbstractC25081Km
    public final void A02(C25121Kq waiter, C25121Kq newValue) {
        this.A02.lazySet(waiter, newValue);
    }

    @Override // X.AbstractC25081Km
    public final void A03(C25121Kq waiter, Thread newValue) {
        this.A03.lazySet(waiter, newValue);
    }

    @Override // X.AbstractC25081Km
    public final boolean A04(C25141Ks future, C25141Ks expect, AbstractC25011Ke update) {
        return C1E0.A00(update, future, expect, this.A00);
    }

    @Override // X.AbstractC25081Km
    public final boolean A05(C25121Kq future, C25121Kq expect, AbstractC25011Ke update) {
        return C1E0.A00(update, future, expect, this.A04);
    }

    @Override // X.AbstractC25081Km
    public final boolean A06(AbstractC25011Ke future, Object expect, Object update) {
        return C1E0.A00(future, expect, update, this.A01);
    }

    public C60785RSw(AtomicReferenceFieldUpdater waiterThreadUpdater, AtomicReferenceFieldUpdater waiterNextUpdater, AtomicReferenceFieldUpdater waitersUpdater, AtomicReferenceFieldUpdater listenersUpdater, AtomicReferenceFieldUpdater valueUpdater) {
        this.A03 = waiterThreadUpdater;
        this.A02 = waiterNextUpdater;
        this.A04 = waitersUpdater;
        this.A00 = listenersUpdater;
        this.A01 = valueUpdater;
    }
}
