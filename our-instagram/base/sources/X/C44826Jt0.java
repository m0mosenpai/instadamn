package X;

/* renamed from: X.Jt0, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44826Jt0 extends AbstractC46542Kih {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44826Jt0) && C14360o3.A0K(this.A00, ((C44826Jt0) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C44826Jt0(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Success(data=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
