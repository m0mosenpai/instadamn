package X;

/* renamed from: X.6J9, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6J9 implements InterfaceC14180ni, InterfaceC42241xE {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C6J9(InterfaceC16660sJ interfaceC16660sJ) {
        C14360o3.A0B(interfaceC16660sJ, 1);
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
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
