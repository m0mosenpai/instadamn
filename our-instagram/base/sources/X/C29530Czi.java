package X;

/* renamed from: X.Czi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29530Czi implements InterfaceC30850DhP {
    public final C28261Cd6 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29530Czi) && C14360o3.A0K(this.A00, ((C29530Czi) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C29530Czi(C28261Cd6 c28261Cd6) {
        this.A00 = c28261Cd6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ShowErrorPopUp(errorInfo=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
