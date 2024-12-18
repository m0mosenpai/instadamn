package X;

/* loaded from: classes9.dex */
public final class N0G extends AbstractC70464WXu implements InterfaceC58275PsT {
    @Override // X.InterfaceC58275PsT
    public final void EZi(EnumC53220NgI enumC53220NgI) {
        InterfaceC72008XEw interfaceC72008XEw;
        int A05 = AbstractC25227BEk.A05(enumC53220NgI, 0);
        if (A05 != 0) {
            if (A05 != 1) {
                if (A05 == 2) {
                    interfaceC72008XEw = this.A00;
                    interfaceC72008XEw.EoO("notif_displayed");
                }
            } else {
                interfaceC72008XEw = this.A00;
                interfaceC72008XEw.EoO("notif_removed");
            }
            interfaceC72008XEw.EoO("incoming_call_screen_displayed");
        } else {
            this.A00.EoO("notif_removed");
        }
        this.A00.CnT("notification_type", enumC53220NgI.A00);
    }

    @Override // X.InterfaceC58275PsT
    public final void AIo(String str) {
        this.A00.EoN(str);
    }

    @Override // X.InterfaceC58275PsT
    public final void EoO(String str) {
        this.A00.EoO(str);
    }
}
