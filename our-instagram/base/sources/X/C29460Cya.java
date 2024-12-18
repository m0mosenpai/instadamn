package X;

/* renamed from: X.Cya, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C29460Cya implements InterfaceC30839DhE {
    public final AbstractC50812Vc A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C29460Cya) && C14360o3.A0K(this.A00, ((C29460Cya) obj).A00));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A00);
    }

    public C29460Cya(AbstractC50812Vc abstractC50812Vc) {
        this.A00 = abstractC50812Vc;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("Child(component=");
        A1C.append(this.A00);
        A1C.append(", id=");
        return AbstractC167017dG.A0o(null, A1C);
    }
}
