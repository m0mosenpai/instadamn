package X;

/* renamed from: X.Wyq, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71691Wyq implements InterfaceC14180ni, InterfaceC71903X9n {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public C71691Wyq(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.InterfaceC71903X9n
    public final /* synthetic */ void DZy() {
        this.A00.invoke();
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC71903X9n) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return AbstractC167007dF.A1Y(obj, this.A00);
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
