package X;

/* renamed from: X.7A9, reason: invalid class name */
/* loaded from: classes3.dex */
public final /* synthetic */ class C7A9 implements InterfaceC14180ni, InterfaceC59892oW {
    public final /* synthetic */ InterfaceC16620sF A00;

    public C7A9(InterfaceC16620sF interfaceC16620sF) {
        this.A00 = interfaceC16620sF;
    }

    @Override // X.InterfaceC59892oW
    public final /* synthetic */ void Dnp(int i, int i2) {
        this.A00.invoke(Integer.valueOf(i), Integer.valueOf(i2));
    }

    @Override // X.InterfaceC14180ni
    public final InterfaceC09250da getFunctionDelegate() {
        return this.A00;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof InterfaceC59892oW) || !(obj instanceof InterfaceC14180ni)) {
            return false;
        }
        return C14360o3.A0K(this.A00, ((InterfaceC14180ni) obj).getFunctionDelegate());
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
