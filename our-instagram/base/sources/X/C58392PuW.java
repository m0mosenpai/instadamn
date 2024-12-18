package X;

/* renamed from: X.PuW, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58392PuW implements InterfaceC65465Tkh {
    public InterfaceC65465Tkh[] A00;

    @Override // X.InterfaceC65465Tkh
    public final boolean Ce4(Class cls) {
        for (InterfaceC65465Tkh interfaceC65465Tkh : this.A00) {
            if (interfaceC65465Tkh.Ce4(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65465Tkh
    public final InterfaceC65180TfO CpV(Class cls) {
        for (InterfaceC65465Tkh interfaceC65465Tkh : this.A00) {
            if (interfaceC65465Tkh.Ce4(cls)) {
                return interfaceC65465Tkh.CpV(cls);
            }
        }
        throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(cls, "No factory is available for message type: "));
    }
}
