package X;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class SNE {
    public final SAI A00 = new SAI();

    public final void A00() {
        this.A00.A00.getAndSet(0);
    }

    public final void A01(Object obj) {
        AtomicInteger atomicInteger = this.A00.A00;
        C14360o3.A0B(atomicInteger, 0);
        if (atomicInteger.get() != 0) {
            throw new AbstractC64922TZx(this, obj);
        }
        throw new RkV();
    }
}
