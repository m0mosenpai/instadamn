package X;

/* loaded from: classes8.dex */
public final /* synthetic */ class M9K implements InterfaceC14180ni, InterfaceC42241xE {
    public final /* synthetic */ C49207LpO A00;

    public M9K(C49207LpO c49207LpO) {
        this.A00 = c49207LpO;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return new C03E(1, this.A00, C49207LpO.class, "onActionBarViewModelChanged", "onActionBarViewModelChanged(Lcom/instagram/direct/fragment/thread/actionbar/viewmodel/DirectThreadActionBarViewModel;)V", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // X.InterfaceC42241xE
    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        this.A00.A00.Egh(obj);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC42241xE) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, getFunctionDelegate());
    }
}
