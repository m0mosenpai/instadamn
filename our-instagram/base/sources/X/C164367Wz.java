package X;

/* renamed from: X.7Wz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C164367Wz implements InterfaceC14180ni, C7X0 {
    public final /* synthetic */ InterfaceC16820sZ A00;

    public C164367Wz(InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(interfaceC16820sZ, 1);
        this.A00 = interfaceC16820sZ;
    }

    @Override // X.C7X0
    public final /* synthetic */ Object get() {
        return this.A00.invoke();
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C7X0) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
