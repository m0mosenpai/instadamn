package X;

/* renamed from: X.WfC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70690WfC implements InterfaceC139976Vb {
    public final /* synthetic */ AnonymousClass631 A00;
    public final /* synthetic */ C102884kP A01;

    @Override // X.InterfaceC139976Vb
    public final C102884kP AC0(InterfaceC102974kY interfaceC102974kY, C102884kP c102884kP) {
        InterfaceC102974kY interfaceC102974kY2 = c102884kP.A01;
        if (interfaceC102974kY2 == null && this.A00 == null) {
            return c102884kP;
        }
        InterfaceC102974kY interfaceC102974kY3 = null;
        if (interfaceC102974kY2 != null) {
            interfaceC102974kY3 = interfaceC102974kY2.Cme(interfaceC102974kY);
        }
        AnonymousClass631 anonymousClass631 = this.A00;
        int i = c102884kP.A04;
        return new C102884kP(interfaceC102974kY3, anonymousClass631, c102884kP, c102884kP.A08, c102884kP.A0A, i);
    }

    @Override // X.InterfaceC139976Vb
    public final void DxH(C102884kP c102884kP) {
    }

    public C70690WfC(AnonymousClass631 anonymousClass631, C102884kP c102884kP) {
        this.A01 = c102884kP;
        this.A00 = anonymousClass631;
    }
}
