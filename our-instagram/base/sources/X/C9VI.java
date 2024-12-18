package X;

/* renamed from: X.9VI, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C9VI extends AbstractC223599u2 {
    public final C224369vN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C9VI) && C14360o3.A0K(this.A00, ((C9VI) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C9VI(C224369vN c224369vN) {
        this.A00 = c224369vN;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(error=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
