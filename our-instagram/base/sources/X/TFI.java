package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class TFI implements InterfaceC27191Tt {
    public final /* synthetic */ C58356Ptw A00;
    public final /* synthetic */ C26461Qb A01;
    public final /* synthetic */ C1QW A02;
    public final /* synthetic */ AtomicBoolean A03;

    @Override // X.InterfaceC27201Tu
    public final void FAL(C1Ef c1Ef) {
    }

    public TFI(C58356Ptw c58356Ptw, C26461Qb c26461Qb, C1QW c1qw, AtomicBoolean atomicBoolean) {
        this.A00 = c58356Ptw;
        this.A02 = c1qw;
        this.A03 = atomicBoolean;
        this.A01 = c26461Qb;
    }

    @Override // X.InterfaceC27201Tu
    public final void cancel() {
        this.A03.set(true);
        this.A01.A00();
    }

    @Override // X.InterfaceC27201Tu
    public final int getRequestId() {
        return this.A02.A04;
    }
}
