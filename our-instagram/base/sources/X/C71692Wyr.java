package X;

/* renamed from: X.Wyr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C71692Wyr implements InterfaceC14180ni, InterfaceC71903X9n {
    public final /* synthetic */ InterfaceC16820sZ A00;

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

    public C71692Wyr(InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = interfaceC16820sZ;
    }
}
