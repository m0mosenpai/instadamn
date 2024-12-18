package X;

/* renamed from: X.C4a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27319C4a extends CA1 {
    public final CAZ A00;

    public C27319C4a(CAZ caz) {
        C14360o3.A0B(caz, 1);
        this.A00 = caz;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27319C4a) && C14360o3.A0K(this.A00, ((C27319C4a) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(error=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
