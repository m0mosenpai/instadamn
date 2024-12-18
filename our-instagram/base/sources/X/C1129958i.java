package X;

/* renamed from: X.58i, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1129958i implements InterfaceC14180ni, InterfaceC1130058j {
    public final /* synthetic */ InterfaceC16660sJ A00;

    public C1129958i(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC1130058j) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
