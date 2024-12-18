package X;

/* loaded from: classes10.dex */
public final class T98 implements InterfaceC65521Tlq {
    public InterfaceC65521Tlq[] A00;

    @Override // X.InterfaceC65521Tlq
    public final boolean Ce4(Class clazz) {
        for (InterfaceC65521Tlq interfaceC65521Tlq : this.A00) {
            if (interfaceC65521Tlq.Ce4(clazz)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65521Tlq
    public final C62587SHm CpW(Class clazz) {
        for (InterfaceC65521Tlq interfaceC65521Tlq : this.A00) {
            if (interfaceC65521Tlq.Ce4(clazz)) {
                return interfaceC65521Tlq.CpW(clazz);
            }
        }
        throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(clazz, "No factory is available for message type: "));
    }
}
