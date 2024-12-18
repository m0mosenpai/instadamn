package X;

/* renamed from: X.MvV, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51827MvV extends C0T6 implements InterfaceC58034PoK {
    public final int A00;
    public final String A01;
    public final InterfaceC16620sF A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51827MvV) {
                C51827MvV c51827MvV = (C51827MvV) obj;
                if (this.A00 != c51827MvV.A00 || !C14360o3.A0K(this.A01, c51827MvV.A01) || this.A03 != c51827MvV.A03 || !C14360o3.A0K(this.A02, c51827MvV.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC58034PoK
    public final boolean Cce() {
        return this.A03;
    }

    @Override // X.InterfaceC58034PoK
    public final String getName() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A02, AbstractC167007dF.A0D(this.A03, ((this.A00 * 31) + AbstractC167017dG.A0O(this.A01)) * 31));
    }

    public C51827MvV(String str, InterfaceC16620sF interfaceC16620sF, int i, boolean z) {
        this.A00 = i;
        this.A01 = str;
        this.A03 = z;
        this.A02 = interfaceC16620sF;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ColorFilterModel(filterId=");
        A1C.append(this.A00);
        A1C.append(", name=");
        A1C.append(this.A01);
        A1C.append(", isSelected=");
        A1C.append(this.A03);
        A1C.append(", loadIcon=");
        return AbstractC167017dG.A0o(this.A02, A1C);
    }
}
