package X;

/* loaded from: classes4.dex */
public final /* synthetic */ class B43 implements InterfaceC14180ni, InterfaceC185448Km {
    public final /* synthetic */ C9R3 A00;

    public B43(C9R3 c9r3) {
        this.A00 = c9r3;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(0, this.A00, C9R3.class, "onFinish", AbstractC111324zv.A00(2815), 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC185448Km) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }

    @Override // X.InterfaceC185448Km
    public final void onFinish() {
        C9R3 c9r3 = this.A00;
        AbstractC167007dF.A0L(c9r3.A03).setVisibility(8);
        c9r3.A05.invoke();
    }
}
