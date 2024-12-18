package X;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Ptw, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58356Ptw implements C1G4 {
    public final C58355Ptv A00;
    public final InterfaceC14020nS A01;

    @Override // X.C1G4
    public final InterfaceC27191Tt startRequest(C1QW c1qw, C1QY c1qy, C26511Qg c26511Qg) {
        C26461Qb c26461Qb = new C26461Qb(c1qw, c1qy);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        try {
            c1qw.A09.getPath();
            this.A01.ATO(new C60954Rcb(this, c26461Qb, c26511Qg, c1qw, c1qy, atomicBoolean));
            return new TFI(this, c26461Qb, c1qw, atomicBoolean);
        } catch (RejectedExecutionException e) {
            StringBuilder A0s = AbstractC58318PtA.A0s(c1qw.A09.toString());
            A0s.append(" ");
            A0s.append(c1qy.A09);
            A0s.append(" ");
            A0s.append(c1qy.A00());
            A0s.append(" ");
            throw new RejectedExecutionException(AbstractC166997dE.A0x(e.getMessage(), A0s));
        }
    }

    public C58356Ptw(C58355Ptv c58355Ptv, InterfaceC14020nS interfaceC14020nS) {
        this.A01 = interfaceC14020nS;
        this.A00 = c58355Ptv;
    }
}
