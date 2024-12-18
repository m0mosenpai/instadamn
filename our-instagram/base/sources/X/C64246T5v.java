package X;

/* renamed from: X.T5v, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C64246T5v implements InterfaceC65515Tlk {
    public final InterfaceC65515Tlk[] A00;

    public C64246T5v(InterfaceC65515Tlk... interfaceC65515TlkArr) {
        this.A00 = interfaceC65515TlkArr;
    }

    @Override // X.InterfaceC65515Tlk
    public final InterfaceC65254Tgk FFo(Class cls) {
        int i = 0;
        do {
            InterfaceC65515Tlk interfaceC65515Tlk = this.A00[i];
            if (interfaceC65515Tlk.FG1(cls)) {
                return interfaceC65515Tlk.FFo(cls);
            }
            i++;
        } while (i < 2);
        throw AbstractC166987dD.A1D("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    @Override // X.InterfaceC65515Tlk
    public final boolean FG1(Class cls) {
        int i = 0;
        while (!this.A00[i].FG1(cls)) {
            i++;
            if (i >= 2) {
                return false;
            }
        }
        return true;
    }
}
