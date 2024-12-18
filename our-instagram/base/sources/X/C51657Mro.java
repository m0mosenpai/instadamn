package X;

/* renamed from: X.Mro, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51657Mro extends C0T6 {
    public final C51659Mrq A00;

    public C51657Mro(C51659Mrq c51659Mrq) {
        C14360o3.A0B(c51659Mrq, 1);
        this.A00 = c51659Mrq;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C51657Mro) && C14360o3.A0K(this.A00, ((C51657Mro) obj).A00));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00);
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("ViewState(ctas=");
        A1C.append(this.A00);
        A1C.append(", errorInfo=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
