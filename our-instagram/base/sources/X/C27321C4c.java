package X;

/* renamed from: X.C4c, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27321C4c extends CA2 {
    public final Throwable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C27321C4c) && C14360o3.A0K(this.A00, ((C27321C4c) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C27321C4c(Throwable th) {
        this.A00 = th;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Failure(error=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
