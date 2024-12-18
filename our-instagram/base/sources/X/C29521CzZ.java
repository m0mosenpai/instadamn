package X;

/* renamed from: X.CzZ, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29521CzZ implements InterfaceC31004Dk3 {
    public final int A00;
    public final String A01;
    public final InterfaceC16820sZ A02;
    public final InterfaceC16820sZ A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C29521CzZ) {
                C29521CzZ c29521CzZ = (C29521CzZ) obj;
                if (this.A00 != c29521CzZ.A00 || !C14360o3.A0K(this.A01, c29521CzZ.A01) || !C14360o3.A0K(this.A03, c29521CzZ.A03) || !C14360o3.A0K(this.A02, c29521CzZ.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31004Dk3
    public final C26572BoV EqD(C2Z1 c2z1) {
        return CL4.A00(C88.A0Z, this.A01, this.A03, this.A02);
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0K(this.A01, this.A00 * 31)));
    }

    public C29521CzZ(String str, InterfaceC16820sZ interfaceC16820sZ, InterfaceC16820sZ interfaceC16820sZ2, int i) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = interfaceC16820sZ;
        this.A02 = interfaceC16820sZ2;
    }

    @Override // X.InterfaceC31004Dk3
    public final int BF3() {
        return this.A00;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Enabled(id=");
        A1C.append(this.A00);
        A1C.append(", text=");
        A1C.append(this.A01);
        A1C.append(", onVisible=");
        A1C.append(this.A03);
        A1C.append(", onClick=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
