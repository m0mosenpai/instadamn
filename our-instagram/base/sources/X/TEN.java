package X;

/* loaded from: classes10.dex */
public final class TEN implements InterfaceC65525Tlu {
    public InterfaceC65525Tlu[] A00;

    @Override // X.InterfaceC65525Tlu
    public final boolean Ce4(Class cls) {
        for (InterfaceC65525Tlu interfaceC65525Tlu : this.A00) {
            if (interfaceC65525Tlu.Ce4(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65525Tlu
    public final C62590SHq CpX(Class cls) {
        for (InterfaceC65525Tlu interfaceC65525Tlu : this.A00) {
            if (interfaceC65525Tlu.Ce4(cls)) {
                return interfaceC65525Tlu.CpX(cls);
            }
        }
        throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(cls, "No factory is available for message type: "));
    }
}
