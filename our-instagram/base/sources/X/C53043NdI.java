package X;

/* renamed from: X.NdI, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C53043NdI extends AbstractC27457C9z {
    public final OLN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C53043NdI) && C14360o3.A0K(this.A00, ((C53043NdI) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C53043NdI(OLN oln) {
        this.A00 = oln;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("FinishSuccess(imagineCreateResponse=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
