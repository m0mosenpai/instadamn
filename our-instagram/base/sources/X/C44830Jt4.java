package X;

/* renamed from: X.Jt4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44830Jt4 extends AbstractC46352Kfa {
    public final C46340KfO A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C44830Jt4) && C14360o3.A0K(this.A00, ((C44830Jt4) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C44830Jt4(C46340KfO c46340KfO) {
        this.A00 = c46340KfO;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Error(error=");
        return AbstractC167017dG.A0o(this.A00, A1C);
    }
}
