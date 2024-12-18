package X;

/* renamed from: X.Jt5, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44831Jt5 extends AbstractC46352Kfa {
    public final Object A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44831Jt5) && C14360o3.A0K(this.A00, ((C44831Jt5) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C44831Jt5(Object obj) {
        this.A00 = obj;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Success(response=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
