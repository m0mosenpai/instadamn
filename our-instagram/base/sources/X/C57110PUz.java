package X;

/* renamed from: X.PUz, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57110PUz implements InterfaceC14180ni, InterfaceC57990Pna {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C57110PUz(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    @Override // X.InterfaceC57990Pna
    public final /* synthetic */ void afterSelection(boolean z) {
        AbstractC25227BEk.A1Q(this.A00, z);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57990Pna) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
