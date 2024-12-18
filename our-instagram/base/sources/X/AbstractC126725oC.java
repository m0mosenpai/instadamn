package X;

import java.util.List;

/* renamed from: X.5oC, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC126725oC extends AbstractC117285Sn implements InterfaceC126735oD {
    public long A00;
    public InterfaceC126735oD A01;

    @Override // X.InterfaceC126735oD
    public final List Au4(long j) {
        InterfaceC126735oD interfaceC126735oD = this.A01;
        interfaceC126735oD.getClass();
        return interfaceC126735oD.Au4(j - this.A00);
    }

    @Override // X.InterfaceC126735oD
    public final long B2n(int i) {
        InterfaceC126735oD interfaceC126735oD = this.A01;
        interfaceC126735oD.getClass();
        return interfaceC126735oD.B2n(i) + this.A00;
    }

    @Override // X.InterfaceC126735oD
    public final int B2o() {
        InterfaceC126735oD interfaceC126735oD = this.A01;
        interfaceC126735oD.getClass();
        return interfaceC126735oD.B2o();
    }

    @Override // X.InterfaceC126735oD
    public final int BWs(long j) {
        InterfaceC126735oD interfaceC126735oD = this.A01;
        interfaceC126735oD.getClass();
        return interfaceC126735oD.BWs(j - this.A00);
    }

    @Override // X.AbstractC96104Tt
    public final void clear() {
        super.clear();
        this.A01 = null;
    }
}
