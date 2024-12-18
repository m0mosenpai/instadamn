package X;

/* renamed from: X.Jt2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44828Jt2 extends AbstractC46351KfZ {
    public final C46339KfN A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44828Jt2) && C14360o3.A0K(this.A00, ((C44828Jt2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C44828Jt2(C46339KfN c46339KfN) {
        this.A00 = c46339KfN;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(error=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
