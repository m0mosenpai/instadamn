package X;

/* renamed from: X.PUt, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C57104PUt implements InterfaceC14180ni, InterfaceC58273PsR {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C57104PUt(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC58273PsR
    public final /* synthetic */ void CP3(C51732MtD c51732MtD) {
        this.A00.invoke(c51732MtD);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC58273PsR) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
