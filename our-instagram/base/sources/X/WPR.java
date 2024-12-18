package X;

/* loaded from: classes11.dex */
public final class WPR implements InterfaceC71933XBi {
    public final /* synthetic */ WPV A00;

    public WPR(WPV wpv) {
        this.A00 = wpv;
    }

    @Override // X.InterfaceC71933XBi
    public final void D5e(WQH wqh, boolean z) {
        if (wqh instanceof UDI) {
            wqh.A00().A0C(false);
        }
        InterfaceC71933XBi interfaceC71933XBi = this.A00.A07;
        if (interfaceC71933XBi != null) {
            interfaceC71933XBi.D5e(wqh, z);
        }
    }

    @Override // X.InterfaceC71933XBi
    public final boolean DWt(WQH wqh) {
        WPV wpv = this.A00;
        if (wqh == wpv.A06) {
            return false;
        }
        ((UDI) wqh).getItem().getItemId();
        InterfaceC71933XBi interfaceC71933XBi = wpv.A07;
        if (interfaceC71933XBi == null) {
            return false;
        }
        return interfaceC71933XBi.DWt(wqh);
    }
}
