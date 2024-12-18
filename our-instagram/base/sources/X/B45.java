package X;

/* loaded from: classes4.dex */
public final /* synthetic */ class B45 implements InterfaceC14180ni, InterfaceC42241xE {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public B45(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC42241xE
    public final /* synthetic */ void accept(Object obj) {
        this.A00.invoke(obj);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC42241xE) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
