package X;

/* renamed from: X.Jt1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44827Jt1 extends AbstractC46542Kih {
    public final Exception A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44827Jt1) && C14360o3.A0K(this.A00, ((C44827Jt1) obj).A00));
    }

    public final int hashCode() {
        return AbstractC167017dG.A0M(this.A00);
    }

    public C44827Jt1(Exception exc) {
        this.A00 = exc;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(cause=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }

    public C44827Jt1() {
        this(null);
    }
}
