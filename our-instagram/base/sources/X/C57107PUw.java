package X;

/* renamed from: X.PUw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57107PUw implements InterfaceC14180ni, InterfaceC57962Pn8 {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C57107PUw(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC57962Pn8
    public final /* synthetic */ void CP6(String str) {
        this.A00.invoke(str);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC57962Pn8) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
