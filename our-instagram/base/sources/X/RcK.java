package X;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class RcK extends AbstractRunnableC14200nk {
    public final /* synthetic */ SJW A00;
    public final /* synthetic */ IOException A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RcK(SJW sjw, IOException iOException) {
        super(1773997430, 3, false, false);
        this.A00 = sjw;
        this.A01 = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        SJW sjw = this.A00;
        AtomicBoolean atomicBoolean = sjw.A09;
        if (!atomicBoolean.get()) {
            sjw.A0A.set(false);
            sjw.A03.markerAnnotate(936452326, sjw.A00, "is_http_success", false);
            atomicBoolean.set(true);
        }
    }
}
