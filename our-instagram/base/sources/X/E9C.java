package X;

/* loaded from: classes6.dex */
public final class E9C extends C0T6 implements InterfaceC37093GWc {
    public static final E9C A04 = new E9C(null, "", 0, false);
    public final int A00;
    public final C32111E9j A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E9C) {
                E9C e9c = (E9C) obj;
                if (!C14360o3.A0K(this.A02, e9c.A02) || this.A00 != e9c.A00 || this.A03 != e9c.A03 || !C14360o3.A0K(this.A01, e9c.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A03, (AbstractC166987dD.A0J(this.A02) + this.A00) * 31) + AbstractC167017dG.A0M(this.A01);
    }

    public E9C(C32111E9j c32111E9j, String str, int i, boolean z) {
        this.A02 = str;
        this.A00 = i;
        this.A03 = z;
        this.A01 = c32111E9j;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("TAMSearchLoadingState(query=");
        A1C.append(this.A02);
        A1C.append(AbstractC111324zv.A00(1405));
        A1C.append(this.A00);
        A1C.append(MSV.A00(67));
        A1C.append(this.A03);
        A1C.append(", searchResults=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }
}
