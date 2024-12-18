package X;

/* renamed from: X.Jsg, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44809Jsg extends AbstractC46349KfX {
    public static final AbstractC46349KfX A01 = new C44809Jsg(C0eB.A00);
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44809Jsg) && C14360o3.A0K(this.A00, ((C44809Jsg) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C44809Jsg(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Either.Right(");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
