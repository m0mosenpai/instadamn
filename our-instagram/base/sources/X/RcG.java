package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class RcG extends AbstractRunnableC14200nk {
    public final /* synthetic */ SJW A00;
    public final /* synthetic */ boolean A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcG(SJW sjw, boolean z) {
        super(1773997430, 3, false, false);
        this.A00 = sjw;
        this.A01 = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SJW sjw = this.A00;
        AtomicBoolean atomicBoolean = sjw.A0B;
        if (!atomicBoolean.get()) {
            boolean z = this.A01;
            sjw.A0C.set(z);
            sjw.A03.markerAnnotate(936452326, sjw.A00, "is_mqtt_success", z);
            atomicBoolean.set(true);
        }
    }
}
