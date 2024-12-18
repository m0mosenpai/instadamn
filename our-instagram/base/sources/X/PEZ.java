package X;

/* loaded from: classes9.dex */
public final class PEZ implements InterfaceC58125Ppo {
    public final /* synthetic */ PCP A00;

    public PEZ(PCP pcp) {
        this.A00 = pcp;
    }

    @Override // X.InterfaceC58125Ppo
    public final /* synthetic */ boolean DrR() {
        return false;
    }

    @Override // X.InterfaceC58125Ppo
    public final boolean DrU() {
        InterfaceC58126Ppp interfaceC58126Ppp = this.A00.A02;
        if (interfaceC58126Ppp != null) {
            interfaceC58126Ppp.DiW();
            return true;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC58125Ppo
    public final /* synthetic */ boolean Dra() {
        return false;
    }
}
