package X;

/* loaded from: classes10.dex */
public final class TEV implements InterfaceC65526Tlv {
    public InterfaceC65526Tlv[] A00;

    @Override // X.InterfaceC65526Tlv
    public final boolean Ce4(Class cls) {
        for (InterfaceC65526Tlv interfaceC65526Tlv : this.A00) {
            if (interfaceC65526Tlv.Ce4(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.InterfaceC65526Tlv
    public final SHr CpY(Class cls) {
        for (InterfaceC65526Tlv interfaceC65526Tlv : this.A00) {
            if (interfaceC65526Tlv.Ce4(cls)) {
                return interfaceC65526Tlv.CpY(cls);
            }
        }
        throw AbstractC166987dD.A1D(AbstractC58319PtB.A0t(cls, "No factory is available for message type: "));
    }
}
