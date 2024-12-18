package X;

/* renamed from: X.8O5, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8O5 implements InterfaceC185958Mp {
    public C194808jg A00;
    public InterfaceC186208No A01;
    public final ViewOnTouchListenerC1829889t A02;

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFI() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFL() {
    }

    @Override // X.InterfaceC185958Mp
    public final /* synthetic */ void DFM() {
    }

    @Override // X.InterfaceC185958Mp
    public final void DFK(int i) {
        C194808jg c194808jg = this.A00;
        if (c194808jg != null) {
            c194808jg.A0A(i);
        }
        this.A00 = null;
        InterfaceC186208No interfaceC186208No = this.A01;
        if (interfaceC186208No != null) {
            interfaceC186208No.Doi();
        }
        this.A02.A09.remove(this);
    }

    @Override // X.InterfaceC185958Mp
    public final void DFN(int i) {
        C194808jg c194808jg = this.A00;
        if (c194808jg != null) {
            c194808jg.A0A(i);
        }
    }

    public C8O5(ViewOnTouchListenerC1829889t viewOnTouchListenerC1829889t) {
        this.A02 = viewOnTouchListenerC1829889t;
    }
}
