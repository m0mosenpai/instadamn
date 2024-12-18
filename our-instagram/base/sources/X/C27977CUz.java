package X;

/* renamed from: X.CUz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27977CUz {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27977CUz) && C14360o3.A0K(this.A00, ((C27977CUz) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C27977CUz(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("BaselineAnchor(id=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
