package X;

/* loaded from: classes5.dex */
public final class C4E extends AbstractC27457C9z {
    public final String A00;
    public final InterfaceC16820sZ A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4E) {
                C4E c4e = (C4E) obj;
                if (!C14360o3.A0K(this.A00, c4e.A00) || !C14360o3.A0K(this.A01, c4e.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0O(this.A00) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C4E(String str, InterfaceC16820sZ interfaceC16820sZ) {
        this.A00 = str;
        this.A01 = interfaceC16820sZ;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SnackBarError(message=");
        A1C.append(this.A00);
        A1C.append(", retryFunction=");
        return AbstractC167017dG.A0o(this.A01, A1C);
    }

    public C4E() {
        this(null, null);
    }
}
