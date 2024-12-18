package X;

/* renamed from: X.C4v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27340C4v extends CAU {
    public final C28261Cd6 A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27340C4v) && C14360o3.A0K(this.A00, ((C27340C4v) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C27340C4v(C28261Cd6 c28261Cd6) {
        this.A00 = c28261Cd6;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(errorInfo=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C27340C4v() {
        this(new C28261Cd6(null, true));
    }
}
