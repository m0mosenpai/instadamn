package X;

/* renamed from: X.Cd1, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28256Cd1 {
    public final CA6 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C28256Cd1) && C14360o3.A0K(this.A00, ((C28256Cd1) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C28256Cd1(CA6 ca6) {
        this.A00 = ca6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("UIState(nuxState=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C28256Cd1() {
        this(null);
    }
}
