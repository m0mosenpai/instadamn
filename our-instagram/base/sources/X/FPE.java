package X;

/* loaded from: classes6.dex */
public final class FPE {
    public final /* synthetic */ EIL A00;

    public FPE(EIL eil) {
        this.A00 = eil;
    }

    public final void A00() {
        AbstractC10360h2 parentFragmentManager;
        EIL eil = this.A00;
        InterfaceC09390do interfaceC09390do = eil.A02;
        AbstractC12990ll A0o = AbstractC166987dD.A0o(interfaceC09390do);
        C06090Tz c06090Tz = C06090Tz.A05;
        if (!C18U.A06(c06090Tz, A0o, 36311560486191708L) && !C18U.A06(c06090Tz, AbstractC166987dD.A0o(interfaceC09390do), 36311560487174763L)) {
            parentFragmentManager = AbstractC31174DnI.A0I(eil);
            if (parentFragmentManager == null) {
                return;
            }
        } else {
            parentFragmentManager = eil.getParentFragmentManager();
        }
        parentFragmentManager.A0b();
    }
}
