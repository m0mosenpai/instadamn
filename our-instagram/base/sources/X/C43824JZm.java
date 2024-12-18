package X;

/* renamed from: X.JZm, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C43824JZm implements InterfaceC19960yQ {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;

    public C43824JZm(C15130pT c15130pT, InterfaceC19960yQ interfaceC19960yQ, int i, long j) {
        this.A00 = i;
        this.A03 = c15130pT;
        this.A01 = j;
        this.A02 = interfaceC19960yQ;
    }

    @Override // X.InterfaceC19960yQ
    public final Object emit(Object obj, InterfaceC23621Ds interfaceC23621Ds) {
        long currentTimeMillis = System.currentTimeMillis();
        C15130pT c15130pT = (C15130pT) this.A03;
        if (currentTimeMillis - c15130pT.A00 >= this.A01) {
            c15130pT.A00 = currentTimeMillis;
            Object emit = ((InterfaceC19960yQ) this.A02).emit(obj, interfaceC23621Ds);
            if (emit == C1JX.A02) {
                return emit;
            }
        }
        return C0eB.A00;
    }
}
