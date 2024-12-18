package X;

/* renamed from: X.PEb, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C56683PEb implements InterfaceC58065Poq {
    public final /* synthetic */ PCP A00;

    @Override // X.InterfaceC58065Poq
    public final boolean DBN() {
        return false;
    }

    public C56683PEb(PCP pcp) {
        this.A00 = pcp;
    }

    @Override // X.InterfaceC58065Poq
    public final boolean DmY() {
        InterfaceC58126Ppp interfaceC58126Ppp = this.A00.A02;
        if (interfaceC58126Ppp != null) {
            interfaceC58126Ppp.DiX();
            return true;
        }
        C14360o3.A0F("listener");
        throw C00O.createAndThrow();
    }
}
