package X;

/* loaded from: classes5.dex */
public final class BZX extends C94 {
    public final AbstractC122975hY A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof BZX) && C14360o3.A0K(this.A00, ((BZX) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public BZX(AbstractC122975hY abstractC122975hY) {
        this.A00 = abstractC122975hY;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Value(alignmentLine=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
