package X;

import java.util.List;

/* renamed from: X.WfD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70691WfD implements InterfaceC139976Vb {
    public final /* synthetic */ C6AQ A00;
    public final /* synthetic */ C102884kP A01;
    public final /* synthetic */ C140026Vg A02;
    public final /* synthetic */ List A03;

    @Override // X.InterfaceC139976Vb
    public final void DxH(C102884kP c102884kP) {
    }

    public C70691WfD(C6AQ c6aq, C102884kP c102884kP, C140026Vg c140026Vg, List list) {
        this.A02 = c140026Vg;
        this.A01 = c102884kP;
        this.A03 = list;
        this.A00 = c6aq;
    }

    @Override // X.InterfaceC139976Vb
    public final C102884kP AC0(InterfaceC102974kY interfaceC102974kY, C102884kP c102884kP) {
        InterfaceC102974kY interfaceC102974kY2;
        C6FD c6fd = this.A02.A01;
        C102884kP c102884kP2 = this.A01;
        List list = this.A03;
        String str = this.A00.A01;
        InterfaceC102974kY interfaceC102974kY3 = c102884kP.A01;
        if (interfaceC102974kY3 != null) {
            if (interfaceC102974kY == null) {
                interfaceC102974kY = c102884kP2.A01;
            }
            interfaceC102974kY2 = interfaceC102974kY3.Cme(interfaceC102974kY);
        } else {
            interfaceC102974kY2 = null;
        }
        return new C102884kP(interfaceC102974kY2, c102884kP2.A02, c102884kP, c102884kP, list, c6fd.A00(c102884kP2, c102884kP, str));
    }
}
