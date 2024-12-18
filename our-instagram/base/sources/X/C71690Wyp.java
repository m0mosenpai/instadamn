package X;

/* renamed from: X.Wyp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71690Wyp implements InterfaceC14180ni, InterfaceC71902X9m {
    public final /* synthetic */ InterfaceC16660sJ A00;

    @Override // X.InterfaceC71902X9m
    public final /* synthetic */ void DV8(String str) {
        this.A00.invoke(str);
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC71902X9m) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C71690Wyp(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }
}
