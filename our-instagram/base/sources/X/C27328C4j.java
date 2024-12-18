package X;

/* renamed from: X.C4j, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27328C4j extends CA5 {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27328C4j) && C14360o3.A0K(this.A00, ((C27328C4j) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C27328C4j(Throwable th) {
        this.A00 = th;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(cause=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C27328C4j() {
        this(null);
    }
}
